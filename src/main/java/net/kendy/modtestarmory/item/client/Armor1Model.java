package net.kendy.modtestarmory.item.client;

import mod.azure.azurelib.model.GeoModel;
import net.kendy.modtestarmory.Modtestarmory;
import net.kendy.modtestarmory.item.custom.Armor1Item;
import net.minecraft.util.Identifier;

public class Armor1Model extends GeoModel<Armor1Item> {
    @Override
    public Identifier getModelResource(Armor1Item armor1Item) {
        return new Identifier(Modtestarmory.MOD_ID, "geo/armor1.geo.json");
    }

    @Override
    public Identifier getTextureResource(Armor1Item armor1Item) {
        return new Identifier(Modtestarmory.MOD_ID, "textures/armor/armor1.png");
    }

    @Override
    public Identifier getAnimationResource(Armor1Item armor1Item) {
        return new Identifier(Modtestarmory.MOD_ID, "animations/armor1.animation.json");
    }
}
