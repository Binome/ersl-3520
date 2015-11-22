package com.github.binome.ersl3520.init;

import com.github.binome.ersl3520.helpers.RegisterHelper;
import com.github.binome.ersl3520.items.PointerStick;
import com.github.binome.ersl3520.items.ItemModArmor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ERSLItems
{
    public static ArmorMaterial beard = EnumHelper.addArmorMaterial("beard", 10, new int[]{1, 3, 2, 1}, 45);
    
	//The little stick with a hand on it that Tanis has.
	public static Item pointerStick = new PointerStick("pointerStick");
	public static Item tutorialHelmet = new ItemModArmor("tutorial_helmet", beard, "tutorial", 0);
	public static Item tutorialChestplate = new ItemModArmor("tutorial_chestplate", beard, "tutorial", 1);
	
	
	
	public static void registerItems()
	{
		RegisterHelper.registerItem(pointerStick);
		RegisterHelper.registerItem(tutorialHelmet); //0 for helmet
		RegisterHelper.registerItem(tutorialChestplate); // 1 for chestplate
	}
	
	
}