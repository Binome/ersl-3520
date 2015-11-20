package com.github.binome.ersl3520.init;

import com.github.binome.ersl3520.blocks.TanisBlock;
import com.github.binome.ersl3520.helpers.RegisterHelper;

import net.minecraft.block.Block;

public class ERSLBlocks
{
	public static Block tanisBlock = new TanisBlock("tanisBlock");
	
	
	public static void registerBlocks()
	{
		RegisterHelper.registerBlock(tanisBlock);
	}
	
}
