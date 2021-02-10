package com.github.lonelymusicdisc.mineralspawn.Entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class GoldenGolem extends IronGolemEntity implements IAnimatable {

    public GoldenGolem(EntityType<? extends IronGolemEntity> entityType, World world) {
        super(entityType, world);
        this.ignoreCameraFrustum = true;
    }

    private final AnimationFactory factory = new AnimationFactory(this);

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> pAnimationEvent) {
        if (pAnimationEvent.isMoving()) {
            //make it so the mob uses the walking animation when moving
            pAnimationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
            return PlayState.CONTINUE;
        }
        if (tryAttack() && !isDead()) {
            pAnimationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("attack", false));
            return PlayState.CONTINUE;
        }
        pAnimationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
        return PlayState.CONTINUE;
    }

    private boolean tryAttack() {
        return false;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public void angerToTag(CompoundTag tag) {

    }

    @Override
    public void angerFromTag(ServerWorld world, CompoundTag tag) {

    }

    @Override
    public void tickAngerLogic(ServerWorld world, boolean bl) {

    }

    @Override
    public boolean shouldAngerAt(LivingEntity entity) {
        return false;
    }

    @Override
    public boolean isUniversallyAngry(World world) {
        return false;
    }

    @Override
    public boolean hasAngerTime() {
        return false;
    }

    @Override
    public void universallyAnger() {

    }

    @Override
    public void stopAnger() {

    }
}
