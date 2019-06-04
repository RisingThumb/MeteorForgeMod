package com.risingthumb.tutorial.item;

import com.risingthumb.tutorial.TutorialMod;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemMeteorArmor extends ItemArmor {
	
	public ItemMeteorArmor(ArmorMaterial material, EntityEquipmentSlot equipmentSlot) {
		super(material, 0, equipmentSlot);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}

}
