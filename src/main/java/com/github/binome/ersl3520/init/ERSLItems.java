package com.github.binome.ersl3520.init;

import com.github.binome.ersl3520.helpers.RegisterHelper;
import com.github.binome.ersl3520.items.ItemERSL;

import net.minecraft.item.Item;

public class ERSLItems
{
	//The little stick with a hand on it that Tanis has.
	public static Item pointerStick = new ItemERSL("pointerStick");
	
	public static void registerItems()
	{
		RegisterHelper.registerItem(pointerStick);
	}
}