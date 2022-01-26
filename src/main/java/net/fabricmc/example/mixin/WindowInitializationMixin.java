package net.fabricmc.example.mixin;

import net.fabricmc.example.MerlinWindow;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class WindowInitializationMixin
{
    @Inject(at = @At("TAIL"), method = "<init>")
    private void initializeMerlinWindow(CallbackInfo ci)
    {
        MerlinWindow.windowInit((MinecraftClient)(Object)this);
    }
}
