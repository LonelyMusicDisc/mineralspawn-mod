package com.github.lonelymusicdisc.mineralspawn;

import com.github.lonelymusicdisc.mineralspawn.Entities.GoldenGolem;
import com.github.lonelymusicdisc.mineralspawn.Entities.Models.GoldGolemModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class MineralSpawnGeo extends GeoEntityRenderer<GoldenGolem> {
    public MineralSpawnGeo(EntityRenderDispatcher renderManger)
    {
        super(renderManger, new GoldGolemModel());
        this.shadowRadius = 0.5f;
    }
}