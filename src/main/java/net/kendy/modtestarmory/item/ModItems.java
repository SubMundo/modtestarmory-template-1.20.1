package net.kendy.modtestarmory.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kendy.modtestarmory.Modtestarmory;
import net.kendy.modtestarmory.item.client.Armor1Model;
import net.kendy.modtestarmory.item.custom.Armor1Item;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item ARMOR1_HELMET = registerItem("armor1_helmet",
            new Armor1Item(ModArmorMaterial.RUBY, ArmorItem.Type.HELMET, new  FabricItemSettings()));
    public static final Item ARMOR1_CHESTPLATE = registerItem("armor1_chestplate",
            new Armor1Item(ModArmorMaterial.RUBY, ArmorItem.Type.CHESTPLATE, new  FabricItemSettings()));
    public static final Item ARMOR1_LEGGINGS = registerItem("armor1_leggings",
            new Armor1Item(ModArmorMaterial.RUBY, ArmorItem.Type.LEGGINGS, new  FabricItemSettings()));
    public static final Item ARMOR1_BOOTS = registerItem("armor1_boots",
            new Armor1Item(ModArmorMaterial.RUBY, ArmorItem.Type.BOOTS, new  FabricItemSettings()));



    private static void addItemsToIngredientTapItemGroup (FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Modtestarmory.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Modtestarmory.LOGGER.info("Registering Mod Items for " + Modtestarmory.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTapItemGroup);
    }
}
