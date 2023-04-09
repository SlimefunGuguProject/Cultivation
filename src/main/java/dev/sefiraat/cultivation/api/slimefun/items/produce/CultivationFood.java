package dev.sefiraat.cultivation.api.slimefun.items.produce;

import dev.sefiraat.cultivation.api.slimefun.RecipeTypes;
import dev.sefiraat.cultivation.implementation.utils.Keys;
import dev.sefiraat.sefilib.itemstacks.Cooldowns;
import dev.sefiraat.sefilib.string.Theme;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class CultivationFood extends SimpleSlimefunItem<ItemUseHandler> {

    private final Consumer<Player> eatingEffects;

    public CultivationFood(ItemGroup group, SlimefunItemStack item, ItemStack[] recipe, Consumer<Player> effect) {
        super(group, item, RecipeTypes.FINISHING, recipe);
        this.eatingEffects = effect;
    }

    @NotNull
    @Override
    public ItemUseHandler getItemHandler() {
        return new ItemUseHandler() {
            @Override
            public void onRightClick(PlayerRightClickEvent e) {
                Player player = e.getPlayer();
                if (Cooldowns.isOnCooldown(Keys.SATIATED, player)) {
                    player.sendMessage(Theme.WARNING.apply(
                        "You aren't hungry yet! You can only eat once every half a day (10 mins)"));
                    return;
                }
                eatingEffects.accept(player);
                Cooldowns.addCooldown(Keys.SATIATED, player, 600);
                e.getItem().setAmount(e.getItem().getAmount() - 1);
                player.sendMessage(Theme.SUCCESS.apply("Lovely! You're all full up."));
            }
        };
    }
}