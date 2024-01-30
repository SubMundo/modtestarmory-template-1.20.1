package net.kendy.modtestarmory.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kendy.modtestarmory.Modtestarmory;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Moditemgroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Modtestarmory.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.ARMOR1_HELMET);
                        entries.add(ModItems.ARMOR1_CHESTPLATE);
                        entries.add(ModItems.ARMOR1_LEGGINGS);
                        entries.add(ModItems.ARMOR1_BOOTS);



                    }).build());

    public static void registerItemGroups() {
        Modtestarmory.LOGGER.info("Registering Item Groups for " + Modtestarmory.MOD_ID);
    }
}
