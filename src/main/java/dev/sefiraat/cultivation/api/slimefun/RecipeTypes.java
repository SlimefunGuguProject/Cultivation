package dev.sefiraat.cultivation.api.slimefun;

import dev.sefiraat.cultivation.api.utils.CultivationThemes;
import dev.sefiraat.cultivation.implementation.listeners.CustomDropListener;
import dev.sefiraat.cultivation.implementation.listeners.MobDropListener;
import dev.sefiraat.cultivation.implementation.slimefun.items.Machines;
import dev.sefiraat.cultivation.implementation.slimefun.machines.KitchenRecipeMachineSimple;
import dev.sefiraat.cultivation.implementation.utils.Keys;
import dev.sefiraat.sefilib.entity.LivingEntityDefinition;
import dev.sefiraat.sefilib.string.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import net.guizhanss.guizhanlib.minecraft.helper.MaterialHelper;
import net.guizhanss.guizhanlib.minecraft.helper.entity.EntityTypeHelper;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This is used to store and initialise the {@link RecipeType}s used in the addon.
 */
public final class RecipeTypes {
    private RecipeTypes() {
        throw new IllegalStateException("Utility class");
    }

    @Nonnull
    public static final RecipeType BUSH = new RecipeType(
        Keys.newKey("bush_harvest"),
        Theme.themedItemStack(
            Material.TRIPWIRE_HOOK,
            CultivationThemes.RECIPE_TYPE,
            "从灌木丛收获",
            List.of(
                "该物品可从农耕工艺的",
                "灌木收获。",
                ""
            )
        )
    );

    @Nonnull
    public static final RecipeType TREE = new RecipeType(
        Keys.newKey("tree_harvest"),
        Theme.themedItemStack(
            Material.ACACIA_SAPLING,
            CultivationThemes.RECIPE_TYPE,
            "从树木收获",
            List.of(
                "该物品可从农耕工艺的",
                "树木收获。",
                ""
            )
        )
    );

    @Nonnull
    public static final RecipeType TRADING_FARMER = new RecipeType(
        Keys.newKey("trading_farmer"),
        Theme.themedItemStack(
            Material.VILLAGER_SPAWN_EGG,
            CultivationThemes.RECIPE_TYPE,
            "村民交易",
            List.of(
                "该物品可从",
                "农夫村民购买。",
                ""
            )
        )
    );

    @Nonnull
    public static final RecipeType TRADING_FLETCHER = new RecipeType(
        Keys.newKey("trading_fletcher"),
        Theme.themedItemStack(
            Material.VILLAGER_SPAWN_EGG,
            CultivationThemes.RECIPE_TYPE,
            "村民交易",
            List.of(
                "该物品可从",
                "制箭师村民购买。",
                ""
            )
        )
    );

    @Nonnull
    public static final RecipeType MOB = new RecipeType(
        Keys.newKey("mob"),
        Theme.themedItemStack(
            Material.ZOMBIE_HEAD,
            CultivationThemes.RECIPE_TYPE,
            "生物掉落",
            List.of(
                "该物品有几率从指定生物掉落。",
                ""
            )
        )
    );

    @Nonnull
    public static final RecipeType PLANT_BREEDING = new RecipeType(
        Keys.newKey("plant_breeding"),
        Theme.themedItemStack(
            Material.FLOWER_POT,
            CultivationThemes.RECIPE_TYPE,
            "植物培育",
            List.of(
                "该种子通过培育获得.",
                "",
                "在两个种子中间",
                "留一个空气方块",
                "来进行培育。",
                "",
                "植物宝典可用来记录",
                "你目前的发现。",
                "",
                "提示：黑色粒子表示",
                "两株植物无法培育。",
                ""
            )
        )
    );

    @Nonnull
    public static final RecipeType VANILLA_DROP = new RecipeType(
        Keys.newKey("vanilla_block_drop"),
        Theme.themedItemStack(
            Material.BROWN_DYE,
            CultivationThemes.RECIPE_TYPE,
            "方块掉落",
            List.of("破坏方块时有几率掉落。", "")
        )
    );

