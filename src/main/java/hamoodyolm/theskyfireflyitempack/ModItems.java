package hamoodyolm.theskyfireflyitempack;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {

    public static <GenericItem extends Item> GenericItem register(String name, Function<Item.Properties, GenericItem> itemFactory, Item.Properties settings) {
        // Create the item key.
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TheSkyFireflyItemPack.MOD_ID, name));

        // Create the item instance.
        GenericItem item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;

    }

    // This is just registering the items
    public static final Item CHAOS_ORB = register("chaos_orb", Item::new, new Item.Properties());
    public static final Item CHAOS_SHARD = register("chaos_shard", Item::new, new Item.Properties());
    public static final Item FIREFLIES_EDGE = register(
            "fireflies_edge",
            FirefliesEdge::new,
            new Item.Properties().sword(ToolMaterials.CHAOS_TOOL_MATERIAL, 1f, -2.4f)
    );
    public static final Item UNITY_BLADE = register(
            "unity_blade",
            Item::new,
            new Item.Properties().sword(ToolMaterials.EQUILIBRIUM_TOOL_MATERIAL, 1f, -2.4f)
    );
    public static final Item FIREFLIES_SOUL = register("fireflies_soul", Item::new, new Item.Properties());;
    public static void initialize()
    {
        // Get the event for modifying entries in the ingredients group.
// And register an event handler that adds our suspicious item to the ingredients group.
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup) -> itemGroup.accept(ModItems.CHAOS_SHARD));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup) -> itemGroup.accept(ModItems.CHAOS_ORB));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> itemGroup.accept(ModItems.FIREFLIES_EDGE));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> itemGroup.accept(ModItems.UNITY_BLADE));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> itemGroup.accept(ModItems.FIREFLIES_SOUL));

    }
}


