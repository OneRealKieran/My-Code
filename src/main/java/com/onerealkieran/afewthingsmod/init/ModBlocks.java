package com.onerealkieran.afewthingsmod.init;

import java.util.ArrayList;
import java.util.List;

import com.onerealkieran.afewthingsmod.blocks.BlockBase;
import com.onerealkieran.afewthingsmod.blocks.chiseledlantern;
import com.onerealkieran.afewthingsmod.blocks.light;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
		
	public static final Block LIGHT = new light("light", Material.ROCK);
	public static final Block CHISELED_LANTERN = new chiseledlantern("chiseled_lantern", Material.ROCK);
	public static final Block OAK_BARK_BLOCK = new BlockBase("oak_bark_block", Material.WOOD);
	public static final Block SPRUCE_BARK_BLOCK = new BlockBase("spruce_bark_block", Material.WOOD);
	
}
 