    @Nonnull
    public static final RecipeType BUCKETING = new RecipeType(
        Keys.newKey("bucketing"),
        Theme.themedItemStack(
            Material.BUCKET,
            CultivationThemes.RECIPE_TYPE,
            "水桶掉落",
            List.of("当使用水桶时掉落。", "")
        )
    );

    @Nonnull
    public static final RecipeType CHOPPED = new RecipeType(
        Keys.newKey("chopped"),
        Theme.themedItemStack(
            Material.IRON_SWORD,
            CultivationThemes.RECIPE_TYPE,
            "切碎",
            List.of(
                "用刀来切碎！",
                ""
            )
        ),
        (itemStacks, itemStack) -> addRecipeToSimpleMachine(Machines.COUNTER_CHOPPING, itemStacks, itemStack)
    );

    @Nonnull
    public static final RecipeType MASHED = new RecipeType(
        Keys.newKey("mashed"),
        Theme.themedItemStack(
            Material.COMPOSTER,
            CultivationThemes.RECIPE_TYPE,
            "捣碎",
            List.of(
                "捣！捣！捣！",
                ""
            )
        ),
        (itemStacks, itemStack) -> addRecipeToSimpleMachine(Machines.COUNTER_MASHER, itemStacks, itemStack)
    );

    @Nonnull
    public static final RecipeType BLENDED = new RecipeType(
        Keys.newKey("blended"),
        Theme.themedItemStack(
            Material.GLASS,
            CultivationThemes.RECIPE_TYPE,
            "搅拌",
            List.of(
                "在搅拌机中制作。",
                ""
            )
        ),
        (itemStacks, itemStack) -> addRecipeToSimpleMachine(Machines.COUNTER_BLENDER, itemStacks, itemStack)
    );

    @Nonnull
    public static final RecipeType SLICED = new RecipeType(
        Keys.newKey("sliced"),
        Theme.themedItemStack(
            Material.SHEARS,
            CultivationThemes.RECIPE_TYPE,
            "切片",
            List.of(
                "如此薄而细腻。",
                ""
            )
        ),
        (itemStacks, itemStack) -> addRecipeToSimpleMachine(Machines.COUNTER_SLICING, itemStacks, itemStack)
    );

    @Nonnull
    public static final RecipeType GROUND = new RecipeType(
        Keys.newKey("ground"),
        Theme.themedItemStack(
            Material.BONE,
            CultivationThemes.RECIPE_TYPE,
            "剁碎",
            List.of(
                "精细处理。",
                ""
            )
        ),
        (itemStacks, itemStack) -> addRecipeToSimpleMachine(Machines.COUNTER_GRINDER, itemStacks, itemStack)
    );

    @Nonnull
    public static final RecipeType BOILED = new RecipeType(
        Keys.newKey("boiled"),
        Theme.themedItemStack(
            Material.CAULDRON,
            CultivationThemes.RECIPE_TYPE,
            "煮熟",
            List.of(
                "烫烫烫！",
                ""
            )
        ),
        (itemStacks, itemStack) -> addRecipeToSimpleMachine(Machines.COUNTER_BOILING, itemStacks, itemStack)
    );

    @Nonnull
    public static final RecipeType FRIED = new RecipeType(
        Keys.newKey("fried"),
        Theme.themedItemStack(
            Material.BLACK_CONCRETE,
            CultivationThemes.RECIPE_TYPE,
            "油炸",
            List.of(
                "完美的酥脆。",
                ""
            )
        ),
        (itemStacks, itemStack) -> addRecipeToSimpleMachine(Machines.COUNTER_FRYER, itemStacks, itemStack)
    );

    @Nonnull
    public static final RecipeType GRILLED = new RecipeType(
        Keys.newKey("grilled"),
        Theme.themedItemStack(
            Material.POLISHED_BLACKSTONE,
            CultivationThemes.RECIPE_TYPE,
            "烤制",
            List.of(
                "鲜嫩多汁。",
                ""
            )
        ),
        (itemStacks, itemStack) -> addRecipeToSimpleMachine(Machines.COUNTER_GRILL, itemStacks, itemStack)
    );

