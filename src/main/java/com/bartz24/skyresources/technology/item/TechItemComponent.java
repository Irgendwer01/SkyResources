package com.bartz24.skyresources.technology.item;

import java.util.ArrayList;

import com.bartz24.skyresources.References;
import com.bartz24.skyresources.registry.ModCreativeTabs;
import com.bartz24.skyresources.registry.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TechItemComponent extends Item
{
	private static ArrayList<String> names = new ArrayList<String>();

	public static final String stoneCrushed = "stoneCrushed";
	public static final String radioactiveMix = "radioactiveMix";
	public static final String frozenIronIngot = "frozenIronIngot";
	public static final String netherrackCrushed = "netherrackCrushed";

	public TechItemComponent()
	{
		super();

		setTranslationKey(References.ModID + ".techItemComponent.");
		setRegistryName("TechItemComponent");
		setHasSubtypes(true);
		this.setCreativeTab(ModCreativeTabs.tabTech);

		itemList();
	}

	private void itemList()
	{
		names.add(0, stoneCrushed);
		names.add(1, radioactiveMix);
		names.add(2, frozenIronIngot);
		names.add(3, netherrackCrushed);
	}

	@Override
	public String getTranslationKey(ItemStack stack)
	{
		return super.getTranslationKey(stack) + names.get(stack.getItemDamage());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(CreativeTabs creativeTab, NonNullList<ItemStack> list)
	{
		if (isInCreativeTab(creativeTab))
			for (int i = 0; i < names.size(); i++)
				list.add(new ItemStack(this, 1, i));
	}

	public static ItemStack getStack(String name)
	{
		return new ItemStack(ModItems.techComponent, 1, names.indexOf(name));
	}

	public static ArrayList<String> getNames()
	{
		return names;
	}
}
