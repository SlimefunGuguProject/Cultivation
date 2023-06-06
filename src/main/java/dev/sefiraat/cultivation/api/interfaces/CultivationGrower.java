package dev.sefiraat.cultivation.api.interfaces;

import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunBlockData;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.bukkit.Location;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * This interface represents a cultivation object that grows and describe what can/should happen
 * during growth/hitting maturity
 */
public interface CultivationGrower {

    /**
     * This method will fire each time the plant grows a single step
     *
     * @param location The location of the plant being ticked
     * @param flora    The {@link SlimefunItem} being ticked
     * @param data     The {@link SlimefunBlockData} from BlockStorage for the location
     */
    @ParametersAreNonnullByDefault
    default void onGrowthStep(Location location, SlimefunItem flora, SlimefunBlockData data) {

    }

    /**
     * This method will fire once when the plant reaches full maturity
     *
     * @param location The location of the plant being ticked
     * @param flora    The {@link SlimefunItem} being ticked
     * @param data     The {@link SlimefunBlockData} from BlockStorage for the location
     */
    @ParametersAreNonnullByDefault
    default void onFullyMatures(Location location, SlimefunItem flora, SlimefunBlockData data) {

    }

    boolean isMature(@Nonnull Location location);

    int getMaxGrowthStages();

}
