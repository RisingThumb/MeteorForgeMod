package com.risingthumb.tutorial.item;

import com.risingthumb.tutorial.TutorialMod;

import net.minecraft.item.ItemSword;

public class ItemTutorialSword extends ItemSword {
	
	public ItemTutorialSword(ToolMaterial material) {
		super(material);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}

}
