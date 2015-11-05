package com.github.binome.ersl3520.init;

import com.github.binome.ersl3520.helpers.RegisterHelper;

import net.minecraft.item.Item;

public class ERSLItems
{
	public static Item testItem = new ItemERSL("testItem");
	
	public static void registerItems()
	{
		RegisterHelper.registerItem(testItem);
	}
}
