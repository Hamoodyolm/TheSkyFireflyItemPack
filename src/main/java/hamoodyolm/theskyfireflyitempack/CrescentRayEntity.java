package hamoodyolm.theskyfireflyitempack;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;

import static hamoodyolm.theskyfireflyitempack.TheSkyFireflyItemPack.CRESCENT_RAY_KEY;
import static hamoodyolm.theskyfireflyitempack.TheSkyFireflyItemPack.MOD_ID;

public class CrescentRayEntity extends PathfinderMob {
    protected CrescentRayEntity(EntityType<? extends PathfinderMob> entityType, Level level) {
        super(entityType, level);
    }
    public static final EntityType<CrescentRayEntity> CRESCENTRAY = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "crescent_ray"),
            EntityType.Builder.of(CrescentRayEntity::new, MobCategory.CREATURE).sized(0.75f, 0.75f).build(CRESCENT_RAY_KEY)
    );
    public void onInitialize() {
        /*
         * Register our Cube Entity's default attributes.
         * Attributes are properties or stats of the mobs, including things like attack damage and health.
         * The game will crash if the entity doesn't have the proper attributes registered in time.
         *
         * In 1.15, this was done by a method override inside the entity class.
         * Most vanilla entities have a static method (e.g. Zombie#createAttributes) for initializing their attributes.
         */
        FabricDefaultAttributeRegistry.register(CRESCENTRAY, CrescentRayEntity.createMobAttributes());
    }
}