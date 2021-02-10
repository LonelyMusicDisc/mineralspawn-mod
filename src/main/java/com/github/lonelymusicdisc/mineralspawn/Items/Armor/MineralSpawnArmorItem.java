package com.github.lonelymusicdisc.mineralspawn.Items.Armor;

import com.github.lonelymusicdisc.mineralspawn.Items.RegisterItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MineralSpawnArmorItem extends ArmorItem {
    public MineralSpawnArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            ItemStack helmet = player.getEquippedStack(EquipmentSlot.HEAD);
            ItemStack chestplate = player.getEquippedStack(EquipmentSlot.CHEST);
            ItemStack leggings = player.getEquippedStack(EquipmentSlot.LEGS);
            ItemStack boots = player.getEquippedStack(EquipmentSlot.FEET);

            //check if player is wearing pumithyst armor, if so, give them slowness
            if (helmet.getItem() == RegisterItems.PUMITHYST_HELMET && chestplate.getItem() == RegisterItems.PUMITHYST_CHESTPLATE && leggings.getItem() == RegisterItems.PUMITHYST_LEGGINGS && boots.getItem() == RegisterItems.PUMITHYST_BOOTS) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 10, 0, false, false, true));
            }
        }
    }
}