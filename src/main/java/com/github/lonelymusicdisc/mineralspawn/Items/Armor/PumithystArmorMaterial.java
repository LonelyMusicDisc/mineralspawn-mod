package com.github.lonelymusicdisc.mineralspawn.Items.Armor;

import com.github.lonelymusicdisc.mineralspawn.Items.RegisterItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class PumithystArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {453, 520, 570, 430};
    private static final int[] PROTECTION_VALUES = new int[] {4, 7, 8, 5};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterItems.PUMITHYST);
    }

    @Override
    public String getName() {
        return "pumithyst";
    }

    @Override
    public float getToughness() {
        return 2.0f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
