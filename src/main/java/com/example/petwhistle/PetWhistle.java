package com.example.petwhistle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.phys.AABB;

public class PetWhistle implements ModInitializer {
	public static final String MOD_ID = "petwhistle";
	public static final double BASE_RANGE = 12.0;
	public static final double WHISTLE_RANGE = 48.0;
	private static final int COOLDOWN_TICKS = 20;
	private static final Map<UUID, Long> LAST_USED = new HashMap<>();

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		ModItems.initialize();

		PayloadTypeRegistry.serverboundPlay().register(WhistlePayload.TYPE, WhistlePayload.CODEC);

		ServerPlayNetworking.registerGlobalReceiver(WhistlePayload.TYPE,
				(payload, context) -> callPets(context.player()));
	}

	public static void callPets(ServerPlayer player) {
		ServerLevel level = (ServerLevel) player.level();

		// Cooldown
		long now = level.getGameTime();
		Long last = LAST_USED.get(player.getUUID());
		if (last != null && now - last < COOLDOWN_TICKS) {
			return;
		}
		LAST_USED.put(player.getUUID(), now);

		double range = hasWhistle(player) ? WHISTLE_RANGE : BASE_RANGE;
		double rangeSq = range * range;
		AABB area = player.getBoundingBox().inflate(range);

		List<TamableAnimal> pets = level.getEntitiesOfClass(TamableAnimal.class, area,
				pet -> pet.isTame()
						&& pet.isOwnedBy(player)
						&& !pet.isOrderedToSit()
						&& pet.distanceToSqr(player) <= rangeSq);

		for (TamableAnimal pet : pets) {
			pet.getNavigation().stop();
			pet.setDeltaMovement(0, 0, 0);
			pet.snapTo(player.getX(), player.getY(), player.getZ(), pet.getYRot(), pet.getXRot());
		}

		level.playSound(null, player.blockPosition(), SoundEvents.EXPERIENCE_ORB_PICKUP,
				SoundSource.PLAYERS, 1.0f, 1.5f);
		player.displayClientMessage(Component.literal(
				"Whistled! " + pets.size() + " pet(s) came (range " + (int) range + ")"), true);
	}

	private static boolean hasWhistle(ServerPlayer player) {
		Inventory inv = player.getInventory();
		for (int i = 0; i < inv.getContainerSize(); i++) {
			if (inv.getItem(i).is(ModItems.WHISTLE)) {
				return true;
			}
		}
		return false;
	}
}
