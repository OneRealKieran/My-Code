package com.onerealkieran.afewthingsmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class light extends BlockBase
{
	public static final AxisAlignedBB LIGHT_AABB = new AxisAlignedBB(0.25D, 0.875, 0.25D, 0.75D, 1D, 0.75D);

	public light(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setLightLevel(1.0F);
		setLightOpacity(1);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return LIGHT_AABB;
	}
}