package net.kendy.modtestarmory.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kendy.modtestarmory.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);

        itemModelGenerator.register(ModItems.ARMOR1_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARMOR1_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARMOR1_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARMOR1_BOOTS, Models.GENERATED);

    }

}
