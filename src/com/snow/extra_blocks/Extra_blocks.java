package com.snow.extra_blocks;
import com.snow.extra_blocks.proxy.ClientProxy;
import com.snow.extra_blocks.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Extra_blocks.modId, name = Extra_blocks.name+Reference.MOD_VERSION, version = Extra_blocks.version, acceptedMinecraftVersions = "["+Extra_blocks.version+"]")
public class Extra_blocks {

	public static final String modId = Reference.MOD_ID;
	public static final String name = Reference.NAME;
	public static final String version = Reference.MINECRAFT_VERSION;

	@Mod.Instance(modId)
	public static Extra_blocks instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		if(event.getSide().isClient())
		{
			ClientProxy.registerRenderers();
		}
	}
	

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;

}