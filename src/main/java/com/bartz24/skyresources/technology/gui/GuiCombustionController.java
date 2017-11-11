package com.bartz24.skyresources.technology.gui;

import com.bartz24.skyresources.References;
import com.bartz24.skyresources.technology.gui.container.ContainerCombustionController;
import com.bartz24.skyresources.technology.tile.TileCombustionController;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiCombustionController extends GuiContainer
{

	private IInventory playerInv;
	private TileCombustionController tile;

	public GuiCombustionController(IInventory playerInv, TileCombustionController te)
	{
		super(new ContainerCombustionController(playerInv, te));

		this.playerInv = playerInv;
		this.tile = te;

		this.xSize = 176;
		this.ySize = 166;
	}
	
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager()
				.bindTexture(new ResourceLocation(References.ModID, "textures/gui/blankInventory.png"));
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);

		this.drawTexturedModalRect(this.guiLeft + 43, this.guiTop + 52, 7, 83, 18, 18);
		this.drawTexturedModalRect(this.guiLeft + 61, this.guiTop + 52, 7, 83, 18, 18);
		this.drawTexturedModalRect(this.guiLeft + 79, this.guiTop + 52, 7, 83, 18, 18);
		this.drawTexturedModalRect(this.guiLeft + 97, this.guiTop + 52, 7, 83, 18, 18);
		this.drawTexturedModalRect(this.guiLeft + 115, this.guiTop + 52, 7, 83, 18, 18);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
	{
		String s = tile.getDisplayName().getUnformattedText();
		this.fontRenderer.drawString(s, 88 - this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
		this.fontRenderer.drawString(this.playerInv.getDisplayName().getUnformattedText(), 8, 72, 4210752);

		String s2 = "Set Priority Output Filter Here";
		this.fontRenderer.drawString(s2, 88 - this.fontRenderer.getStringWidth(s2) / 2, 40, 4210752);
	}
}
