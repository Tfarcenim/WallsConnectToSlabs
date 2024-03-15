package tfar.wallsconnecttoslabs.mixin;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import tfar.wallsconnecttoslabs.WallsConnectToSlabs;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WallBlock.class)
public class MixinWallBlock {
    
    @Inject(method = "connectsTo",at = @At("RETURN"),cancellable = true)
    private void forceConnect(BlockState state, boolean isFullFace, Direction direction, CallbackInfoReturnable<Boolean> cir) {
        WallsConnectToSlabs.forceConnectHook(state, isFullFace, direction, cir);
    }
}