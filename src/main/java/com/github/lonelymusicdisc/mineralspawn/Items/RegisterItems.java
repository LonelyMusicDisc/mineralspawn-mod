package com.github.lonelymusicdisc.mineralspawn.Items;

import com.github.lonelymusicdisc.mineralspawn.Items.Armor.MineralSpawnArmorItem;
import com.github.lonelymusicdisc.mineralspawn.Items.Armor.PumithystArmorMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {
    public static final Item PUMITHYST = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item ATMOSMITE_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item NATURITE_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item UNSTABLE_ATATURITE_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    //armor
    public static final ArmorMaterial PumithystArmorMaterial = new PumithystArmorMaterial();

    public static final Item PUMITHYST_HELMET = new MineralSpawnArmorItem(PumithystArmorMaterial, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item PUMITHYST_CHESTPLATE = new MineralSpawnArmorItem(PumithystArmorMaterial, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item PUMITHYST_LEGGINGS = new MineralSpawnArmorItem(PumithystArmorMaterial, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item PUMITHYST_BOOTS = new MineralSpawnArmorItem(PumithystArmorMaterial, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT));

    public static void registry() {
        Registry.register(Registry.ITEM, new Identifier("mineralspawn", "pumithyst"), PUMITHYST);
        Registry.register(Registry.ITEM, new Identifier("mineralspawn", "atmosmite_ingot"), ATMOSMITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier("mineralspawn", "naturite_ingot"), NATURITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier("mineralspawn", "unstable_ataturite_ingot"), UNSTABLE_ATATURITE_INGOT);

        //armor items
        Registry.register(Registry.ITEM, new Identifier("mineralspawn", "pumithyst_helmet"), PUMITHYST_HELMET);
        Registry.register(Registry.ITEM, new Identifier("mineralspawn", "pumithyst_chestplate"), PUMITHYST_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("mineralspawn", "pumithyst_leggings"), PUMITHYST_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("mineralspawn", "pumithyst_boots"), PUMITHYST_BOOTS);

    }
}