package net.vtr0_o.devoice;

import cpw.mods.fml.common.event.*;
import net.vtr0_o.devoice.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;

@Mod(
    modid = DeVoiceMod.MODID,
    version = Tags.VERSION,
    name = DeVoiceMod.MODNAME,
    acceptedMinecraftVersions = "[1.7.10]"
)
public class DeVoiceMod {

    public static final String MODID = "devoice";
    public static final String MODNAME = "DeVoice";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(
        clientSide = "net.vtr0_o.devoice.proxy.ClientProxy",
        serverSide = "net.vtr0_o.devoice.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }

    @Mod.EventHandler
    public void serverStopping(FMLServerStoppingEvent event) {
        proxy.serverStopping(event);
    }

}
