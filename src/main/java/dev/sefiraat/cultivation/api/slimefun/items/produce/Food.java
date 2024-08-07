package dev.sefiraat.cultivation.api.slimefun.items.produce;

import dev.sefiraat.cultivation.api.slimefun.groups.CultivationGroups;
import dev.sefiraat.cultivation.implementation.slimefun.CultivationStacks;
import dev.sefiraat.cultivation.implementation.utils.Keys;
import dev.sefiraat.sefilib.itemstacks.Cooldowns;
import dev.sefiraat.sefilib.string.Theme;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.data.persistent.PersistentDataAPI;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

public class Food extends SimpleSlimefunItem<ItemUseHandler> {

    private final Consumer<Player> eatingEffects;
    private String eatingMessage = "好!你吃饱了!";

    public Food(SlimefunItemStack item,
                RecipeType recipeType,
                ItemStack[] recipe,
                Consumer<Player> effect
    ) {
        super(CultivationGroups.FOODS, item, recipeType, recipe);
        this.eatingEffects = effect;
    }

    @NotNull
    @Override
    public ItemUseHandler getItemHandler() {
        return new ItemUseHandler() {
            @Override
            public void onRightClick(PlayerRightClickEvent e) {
                Player player = e.getPlayer();
                boolean lemonDrop = getId().equals(CultivationStacks.LEMON_DROP.getItemId());
                if (Cooldowns.isOnCooldown(Keys.SATIATED, player) && !lemonDrop) {
                    player.sendMessage(Theme.WARNING.apply(
                        "你现在还不能吃! 每10分钟才能吃一次!"));
                    return;
                }
                if (!lemonDrop) {
                    Cooldowns.addCooldown(Keys.SATIATED, player, 600);
                } else {
                    PersistentDataAPI.remove(player, Keys.SATIATED);
                }
                e.getItem().setAmount(e.getItem().getAmount() - 1);
                player.sendMessage(Theme.SUCCESS.apply(eatingMessage));
                eatingEffects.accept(player);
            }
        };
    }

    public Food overrideEatingMessage(@Nonnull String string) {
        this.eatingMessage = string;
        return this;
    }

    public Food buildRegister(@Nonnull SlimefunAddon addon) {
        register(addon);
        return this;
    }
}