    @Nonnull
    public static final RecipeType FINISHING = new RecipeType(
        Keys.newKey("finishing"),
        Theme.themedItemStack(
            Material.POLISHED_DIORITE,
            CultivationThemes.RECIPE_TYPE,
            "上菜",
            List.of(
                "使用厨房的上菜柜台来制作该物品。",
                ""
            )
        ),
        RecipeTypes::createFoodFinishingRecipe
    );

    @Nonnull
    public static final RecipeType BAKING = new RecipeType(
        Keys.newKey("baking"),
        Theme.themedItemStack(
            Material.FURNACE,
            CultivationThemes.RECIPE_TYPE,
            "烘焙",
            List.of(
                "使用厨房的烘培柜台来制作该物品。",
                ""
            )
        ),
        RecipeTypes::createFoodBakingRecipe
    );

    private static void addRecipeToSimpleMachine(KitchenRecipeMachineSimple machine, ItemStack[] recipe, ItemStack output) {
        ItemStack input = recipe[4];
        if (input == null) {
            return;
        }
        SlimefunItem slimefunItem = SlimefunItem.getByItem(input);
        machine.addRecipe(
            slimefunItem != null ? slimefunItem.getId() : input.getType().name(),
            output
        );
    }

    /**
     * This method both registers the drop and returns an ItemStack array that can be used
     * for Slimefun's recipe system. {@link RecipeTypes#VANILLA_DROP}
     *
     * @param stackToDrop The {@link ItemStack} to drop in the world
     * @param dropFrom    The {@link ItemStack} to drop from (#getType() is used) and the stack is used in the recipe.
     * @param dropChance  The chance (0-1) for the drop to occur
     * @return A {@link ItemStack[]} used for Slimefun's Recipe registration with the dropFrom item in the middle.
     */
    @Nonnull
    public static ItemStack[] createBlockDropRecipe(@Nonnull ItemStack stackToDrop,
                                                    @Nonnull ItemStack dropFrom,
                                                    double dropChance
    ) {
        return createBlockDropRecipe(stackToDrop, Set.of(dropFrom.getType()), dropChance);
    }

    /**
     * This method both registers the drop and returns an ItemStack array that can be used
     * for Slimefun's recipe system. {@link RecipeTypes#VANILLA_DROP}
     *
     * @param stackToDrop The {@link ItemStack} to drop in the world
     * @param dropFrom    The {@link ItemStack}'s to drop from (#getType() for the first is used) and the stack is used in the recipe.
     * @param dropChance  The chance (0-1) for the drop to occur
     * @return A {@link ItemStack[]} used for Slimefun's Recipe registration with the dropFrom item in the middle.
     */
    @Nonnull
    public static ItemStack[] createBlockDropRecipe(@Nonnull ItemStack stackToDrop,
                                                    @Nonnull Set<Material> dropFrom,
                                                    double dropChance
    ) {
        Material material = dropFrom.stream().findFirst().orElse(Material.DIRT);
        List<String> lore = dropFrom.stream()
            .map(material1 -> Theme.CLICK_INFO.apply(MaterialHelper.getName(material1)))
            .toList();
        ItemStack itemStack = Theme.themedItemStack(material, CultivationThemes.RECIPE_TYPE, "从以下方块掉落：", lore);
        CustomDropListener.addBlockDrop(new CustomDropListener.BlockDrop(stackToDrop, dropFrom, dropChance));
        return new ItemStack[]{
            null, null, null,
            null, itemStack, null,
            null, null, null
        };
    }

