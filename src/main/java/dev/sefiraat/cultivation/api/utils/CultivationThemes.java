package dev.sefiraat.cultivation.api.utils;

import dev.sefiraat.sefilib.string.Theme;
import net.md_5.bungee.api.ChatColor;

public final class CultivationThemes {

    private CultivationThemes() {
        throw new IllegalStateException("Utility class");
    }

    public static final Theme MAIN = new Theme(ChatColor.of("#8a0e0e"), "农耕工艺");
    public static final Theme DISCOVEREY = new Theme(ChatColor.of("#a60e03"), "探索");
    public static final Theme CRAFTING = new Theme(ChatColor.of("#dbcea9"), "合成材料");
    public static final Theme RECIPE_TYPE = new Theme(ChatColor.of("#ffe89c"), "合成配方");
    public static final Theme MACHINE = new Theme(ChatColor.of("#3295a8"), "机器");
    public static final Theme TOOL = new Theme(ChatColor.of("#3295a8"), "工具");
    public static final Theme PLANT = new Theme(ChatColor.of("#a241bf"), "植物");
    public static final Theme BUSH = new Theme(ChatColor.of("#a241bf"), "灌木");
    public static final Theme SAPLING = new Theme(ChatColor.of("#a241bf"), "树苗");
    public static final Theme PRODUCE = new Theme(ChatColor.of("#ccd123"), "产品");
    public static final Theme BY_PRODUCT = new Theme(ChatColor.of("#ccd123"), "副产品");
    public static final Theme FOOD = new Theme(ChatColor.of("#ccd123"), "食物");

    // Seeds
    public static final Theme SEED_RED = new Theme(ChatColor.of("#c41d1d"));
    public static final Theme SEED_ORANGE = new Theme(ChatColor.of("#c4761d"));
    public static final Theme SEED_YELLOW = new Theme(ChatColor.of("#c4b31d"));
    public static final Theme SEED_GREEN = new Theme(ChatColor.of("#4ac41d"));
    public static final Theme SEED_BLUE = new Theme(ChatColor.of("#1d36c4"));
    public static final Theme SEED_CYAN = new Theme(ChatColor.of("#1fcccc"));
    public static final Theme SEED_PURPLE = new Theme(ChatColor.of("#811dc4"));
}
