package hamoodyolm.theskyfireflyitempack;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ambient.AmbientCreature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl.LOGGER;

public class TheSkyFireflyItemPack implements ModInitializer {
    static Identifier ResourceLocation;
    public static final ResourceKey<EntityType<?>> CRESCENT_RAY_KEY = ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath("modid", "crescent_ray"));

    public static final String MOD_ID = "theskyfireflyitempack";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
        ModItems.initialize();

		LOGGER.info("Hello Fabric world!");
	}
}