package com.snow.extra_blocks.item;

import com.snow.extra_blocks.Extra_blocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabExtraBlocks extends CreativeTabs
{
	public static final TabExtraBlocks instance = new TabExtraBlocks("tab_"+Extra_blocks.name);
	
	private TabExtraBlocks(String label)
	{
		super(label);
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ExtraBlockItems.item);
	}
}