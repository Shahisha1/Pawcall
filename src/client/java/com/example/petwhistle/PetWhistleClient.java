package com.example.petwhistle;

import com.mojang.blaze3d.platform.InputConstants;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.KeyMapping;

public class PetWhistleClient implements ClientModInitializer {
	private static final KeyMapping.Category CATEGORY =
			KeyMapping.Category.register(PetWhistle.id("main"));

	private static KeyMapping whistleKey;

	@Override
	public void onInitializeClient() {
		whistleKey = KeyMappingHelper.registerKeyMapping(new KeyMapping(
				"key.petwhistle.whistle",
				InputConstants.Type.KEYSYM,
				InputConstants.KEY_G,
				CATEGORY));

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			while (whistleKey.consumeClick()) {
				if (client.player == null) {
					return;
				}
				ClientPlayNetworking.send(new WhistlePayload());
			}
		});
	}
}
