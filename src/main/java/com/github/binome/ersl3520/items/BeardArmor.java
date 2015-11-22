package com.github.binome.ersl3520.items;

import com.github.binome.ersl3520.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class BeardArmor extends ItemArmor {

//	public ItemModArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
//		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
//		// TODO Auto-generated constructor stub
//	}

	public String textureName;

	public BeardArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
	    super(material, 0, type);
	    this.textureName = textureName;
	    this.setUnlocalizedName(unlocalizedName);
	    this.setTextureName(Reference.MODID + ":" + unlocalizedName);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return Reference.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}
