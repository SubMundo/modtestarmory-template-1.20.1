package net.kendy.modtestarmory.item.client;

import mod.azure.azurelib.model.GeoModel;
import mod.azure.azurelib.renderer.GeoArmorRenderer;
import mod.azure.azurelib.renderer.layer.AutoGlowingGeoLayer;
import mod.azure.azurelib.renderer.layer.GeoRenderLayer;
import net.kendy.modtestarmory.item.custom.Armor1Item;
import net.minecraft.util.Identifier;

public class Armor1Renderer extends GeoArmorRenderer<Armor1Item> {
    public Armor1Renderer() {
        super(new Armor1Model());
        addRenderLayer(new AutoGlowingGeoLayer<>(this));

    }
}
