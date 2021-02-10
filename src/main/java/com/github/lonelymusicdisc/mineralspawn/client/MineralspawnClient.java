package com.github.lonelymusicdisc.mineralspawn.client;

import com.github.lonelymusicdisc.mineralspawn.Entities.EntityRegister;
import com.github.lonelymusicdisc.mineralspawn.MineralSpawnGeo;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class MineralspawnClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(EntityRegister.GOLDEN_GOLEM_ENTITY,
                (entityRenderDispatcher, context) -> new MineralSpawnGeo(entityRenderDispatcher));

    }
}
