package com.github.binome.ersl3520.init;

import com.github.binome.ersl3520.helpers.RegisterHelper;
import com.github.binome.ersl3520.items.PointerStick;
import com.github.binome.ersl3520.items.BeardArmor;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ERSLItems
{
    public static ArmorMaterial beard = EnumHelper.addArmorMaterial("beard", 10, new int[]{1, 3, 2, 1}, 45);
    public static ToolMaterial pointerMat = EnumHelper.addToolMaterial("pointerMat", 3, 1000, 15.0f, 20.0f, 20);
    
	//The little stick with a hand on it that Tanis has.
	public static Item pointerStick = new PointerStick("pointerStick", pointerMat);
	public static Item beardHelmet = new BeardArmor("beard_helmet", beard, "tutorial", 0); //0 for helmet
	public static Item beardChestplate = new BeardArmor("beard_chestplate", beard, "tutorial", 1);// 1 for chestplate
	
	
	
	public static void registerItems()
	{
		RegisterHelper.registerItem(pointerStick);
		RegisterHelper.registerItem(beardHelmet);
		RegisterHelper.registerItem(beardChestplate); 
	}
	
	
}