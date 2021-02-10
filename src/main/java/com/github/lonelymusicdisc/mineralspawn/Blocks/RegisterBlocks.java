package com.github.lonelymusicdisc.mineralspawn.Blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterBlocks {
    public static final Block PUMITHYST_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.PICKAXES, 3));

    //Registering the block
    public static void registry() {
        Registry.register(Registry.BLOCK, new Identifier("mineralspawn", "pumithyst_ore"), PUMITHYST_ORE);
        Registry.register(Registry.ITEM, new Identifier("mineralspawn", "pumithyst_ore"), new BlockItem(PUMITHYST_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
