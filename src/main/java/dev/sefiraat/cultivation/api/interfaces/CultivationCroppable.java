package dev.sefiraat.cultivation.api.interfaces;

import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunBlockData;
import com.xzavier0722.mc.plugin.slimefun4.storage.util.StorageCacheUtils;
import dev.sefiraat.cultivation.implementation.utils.DisplayGroupGenerators;
import dev.sefiraat.sefilib.entity.display.DisplayGroup;
import org.bukkit.Location;
import org.bukkit.block.Block;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.UUID;

public interface CultivationCroppable {

    String CROPPED = "crops_present";
    String CROSS_CROPPED = "cross_crop_present";
    String GROUP_PARENT = "crop_display_group";

    default boolean isCropped(@Nonnull Block block) {
        return isCropped(block.getLocation());
    }

    default boolean isCropped(@Nonnull Location location) {
        String cropped = StorageCacheUtils.getData(location, CROPPED);
        return Boolean.parseBoolean(cropped);
    }

    default boolean isCropped(@Nonnull SlimefunBlockData config) {
        String cropped = config.getData(CROPPED);
        return Boolean.parseBoolean(cropped);
    }

    default boolean isCrossCropped(@Nonnull Block block) {
        return isCrossCropped(block.getLocation());
    }

    default boolean isCrossCropped(@Nonnull Location location) {
        String cropped = StorageCacheUtils.getData(location, CROSS_CROPPED);
        return Boolean.parseBoolean(cropped);
    }

    default boolean isCrossCropped(@Nonnull SlimefunBlockData config) {
        String cropped = config.getData(CROSS_CROPPED);
        return Boolean.parseBoolean(cropped);
    }

    default boolean incrementCrop(@Nonnull Location location) {
        if (isCrossCropped(location)) {
            return false;
        } else if (isCropped(location)) {
            setCrossCropped(location);
            return true;
        } else {
            setCropped(location);
            return true;
        }
    }

    default void setCropped(@Nonnull Location location) {
        DisplayGroup displayGroup = DisplayGroupGenerators.generateCropStickGroup(location.clone().add(0.5, 0, 0.5));
        StorageCacheUtils.setData(location, CROPPED, "true");
        StorageCacheUtils.setData(location, GROUP_PARENT, displayGroup.getParentUUID().toString());
    }

    default void setCrossCropped(@Nonnull Location location) {
        if (isCropped(location)) {
            removeCropDisplayGroup(location);
        }
        DisplayGroup displayGroup = DisplayGroupGenerators.generateCrossedCropStickGroup(location.clone().add(0.5, 0, 0.5));
        StorageCacheUtils.setData(location, CROPPED, "true");
        StorageCacheUtils.setData(location, CROSS_CROPPED, "true");
        StorageCacheUtils.setData(location, GROUP_PARENT, displayGroup.getParentUUID().toString());
    }

    default void removeCropped(@Nonnull Location location) {
        removeCropDisplayGroup(location);
        StorageCacheUtils.removeData(location, CROPPED);
        StorageCacheUtils.removeData(location, CROSS_CROPPED);
        StorageCacheUtils.removeData(location, GROUP_PARENT);
    }

    @Nullable
    default UUID getCropDisplayGroupUUID(@Nonnull Location location) {
        String uuid = StorageCacheUtils.getData(location, GROUP_PARENT);
        if (uuid == null) {
            return null;
        }
        return UUID.fromString(uuid);
    }

    @Nullable
    default DisplayGroup getCropDisplayGroup(@Nonnull Location location) {
        UUID uuid = getCropDisplayGroupUUID(location);
        if (uuid == null) {
            return null;
        }
        return DisplayGroup.fromUUID(uuid);
    }

    default void removeCropDisplayGroup(@Nonnull Location location) {
        DisplayGroup displayGroup = getCropDisplayGroup(location);
        if (displayGroup != null) {
            displayGroup.remove();
        }
    }
}
