package com.risingthumb.tutorial.item;

import com.risingthumb.tutorial.TutorialMod;

import net.minecraft.item.ItemAxe;

public class ItemTutorialAxe extends ItemAxe {

	public ItemTutorialAxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}

	public ItemTutorialAxe(ToolMaterial material) {
		this(material, 8.0F, -3.1F);
	}
}