package net.kendy.modtestarmory.item;

import net.kendy.modtestarmory.Modtestarmory;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    RUBY("ruby", 25, new int[] {3, 8, 6, 3 }, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.RUBY));

    private final String name;
    private final int durabilityMultiplier;
    private final int [] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knokbackResistance;
    private final Supplier<Ingredient> repairIgredient;

    private static final int [] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knokbackResistance, Supplier<Ingredient> repairIgredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knokbackResistance = knokbackResistance;
        this.repairIgredient = repairIgredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIgredient.get();
    }

    @Override
    public String getName() {
        return Modtestarmory.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knokbackResistance;
    }
}
