package com.bartz24.skyresources.base.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMeta extends ItemBlock
{
	public ItemBlockMeta(Block block)
	{
		super(block);
		if (!(block instanceof IMetaBlockName))
		{
			throw new IllegalArgumentException(String.format(
					"The given Block %s is not an instance of ISpecialBlockName!",
					block.getTranslationKey()));
		}
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}

	@Override
	public String getTranslationKey(ItemStack stack)
	{
		return super.getTranslationKey(stack) + "."
				+ ((IMetaBlockName) this.block).getSpecialName(stack);
	}

}