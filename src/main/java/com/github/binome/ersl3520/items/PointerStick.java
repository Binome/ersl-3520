package com.github.binome.ersl3520.items;

import com.github.binome.ersl3520.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class PointerStick extends ItemSword
{
	public PointerStick(String name, ToolMaterial mat)
	{
		super(mat);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName(name);
		this.setTextureName(Reference.MODID + ":" + name);
	}
}
