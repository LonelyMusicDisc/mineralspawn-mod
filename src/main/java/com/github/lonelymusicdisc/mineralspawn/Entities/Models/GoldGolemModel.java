package com.github.lonelymusicdisc.mineralspawn.Entities.Models;

import com.github.lonelymusicdisc.mineralspawn.Entities.GoldenGolem;
import com.github.lonelymusicdisc.mineralspawn.Mineralspawn;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GoldGolemModel extends AnimatedGeoModel<GoldenGolem> {
    @Override
    public Identifier getModelLocation(GoldenGolem object) {
        return new Identifier(Mineralspawn.MOD_ID, "geo/gold_golem.geo.json");
    }

    @Override
    public Identifier getTextureLocation(GoldenGolem object) {
        return new Identifier(Mineralspawn.MOD_ID, "textures/entity/gold_golem.png");
    }

    @Override
    public Identifier getAnimationFileLocation(GoldenGolem animatable) {
        return new Identifier(Mineralspawn.MOD_ID, "animations/gold_golem.animation.json");
    }
}
