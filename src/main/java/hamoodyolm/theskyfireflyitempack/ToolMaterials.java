package hamoodyolm.theskyfireflyitempack;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class ToolMaterials {
    public static final ToolMaterial CHAOS_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            2885,
            9.0F,
            7.0F,
            22,
            ChaosArmorMaterials.REPAIRS_CHAOS_ARMOR
    );
    public static final ToolMaterial EQUILIBRIUM_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            2885,
            9.0F,
            7.0F,
            22,
            ChaosArmorMaterials.REPAIRS_CHAOS_ARMOR
    );
}
