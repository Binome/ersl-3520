package com.github.binome.ersl3520;

import com.github.binome.ersl3520.init.ERSLBlocks;
import com.github.binome.ersl3520.init.ERSLItems;
import com.github.binome.ersl3520.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ERSL
{
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	@Instance(Reference.MODID)
	public static ERSL instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ERSLItems.registerItems();
		ERSLBlocks.registerBlocks();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		ItemStack dbStack = new ItemStack(Blocks.diamond_block);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ERSLBlocks.tanisBlock), dbStack, dbStack, dbStack, dbStack, dbStack, dbStack, dbStack, dbStack, dbStack);
        GameRegistry.addRecipe(new ItemStack(ERSLItems.pointerStick), "xyx", " z ", " z ",
                'x', new ItemStack(Blocks.lapis_block),
                'y', new ItemStack(Items.quartz),
                'z', new ItemStack(Items.blaze_rod));
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
