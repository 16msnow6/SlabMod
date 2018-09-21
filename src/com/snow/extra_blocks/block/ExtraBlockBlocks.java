package com.snow.extra_blocks.block;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class ExtraBlockBlocks
{
	//Blocks
	public static Block block = new ExampleBlock();
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		IForgeRegistry<Block> registry = event.getRegistry();
		//blocks
		final Block[] blocks = {block};
		
		for(Block block : blocks) {
			registry.register(block);
		}

	}

}