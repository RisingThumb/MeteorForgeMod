package com.risingthumb.tutorial.recipes;

import com.risingthumb.tutorial.init.ModBlocks;
import com.risingthumb.tutorial.init.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void initSmelting() {
		GameRegistry.addSmelting(ModBlocks.METEOR_ORE, new ItemStack(ModItems.METEOR_INGOT),10.0F);
	}

}
