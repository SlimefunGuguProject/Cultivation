package dev.sefiraat.cultivation.api.interfaces;

import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunBlockData;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.bukkit.Location;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * This interface represents a Cultivation object that will tick including methods
 * for ticking in general and when fully grown.
 */
public interface CultivationTicking {

    /**
     * This method will fire every single time the CultivationFlora ticks
     *
     * @param location The location of the plant being ticked
     * @param flora    The {@link SlimefunItem} being ticked
     * @param data     The {@link SlimefunBlockData} from BlockStorage for the location
     */
    @ParametersAreNonnullByDefault
    default void onTickAlways(Location location, SlimefunItem flora, SlimefunBlockData data) {

    }

    /**
     * This method will fire when the CultivationFlora ticks when fully grown
     *
     * @param location The location of the plant being ticked
     * @param flora    The {@link SlimefunItem} being ticked
     * @param data     The {@link SlimefunBlockData} from BlockStorage for the location
     */
    @ParametersAreNonnullByDefault
    default void onTickFullyGrown(Location location, SlimefunItem flora, SlimefunBlockData data) {

    }
}
