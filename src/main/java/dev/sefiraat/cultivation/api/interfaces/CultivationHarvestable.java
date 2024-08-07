package dev.sefiraat.cultivation.api.interfaces;

import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.RandomizedSet;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

/**
 * This interface defines a Cultivation object that can be harvested, describing what can be harvested from
 * it as well as if it is harvestable
 */
public interface CultivationHarvestable {

    /**
     * Defines the {@link ItemStack}'s that will/can drop when harvested. Defaults to null.
     *
     * @return The {@link ItemStack}'s that will/can drop when harvested. Defaults to null.
     */
    @Nonnull
    default RandomizedSet<ItemStack> getHarvestingResults() {
        return new RandomizedSet<>();
    }
}
