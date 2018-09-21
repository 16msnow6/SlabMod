package com.snow.extra_blocks.item;

import com.snow.extra_blocks.block.ExtraBlockBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class ExtraBlockItems
{
	//the tab for future reference
	public static CreativeTabs modTab = TabExtraBlocks.instance;
	
	
	public static Item item= new ExampleItem();
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		//get the registry
		IForgeRegistry<Item> registry = event.getRegistry();
		/**-----------------------------------
		 * items
		 *-------------------------------------*/		
		registerItem(registry,item,"item");
		/**-----------------------------------
		 *blocks
		 -------------------------------------*/
		registerItemBlock(registry,new ItemBlock(ExtraBlockBlocks.block));
	}
	private static Item registerItem(IForgeRegistry<Item> registry,Item item, String name) {
		item.setCreativeTab(modTab);
		item.setUnlocalizedName(name);
		item.setRegistryName(name);
		registry.register(item);
		return item;
	}
	

	
	private static Item registerItemBlock(IForgeRegistry<Item> registry, ItemBlock item)
	{
		registry.register(item.setRegistryName(item.getBlock().getRegistryName()));
		return item;
	}
}
