package com.risingthumb.tutorial.item;

import com.risingthumb.tutorial.TutorialMod;

import net.minecraft.item.ItemHoe;

public class ItemTutorialHoe extends ItemHoe {
	
	public ItemTutorialHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}

}
