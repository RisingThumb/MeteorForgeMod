package com.risingthumb.tutorial.client;

import com.risingthumb.tutorial.init.ModBlocks;
import com.risingthumb.tutorial.init.ModItems;
import com.risingthumb.tutorial.TutorialMod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid = TutorialMod.MODID, value = Side.CLIENT)
public final class ClientEventSubscriber {
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.FIRST_ITEM);
		registerModel(ModItems.METEOR_INGOT);
		registerModel(ModItems.TUTORIAL_AXE);
		registerModel(ModItems.TUTORIAL_PICKAXE);
		registerModel(ModItems.TUTORIAL_SHOVEL);
		registerModel(ModItems.TUTORIAL_SWORD);
		registerModel(ModItems.TUTORIAL_HOE);
		registerModel(Item.getItemFromBlock(ModBlocks.FIRST_BLOCK));
		registerModel(Item.getItemFromBlock(ModBlocks.METEOR_ORE));
		registerModel(ModItems.METEOR_HELMET);
		registerModel(ModItems.METEOR_CHESTPLATE);
		registerModel(ModItems.METEOR_LEGGINGS);
		registerModel(ModItems.METEOR_BOOTS);
	}
	
	private static void registerModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}

}
