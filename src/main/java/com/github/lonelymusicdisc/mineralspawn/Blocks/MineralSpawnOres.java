package com.github.lonelymusicdisc.mineralspawn.Blocks;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class MineralSpawnOres {
    public static ConfiguredFeature<?, ?> ORE_PUMITHYST_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    RegisterBlocks.PUMITHYST_ORE.getDefaultState(),
            4))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
            12)))
            .spreadHorizontally()
            .repeat(10);

    public static void registry() {
        RegistryKey<ConfiguredFeature<?, ?>> orePumithystOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("mineralspawn", "ore_pumithyst_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePumithystOverworld.getValue(), ORE_PUMITHYST_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePumithystOverworld);
    }
}
