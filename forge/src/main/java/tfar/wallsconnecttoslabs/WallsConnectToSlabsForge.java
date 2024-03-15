package tfar.wallsconnecttoslabs;

import net.minecraftforge.fml.common.Mod;

@Mod(WallsConnectToSlabs.MOD_ID)
public class WallsConnectToSlabsForge {
    
    public WallsConnectToSlabsForge() {
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        WallsConnectToSlabs.init();
    }
}