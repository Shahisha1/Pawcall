package com.example.pawcall;
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
import net.minecraft.world.phys.AABB;
public class Pawcall implements ModInitializer {
 public static final String MOD_ID="pawcall";
 public static final double BASE_RANGE=12.0, WHISTLE_RANGE=48.0;
 private static final int COOLDOWN_TICKS=20;
 private static final double PET_APPROACH_SPEED=1.25D;
 private static final Map<UUID,Long> LAST_USED=new HashMap<>();
 public static Identifier id(String path){return Identifier.fromNamespaceAndPath(MOD_ID,path);}
 @Override public void onInitialize(){
  ModItems.initialize();
  PayloadTypeRegistry.serverboundPlay().register(WhistlePayload.TYPE,WhistlePayload.CODEC);
  ServerPlayNetworking.registerGlobalReceiver(WhistlePayload.TYPE,(payload,context)->callPets(context.player()));
 }
 public static void callPets(ServerPlayer player){
  ServerLevel level=(ServerLevel)player.level(); long now=level.getGameTime();
  Long last=LAST_USED.get(player.getUUID()); if(last!=null&&now-last<COOLDOWN_TICKS)return;
  LAST_USED.put(player.getUUID(),now);
  double range=hasWhistleInHand(player)?WHISTLE_RANGE:BASE_RANGE, rangeSq=range*range;
  AABB area=player.getBoundingBox().inflate(range);
  List<TamableAnimal> pets=level.getEntitiesOfClass(TamableAnimal.class,area,
   pet->pet.isTame()&&pet.isOwnedBy(player)&&!pet.isOrderedToSit()&&pet.distanceToSqr(player)<=rangeSq);
  for(TamableAnimal pet:pets)pet.getNavigation().moveTo(player,PET_APPROACH_SPEED);
  level.playSound(null,player.blockPosition(),SoundEvents.EXPERIENCE_ORB_PICKUP,SoundSource.PLAYERS,1.0f,1.5f);
  player.sendSystemMessage(Component.literal("Pawcall! "+pets.size()+" pet(s) coming (range "+(int)range+")"));
 }
 private static boolean hasWhistleInHand(ServerPlayer player){
  return player.getMainHandItem().is(ModItems.WHISTLE)||player.getOffhandItem().is(ModItems.WHISTLE);
 }
}
