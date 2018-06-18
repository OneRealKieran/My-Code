package com.onerealkieran.afewthingsmod.items;

import com.onerealkieran.afewthingsmod.Main;
import com.onerealkieran.afewthingsmod.init.ModItems;
import com.onerealkieran.afewthingsmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.afewthingstab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
