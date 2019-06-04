package com.risingthumb.tutorial.material;

import com.risingthumb.tutorial.TutorialMod;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TutorialMaterials {
	
	public static final ToolMaterial TUTORIAL_TOOL = EnumHelper.addToolMaterial(TutorialMod.MODID+":"+"tutorial_tool",4, 625, 9.0F, 2.5F, 10);
	
	public static final ArmorMaterial TUTORIAL_ARMOR = EnumHelper.addArmorMaterial(TutorialMod.MODID+"meteor_armor", TutorialMod.MODID+":meteor", 17, new int[] {2,5,6,3}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);}
