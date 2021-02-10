package com.github.lonelymusicdisc.mineralspawn;

import com.github.lonelymusicdisc.mineralspawn.Blocks.MineralSpawnOres;
import com.github.lonelymusicdisc.mineralspawn.Blocks.RegisterBlocks;
import com.github.lonelymusicdisc.mineralspawn.Entities.GoldenGolem;
import com.github.lonelymusicdisc.mineralspawn.Items.RegisterItems;
import com.github.lonelymusicdisc.mineralspawn.Entities.EntityRegister;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.attribute.EntityAttributes;
import software.bernie.geckolib3.GeckoLib;

public class Mineralspawn implements ModInitializer {

    public static final String MOD_ID = "mineralspawn";

    @Override
    public void onInitialize() {
        GeckoLib.initialize();
        RegisterItems.registry();
        RegisterBlocks.registry();
        MineralSpawnOres.registry();

        //mobs
        FabricDefaultAttributeRegistry.register(EntityRegister.GOLDEN_GOLEM_ENTITY, GoldenGolem.createIronGolemAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 40).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 10.0D));

    }
}
