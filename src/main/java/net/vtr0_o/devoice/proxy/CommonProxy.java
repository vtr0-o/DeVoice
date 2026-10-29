package net.vtr0_o.devoice.proxy;

import cpw.mods.fml.common.event.*;
import net.vtr0_o.devoice.Config;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        Config.synchronizeConfiguration(event.getSuggestedConfigurationFile());
    }

    public void init(FMLInitializationEvent event) {}

    public void postInit(FMLPostInitializationEvent event) {}

    public void serverStarting(FMLServerStartingEvent event) {}

    public void serverStopping(FMLServerStoppingEvent event) {}

}