    /**
     * Creates and registers the given recipe for Bucketing up blocks in the world. {@link RecipeTypes#BUCKETING}
     *
     * @param stackToDrop The {@link ItemStack} to be dropped when bucketing
     * @param dropFrom    The {@link Material} to drop from
     * @param dropChance  The chance (0-1) for the drop to occur
     * @return A {@link ItemStack[]} used for Slimefun's Recipe registration, blank.
     */
    @Nonnull
    public static ItemStack[] createBucketingRecipe(@Nonnull ItemStack stackToDrop,
                                                    @Nonnull Material dropFrom,
                                                    double dropChance
    ) {
        return createBucketingRecipe(stackToDrop, Set.of(dropFrom), dropChance);
    }

    /**
     * Creates and registers the given recipe for Bucketing up blocks in the world. {@link RecipeTypes#BUCKETING}
     *
     * @param stackToDrop The {@link ItemStack} to be dropped when bucketing
     * @param dropFrom    The set of {@link Material} to drop from
     * @param dropChance  The chance (0-1) for the drop to occur
     * @return A {@link ItemStack[]} used for Slimefun's Recipe registration, blank.
     */
    @Nonnull
    public static ItemStack[] createBucketingRecipe(@Nonnull ItemStack stackToDrop,
                                                    @Nonnull Set<Material> dropFrom,
                                                    double dropChance
    ) {
        CustomDropListener.addBucketingDrop(new CustomDropListener.BlockDrop(stackToDrop, dropFrom, dropChance));
        return new ItemStack[]{
            null, null, null,
            null, null, null,
            null, null, null
        };
    }

    /**
     * This method both registers the drop and returns an ItemStack array that can be used
     * for Slimefun's recipe system. {@link RecipeTypes#VANILLA_DROP}
     *
     * @param stackToDrop The {@link ItemStack} to drop in the world
     * @param dropFrom    The {@link ItemStack} to drop from (#getType() is used) and the stack is used in the recipe.
     * @param dropChance  The chance (0-1) for the drop to occur
     * @return A {@link ItemStack[]} used for Slimefun's Recipe registration with the dropFrom item in the middle.
     */
    @Nonnull
    public static ItemStack[] createMobDropRecipe(@Nonnull ItemStack stackToDrop,
                                                  @Nonnull LivingEntityDefinition dropFrom,
                                                  double dropChance
    ) {
        return createMobDropRecipe(stackToDrop, Set.of(dropFrom), dropChance);
    }

    /**
     * This method both registers the drop and returns an ItemStack array that can be used
     * for Slimefun's recipe system. {@link RecipeTypes#VANILLA_DROP}
     *
     * @param stackToDrop The {@link ItemStack} to drop in the world
     * @param dropFrom    The {@link LivingEntityDefinition}'s to drop from.
     * @param dropChance  The chance (0-1) for the drop to occur
     * @return A {@link ItemStack[]} used for Slimefun's Recipe registration with the dropFrom item in the middle.
     */
    @Nonnull
    public static ItemStack[] createMobDropRecipe(@Nonnull ItemStack stackToDrop,
                                                  @Nonnull Set<LivingEntityDefinition> dropFrom,
                                                  double dropChance
    ) {
        Set<EntityType> types = dropFrom.stream().map(LivingEntityDefinition::getType).collect(Collectors.toSet());
        List<String> lore = types.stream()
            .map(type -> Theme.CLICK_INFO.apply(EntityTypeHelper.getName(type)))
            .toList();
        final ItemStack itemStack = Theme.themedItemStack(
            Material.SKELETON_SKULL,
            CultivationThemes.RECIPE_TYPE,
            "从以下生物掉落：",
            lore
        );
        MobDropListener.addDrop(new MobDropListener.MobDrop(stackToDrop, types, dropChance));
        return new ItemStack[]{
            null, null, null,
            null, itemStack, null,
            null, null, null
        };
    }

    public static void createFoodFinishingRecipe(@Nonnull ItemStack[] recipe, @Nonnull ItemStack result) {
        Machines.COUNTER_FINISHING.addRecipe(recipe, result);
    }

    public static void createFoodBakingRecipe(@Nonnull ItemStack[] recipe, @Nonnull ItemStack result) {
        Machines.COUNTER_OVEN.addRecipe(recipe, result);
    }
}
