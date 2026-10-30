package com.example.pawcall;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
public record WhistlePayload() implements CustomPacketPayload {
 public static final CustomPacketPayload.Type<WhistlePayload> TYPE=new CustomPacketPayload.Type<>(Pawcall.id("whistle"));
 public static final StreamCodec<RegistryFriendlyByteBuf,WhistlePayload> CODEC=StreamCodec.unit(new WhistlePayload());
 @Override public CustomPacketPayload.Type<? extends CustomPacketPayload> type(){return TYPE;}
}
