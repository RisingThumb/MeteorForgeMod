package com.risingthumb.tutorial.block;

import com.risingthumb.tutorial.TutorialMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockFirstBlock extends Block {

	public BlockFirstBlock() {
		super(Material.ROCK);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe",1);
		setHardness(0.75F);
		setLightLevel(7/16f);
	}
	

}
