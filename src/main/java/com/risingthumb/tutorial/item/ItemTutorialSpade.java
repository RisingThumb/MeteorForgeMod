package com.risingthumb.tutorial.item;

import com.risingthumb.tutorial.TutorialMod;

import net.minecraft.item.ItemSpade;

public class ItemTutorialSpade extends ItemSpade {
	
	public ItemTutorialSpade(ToolMaterial material) {
		super(material);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}

}
