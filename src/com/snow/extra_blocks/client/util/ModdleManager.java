package com.snow.extra_blocks.client.util;

import static com.snow.extra_blocks.block.ExtraBlockBlocks.*;
import static com.snow.extra_blocks.item.ExtraBlockItems.*;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class ModdleManager {
	@SubscribeEvent
	public static void handleModelRegistry(ModelRegistryEvent event) {
		itemModels();
		blockModels();
	}
	private static void itemModels() {
		register(item);
	}
	private static void blockModels() {
		register(block);
	}
	
	
	
	private static void register(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	private static void register(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		if(item == Items.AIR)
			throw new IllegalArgumentException("That block doesn't have an item, and this method is only intended for blocks with a connected itemblock.");
		register(item);
	}
}
