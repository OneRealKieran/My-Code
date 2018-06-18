package com.onerealkieran.afewthingsmod.tabs;

import com.onerealkieran.afewthingsmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class AFewThingsTab extends CreativeTabs
{
	public AFewThingsTab(String label) { super("afewthingstab");
	this.setBackgroundImageName("am.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.IRON_ROD);}
}
