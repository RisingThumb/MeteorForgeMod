package com.risingthumb.tutorial.item;

import com.risingthumb.tutorial.TutorialMod;

import net.minecraft.item.ItemPickaxe;

public class ItemTutorialPickaxe extends ItemPickaxe {
	
	public ItemTutorialPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}

}
