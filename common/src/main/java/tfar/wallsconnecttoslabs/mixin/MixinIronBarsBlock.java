package tfar.wallsconnecttoslabs.mixin;

import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import tfar.wallsconnecttoslabs.WallsConnectToSlabs;

@Mixin(IronBarsBlock.class)
public class MixinIronBarsBlock {
    
    @Inject(method = "attachsTo",at = @At("RETURN"),cancellable = true)
    private void forceConnect(BlockState state, boolean isFullFace, CallbackInfoReturnable<Boolean> cir) {
        WallsConnectToSlabs.forceConnectHook(state, isFullFace,null, cir);
    }
}