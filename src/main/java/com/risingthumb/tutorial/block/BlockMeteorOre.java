package com.risingthumb.tutorial.block;

import com.risingthumb.tutorial.TutorialMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockMeteorOre extends Block {

	public BlockMeteorOre() {
		super(Material.ROCK);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setLightLevel(4/16f);
		setHarvestLevel("pickaxe",3);
	}

}
