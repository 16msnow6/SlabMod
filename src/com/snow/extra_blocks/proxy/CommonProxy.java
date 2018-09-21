package com.snow.extra_blocks.proxy;

import com.snow.extra_blocks.block.ExtraBlockBlocks;
import com.snow.extra_blocks.client.util.ModdleManager;
import com.snow.extra_blocks.item.ExtraBlockItems;

import net.minecraftforge.common.MinecraftForge;

public abstract class CommonProxy {

	public void preInit() {
		//MinecraftForge.EVENT_BUS.register(AlterniaSoundHandler.instance);
		MinecraftForge.EVENT_BUS.register(ExtraBlockBlocks.class);
		MinecraftForge.EVENT_BUS.register(ExtraBlockItems.class);
		MinecraftForge.EVENT_BUS.register(ModdleManager.class);
		//MinecraftForge.EVENT_BUS.register(BiomeAlternia.class);
		
		//AlterniaSoundHandler.initSound();
		
		//AlterniaCriteriaTriggers.register();
	};
	public void init() {		
		//register ore generation
//		OreHandler oreHandler = new OreHandler();
//		GameRegistry.registerWorldGenerator(oreHandler, 0);
		
		//register GUI handler
//		NetworkRegistry.INSTANCE.registerGuiHandler(Minestuck.instance, new GuiHandler());
		
//		AlterniaEntities.registerEntities();
		//Register structures
//		MapGenStructureIO.registerStructure(StructureCastleStart.class, "SkaiaCastle");
//		MapGenLandStructure.registerStructures();
	}
	public void postInit() {
		
	}
}
