package com.bartz24.skyresources.registry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bartz24.skyresources.RandomHelper;
import com.bartz24.skyresources.References;
import com.bartz24.skyresources.alchemy.FusionCatalysts;
import com.bartz24.skyresources.alchemy.item.ItemOreAlchDust;
import com.bartz24.skyresources.base.HeatSources;
import com.bartz24.skyresources.base.MachineVariants;
import com.bartz24.skyresources.config.ConfigOptions;
import com.bartz24.skyresources.recipe.ProcessRecipeManager;
import com.bartz24.skyresources.technology.item.GemRegisterInfo;
import com.google.common.base.Strings;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModCrafting
{
	public static void init()
	{
		CraftingRegistry.addShapedOreRecipe(new ItemStack(Blocks.SNOW_LAYER, 4),
				new Object[] { "XX", 'X', new ItemStack(Items.SNOWBALL) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.survivalistFishingRod),
				new Object[] { " X", "XY", 'X', new ItemStack(Items.STICK), 'Y', new ItemStack(Items.STRING) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.cactusKnife),
				new Object[] { " #", "# ", '#', new ItemStack(ModItems.alchemyComponent, 1, 0) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.stoneKnife), new Object[] { "#  ", "#X ", " #X", 'X',
				new ItemStack(Items.STICK), '#', new ItemStack(Blocks.COBBLESTONE) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.ironKnife), new Object[] { "#  ", "#X ", " #X", 'X',
				new ItemStack(Items.STICK), '#', new ItemStack(Items.IRON_INGOT) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.diamondKnife), new Object[] { "#  ", "#X ", " #X",
				'X', new ItemStack(Items.STICK), '#', new ItemStack(Items.DIAMOND) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.stoneGrinder), new Object[] { "#  ", " # ", "  X",
				'X', new ItemStack(Items.STICK), '#', new ItemStack(Blocks.COBBLESTONE) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.ironGrinder), new Object[] { "#  ", " # ", "  X",
				'X', new ItemStack(Items.STICK), '#', new ItemStack(Items.IRON_INGOT) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.diamondGrinder), new Object[] { "#  ", " # ", "  X",
				'X', new ItemStack(Items.STICK), '#', new ItemStack(Items.DIAMOND) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.cactusFruitNeedle), new Object[] { "X", "Y", 'X',
				new ItemStack(ModItems.cactusFruit), 'Y', new ItemStack(ModItems.alchemyComponent, 1, 0) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.sandstoneInfusionStone),
				new Object[] { "X", "Y", 'X', new ItemStack(ModItems.alchemyComponent, 1, 0), 'Y',
						new ItemStack(Blocks.SANDSTONE, 1, OreDictionary.WILDCARD_VALUE) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.redSandstoneInfusionStone),
				new Object[] { "X", "Y", 'X', new ItemStack(ModItems.alchemyComponent, 1, 0), 'Y',
						new ItemStack(Blocks.RED_SANDSTONE, 1, OreDictionary.WILDCARD_VALUE) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.alchemicalInfusionStone),
				new Object[] { "X", "Y", 'X', new ItemStack(ModItems.alchemyComponent, 1, 9), 'Y',
						new ItemStack(ModItems.alchemyComponent, 1, 10) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.alchemyComponent, 1, 9),
				new Object[] { "X", "X", 'X', new ItemStack(ModItems.alchemyComponent, 1, 7) });
		CraftingRegistry.addShapelessRecipe(new ItemStack(ModItems.baseComponent, 4, 4), Items.ROTTEN_FLESH,
				new ItemStack(Items.DYE, 1, 15), new ItemStack(Items.DYE, 1, 15), new ItemStack(Items.DYE, 1, 15));
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.compressedCoalBlock), new Object[] { "XXX", "XYX",
				"XXX", 'X', new ItemStack(Blocks.COAL_BLOCK), 'Y', new ItemStack(Items.COAL) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.blazePowderBlock),
				new Object[] { "XX", "XX", 'X', new ItemStack(Items.BLAZE_POWDER) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.heavySnow),
				new Object[] { "XX", "XX", 'X', new ItemStack(ModItems.heavySnowball) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.miniFreezer),
				new Object[] { "X", "X", 'X', new ItemStack(Blocks.SNOW) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.coalInfusedBlock),
				new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.alchemyComponent, 1, 6) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.alchemyComponent, 9, 6),
				new Object[] { "X", 'X', new ItemStack(ModBlocks.coalInfusedBlock) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.darkMatterBlock),
				new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.baseComponent, 1, 3) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.lightMatterBlock),
				new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.baseComponent, 1, 7) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 9, 3),
				new Object[] { "X", 'X', new ItemStack(ModBlocks.darkMatterBlock) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 9, 7),
				new Object[] { "X", 'X', new ItemStack(ModBlocks.lightMatterBlock) });
		CraftingRegistry.addShapelessOreRecipe(new ItemStack(Blocks.SAPLING, 1, 1),
				new Object[] { new ItemStack(Blocks.DIRT, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Items.PUMPKIN_SEEDS), new ItemStack(Items.PUMPKIN_SEEDS),
						new ItemStack(Items.DYE, 1, 15) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 3, 0),
				new Object[] { " X ", "XXX", " X ", 'X', "treeSapling" });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 3, 0),
				new Object[] { " X ", "XXX", " X ", 'X', "cropWheat" });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 3, 0),
				new Object[] { " X ", "XXX", " X ", 'X', "treeLeaves" });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 3, 0),
				new Object[] { " X ", "XXX", " X ", 'X', ModItems.cactusFruit });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 3, 0),
				new Object[] { " X ", "XXX", " X ", 'X', "cropPotato" });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 3, 0),
				new Object[] { " X ", "XXX", " X ", 'X', "cropCarrot" });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 3, 0),
				new Object[] { " X ", "XXX", " X ", 'X', "sugarcane" });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 3, 0),
				new Object[] { " X ", "XXX", " X ", 'X', "dustWood" });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 3, 0),
				new Object[] { " X ", "XXX", " X ", 'X', "listAllveggie" });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 3, 0),
				new Object[] { " X ", "XXX", " X ", 'X', "listAllgrain" });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 3, 0),
				new Object[] { " X ", "XXX", " X ", 'X', "listAllfruit" });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.ironFreezer), new Object[] { "XXX", "XZX", "XXX",
				'X', "ingotFrozenIron", 'Z', new ItemStack(ModBlocks.miniFreezer) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.lightFreezer), new Object[] { "XXX", "XZX", "XXX",
				'X', new ItemStack(ModItems.baseComponent, 1, 7), 'Z', new ItemStack(ModBlocks.ironFreezer) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.dirtFurnace),
				new Object[] { "X", "Y", 'X', "dirt", 'Y', new ItemStack(ModItems.heatComponent, 1, 0) });

		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.waterExtractor),
				new Object[] { "XXX", " XX", 'X', "plankWood" });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.crucible),
				new Object[] { "X X", "X X", "XXX", 'X', new ItemStack(Items.BRICK) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.fluidDropper),
				new Object[] { "XXX", "X X", "X X", 'X', "cobblestone" });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.fleshySnowNugget, 3), new Object[] { "XX", "XY", 'X',
				new ItemStack(Items.SNOWBALL), 'Y', new ItemStack(Items.ROTTEN_FLESH) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 1, 2),
				new Object[] { "XZX", "XYX", "XYX", 'X', "ingotFrozenIron", 'Y', new ItemStack(Items.GLOWSTONE_DUST),
						'Z', new ItemStack(Items.DYE, 1, 4) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.combustionCollector),
				new Object[] { "XXX", "XYX", "XXX", 'X', "ingotIron", 'Y', new ItemStack(Blocks.HOPPER) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.quickDropper), new Object[] { "XXX", "XZX", "XYX",
				'X', "ingotIron", 'Y', new ItemStack(Blocks.DROPPER), 'Z', new ItemStack(Blocks.GLOWSTONE) });

		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.darkMatterWarper), new Object[] { "XXX", "XYX",
				"XXX", 'X', new ItemStack(Blocks.OBSIDIAN), 'Y', new ItemStack(ModItems.baseComponent, 1, 3) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.silverfishDisruptor),
				new Object[] { " Y ", " Z ", "XXX", 'X', new ItemStack(ModItems.baseComponent, 1, 3), 'Y',
						new ItemStack(Items.ENDER_EYE), 'Z', new ItemStack(ModItems.baseComponent, 1, 7) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.endPortalCore),
				new Object[] { "BYB", "AZA", "XXX", 'X', new ItemStack(ModBlocks.darkMatterBlock), 'Y',
						new ItemStack(Items.ENDER_EYE), 'Z', new ItemStack(ModItems.baseComponent, 1, 6), 'A',
						new ItemStack(ModItems.alchemyComponent, 1, 7), 'B', new ItemStack(Blocks.QUARTZ_BLOCK) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.sandyNetherrack, 4),
				new Object[] { "XY", "ZX", 'X', new ItemStack(Blocks.SAND), 'Y', new ItemStack(Items.NETHER_WART), 'Z',
						new ItemStack(Blocks.NETHERRACK) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.lifeInfuser), new Object[] { "XXX", " X ", " Y ",
				'X', "logWood", 'Y', new ItemStack(ModItems.alchemicalInfusionStone) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.lifeInjector),
				new Object[] { " Y ", " X ", "XXX", 'X', "logWood", 'Y', new ItemStack(Items.DIAMOND_SWORD) });
		CraftingRegistry.addShapelessOreRecipe(new ItemStack(ModItems.heavyExpSnowball, 3),
				new ItemStack(ModItems.heavySnowball), new ItemStack(ModItems.heavySnowball),
				new ItemStack(ModItems.heavySnowball), new ItemStack(Items.GUNPOWDER));
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.crucibleInserter),
				new Object[] { "XYX", "X X", "X X", 'X', "ingotIron", 'Y', new ItemStack(Blocks.DROPPER) });
		CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 1, 6),
				new Object[] { "XYX", "XZX", "XZX", 'X', new ItemStack(Items.QUARTZ), 'Y',
						new ItemStack(Items.DYE, 1, 4), 'Z', new ItemStack(Items.GLOWSTONE_DUST) });
		CraftingRegistry
				.addShapedOreRecipe(new ItemStack(ModBlocks.fusionTable),
						new Object[] { "XZX", "XYX", "X X", 'X', "plankWood", 'Y',
								new ItemStack(ModItems.alchComponent, 1, 1), 'Z',
								new ItemStack(ModItems.alchemyComponent, 1, 2) });
		CraftingRegistry.addShapelessOreRecipe(new ItemStack(ModBlocks.petrifiedPlanks, 4),
				new Object[] { new ItemStack(ModBlocks.petrifiedWood) });

		Object advComponent = getModMaterial("Steel") != null ? getModMaterial("Steel")
				: getModMaterial("ElectricalSteel") != null ? getModMaterial("ElectricalSteel")
						: getModMaterial("Iron");
		String coalDust = OreDictionary.getOres("dustCoal").size() > 0 ? "dustCoal" : "dustRedstone";
		String circuit = OreDictionary.getOres("circuitBasic").size() > 0 ? "circuitBasic" : "blockRedstone";
		{
			CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.baseComponent, 1, 1),
					new Object[] { "XZX", "XYX", "XZX", 'X', advComponent, 'Y', circuit, 'Z', coalDust });
			CraftingRegistry
					.addShapedOreRecipe(new ItemStack(ModBlocks.rockCrusher),
							new Object[] { "XXX", "XYX", "XZX", 'X', advComponent, 'Y',
									new ItemStack(ModItems.diamondGrinder), 'Z',
									new ItemStack(ModItems.baseComponent, 1, 1) });
			CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.rockCleaner),
					new Object[] { "XXX", "XYX", "XZX", 'X', advComponent, 'Y', new ItemStack(Items.CAULDRON), 'Z',
							new ItemStack(ModItems.baseComponent, 1, 1) });
			CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.aqueousConcentrator),
					new Object[] { "XAX", "XZX", "XYX", 'X', advComponent, 'Y',
							new ItemStack(ModItems.baseComponent, 1, 1), 'Z', new ItemStack(ModItems.waterExtractor),
							'A', new ItemStack(Blocks.SNOW) });
			CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.aqueousDeconcentrator),
					new Object[] { "XAX", "XZX", "XYX", 'X', advComponent, 'Y',
							new ItemStack(ModItems.baseComponent, 1, 1), 'Z', new ItemStack(ModItems.waterExtractor),
							'A', new ItemStack(Blocks.SAND) });
			CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.combustionController),
					new Object[] { "XXX", "XYX", "XYX", 'X', advComponent, 'Y', circuit });
			CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.wildlifeAttractor),
					new Object[] { "XXX", "XYX", "XZX", 'X', new ItemStack(Blocks.HAY_BLOCK), 'Y',
							new ItemStack(Blocks.CHEST), 'Z', new ItemStack(Items.REDSTONE) });
		}
		GameRegistry.addSmelting(ModBlocks.dryCactus, new ItemStack(Items.DYE, 1, 7), 0.2F);

		GameRegistry.addSmelting(new ItemStack(ModItems.baseComponent, 1, 0), new ItemStack(Items.COAL, 1, 1), 0.1F);

		GameRegistry.addSmelting(new ItemStack(ModBlocks.petrifiedWood), new ItemStack(Items.COAL, 1, 1), 0.1F);

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Blocks.SAPLING, 1, 4), 10,
				new ArrayList<Object>(Arrays.asList(new ItemStack(ModItems.alchemyComponent, 10, 0),
						new ItemStack(ModBlocks.cactusFruitNeedle))));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Blocks.SAPLING, 1, 0), 10,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.APPLE, 4, 0), "treeSapling")));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Blocks.DIRT, 1, 1), 15, new ArrayList<Object>(
				Arrays.asList(new ItemStack(ModItems.cactusFruit, 4), new ItemStack(Blocks.SAND, 1, 1))));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Blocks.CACTUS, 3), 8,
				new ArrayList<Object>(Arrays.asList(new ItemStack(ModItems.alchemyComponent, 6, 0),
						new ItemStack(Blocks.CACTUS, 1, OreDictionary.WILDCARD_VALUE))));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Blocks.DEADBUSH), 10,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.ROTTEN_FLESH, 4), "treeSapling")));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Blocks.GRASS, 1), 14,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.WHEAT_SEEDS, 4), new ItemStack(Blocks.DIRT))));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Blocks.MYCELIUM, 1), 16, new ArrayList<Object>(
				Arrays.asList(new ItemStack(Blocks.BROWN_MUSHROOM, 4), new ItemStack(Blocks.DIRT))));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Items.APPLE), 10,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.SUGAR, 3),
						new ItemStack(Blocks.HAY_BLOCK, 1, OreDictionary.WILDCARD_VALUE))));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Blocks.SAPLING, 1, 3), 19,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.DYE, 10, 3), "treeSapling")));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Blocks.SAPLING, 1, 2), 19,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.DYE, 10, 15), "treeSapling")));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Items.REEDS), 17,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.SPECKLED_MELON, 3),
						new ItemStack(Blocks.PUMPKIN, 1, OreDictionary.WILDCARD_VALUE))));
		
		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Blocks.CHORUS_FLOWER), 19,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.CHORUS_FRUIT_POPPED, 3),
						new ItemStack(Blocks.RED_MUSHROOM))));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Items.CHORUS_FRUIT), 12,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.ENDER_EYE, 4),
						new ItemStack(Blocks.MELON_BLOCK, 1, OreDictionary.WILDCARD_VALUE))));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Items.NETHER_WART), 12,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.SPIDER_EYE, 4),
						new ItemStack(Blocks.TALLGRASS, 1, OreDictionary.WILDCARD_VALUE))));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Blocks.RED_MUSHROOM), 12,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.DYE, 8, 1),
						new ItemStack(Blocks.TALLGRASS, 1, OreDictionary.WILDCARD_VALUE))));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(Blocks.BROWN_MUSHROOM), 12,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.DYE, 8, 3),
						new ItemStack(Blocks.TALLGRASS, 1, OreDictionary.WILDCARD_VALUE))));

		ProcessRecipeManager.infusionRecipes.addRecipe(new ItemStack(ModItems.healthGem), 15,
				new ArrayList<Object>(Arrays.asList(new ItemStack(ModItems.alchemyComponent, 1, 10),
						new ItemStack(Blocks.CHORUS_FLOWER, 1, OreDictionary.WILDCARD_VALUE))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Items.COAL, 1), 170,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.COAL, 1, 1))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Items.BLAZE_POWDER, 3), 75,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.GUNPOWDER))));
		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Items.GUNPOWDER, 3), 1120,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.FLINT))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Items.DIAMOND, 1), 1600,
				new ArrayList<Object>(Arrays.asList(new ItemStack(ModBlocks.compressedCoalBlock, 1))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Blocks.SAND, 12, 1), 200,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Blocks.SAND, 12), new ItemStack(Items.DYE, 1, 1))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(ModBlocks.dryCactus), 400,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Blocks.BONE_BLOCK), new ItemStack(Items.DYE, 8, 7),
						new ItemStack(ModItems.baseComponent, 8, 0))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Items.REDSTONE, 4), 880, new ArrayList<Object>(
				Arrays.asList(new ItemStack(Items.GUNPOWDER, 2), new ItemStack(Items.BLAZE_POWDER, 2))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Items.WHEAT_SEEDS, 1), 50,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Blocks.DEADBUSH, 1), new ItemStack(Items.FLINT, 2))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Blocks.DIRT), 100,
				new ArrayList<Object>(Arrays.asList(new ItemStack(ModItems.baseComponent, 4, 0))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Items.SLIME_BALL), 200, new ArrayList<Object>(
				Arrays.asList(new ItemStack(ModItems.baseComponent, 8, 0), new ItemStack(Items.SNOWBALL))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Items.POISONOUS_POTATO, 4), 650,
				new ArrayList<Object>(
						Arrays.asList(new ItemStack(Items.POTATO, 4, 0), new ItemStack(Items.ROTTEN_FLESH))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(ModItems.techComponent, 6, 1), 1400,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.POISONOUS_POTATO, 1),
						new ItemStack(Items.SPIDER_EYE, 2), new ItemStack(Items.GUNPOWDER, 4))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Items.PRISMARINE_SHARD, 4), 1900,
				new ArrayList<Object>(
						Arrays.asList(new ItemStack(Items.QUARTZ, 4), new ItemStack(Blocks.MOSSY_COBBLESTONE))));
		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Items.PRISMARINE_CRYSTALS, 4), 1440,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.QUARTZ, 1), new ItemStack(Blocks.GLASS, 3))));

		ItemStack waterBottle = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER);

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Items.SNOWBALL), 400,
				new ArrayList<Object>(Arrays.asList(waterBottle)));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Blocks.NETHERRACK, 8), 920,
				new ArrayList<Object>(
						Arrays.asList(new ItemStack(Blocks.COBBLESTONE, 8), new ItemStack(Items.BLAZE_POWDER, 3))));

		String hardestIngot = "ingotGold";
		String hardestIngot2 = "ingotIron";
		String hardestIngot3 = "ingotBrick";
		if (OreDictionary.getOres("ingotSteel").size() > 0)
		{
			hardestIngot3 = hardestIngot2.substring(0);
			hardestIngot2 = hardestIngot.substring(0);
			hardestIngot = "ingotSteel";
		}
		if (OreDictionary.getOres("ingotTungsten").size() > 0)
		{
			hardestIngot3 = hardestIngot2.substring(0);
			hardestIngot2 = hardestIngot.substring(0);
			hardestIngot = "ingotTungsten";
		}
		if (OreDictionary.getOres("ingotPlatinum").size() > 0)
		{
			hardestIngot3 = hardestIngot2.substring(0);
			hardestIngot2 = hardestIngot.substring(0);
			hardestIngot = "ingotPlatinum";
		}
		if (OreDictionary.getOres("ingotEnderium").size() > 0)
		{
			hardestIngot3 = hardestIngot2.substring(0);
			hardestIngot2 = hardestIngot.substring(0);
			hardestIngot = "ingotEnderium";
		}
		if (OreDictionary.getOres("ingotRefinedObsidian").size() > 0)
		{
			hardestIngot3 = hardestIngot2.substring(0);
			hardestIngot2 = hardestIngot.substring(0);
			hardestIngot = "ingotRefinedObsidian";
		}
		if (OreDictionary.getOres("ingotTungstensteel").size() > 0)
		{
			hardestIngot3 = hardestIngot2.substring(0);
			hardestIngot2 = hardestIngot.substring(0);
			hardestIngot = "ingotTungstensteel";
		}
		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(ModItems.baseComponent, 1, 3), 2900,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Blocks.SOUL_SAND, 5),
						new ItemStack(ModBlocks.compressedCoalBlock, 3),
						new ItemStack(getModPriority(OreDictionary.getOres(hardestIngot)).getItem(), 1,
								getModPriority(OreDictionary.getOres(hardestIngot)).getMetadata()),
						new ItemStack(getModPriority(OreDictionary.getOres(hardestIngot2)).getItem(), 2,
								getModPriority(OreDictionary.getOres(hardestIngot2)).getMetadata()),
						new ItemStack(getModPriority(OreDictionary.getOres(hardestIngot3)).getItem(), 4,
								getModPriority(OreDictionary.getOres(hardestIngot3)).getMetadata()))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(ModItems.baseComponent, 1, 7), 3400,
				new ArrayList<Object>(Arrays.asList(new ItemStack(ModBlocks.heavySnow, 5),
						new ItemStack(ModItems.techComponent, 4, 2), new ItemStack(ModItems.alchemyComponent, 4, 7),
						new ItemStack(Blocks.END_STONE, 3))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Items.GLOWSTONE_DUST, 5), 1700,
				new ArrayList<Object>(
						Arrays.asList(new ItemStack(Items.REDSTONE, 4), new ItemStack(Items.BLAZE_POWDER, 2))));

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(Blocks.END_STONE, 1), 1800,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Blocks.STONE, 6, 3), new ItemStack(Items.SUGAR, 2),
						new ItemStack(Items.ENDER_PEARL, 4), new ItemStack(Items.QUARTZ, 2),
						new ItemStack(Blocks.BONE_BLOCK, 4))));

		ProcessRecipeManager.rockGrinderRecipes.addRecipe(new ItemStack(Blocks.GRAVEL), 1,
				new ItemStack(Blocks.COBBLESTONE));
		ProcessRecipeManager.rockGrinderRecipes.addRecipe(new ItemStack(Blocks.SAND), 1, new ItemStack(Blocks.GRAVEL));
		ProcessRecipeManager.rockGrinderRecipes.addRecipe(new ItemStack(Items.FLINT), .3f,
				new ItemStack(Blocks.GRAVEL));
		ProcessRecipeManager.rockGrinderRecipes.addRecipe(new ItemStack(ModItems.techComponent, 1, 0), 0.44f,
				new ItemStack(Blocks.STONE));
		ProcessRecipeManager.rockGrinderRecipes.addRecipe(new ItemStack(ModItems.techComponent, 1, 3), 0.44f,
				new ItemStack(Blocks.NETHERRACK));
		ProcessRecipeManager.rockGrinderRecipes.addRecipe(new ItemStack(ModItems.baseComponent, 1, 5), 1.5f, "logWood");

		ProcessRecipeManager.knifeRecipes.addRecipe(new ItemStack(ModItems.cactusFruit, 2), 0,
				new ItemStack(Blocks.CACTUS, 1, OreDictionary.WILDCARD_VALUE));
		ProcessRecipeManager.knifeRecipes.addRecipe(new ItemStack(Items.MELON, 9), 0,
				new ItemStack(Blocks.MELON_BLOCK));

		for (int i = 0; i < 4; i++)
		{
			ProcessRecipeManager.knifeRecipes.addRecipe(new ItemStack(Blocks.PLANKS, 6, i), 0,
					new ItemStack(Blocks.LOG, 1, i));
		}
		for (int i = 0; i < 2; i++)
		{
			ProcessRecipeManager.knifeRecipes.addRecipe(new ItemStack(Blocks.PLANKS, 6, i + 4), 0,
					new ItemStack(Blocks.LOG2, 1, i));
		}
		for (int i = 0; i < 6; i++)
		{
			ProcessRecipeManager.knifeRecipes.addRecipe(new ItemStack(Items.STICK, 6), 0,
					new ItemStack(Blocks.PLANKS, 1, i));
		}
		ProcessRecipeManager.knifeRecipes.addRecipe(new ItemStack(ModBlocks.petrifiedPlanks, 6), 0,
				new ItemStack(ModBlocks.petrifiedWood));
		ProcessRecipeManager.knifeRecipes.addRecipe(new ItemStack(Items.STICK, 6), 0,
				new ItemStack(ModBlocks.petrifiedPlanks));

		for (int i = 0; i < ModItems.gemList.size(); i++)
		{
			String oreName = Strings.isNullOrEmpty(ModItems.gemList.get(i).oreOverride)
					? ("gem" + RandomHelper.capatilizeString(ModItems.gemList.get(i).name))
					: ModItems.gemList.get(i).oreOverride;
			if (ConfigOptions.miscSettings.allowAllGemTypes || OreDictionary.getOres(oreName).size() > 0)
				ProcessRecipeManager.rockGrinderRecipes.addRecipe(new ItemStack(ModItems.dirtyGem, 1, i),
						ModItems.gemList.get(i).rarity, ModItems.gemList.get(i).parentBlock);
		}

		ProcessRecipeManager.crucibleRecipes.addRecipe(new FluidStack(ModFluids.crystalFluid, 1000), 0,
				new ItemStack(ModItems.alchemyComponent, 1, 1));

		ProcessRecipeManager.crucibleRecipes.addRecipe(new FluidStack(FluidRegistry.LAVA, 1000), 0,
				new ItemStack(ModBlocks.blazePowderBlock));

		ProcessRecipeManager.waterExtractorExtractRecipes.addRecipe(
				new ArrayList<Object>(
						Arrays.asList(new ItemStack(ModBlocks.dryCactus), new FluidStack(FluidRegistry.WATER, 50))),
				0, new ItemStack(Blocks.CACTUS));
		ProcessRecipeManager.waterExtractorExtractRecipes.addRecipe(
				new ArrayList<Object>(Arrays.asList(ItemStack.EMPTY, new FluidStack(FluidRegistry.WATER, 50))), 0,
				new ItemStack(Blocks.SNOW));
		ProcessRecipeManager.waterExtractorExtractRecipes.addRecipe(
				new ArrayList<Object>(Arrays.asList(ItemStack.EMPTY, new FluidStack(FluidRegistry.WATER, 20))), 0,
				"treeLeaves");

		ProcessRecipeManager.waterExtractorInsertRecipes.addRecipe(new ItemStack(Blocks.CLAY), 0,
				Arrays.asList(new ItemStack(Blocks.DIRT), new FluidStack(FluidRegistry.WATER, 200)));

		ProcessRecipeManager.waterExtractorInsertRecipes.addRecipe(new ItemStack(Blocks.CACTUS), 0,
				Arrays.asList(new ItemStack(ModBlocks.dryCactus), new FluidStack(FluidRegistry.WATER, 1200)));

		ProcessRecipeManager.freezerRecipes.addRecipe(new ItemStack(ModItems.heavySnowball), 40,
				new ItemStack(Items.SNOWBALL, 4));
		ProcessRecipeManager.freezerRecipes.addRecipe(new ItemStack(Blocks.DIRT, 1, 1), 800,
				new ItemStack(ModBlocks.heavySnow));
		ProcessRecipeManager.freezerRecipes.addRecipe(new ItemStack(Blocks.ICE), 2000, waterBottle);
		ProcessRecipeManager.freezerRecipes.addRecipe(new ItemStack(ModItems.techComponent, 1, 2), 3000,
				new ItemStack(Items.IRON_INGOT));
		ProcessRecipeManager.freezerRecipes.addRecipe(new ItemStack(Blocks.SOUL_SAND), 1500,
				new ItemStack(ModBlocks.sandyNetherrack));

		for (int i = 0; i < ItemOreAlchDust.oreInfos.size(); i++)
		{
			if (!ItemOreAlchDust.oreInfos.get(i).automatic)
				continue;
			String itemIngot = "ingot" + RandomHelper.capatilizeString(ItemOreAlchDust.oreInfos.get(i).name);
			if (OreDictionary.getOres(itemIngot).size() > 0)
			{
				ItemStack output = getModPriority(OreDictionary.getOres(itemIngot)).copy();
				output.setCount(1);
				ProcessRecipeManager.condenserRecipes.addRecipe(output,
						(float) Math.pow(1.4f, ItemOreAlchDust.oreInfos.get(i).rarity) * 50f,
						Arrays.asList(new ItemStack(ModItems.oreAlchDust, 1, i),
								new FluidStack(ModFluids.crystalFluid, 1000)));
			}
			String itemOre = "ore" + RandomHelper.capatilizeString(ItemOreAlchDust.oreInfos.get(i).name);
			if (OreDictionary.getOres(itemOre).size() > 0)
			{
				ItemStack output = getModPriority(OreDictionary.getOres(itemOre)).copy();
				output.setCount(1);
				ProcessRecipeManager.condenserRecipes.addRecipe(output,
						(float) Math.pow(1.72f, ItemOreAlchDust.oreInfos.get(i).rarity) * 62f,
						Arrays.asList(new ItemStack(ModItems.oreAlchDust, 1, i),
								ItemOreAlchDust.oreInfos.get(i).parentBlock));
			}
			String itemDust = "dust" + RandomHelper.capatilizeString(ItemOreAlchDust.oreInfos.get(i).name);
			if (OreDictionary.getOres(itemDust).size() > 0)
			{
				ItemStack output = getModPriority(OreDictionary.getOres(itemDust)).copy();
				output.setCount(1);
				ProcessRecipeManager.cauldronCleanRecipes.addRecipe(output,
						1f / (((float) Math.pow((ItemOreAlchDust.oreInfos.get(i).rarity + 2.5f), 3.7f))),
						new ItemStack(ModItems.techComponent, 1, ItemOreAlchDust.oreInfos.get(i).parentBlock
								.isItemEqual(new ItemStack(Blocks.NETHERRACK)) ? 3 : 0));
			}
		}

		ProcessRecipeManager.combustionRecipes.addRecipe(new ItemStack(ModItems.alchemyComponent, 5, 2), 335f,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.GUNPOWDER, 3),
						new ItemStack(Items.BLAZE_POWDER, 2), new ItemStack(Items.COAL, 1, 1))));
		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.alchemyComponent, 5, 3), 0.0025f,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.REDSTONE, 2),
						new ItemStack(Items.BLAZE_POWDER, 2), new ItemStack(ModItems.alchemyComponent, 1, 8))));
		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.alchemyComponent, 5, 4), 0.004f,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.GLOWSTONE_DUST, 2),
						new ItemStack(Items.DYE, 2, 4), new ItemStack(ModItems.alchemyComponent, 1, 7))));
		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.alchemyComponent, 5, 5), 0.035f,
				new ArrayList<Object>(Arrays.asList(new ItemStack(ModItems.baseComponent, 1, 3),
						new ItemStack(ModItems.baseComponent, 1, 7), new ItemStack(ModItems.alchemyComponent, 6, 6),
						new ItemStack(Items.EMERALD, 2), new ItemStack(ModItems.alchemyComponent, 6, 10))));

		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.alchemyComponent, 1, 6), 0.0015f,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.COAL, 1), new ItemStack(Items.GUNPOWDER, 3))));
		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.alchemyComponent, 1, 8), 0.002f,
				new ArrayList<Object>(
						Arrays.asList(new ItemStack(Items.IRON_INGOT, 1), new ItemStack(Items.BLAZE_POWDER, 3))));
		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.alchemyComponent, 1, 7), 0.005f,
				new ArrayList<Object>(
						Arrays.asList(new ItemStack(Items.GOLD_INGOT, 1), new ItemStack(Items.GLOWSTONE_DUST, 3))));
		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.alchemyComponent, 1, 10), 0.03f,
				new ArrayList<Object>(
						Arrays.asList(new ItemStack(Items.DIAMOND, 1), new ItemStack(Items.REDSTONE, 8))));
		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(Blocks.SAPLING, 1, 5), 0.0015f,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Items.NETHER_WART), new ItemStack(Items.GUNPOWDER, 2),
						new ItemStack(Items.ROTTEN_FLESH, 1))));
		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModBlocks.magmafiedStone), 0.009f,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Blocks.MAGMA), new ItemStack(Blocks.STONE),
						new ItemStack(ModItems.alchemyComponent, 2, 6))));
		ProcessRecipeManager.fusionRecipes
				.addRecipe(new ItemStack(ModBlocks.alchemicalGlass), 0.004f,
						new ArrayList<Object>(Arrays.asList(new ItemStack(Blocks.SAND),
								new ItemStack(ModItems.alchemyComponent, 1, 1),
								new ItemStack(Items.PRISMARINE_CRYSTALS))));
		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModBlocks.petrifiedWood), 0.001f,
				new ArrayList<Object>(
						Arrays.asList("logWood", new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.COAL))));
		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(Blocks.DIRT), 0.0012f, new ArrayList<Object>(
				Arrays.asList(new ItemStack(Blocks.SOUL_SAND), new ItemStack(ModItems.baseComponent, 3, 4))));

		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.alchemyComponent, 2, 1), 0.001f,
				new ArrayList<Object>(Arrays.asList(new ItemStack(Blocks.GLASS))));
		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.alchemyComponent, 16, 1), 0.006f,
				new ArrayList<Object>(Arrays.asList(new ItemStack(ModBlocks.alchemicalGlass))));
		ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(Blocks.DIRT), 0.008f,
				new ArrayList<Object>(Arrays.asList(new ItemStack(ModItems.baseComponent, 6, 0))));

		List<ItemStack> componentsOreDust = new ArrayList();
		componentsOreDust.add(new ItemStack(Items.ROTTEN_FLESH)); // iron 3
		componentsOreDust.add(new ItemStack(Items.WHEAT)); // gold 5
		componentsOreDust.add(new ItemStack(Items.PUMPKIN_SEEDS)); // copper 1
		componentsOreDust.add(new ItemStack(Items.BONE)); // tin 3
		componentsOreDust.add(new ItemStack(Items.SUGAR)); // silver 4
		componentsOreDust.add(new ItemStack(Items.WHEAT)); // zinc 2
		componentsOreDust.add(new ItemStack(Items.IRON_INGOT)); // nickel 5
		componentsOreDust.add(new ItemStack(Items.GOLD_INGOT)); // platinum 7
		componentsOreDust.add(new ItemStack(ModItems.baseComponent, 1, 4)); // aluminum
																			// 4
		componentsOreDust.add(new ItemStack(Blocks.CLAY)); // lead 4
		componentsOreDust.add(new ItemStack(Items.DYE, 1, 12)); // cobalt 6
		componentsOreDust.add(new ItemStack(Items.MAGMA_CREAM)); // ardite 6
		componentsOreDust.add(new ItemStack(Items.CLAY_BALL)); // osmium 6
		componentsOreDust.add(null); // draconium 9
		componentsOreDust.add(new ItemStack(Items.COAL, 1, 1)); // titanium 6
		componentsOreDust.add(new ItemStack(Blocks.OBSIDIAN)); // tungsten 6
		componentsOreDust.add(new ItemStack(Items.SUGAR)); // chrome 8
		componentsOreDust.add(new ItemStack(ModItems.techComponent, 1, 2)); // iridium
																			// 11
		componentsOreDust.add(new ItemStack(Blocks.SOUL_SAND)); // boron 5
		componentsOreDust.add(new ItemStack(Items.PRISMARINE_SHARD)); // lithium
																		// 7
		componentsOreDust.add(new ItemStack(ModItems.baseComponent, 1, 4)); // magnesium
																			// 5
		componentsOreDust.add(new ItemStack(Items.DIAMOND)); // mithril 9

		for (int i = 0; i < ItemOreAlchDust.oreInfos.size(); i++)
		{
			if (!ItemOreAlchDust.oreInfos.get(i).automatic)
				continue;
			String ingot = "ingot" + RandomHelper.capatilizeString(ItemOreAlchDust.oreInfos.get(i).name);
			if (OreDictionary.getOres(ingot).size() > 0)
			{
				ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.oreAlchDust, 1, i),
						ItemOreAlchDust.oreInfos.get(i).rarity * 0.0008f,
						new ArrayList<Object>(Arrays.asList(componentsOreDust.get(i),
								getOreItemDust(ItemOreAlchDust.oreInfos.get(i).rarity))));
				String dust = "dust" + RandomHelper.capatilizeString(ItemOreAlchDust.oreInfos.get(i).name);
				if (OreDictionary.getOres(dust).size() > 0)
				{
					ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.oreAlchDust, 1, i),
							ItemOreAlchDust.oreInfos.get(i).rarity * 0.0021f, new ArrayList<Object>(
									Arrays.asList(dust, getOreItemDust(ItemOreAlchDust.oreInfos.get(i).rarity))));
				}
			}
		}

		if (ConfigOptions.miscSettings.addBeetrootSeedDrop)
			MinecraftForge.addGrassSeed(new ItemStack(Items.BEETROOT_SEEDS), 10);
		if (ConfigOptions.miscSettings.addMelonSeedDrop)
			MinecraftForge.addGrassSeed(new ItemStack(Items.MELON_SEEDS), 12);
		if (ConfigOptions.miscSettings.addPumpkinSeedDrop)
			MinecraftForge.addGrassSeed(new ItemStack(Items.PUMPKIN_SEEDS), 12);
		if (ConfigOptions.miscSettings.addCocoaBeanDrop)
			MinecraftForge.addGrassSeed(new ItemStack(Items.DYE, 1, 3), 4);
		if (ConfigOptions.miscSettings.addCarrotDrop)
			MinecraftForge.addGrassSeed(new ItemStack(Items.CARROT), 7);
		if (ConfigOptions.miscSettings.addPotatoDrop)
			MinecraftForge.addGrassSeed(new ItemStack(Items.POTATO), 7);

		HeatSources.addHeatSource(Blocks.FIRE.getDefaultState(), 8);
		HeatSources.addHeatSource(Blocks.LAVA.getDefaultState(), 6);
		HeatSources.addHeatSource(Blocks.FLOWING_LAVA.getDefaultState(), 4);
		HeatSources.addHeatSource(Blocks.TORCH.getDefaultState(), 1);
		HeatSources.addHeatSource(Blocks.OBSIDIAN.getDefaultState(), 3);
		HeatSources.addHeatSource(Blocks.MAGMA.getDefaultState(), 9);

		FusionCatalysts.addCatalyst(new ItemStack(ModItems.alchemyComponent, 1, 2), 0.75f);
		FusionCatalysts.addCatalyst(new ItemStack(ModItems.alchemyComponent, 1, 3), 1.75f);
		FusionCatalysts.addCatalyst(new ItemStack(ModItems.alchemyComponent, 1, 4), 4.50f);
		FusionCatalysts.addCatalyst(new ItemStack(ModItems.alchemyComponent, 1, 5), 32.00f);

		if (OreDictionary.getOres("ingotUranium").size() > 0 || OreDictionary.getOres("oreUranium").size() > 0)
		{
			if (OreDictionary.getOres("ingotUranium").size() > 0)
			{
				ItemStack ingot = getModPriority(OreDictionary.getOres("ingotUranium")).copy();
				ingot.setCount(1);

				ProcessRecipeManager.condenserRecipes.addRecipe(ingot,
						(float) Math.pow(1.4f, ItemOreAlchDust.oreInfos.get(23).rarity) * 50f,
						Arrays.asList(new ItemStack(ModItems.oreAlchDust, 1, 23),
								new FluidStack(ModFluids.crystalFluid, 1000)));
			}
			if (OreDictionary.getOres("oreUranium").size() > 0)
			{
				ItemStack ore = getModPriority(OreDictionary.getOres("oreUranium")).copy();
				ore.setCount(1);
				ProcessRecipeManager.condenserRecipes.addRecipe(ore,
						(float) Math.pow(1.72f, ItemOreAlchDust.oreInfos.get(23).rarity) * 62f,
						Arrays.asList(new ItemStack(ModItems.oreAlchDust, 1, 23), new ItemStack(Blocks.STONE)));
			}
			ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.oreAlchDust, 1, 23),
					ItemOreAlchDust.oreInfos.get(23).rarity * 0.0008f, new ArrayList<Object>(Arrays
							.asList(new ItemStack(Items.ROTTEN_FLESH), new ItemStack(ModItems.techComponent, 1, 1))));
			if (OreDictionary.getOres("dustUranium").size() > 0)
			{
				ItemStack dust = getModPriority(OreDictionary.getOres("dustUranium")).copy();
				dust.setCount(1);
				ProcessRecipeManager.cauldronCleanRecipes.addRecipe(dust,
						1f / (((float) Math.pow((ItemOreAlchDust.oreInfos.get(23).rarity + 2.5f), 3.7f))),
						new ItemStack(ModItems.techComponent, 1, 0));
				ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.oreAlchDust, 1, 23),
						ItemOreAlchDust.oreInfos.get(23).rarity * 0.0021f,
						new ArrayList<Object>(Arrays.asList(dust, new ItemStack(ModItems.techComponent, 1, 1))));
			}
		}

		if (OreDictionary.getOres("ingotThorium").size() > 0 || OreDictionary.getOres("oreThorium").size() > 0)
		{
			if (OreDictionary.getOres("ingotThorium").size() > 0)
			{
				ItemStack ingot = getModPriority(OreDictionary.getOres("ingotThorium")).copy();
				ingot.setCount(1);

				ProcessRecipeManager.condenserRecipes.addRecipe(ingot,
						(float) Math.pow(1.4f, ItemOreAlchDust.oreInfos.get(24).rarity) * 50f,
						Arrays.asList(new ItemStack(ModItems.oreAlchDust, 1, 24),
								new FluidStack(ModFluids.crystalFluid, 1000)));
			}
			if (OreDictionary.getOres("oreThorium").size() > 0)
			{
				ItemStack ore = getModPriority(OreDictionary.getOres("oreThorium")).copy();
				ore.setCount(1);
				ProcessRecipeManager.condenserRecipes.addRecipe(ore,
						(float) Math.pow(1.72f, ItemOreAlchDust.oreInfos.get(24).rarity) * 62f,
						Arrays.asList(new ItemStack(ModItems.oreAlchDust, 1, 24), new ItemStack(Blocks.STONE)));
			}

			ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.oreAlchDust, 1, 24),
					ItemOreAlchDust.oreInfos.get(24).rarity * 0.0008f,
					new ArrayList<Object>(Arrays.asList(new ItemStack(ModItems.baseComponent, 1, 4),
							new ItemStack(ModItems.techComponent, 1, 1))));
			if (OreDictionary.getOres("dustThorium").size() > 0)
			{
				ItemStack dust = getModPriority(OreDictionary.getOres("dustThorium")).copy();
				dust.setCount(1);
				ProcessRecipeManager.cauldronCleanRecipes.addRecipe(dust,
						1f / (((float) Math.pow((ItemOreAlchDust.oreInfos.get(24).rarity + 2.5f), 3.7f))),
						new ItemStack(ModItems.techComponent, 1, 0));
				ProcessRecipeManager.fusionRecipes.addRecipe(new ItemStack(ModItems.oreAlchDust, 1, 24),
						ItemOreAlchDust.oreInfos.get(24).rarity * 0.0021f,
						new ArrayList<Object>(Arrays.asList(dust, new ItemStack(ModItems.techComponent, 1, 1))));
			}
		}
		for (GemRegisterInfo i : ModItems.gemList)
		{
			String oreName = Strings.isNullOrEmpty(i.oreOverride) ? ("gem" + RandomHelper.capatilizeString(i.name))
					: i.oreOverride;
			if (OreDictionary.getOres(oreName).size() > 0)
			{
				ProcessRecipeManager.cauldronCleanRecipes.addRecipe(
						getModPriority(OreDictionary.getOres(oreName)).copy(), 1F,
						new ItemStack(ModItems.dirtyGem, 1, ModItems.gemList.indexOf(i)));
			}
		}

		for (int i = 0; i < MachineVariants.values().length; i++)
		{
			Object material = getMaterial(i);
			Object altMaterial = getAltMaterial(i);
			Object materialDust = getMaterialDust(i, false);
			Object materialAlch = getMaterialDust(i, true);
			Object materialGear = getGear(i);

			if (material != null)
			{
				CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.heatComponent, 1, i),
						new Object[] { "XXX", "XYX", "XXX", 'X', altMaterial, 'Y', materialDust });
				CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.alchComponent, 1, i),
						new Object[] { "XXX", "XYX", "XXX", 'X', altMaterial, 'Y', materialAlch });
				if (i >= 4)
				{
					CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.condenser, 1, i),
							new Object[] { "XYX", "XZX", "X X", 'X', material, 'Y',
									new ItemStack(ModItems.alchComponent, 1, i), 'Z',
									new ItemStack(ModItems.baseComponent, 1, i >= 8 ? 6 : 2) });
					CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.combustionHeater, 1, i),
							new Object[] { "XXX", "XYX", "XZX", 'X', material, 'Y',
									new ItemStack(ModItems.heatComponent, 1, i), 'Z',
									new ItemStack(ModItems.baseComponent, 1, i >= 8 ? 6 : 2) });
				} else
				{
					CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.condenser, 1, i), new Object[] { "XYX",
							"X X", "X X", 'X', material, 'Y', new ItemStack(ModItems.alchComponent, 1, i) });
					CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.combustionHeater, 1, i), new Object[] {
							"XXX", "X X", "XYX", 'X', material, 'Y', new ItemStack(ModItems.heatComponent, 1, i) });

				}
				CraftingRegistry.addShapedOreRecipe(new ItemStack(ModItems.heatProvider, 1, i), new Object[] { "XYX",
						"XYX", "X X", 'X', material, 'Y', new ItemStack(ModItems.heatComponent, 1, i) });
				if (materialGear != null)
					CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.casing, 1, i),
							new Object[] { "XXX", "XYX", "XXX", 'X', material, 'Y', materialGear });
				else
					CraftingRegistry.addShapedOreRecipe(new ItemStack(ModBlocks.casing, 1, i),
							new Object[] { "XXX", "X X", "XXX", 'X', material });
			}
		}

		LootTableList.register(new ResourceLocation(References.ModID, "gameplay/fishingsurvivalist"));
		LootTableList.register(new ResourceLocation(References.ModID, "gameplay/fishing/survivalistjunk"));

		MachineVariants.DARKMATTER.setFuel(new ItemStack(ModItems.baseComponent, 1, 3), 31415);
		MachineVariants.LIGHTMATTER.setFuel(new ItemStack(ModItems.baseComponent, 1, 7), 27183);
		MachineVariants.LEAD.setFuel(new ItemStack(ModItems.techComponent, 1, 1), 900);
	}

	public static ItemStack getOreItemDust(int rarity)
	{
		if (rarity <= 2)
			return new ItemStack(Items.GUNPOWDER, 2);
		else if (rarity <= 4)
			return new ItemStack(Items.BLAZE_POWDER, 2);
		else if (rarity <= 6)
			return new ItemStack(Items.GLOWSTONE_DUST, 2);
		else if (rarity <= 8)
			return new ItemStack(Items.DYE, 2, 4);
		else
			return new ItemStack(ModItems.baseComponent, 2, 3);
	}

	public static ItemStack getMaterialDust(int type, boolean alch)
	{
		if (type <= 3)
			return alch ? new ItemStack(ModItems.alchemyComponent, 1, 2) : new ItemStack(Items.GUNPOWDER, 1);
		else if (type <= 7 || type == 14)
			return alch ? new ItemStack(ModItems.alchemyComponent, 1, 3) : new ItemStack(Items.BLAZE_POWDER, 1);
		else if (type <= 11 || type == 15)
			return alch ? new ItemStack(ModItems.alchemyComponent, 1, 4) : new ItemStack(Items.REDSTONE, 1);
		else
			return alch ? new ItemStack(ModItems.alchemyComponent, 1, 5) : new ItemStack(Items.GLOWSTONE_DUST, 1);
	}

	private static Object getAltMaterial(int type)
	{
		if (type == 0)
			return "plankWood";

		return getMaterial(type);
	}

	private static Object getMaterial(int type)
	{
		switch (type)
		{
		case 0:
			return "logWood";
		case 1:
			return new ItemStack(Blocks.STONE);
		case 2:
			return getModMaterial("Bronze");
		case 3:
			return getModMaterial("Iron");
		case 4:
			return getModMaterial("Steel");
		case 5:
			return getModMaterial("Electrum");
		case 6:
			return new ItemStack(Items.NETHERBRICK);
		case 7:
			return getModMaterial("Lead");
		case 8:
			return getModMaterial("Manyullyn");
		case 9:
			return getModMaterial("Signalum");
		case 10:
			return new ItemStack(Blocks.END_STONE);
		case 11:
			return getModMaterial("Enderium");
		case 12:
			return new ItemStack(ModItems.baseComponent, 1, 3);
		case 13:
			return new ItemStack(ModItems.baseComponent, 1, 7);
		case 14:
			return getModMaterial("Osmium");
		case 15:
			return getModMaterial("RefinedObsidian");
		}
		return null;
	}

	private static Object getGear(int type)
	{
		switch (type)
		{
		case 0:
			return getModGear("Wood") != null ? getModGear("Wood") : "plankWood";
		case 1:
			return getModGear("Stone") != null ? getModGear("Stone") : new ItemStack(Blocks.STONEBRICK);
		case 2:
			return getModGear("Bronze");
		case 3:
			return getModGear("Iron");
		case 4:
			return getModGear("Steel");
		case 5:
			return getModGear("Electrum");
		case 6:
			return new ItemStack(Blocks.NETHER_BRICK);
		case 7:
			return getModGear("Lead");
		case 8:
			return getModGear("Manyullyn");
		case 9:
			return getModGear("Signalum");
		case 10:
			return new ItemStack(Blocks.PURPUR_BLOCK);
		case 11:
			return getModGear("Enderium");
		case 12:
			return new ItemStack(Items.NETHER_STAR);
		case 13:
			return new ItemStack(Items.NETHER_STAR);
		case 14:
			return getModGear("Osmium");
		case 15:
			return getModGear("RefinedObsidian");
		}
		return null;
	}

	private static Object getModMaterial(String type)
	{
		return (OreDictionary.getOres("ingot" + type).size() > 0 ? ("ingot" + type) : null);
	}

	private static Object getModGear(String type)
	{
		return OreDictionary.getOres("gear" + type).size() > 0 ? ("gear" + type) : null;
	}

	public static void initOreDict()
	{
		OreDictionary.registerOre("ingotFrozenIron", new ItemStack(ModItems.techComponent, 1, 2));
		OreDictionary.registerOre("dustWood", new ItemStack(ModItems.baseComponent, 1, 5));
		OreDictionary.registerOre("logWood", new ItemStack(ModBlocks.petrifiedWood));
		OreDictionary.registerOre("plankWood", new ItemStack(ModBlocks.petrifiedPlanks));

	}

	public static void postInit()
	{
		for (ProcessRecipeManager m : ProcessRecipeManager.getManagers())
		{
			m.ctRecipes();
		}
		HeatSources.ctRecipes();
		FusionCatalysts.ctRecipes();
	}

	public static ItemStack getModPriority(NonNullList<ItemStack> stacks)
	{
		if (stacks.size() == 0)
			return ItemStack.EMPTY;
		ItemStack curPriority = ItemStack.EMPTY;
		List<String> modNames = Arrays.asList(ConfigOptions.miscSettings.modResourcePriorities);
		for (ItemStack s : stacks)
		{
			if (curPriority.isEmpty() && !s.isEmpty())
				curPriority = s;

			if (s == curPriority || s.isEmpty())
				continue;
			int indexNew = modNames.indexOf(s.getItem().delegate.name().getNamespace());
			int indexCur = modNames.indexOf(curPriority.getItem().delegate.name().getNamespace());
			if (indexNew >= 0 && indexNew < indexCur)
				curPriority = s;
		}
		return curPriority;
	}

}
