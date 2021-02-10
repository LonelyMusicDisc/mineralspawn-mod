package com.github.lonelymusicdisc.mineralspawn.Entities;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EntityRegister {

    public static final EntityType<GoldenGolem> GOLDEN_GOLEM_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("mineralspawn", "gold_golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GoldenGolem::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

}
