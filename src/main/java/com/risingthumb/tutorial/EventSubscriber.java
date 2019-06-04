package com.risingthumb.tutorial;

import com.risingthumb.tutorial.block.BlockFirstBlock;
import com.risingthumb.tutorial.block.BlockMeteorOre;
import com.risingthumb.tutorial.init.ModBlocks;
import com.risingthumb.tutorial.item.ItemFirstItem;
import com.risingthumb.tutorial.item.ItemMeteorArmor;
import com.risingthumb.tutorial.item.ItemMeteorIngot;
import com.risingthumb.tutorial.item.ItemTutorialAxe;
import com.risingthumb.tutorial.item.ItemTutorialHoe;
import com.risingthumb.tutorial.item.ItemTutorialPickaxe;
import com.risingthumb.tutorial.item.ItemTutorialSpade;
import com.risingthumb.tutorial.item.ItemTutorialSword;
import com.risingthumb.tutorial.material.TutorialMaterials;

import net.minecraft.block.Block;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = TutorialMod.MODID)
public final class EventSubscriber {
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				new BlockFirstBlock().setRegistryName("first_block").setUnlocalizedName(TutorialMod.MODID+"."+"first_block"),
				new BlockMeteorOre().setRegistryName("meteor_ore").setUnlocalizedName(TutorialMod.MODID+"."+"meteor_ore"),
		};
		
		event.getRegistry().registerAll(blocks);
	}
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new ItemFirstItem().setRegistryName("first_item").setUnlocalizedName(TutorialMod.MODID+"."+"first_item"),
				new ItemMeteorIngot().setRegistryName("meteor_ingot").setUnlocalizedName(TutorialMod.MODID+"."+"meteor_ingot"),
				new ItemTutorialAxe(TutorialMaterials.TUTORIAL_TOOL).setRegistryName("tutorial_axe").setUnlocalizedName(TutorialMod.MODID+"."+"tutorial_axe"),
				new ItemTutorialHoe(TutorialMaterials.TUTORIAL_TOOL).setRegistryName("tutorial_hoe").setUnlocalizedName(TutorialMod.MODID+"."+"tutorial_hoe"),
				new ItemTutorialPickaxe(TutorialMaterials.TUTORIAL_TOOL).setRegistryName("tutorial_pickaxe").setUnlocalizedName(TutorialMod.MODID+"."+"tutorial_pickaxe"),
				new ItemTutorialSpade(TutorialMaterials.TUTORIAL_TOOL).setRegistryName("tutorial_shovel").setUnlocalizedName(TutorialMod.MODID+"."+"tutorial_shovel"),
				new ItemTutorialSword(TutorialMaterials.TUTORIAL_TOOL).setRegistryName("tutorial_sword").setUnlocalizedName(TutorialMod.MODID+"."+"tutorial_sword"),
				new ItemMeteorArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.HEAD).setRegistryName("meteor_helmet").setUnlocalizedName(TutorialMod.MODID+"."+"meteor_helmet"),
				new ItemMeteorArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.CHEST).setRegistryName("meteor_chestplate").setUnlocalizedName(TutorialMod.MODID+"."+"meteor_chestplate"),
				new ItemMeteorArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.LEGS).setRegistryName("meteor_leggings").setUnlocalizedName(TutorialMod.MODID+"."+"meteor_leggings"),
				new ItemMeteorArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.FEET).setRegistryName("meteor_boots").setUnlocalizedName(TutorialMod.MODID+"."+"meteor_boots"),
		};
		final Item[] itemBlocks = {
				new ItemBlock(ModBlocks.FIRST_BLOCK).setRegistryName(ModBlocks.FIRST_BLOCK.getRegistryName()),
				new ItemBlock(ModBlocks.METEOR_ORE).setRegistryName(ModBlocks.METEOR_ORE.getRegistryName()),
		};
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}

}
