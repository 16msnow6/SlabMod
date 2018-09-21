/**
 * an example class to ensure that a block can be made
 * delete before releasing anything to the public
 */
package com.snow.extra_blocks.block;

import com.snow.extra_blocks.item.TabExtraBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ExampleBlock extends Block {

	public ExampleBlock() {
		super(Material.CLAY);
		setCreativeTab(TabExtraBlocks.instance);
		setUnlocalizedName("block");
		setRegistryName("block");
	}
}