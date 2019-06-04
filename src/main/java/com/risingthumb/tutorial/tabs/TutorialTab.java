package com.risingthumb.tutorial.tabs;

import com.risingthumb.tutorial.TutorialMod;
import com.risingthumb.tutorial.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TutorialTab extends CreativeTabs {
	
	public TutorialTab() {
		super(TutorialMod.MODID);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FIRST_ITEM);
	}

}
