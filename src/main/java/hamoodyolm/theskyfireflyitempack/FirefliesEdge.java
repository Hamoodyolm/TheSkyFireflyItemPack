package hamoodyolm.theskyfireflyitempack;


import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponentGetter;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.component.TooltipProvider;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class FirefliesEdge extends Item {
    public FirefliesEdge(Settings settings) {
        super((Properties) settings);
    }

    @Override
    public @NotNull InteractionResult use(@NotNull Level level, @NotNull Player player, @NotNull InteractionHand interactionHand) {

        return super.use(level, player, interactionHand);
    }
    List<Component> loreLines = List.of(
            Component.literal("The sword of the prophecy awakens...").withStyle(ChatFormatting.GOLD),
            Component.literal("Those who wield it shall gain the power to").withStyle(ChatFormatting.GRAY),
            Component.literal("charge their sword and appear behind their").withStyle(ChatFormatting.GRAY),
            Component.literal("opponent each blow they hit, or send a ray").withStyle(ChatFormatting.GRAY),
            Component.literal("of light wherever they charge. ").withStyle(ChatFormatting.GRAY)
    );
    public record ComponentWithTooltip(int clickCount) implements TooltipProvider {
        @Override
        public void addToTooltip(@NotNull TooltipContext tooltip, Consumer<Component> textConsumer, TooltipFlag type, @NotNull DataComponentGetter components) {
            textConsumer.accept(Component.literal("The sword of the prophecy awakens...").withStyle(ChatFormatting.GOLD));
        }
    }
}