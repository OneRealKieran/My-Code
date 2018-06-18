package com.onerealkieran.afewthingsmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class chiseledlantern extends BlockBase
{

	public chiseledlantern(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(1.0F);
        //setLightOpacity(1);
		//setBlockUnbreakable();
	}
}
