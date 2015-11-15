package com.github.binome.ersl3520.blocks;

import com.github.binome.ersl3520.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockERSL extends Block
{
    public BlockERSL(String name)
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName(name);
        this.setBlockTextureName(Reference.MODID + ":" + name);
    }
}