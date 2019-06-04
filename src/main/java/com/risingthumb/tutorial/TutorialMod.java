package com.risingthumb.tutorial;

import org.apache.logging.log4j.Logger;

import com.risingthumb.tutorial.proxy.IProxy;
import com.risingthumb.tutorial.recipes.ModRecipes;
import com.risingthumb.tutorial.tabs.TutorialTab;
import com.risingthumb.tutorial.world.gen.TutorialWorldGen;

import org.apache.logging.log4j.LogManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid=TutorialMod.MODID, name=TutorialMod.NAME, version= TutorialMod.VERSION, acceptedMinecraftVersions=TutorialMod.MC_VERSION)
public class TutorialMod {
	public static final String MODID="tutorialmod";
	public static final String NAME="Aaron's Tutorial Mod";
	public static final String VERSION="1.0";
	public static final String MC_VERSION="[1.12.2]";
	
	public static final CreativeTabs TUTORIAL_TAB = new TutorialTab();
	
	public static final Logger LOGGER = LogManager.getLogger(TutorialMod.MODID);
	
	public static final String CLIENT="com.risingthumb.tutorial.proxy.ClientProxy";
	public static final String SERVER="com.risingthumb.tutorial.proxy.ServerProxy";
	
	@SidedProxy(clientSide=TutorialMod.CLIENT, serverSide=TutorialMod.SERVER)
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(TutorialMod.NAME + "says hi!");
		proxy.init(event);
		ModRecipes.initSmelting();
		GameRegistry.registerWorldGenerator(new TutorialWorldGen(), 0);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
		
	}

}
