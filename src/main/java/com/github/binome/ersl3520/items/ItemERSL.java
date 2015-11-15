package com.github.binome.ersl3520.items;

import com.github.binome.ersl3520.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemERSL extends Item
{
	public ItemERSL(String name)
	{
		super();
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName(name);
		this.setTextureName(Reference.MODID + ":" + name);
	}
}
