package dev.sefiraat.cultivation.implementation.slimefun;

import dev.sefiraat.cultivation.api.utils.CultivationThemes;
import dev.sefiraat.cultivation.api.utils.Skins;
import dev.sefiraat.sefilib.itemstacks.ItemStackGenerators;
import dev.sefiraat.sefilib.string.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public final class CultivationStacks {

    private CultivationStacks() {
        throw new IllegalStateException("Utility class");
    }

    // region Trees

    public static final SlimefunItemStack TREE_BANANA = Theme.themedSlimefunItemStack(
        "CLT_TREE_BANANA",
        new ItemStack(Material.ACACIA_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 香蕉",
        List.of(
            "一棵能长出手指的树，emm！"
        )
    );

    public static final SlimefunItemStack TREE_LEMON = Theme.themedSlimefunItemStack(
        "CLT_TREE_LEMON",
        new ItemStack(Material.ACACIA_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 柠檬",
        List.of(
            "这棵树看上去很酸。"
        )
    );

    public static final SlimefunItemStack TREE_ORANGE = Theme.themedSlimefunItemStack(
        "CLT_TREE_ORANGE",
        new ItemStack(Material.JUNGLE_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 橘子",
        List.of(
            "阳光小球。"
        )
    );

    public static final SlimefunItemStack TREE_GREEN_APPLE = Theme.themedSlimefunItemStack(
        "CLT_TREE_GREEN_APPLE",
        new ItemStack(Material.BIRCH_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 青苹果",
        List.of(
            "培育又大又清脆的青苹果。"
        )
    );

    public static final SlimefunItemStack TREE_PINEAPPLE = Theme.themedSlimefunItemStack(
        "CLT_TREE_PINEAPPLE",
        new ItemStack(Material.JUNGLE_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 菠萝",
        List.of(
            "披萨，哪里有披萨？"
        )
    );

    public static final SlimefunItemStack TREE_MANGO = Theme.themedSlimefunItemStack(
        "CLT_TREE_MANGO",
        new ItemStack(Material.OAK_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 芒果",
        List.of(
            "成熟的时候最好吃。"
        )
    );

    public static final SlimefunItemStack TREE_PEACH = Theme.themedSlimefunItemStack(
        "CLT_TREE_PEACH",
        new ItemStack(Material.BIRCH_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 桃子",
        List.of(
            "我觉得詹姆斯正在找这个？"
        )
    );

    public static final SlimefunItemStack TREE_APRICOT = Theme.themedSlimefunItemStack(
        "CLT_TREE_APRICOT",
        new ItemStack(Material.BIRCH_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 杏子",
        List.of(
            "里面只有一个个坑。"
        )
    );

    public static final SlimefunItemStack TREE_PEAR = Theme.themedSlimefunItemStack(
        "CLT_TREE_PEAR",
        new ItemStack(Material.ACACIA_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 梨子",
        List.of(
            "一对梨为了平衡而搭配。"
        )
    );

    public static final SlimefunItemStack TREE_CHERRY = Theme.themedSlimefunItemStack(
        "CLT_TREE_CHERRY",
        new ItemStack(Material.OAK_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 樱桃",
        List.of(
            "Tie the knot!"
        )
    );

    public static final SlimefunItemStack TREE_KIWI = Theme.themedSlimefunItemStack(
        "CLT_TREE_KIWI",
        new ItemStack(Material.BIRCH_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 猕猴桃",
        List.of(
            "一颗来自新西兰的树? 我没搞错吧？"
        )
    );

    public static final SlimefunItemStack TREE_LIME = Theme.themedSlimefunItemStack(
        "CLT_TREE_LIME",
        new ItemStack(Material.JUNGLE_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 酸橙",
        List.of(
            "你知道吗，酸橙只是柠檬在屏住呼吸？"
        )
    );

    public static final SlimefunItemStack TREE_CHESTNUT = Theme.themedSlimefunItemStack(
        "CLT_TREE_CHESTNUT",
        new ItemStack(Material.OAK_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 栗子",
        List.of(
            "一棵显然是为了让人攀爬的树。"
        )
    );

    public static final SlimefunItemStack TREE_HAZELNUT = Theme.themedSlimefunItemStack(
        "CLT_TREE_HAZELNUT",
        new ItemStack(Material.OAK_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 榛子",
        List.of(
            "摇晃这棵树是童年的一种消遣。"
        )
    );

    public static final SlimefunItemStack TREE_PECAN = Theme.themedSlimefunItemStack(
        "CLT_TREE_PECAN",
        new ItemStack(Material.BIRCH_SAPLING),
        CultivationThemes.SAPLING,
        "农耕工艺 - 树木: 山核桃",
        List.of(
            "我们能种这棵树马？是的，可以！"
        )
    );

    // endregion

    // region Bushes

    public static final SlimefunItemStack BUSH_GRAPE = Theme.themedSlimefunItemStack(
        "CLT_BUSH_GRAPE",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 葡萄",
        List.of(
            "成熟多汁的葡萄,",
            "几乎快要从树上掉下来了。"
        )
    );

    public static final SlimefunItemStack BUSH_PEANUTS = Theme.themedSlimefunItemStack(
        "CLT_BUSH_PEANUTS",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 花生",
        List.of(
            "坚实而芬芳，富含蛋白质。"
        )
    );

    public static final SlimefunItemStack BUSH_STRAWBERRY = Theme.themedSlimefunItemStack(
        "CLT_BUSH_STRAWBERRY",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 草莓",
        List.of(
            "坚实而芬芳，富含蛋白质。"
        )
    );

    public static final SlimefunItemStack BUSH_RICE = Theme.themedSlimefunItemStack(
        "CLT_BUSH_RICE",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 大米",
        List.of(
            "终极主食。"
        )
    );

    public static final SlimefunItemStack BUSH_GARLIC = Theme.themedSlimefunItemStack(
        "CLT_BUSH_GARLIC",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 大蒜",
        List.of(
            "灌木丛的味道闻起来很差。"
        )
    );

    public static final SlimefunItemStack BUSH_CAYENNE_PEPPER = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CAYENNE_PEPPER",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 卡宴辣椒",
        List.of(
            "吃了容易上火。"
        )
    );

    public static final SlimefunItemStack BUSH_TOMATO = Theme.themedSlimefunItemStack(
        "CLT_BUSH_TOMATO",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 番茄",
        List.of(
            "成熟的番茄可以做成美食了。"
        )
    );

    public static final SlimefunItemStack BUSH_BELL_PEPPER = Theme.themedSlimefunItemStack(
        "CLT_BUSH_BELL_PEPPER",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 甜椒",
        List.of(
            "走在边上的时候要小心,",
            "你可能会触发警报。"
        )
    );

    public static final SlimefunItemStack BUSH_ONION = Theme.themedSlimefunItemStack(
        "CLT_BUSH_ONION",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 洋葱",
        List.of(
            "这个灌木丛是不是看起来像在撕裂？"
        )
    );

    public static final SlimefunItemStack BUSH_PEA = Theme.themedSlimefunItemStack(
        "CLT_BUSH_PEA",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 豌豆",
        List.of(
            "我觉得Q更好。"
        )
    );

    public static final SlimefunItemStack BUSH_RAPESEED = Theme.themedSlimefunItemStack(
        "CLT_BUSH_RAPESEED",
        Skins.SPIKEY_BLUE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 油菜",
        List.of(
            "这片灌木丛散发着一些油性物质。"
        )
    );

    public static final SlimefunItemStack BUSH_LETTUCE = Theme.themedSlimefunItemStack(
        "CLT_BUSH_LETTUCE",
        Skins.SPIKEY_GREEN_4.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 生菜",
        List.of(
            "生菜真的长在灌木丛里吗？",
            "剧透: 不, 并不会。"
        )
    );

    public static final SlimefunItemStack BUSH_MUSTARD = Theme.themedSlimefunItemStack(
        "CLT_BUSH_MUSTARD",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 芥菜",
        List.of(
            "在嘴里就像火一样。"
        )
    );

    public static final SlimefunItemStack BUSH_BROCCOLI = Theme.themedSlimefunItemStack(
        "CLT_BUSH_BROCCOLI",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 西兰花",
        List.of(
            "可以吃的小树? 是谁发明的!？"
        )
    );

    public static final SlimefunItemStack BUSH_CINNAMON = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CINNAMON",
        Skins.SPIKEY_ORANGE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 肉桂",
        List.of(
            "芳香四溢的灌木丛。"
        )
    );

    public static final SlimefunItemStack BUSH_BASIL = Theme.themedSlimefunItemStack(
        "CLT_BUSH_BASIL",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 罗勒",
        List.of(
            "充满奇思妙想的轻盈灌木丛。"
        )
    );

    public static final SlimefunItemStack BUSH_BAY_LEAF = Theme.themedSlimefunItemStack(
        "CLT_BUSH_BAY_LEAF",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 香叶",
        List.of(
            "香味传千里。"
        )
    );

    public static final SlimefunItemStack BUSH_CILANTRO = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CILANTRO",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 香菜",
        List.of(
            "这片灌木丛中散发着淡淡的柑橘和香料的气味。"
        )
    );

    public static final SlimefunItemStack BUSH_CHICORY = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CHICORY",
        Skins.SPIKEY_BLUE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 菊苣",
        List.of(
            "我以为菊苣是一种根茎？",
            "这个附属真的做过相关的研究吗!？"
        )
    );

    public static final SlimefunItemStack BUSH_CHIVES = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CHIVES",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 韭菜",
        List.of(
            "可以生产世界上最小的",
            "洋葱的灌木丛。"
        )
    );

    public static final SlimefunItemStack BUSH_CLOVE = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CLOVE",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 丁香",
        List.of(
            "这灌木丛让我想起了圣诞节。"
        )
    );

    public static final SlimefunItemStack BUSH_CUMIN = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CUMIN",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 孜然",
        List.of(
            "灌木丛中散发着温暖的香气。"
        )
    );

    public static final SlimefunItemStack BUSH_CHILLI_PEPPER = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CHILLI_PEPPER",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 辣椒",
        List.of(
            "仅仅看着这个灌木丛，就能让我的舌头发烫。"
        )
    );

    public static final SlimefunItemStack BUSH_CURRY_LEAF = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CURRY_LEAF",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 咖喱叶",
        List.of(
            "干烤时效果最佳。"
        )
    );

    public static final SlimefunItemStack BUSH_DILL = Theme.themedSlimefunItemStack(
        "CLT_BUSH_DILL",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 莳萝",
        List.of(
            "这种灌木长得比其他的都快"
        )
    );

    public static final SlimefunItemStack BUSH_FENNEL = Theme.themedSlimefunItemStack(
        "CLT_BUSH_FENNEL",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 茴香",
        List.of(
            "为什么这种灌木能驱虫!？"
        )
    );

    public static final SlimefunItemStack BUSH_GINGER = Theme.themedSlimefunItemStack(
        "CLT_BUSH_GINGER",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 姜",
        List.of(
            "这种灌木在煮熟后的效果很好。"
        )
    );

    public static final SlimefunItemStack BUSH_HORSERADISH = Theme.themedSlimefunItemStack(
        "CLT_BUSH_HORSERADISH",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 辣根",
        List.of(
            "没错, 这种植物的存在没有任何意义。"
        )
    );

    public static final SlimefunItemStack BUSH_JASMINE = Theme.themedSlimefunItemStack(
        "CLT_BUSH_JASMINE",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 茉莉",
        List.of(
            "这个灌木丛的气味是如此的柔和与圆润。"
        )
    );

    public static final SlimefunItemStack BUSH_JUNIPER_BERRY = Theme.themedSlimefunItemStack(
        "CLT_BUSH_JUNIPER_BERRY",
        Skins.SPIKEY_BLUE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 杜松子",
        List.of(
            "未采摘时很甜，但烘干后很刺鼻。"
        )
    );

    public static final SlimefunItemStack BUSH_KAFFIR_LIME = Theme.themedSlimefunItemStack(
        "CLT_BUSH_KAFFIR_LIME",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 泰国青柠",
        List.of(
            "一种叶子比果实更受欢迎的灌木。"
        )
    );

    public static final SlimefunItemStack BUSH_LAVENDER = Theme.themedSlimefunItemStack(
        "CLT_BUSH_LAVENDER",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 薰衣草",
        List.of(
            "这种灌木到处散发着它的气味。"
        )
    );

    public static final SlimefunItemStack BUSH_LICORICE = Theme.themedSlimefunItemStack(
        "CLT_BUSH_LICORICE",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 甘草",
        List.of(
            "粗壮的"
        )
    );

    public static final SlimefunItemStack BUSH_MACE = Theme.themedSlimefunItemStack(
        "CLT_BUSH_MACE",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 肉豆蔻",
        List.of(
            "这片灌木丛似乎在击退攻击者？"
        )
    );

    public static final SlimefunItemStack BUSH_MARJORAM = Theme.themedSlimefunItemStack(
        "CLT_BUSH_MARJORAM",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 马郁兰",
        List.of(
            "一大片散发着木质气味的灌木。"
        )
    );

    public static final SlimefunItemStack BUSH_MINT = Theme.themedSlimefunItemStack(
        "CLT_BUSH_MINT",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 薄荷",
        List.of(
            "这简直是最好闻的灌木"
        )
    );

    public static final SlimefunItemStack BUSH_OREGANO = Theme.themedSlimefunItemStack(
        "CLT_BUSH_OREGANO",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 牛至",
        List.of(
            "这种刺鼻气味的灌木令游客望而却步。"
        )
    );

    public static final SlimefunItemStack BUSH_PARSLEY = Theme.themedSlimefunItemStack(
        "CLT_BUSH_PARSLEY",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 欧芹",
        List.of(
            "把这片灌木丛扔进熔岩里, 就现在! :D"
        )
    );

    public static final SlimefunItemStack BUSH_ROSEMARY = Theme.themedSlimefunItemStack(
        "CLT_BUSH_ROSEMARY",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 迷迭香",
        List.of(
            "一种灌木，它的气味使人想起星期天的午餐。"
        )
    );

    public static final SlimefunItemStack BUSH_SASSAFRAS = Theme.themedSlimefunItemStack(
        "CLT_BUSH_SASSAFRAS",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 黄樟",
        List.of(
            "这种灌木喜欢被种植",
            "在小水域附近"
        )
    );

    public static final SlimefunItemStack BUSH_SHISO = Theme.themedSlimefunItemStack(
        "CLT_BUSH_SHISO",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 紫苏",
        List.of(
            "我乐意认为这种灌木",
            "是薄荷灌木和罗勒灌木的私生子",
            "可惜很难育种!"
        )
    );

    public static final SlimefunItemStack BUSH_STAR_ANISE = Theme.themedSlimefunItemStack(
        "CLT_BUSH_STAR_ANISE",
        Skins.SPIKEY_ORANGE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 八角",
        List.of(
            "从这种灌木上脱落的一小片茴香是如此独特",
            "你简直无法相信。"
        )
    );

    public static final SlimefunItemStack BUSH_TARRAGON = Theme.themedSlimefunItemStack(
        "CLT_BUSH_TARRAGON",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 龙蒿",
        List.of(
            "这棵灌木不喜欢引起太多的注意"
        )
    );

    public static final SlimefunItemStack BUSH_THYME = Theme.themedSlimefunItemStack(
        "CLT_BUSH_THYME",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 百里香",
        List.of(
            "这种灌木总是用光…百里香…*咳嗽*"
        )
    );

    public static final SlimefunItemStack BUSH_TURMERIC = Theme.themedSlimefunItemStack(
        "CLT_BUSH_TURMERIC",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 姜黄",
        List.of(
            "只要拿着这丛灌木",
            "一股香料的味道就会扑鼻而来。"
        )
    );

    public static final SlimefunItemStack BUSH_VANILLA = Theme.themedSlimefunItemStack(
        "CLT_BUSH_VANILLA",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 香子兰",
        List.of(
            "这种灌木长期存在于星巴克中。"
        )
    );

    public static final SlimefunItemStack BUSH_WASABI = Theme.themedSlimefunItemStack(
        "CLT_BUSH_WASABI",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 山萮菜",
        List.of(
            "这是从灌木丛中长出的另一根？",
            "哎…"
        )
    );

    public static final SlimefunItemStack BUSH_ARTICHOKE = Theme.themedSlimefunItemStack(
        "CLT_BUSH_ARTICHOKE",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 洋蓟",
        List.of(
            "迄今为止最好的能勒死艺术家的灌木",
            "双关很难"
        )
    );

    public static final SlimefunItemStack BUSH_AUBERGINE = Theme.themedSlimefunItemStack(
        "CLT_BUSH_AUBERGINE",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 茄冰蕉",
        List.of(
            "我拒绝用茄子这个词,因为我喜欢。"
        )
    );

    public static final SlimefunItemStack BUSH_ASPARAGUS = Theme.themedSlimefunItemStack(
        "CLT_BUSH_ASPARAGUS",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 芦笋",
        List.of(
            "这种芦笋灌木",
            "是很好的追踪者!"
        )
    );

    public static final SlimefunItemStack BUSH_BRUSSELS_SPROUTS = Theme.themedSlimefunItemStack(
        "CLT_BUSH_BRUSSELS_SPROUTS",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 球芽甘蓝",
        List.of(
            "这种灌木",
            "有时会产出有毒气体"
        )
    );

    public static final SlimefunItemStack BUSH_CABBAGE = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CABBAGE",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 卷心菜",
        List.of(
            "伴随着大量情感的",
            "卷心菜灌木。"
        )
    );

    public static final SlimefunItemStack BUSH_CAULIFLOWER = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CAULIFLOWER",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 花椰菜",
        List.of(
            "能够结出令人开心的",
            "小云彩"
        )
    );

    public static final SlimefunItemStack BUSH_CELERY = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CELERY",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 芹菜",
        List.of(
            "这个灌木丛是多余的。",
            "Sefi不喜欢芹菜"
        )
    );

    public static final SlimefunItemStack BUSH_KALE = Theme.themedSlimefunItemStack(
        "CLT_BUSH_KALE",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 羽衣甘蓝",
        List.of(
            "当你种植这株灌木时",
            "你会觉得一切都将变成甘蓝。"
        )
    );

    public static final SlimefunItemStack BUSH_SPINACH = Theme.themedSlimefunItemStack(
        "CLT_BUSH_SPINACH",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 菠菜",
        List.of(
            "这株灌木是大力水手最好的朋友"
        )
    );

    public static final SlimefunItemStack BUSH_BLACK_BEANS = Theme.themedSlimefunItemStack(
        "CLT_BUSH_BLACK_BEANS",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 黑豆",
        List.of(
            "这株灌木轻轻地对你低语:",
            "你是一颗伟大的豆子。"
        )
    );

    public static final SlimefunItemStack BUSH_GREEN_BEANS = Theme.themedSlimefunItemStack(
        "CLT_BUSH_GREEN_BEANS",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 四季豆",
        List.of(
            "将番茄酱倒在灌木上",
            "来做烧烤。"
        )
    );

    public static final SlimefunItemStack BUSH_CHICKPEAS = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CHICKPEAS",
        Skins.SPIKEY_ORANGE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 鹰嘴豆",
        List.of(
            "用豌豆和鸡繁殖而成的灌木",
            "科技与狠活"
        )
    );

    public static final SlimefunItemStack BUSH_SOY_BEANS = Theme.themedSlimefunItemStack(
        "CLT_BUSH_SOY_BEANS",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 大豆",
        List.of(
            "这种灌木能友好的享受",
            "这让我很开心。"
        )
    );

    public static final SlimefunItemStack BUSH_PINTO_BEANS = Theme.themedSlimefunItemStack(
        "CLT_BUSH_PINTO_BEANS",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 斑豆",
        List.of(
            "用不了多久我们就能成功培育出直筒玉米煎饼",
            "对吗？"
        )
    );

    public static final SlimefunItemStack BUSH_RUNNER_BEANS = Theme.themedSlimefunItemStack(
        "CLT_BUSH_RUNNER_BEANS",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 红花菜豆",
        List.of(
            "这豆长脚了 o.o？"
        )
    );

    public static final SlimefunItemStack BUSH_NETTLES = Theme.themedSlimefunItemStack(
        "CLT_BUSH_NETTLES",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 荨麻",
        List.of(
            "穿过这片灌木丛时要小心!"
        )
    );

    public static final SlimefunItemStack BUSH_OKRA = Theme.themedSlimefunItemStack(
        "CLT_BUSH_OKRA",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 秋葵",
        List.of(
            "根据秋葵·温弗瑞的蔬菜俱乐部",
            "它被评为头号蔬菜。"
        )
    );

    public static final SlimefunItemStack BUSH_LEEK = Theme.themedSlimefunItemStack(
        "CLT_BUSH_LEEK",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 韭葱",
        List.of(
            "你知道韭菜只是一个穿了紧身胸衣的洋葱吗？",
            "这是真实的故事。"
        )
    );

    public static final SlimefunItemStack BUSH_SHALLOT = Theme.themedSlimefunItemStack(
        "CLT_BUSH_SHALLOT",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 青葱",
        List.of(
            "这种灌木很快就会长出可爱的迷你洋葱",
            "幸运的是你不需要葱。"
        )
    );

    public static final SlimefunItemStack BUSH_JALAPENO = Theme.themedSlimefunItemStack(
        "CLT_BUSH_JALAPENO",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 墨西哥胡椒",
        List.of(
            "只要握住这根灌木",
            "你就有1%的机会点燃它。"
        )
    );

    public static final SlimefunItemStack BUSH_RADICCHIO = Theme.themedSlimefunItemStack(
        "CLT_BUSH_RADICCHIO",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 菊苣",
        List.of(
            "这听起来很花哨吗？",
            "但是在任何一餐中加入菊苣 - 就如同卷心菜",
            "让你看起来很精致"
        )
    );

    public static final SlimefunItemStack BUSH_RHUBARB = Theme.themedSlimefunItemStack(
        "CLT_BUSH_RHUBARB",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 大黄",
        List.of(
            "你知道大黄是一种蔬菜吗？",
            "我以为是一种锤子。"
        )
    );

    public static final SlimefunItemStack BUSH_CELERIAC = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CELERIAC",
        Skins.SPIKEY_ORANGE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 块根芹",
        List.of(
            "又一个从灌木丛中长出的根？",
            "Sefi再见™"
        )
    );

    public static final SlimefunItemStack BUSH_PARSNIP = Theme.themedSlimefunItemStack(
        "CLT_BUSH_PARSNIP",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 欧洲防风草",
        List.of(
            "跳过中间人",
            "烤干灌木"
        )
    );

    public static final SlimefunItemStack BUSH_RUTABAGA = Theme.themedSlimefunItemStack(
        "CLT_BUSH_RUTABAGA",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 芜菁甘蓝",
        List.of(
            "瑞典人!它是瑞典人!"
        )
    );

    public static final SlimefunItemStack BUSH_RADDISH = Theme.themedSlimefunItemStack(
        "CLT_BUSH_RADDISH",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 小红萝卜",
        List.of(
            "这株植物刚刚表演了一个滑板魔术",
            "太棒了…咦惹。"
        )
    );

    public static final SlimefunItemStack BUSH_SWEET_POTATO = Theme.themedSlimefunItemStack(
        "CLT_BUSH_SWEET_POTATO",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 甘薯",
        List.of(
            "这灌木太可爱了",
            "你没听的时候我听到它在夸你。"
        )
    );

    public static final SlimefunItemStack BUSH_TURNIP = Theme.themedSlimefunItemStack(
        "CLT_BUSH_TURNIP",
        Skins.SPIKEY_ORANGE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 大头菜",
        List.of(
            "根据英国政府的说法",
            "这棵灌木将解决我们所有的问题。"
        )
    );

    public static final SlimefunItemStack BUSH_SWEETCORN = Theme.themedSlimefunItemStack(
        "CLT_BUSH_SWEETCORN",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 甜玉米",
        List.of(
            "这片灌木丛迫切需要",
            "被建成一个迷宫"
        )
    );

    public static final SlimefunItemStack BUSH_COURGETTE = Theme.themedSlimefunItemStack(
        "CLT_BUSH_COURGETTE",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 西葫芦",
        List.of(
            "为什么这棵灌木一直在喊西葫芦这个词",
            "我猜一定是美国人？"
        )
    );

    public static final SlimefunItemStack BUSH_CUCUMBER = Theme.themedSlimefunItemStack(
        "CLT_BUSH_CUCUMBER",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 黄瓜",
        List.of(
            "这种灌木是专为你可爱的",
            "夏季沙拉而设计的。"
        )
    );

    public static final SlimefunItemStack BUSH_MARROW = Theme.themedSlimefunItemStack(
        "CLT_BUSH_MARROW",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 嫩葫芦",
        List.of(
            "我很惊讶这灌木",
            "能承受它自己的重量。"
        )
    );

    public static final SlimefunItemStack BUSH_AVOCADO = Theme.themedSlimefunItemStack(
        "CLT_BUSH_AVOCADO",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 鳄梨",
        List.of(
            "这种灌木是专门培育的",
            "不需要太多的水。"
        )
    );

    public static final SlimefunItemStack BUSH_GREEN_ONION = Theme.themedSlimefunItemStack(
        "CLT_BUSH_GREEN_ONION",
        Skins.SPIKEY_GREEN_4.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 嫩葱",
        List.of(
            "也叫葱白。",
            "大葱通常比大多数",
            "洋葱味道温和"
        )
    );

    public static final SlimefunItemStack BUSH_BLACK_PEPPER = Theme.themedSlimefunItemStack(
        "CLT_BUSH_PEPPER",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "农耕工艺 - 灌木: 黑胡椒",
        List.of(
            "早在希腊和罗马时代",
            "黑胡椒就是印度和欧洲之间",
            "香料贸易的重要主城部分。"
        )
    );

    // endregion

    // region Plants

    public static final SlimefunItemStack PLANT_DARKNESS = Theme.themedSlimefunItemStack(
        "CLT_PLANT_DARKNESS",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 原始植物: 黑暗",
        List.of(
            "一种在无尽的愤怒中沸腾的植物。",
            "",
            Theme.WARNING.apply("原始植物不会生产物品，"),
            Theme.WARNING.apply("仅可进行培育。")
        )
    );

    public static final SlimefunItemStack PLANT_LIGHT = Theme.themedSlimefunItemStack(
        "CLT_PLANT_LIGHT",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 原始植物: 光明",
        List.of(
            "一种散发着纯爱气息的植物。",
            "",
            Theme.WARNING.apply("原始植物不会生产物品，"),
            Theme.WARNING.apply("仅可进行培育。")
        )
    );

    public static final SlimefunItemStack PLANT_EARTH = Theme.themedSlimefunItemStack(
        "CLT_PLANT_EARTH",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 原始植物: 大地",
        List.of(
            "一种能填充周围世界的植物。",
            "",
            Theme.WARNING.apply("原始植物不会生产物品，"),
            Theme.WARNING.apply("仅可进行培育。")
        )
    );

    public static final SlimefunItemStack PLANT_WATER = Theme.themedSlimefunItemStack(
        "CLT_PLANT_WATER",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 原始植物: 水",
        List.of(
            "一种能滋养周边生物,",
            "也能提供生命的植物。",
            "",
            Theme.WARNING.apply("原始植物不会生产物品，"),
            Theme.WARNING.apply("仅可进行培育。")
        )
    );

    public static final SlimefunItemStack PLANT_FIRE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_FIRE",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 原始植物: 火",
        List.of(
            "一种同时提供了",
            "毁灭与新生的植物。",
            "",
            Theme.WARNING.apply("原始植物不会生产物品，"),
            Theme.WARNING.apply("仅可进行培育。")
        )
    );

    public static final SlimefunItemStack PLANT_AIR = Theme.themedSlimefunItemStack(
        "CLT_PLANT_AIR",
        Skins.SEED_CYAN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 原始植物: 空气",
        List.of(
            "一种静静地哼唱着周围自然旋律的植物。",
            "",
            Theme.WARNING.apply("原始植物不会生产物品，"),
            Theme.WARNING.apply("仅可进行培育。")
        )
    );

    public static final SlimefunItemStack PLANT_POWER = Theme.themedSlimefunItemStack(
        "CLT_PLANT_POWER",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 原始植物: 力量",
        List.of(
            "一种积极地散发力量的植物。",
            "",
            Theme.WARNING.apply("原始植物不会生产物品，"),
            Theme.WARNING.apply("仅可进行培育。")
        )
    );

    public static final SlimefunItemStack PLANT_WEALTH = Theme.themedSlimefunItemStack(
        "CLT_PLANT_WEALTH",
        Skins.SEED_ORANGE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 原始植物: 财富",
        List.of(
            "一种彰显荣华富贵的植物。",
            "",
            Theme.WARNING.apply("Primal plants dont produce items"),
            Theme.WARNING.apply("and are just for breeding.")
        )
    );

    public static final SlimefunItemStack PLANT_SPECTRUM = Theme.themedSlimefunItemStack(
        "CLT_PLANT_SPECTRUM",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 原始植物: 光谱",
        List.of(
            "一种轻微改变着颜色的植物。",
            "",
            Theme.WARNING.apply("原始植物不会生产物品，"),
            Theme.WARNING.apply("仅可进行培育。")
        )
    );

    public static final SlimefunItemStack PLANT_DIRT = Theme.themedSlimefunItemStack(
        "CLT_PLANT_DIRT",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 泥土",
        List.of(
            "表面肮脏，但包含了",
            "孕育生命所需的方块。"
        )
    );

    public static final SlimefunItemStack PLANT_GRASS = Theme.themedSlimefunItemStack(
        "CLT_PLANT_GRASS",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 草",
        List.of(
            "从地上长出生机蓬勃的生命。"
        )
    );

    public static final SlimefunItemStack PLANT_FLOWER = Theme.themedSlimefunItemStack(
        "CLT_PLANT_FLOWER",
        Skins.SEED_ORANGE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 花卉",
        List.of(
            "各种花卉被很好地展示出来。"
        )
    );

    public static final SlimefunItemStack PLANT_VINE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_VINE",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 藤蔓",
        List.of(
            "一种能瞬间将自己缠绕起来的植物。"
        )
    );

    public static final SlimefunItemStack PLANT_SAND = Theme.themedSlimefunItemStack(
        "CLT_PLANT_SAND",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 沙子",
        List.of(
            "这种植物有时会一触即散。"
        )
    );

    public static final SlimefunItemStack PLANT_RED_SAND = Theme.themedSlimefunItemStack(
        "CLT_PLANT_RED_SAND",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 红沙",
        List.of(
            "这种植物有时会一触即散，",
            "不过更红一点。"
        )
    );

    public static final SlimefunItemStack PLANT_MOSS = Theme.themedSlimefunItemStack(
        "CLT_PLANT_MOSS",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 苔藓",
        List.of(
            "这种植物往往会不受控制地往外扩散。"
        )
    );

    public static final SlimefunItemStack PLANT_SAPLING = Theme.themedSlimefunItemStack(
        "CLT_PLANT_SAPLING",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 树苗",
        List.of(
            "这种植物到底有什么意义呢…"
        )
    );

    public static final SlimefunItemStack PLANT_MUSHROOM = Theme.themedSlimefunItemStack(
        "CLT_PLANT_MUSHROOM",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 蘑菇",
        List.of(
            "是的，可以长出蘑菇的植物。",
            "这在粘液科技里再正常不过了。"
        )
    );

    public static final SlimefunItemStack PLANT_WITHER_ROSE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_WITHER_ROSE",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 凋零玫瑰",
        List.of(
            "这种植物不知何故",
            "会在周围散发出有害的气息。"
        )
    );

    public static final SlimefunItemStack PLANT_DARK_FLORA = Theme.themedSlimefunItemStack(
        "CLT_PLANT_DARK_FLORA",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 黑暗植物",
        List.of(
            "种子中隐藏着沉默的恶魔。"
        )
    );

    public static final SlimefunItemStack PLANT_GLOWING_VINE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_GLOWING_VINE",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 发光藤蔓",
        List.of(
            "种子散发着微弱的光芒。"
        )
    );

    public static final SlimefunItemStack PLANT_DIM_LIT = Theme.themedSlimefunItemStack(
        "CLT_PLANT_DIM_LIT",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 昏暗光线",
        List.of(
            "种子散发着非常昏暗的光线。"
        )
    );

    public static final SlimefunItemStack PLANT_COW = Theme.themedSlimefunItemStack(
        "CLT_PLANT_COW",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 牛",
        List.of(
            "如果你将这颗种子放在耳边，",
            "你会偶尔听到牛叫。"
        )
    );

    public static final SlimefunItemStack PLANT_CHICKEN = Theme.themedSlimefunItemStack(
        "CLT_PLANT_CHICKEN",
        Skins.SEED_CYAN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 鸡",
        List.of(
            "传闻说，如果你举着这颗种子",
            "从高处跳下，你会滑翔两年半",
            "而不会摔落。"
        )
    );

    public static final SlimefunItemStack PLANT_FISH = Theme.themedSlimefunItemStack(
        "CLT_PLANT_FISH",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 鱼",
        List.of(
            "一股成熟的气味从种子中散发出来。"
        )
    );

    public static final SlimefunItemStack PLANT_TURTLE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_TURTLE",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 海龟",
        List.of(
            "被坚硬外壳包围的种子。"
        )
    );

    public static final SlimefunItemStack PLANT_VILLAGER = Theme.themedSlimefunItemStack(
        "CLT_PLANT_VILLAGER",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 村民",
        List.of(
            "是的，我们将村民的精华浓缩在植物里。",
            "显然，这很伤村民。"
        )
    );

    public static final SlimefunItemStack PLANT_RABBIT = Theme.themedSlimefunItemStack(
        "CLT_PLANT_RABBIT",
        Skins.SEED_ORANGE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 兔子",
        List.of(
            "虫子会感到自豪。"
        )
    );

    public static final SlimefunItemStack PLANT_SHEEP = Theme.themedSlimefunItemStack(
        "CLT_PLANT_SHEEP",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 羊",
        List.of(
            "这种植物有着粗糙的毛茸质地。"
        )
    );

    public static final SlimefunItemStack PLANT_PIG = Theme.themedSlimefunItemStack(
        "CLT_PLANT_PIG",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 猪",
        List.of(
            "这种植物会随机地发出哼叫声。"
        )
    );

    public static final SlimefunItemStack PLANT_BEE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_BEE",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 蜜蜂",
        List.of(
            "这种植物有一对非常小而精致的翅膀。"
        )
    );

    public static final SlimefunItemStack PLANT_SQUID = Theme.themedSlimefunItemStack(
        "CLT_PLANT_SQUID",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 鱿鱼",
        List.of(
            "小心，只要触碰到这株植物，",
            "就有可能让这片区域充满墨汁。"
        )
    );

    public static final SlimefunItemStack PLANT_GLOW_SQUID = Theme.themedSlimefunItemStack(
        "CLT_PLANT_GLOW_SQUID",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 发光鱿鱼",
        List.of(
            "一种散发着微弱光芒的植物。"
        )
    );

    public static final SlimefunItemStack PLANT_FROG = Theme.themedSlimefunItemStack(
        "CLT_PLANT_FROG",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 青蛙",
        List.of(
            "呱呱!"
        )
    );

    public static final SlimefunItemStack PLANT_GOAT = Theme.themedSlimefunItemStack(
        "CLT_PLANT_GOAT",
        Skins.SEED_ORANGE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 山羊",
        List.of(
            "一种拥有随机暴力倾向的植物，",
            "喜欢跳来跳去。"
        )
    );

    public static final SlimefunItemStack PLANT_RAINBOW = Theme.themedSlimefunItemStack(
        "CLT_PLANT_RAINBOW",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 彩虹",
        List.of(
            "这种植物的尽头可能有装满金子的罐头，",
            "也可能没有。"
        )
    );

    public static final SlimefunItemStack PLANT_WAXY = Theme.themedSlimefunItemStack(
        "CLT_PLANT_WAXY",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 蜡",
        List.of(
            "这种植物的汁液会自然形成",
            "与蜡烛完全相似的蜡块。"
        )
    );

    public static final SlimefunItemStack PLANT_WOOLLY = Theme.themedSlimefunItemStack(
        "CLT_PLANT_WOOLLY",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 羊毛",
        List.of(
            "一种从根茎到枝叶",
            "完全被羊毛覆盖的植物。"
        )
    );

    public static final SlimefunItemStack PLANT_TERRA = Theme.themedSlimefunItemStack(
        "CLT_PLANT_TERRA",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 大地",
        List.of(
            "一种在受到压力时产生裂纹的坚硬植物。"
        )
    );

    public static final SlimefunItemStack PLANT_GLAZED = Theme.themedSlimefunItemStack(
        "CLT_PLANT_GLAZED",
        Skins.SEED_ORANGE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 釉",
        List.of(
            "一种会长出复杂设计的植物。"
        )
    );

    public static final SlimefunItemStack PLANT_DUSTY = Theme.themedSlimefunItemStack(
        "CLT_PLANT_DUSTY",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 粉",
        List.of(
            "这种植物需要特殊照顾，",
            "即使微风也足以使其破碎。"
        )
    );

    public static final SlimefunItemStack PLANT_CONCRETE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_CONCRETE",
        Skins.SEED_CYAN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 混凝土",
        List.of(
            "这种植物很难生长，",
            "因为它很快就会变硬。"
        )
    );

    public static final SlimefunItemStack PLANT_STAINED = Theme.themedSlimefunItemStack(
        "CLT_PLANT_STAINED",
        Skins.SEED_CYAN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 染色",
        List.of(
            "这种植物将光分裂成真正的光谱，",
            "照射到附近的物体上。"
        )
    );

    public static final SlimefunItemStack PLANT_COBBLESTONE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_COBBLESTONE",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 圆石",
        List.of(
            "这种植物与岩石一样坚硬。"
        )
    );

    public static final SlimefunItemStack PLANT_GRAVEL = Theme.themedSlimefunItemStack(
        "CLT_PLANT_GRAVEL",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 沙砾",
        List.of(
            "这种植物完全不知道",
            "如何保持自己的完整。"
        )
    );

    public static final SlimefunItemStack PLANT_CLAY = Theme.themedSlimefunItemStack(
        "CLT_PLANT_CLAY",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 粘土",
        List.of(
            "这种植物可以被自由地塑形与重塑。",
            "虽然如此，这样做这并不是一个好主意！"
        )
    );

    public static final SlimefunItemStack PLANT_IGNEOUS = Theme.themedSlimefunItemStack(
        "CLT_PLANT_IGNEOUS",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 火成岩",
        List.of(
            "这种植物是通过热和压力形成的。",
            "不要这样看着我！",
            "所有这些植物描述都是有意义的。"
        )
    );

    public static final SlimefunItemStack PLANT_DEEPSLATE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_DEEPSLATE",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 深板岩",
        List.of(
            "深层，板岩，<在此插入说明>。"
        )
    );

    public static final SlimefunItemStack PLANT_REINFORCED = Theme.themedSlimefunItemStack(
        "CLT_PLANT_REINFORCED",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 强化",
        List.of(
            "这种植物能够通过任何方式",
            "支撑起自己。"
        )
    );

    public static final SlimefunItemStack PLANT_BLACKSTONE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_BLACKSTONE",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 黑石",
        List.of(
            "这种植物据说可以吸收光线。"
        )
    );

    public static final SlimefunItemStack PLANT_NETHERRACK = Theme.themedSlimefunItemStack(
        "CLT_PLANT_NETHERRACK",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 下界岩",
        List.of(
            "这种坚韧的植物",
            "能够在大多数地方生存。"
        )
    );

    public static final SlimefunItemStack PLANT_DARK_GRASS = Theme.themedSlimefunItemStack(
        "CLT_PLANT_DARK_GRASS",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 黑草",
        List.of(
            "这种植物已经失去自我。"
        )
    );

    public static final SlimefunItemStack PLANT_MAGMA = Theme.themedSlimefunItemStack(
        "CLT_PLANT_MAGMA",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 岩浆",
        List.of(
            "这种植物很烫，",
            "会燃烧周围的一切。"
        )
    );

    public static final SlimefunItemStack PLANT_SOUL = Theme.themedSlimefunItemStack(
        "CLT_PLANT_SOUL",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 灵魂",
        List.of(
            "这种植物在安静时会发出尖叫声。"
        )
    );

    public static final SlimefunItemStack PLANT_BASALT = Theme.themedSlimefunItemStack(
        "CLT_PLANT_BASALT",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 玄武岩",
        List.of(
            "这种植物非常无聊和乏味。"
        )
    );

    public static final SlimefunItemStack PLANT_GLASS = Theme.themedSlimefunItemStack(
        "CLT_PLANT_GLASS",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 玻璃",
        List.of(
            "只要角度合适，",
            "你一定能看到植物的内部。"
        )
    );

    public static final SlimefunItemStack PLANT_MUD = Theme.themedSlimefunItemStack(
        "CLT_PLANT_MUD",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 泥巴",
        List.of(
            "这种植物几乎和它来自的土地一样肮脏。"
        )
    );

    public static final SlimefunItemStack PLANT_END_STONE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_END_STONE",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 末地石",
        List.of(
            "这种植物会发出虚空的嗡鸣声。"
        )
    );

    public static final SlimefunItemStack PLANT_PURPUR = Theme.themedSlimefunItemStack(
        "CLT_PLANT_PURPUR",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 紫珀",
        List.of(
            "一种奇怪的植物，",
            "似乎比大多数植物轻得多。"
        )
    );

    public static final SlimefunItemStack PLANT_COAL = Theme.themedSlimefunItemStack(
        "CLT_PLANT_COAL",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 煤炭",
        List.of(
            "这种植物有着巨大的潜力。"
        )
    );

    public static final SlimefunItemStack PLANT_RAW_IRON = Theme.themedSlimefunItemStack(
        "CLT_PLANT_RAW_IRON",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 粗铁",
        List.of(
            "这种坚固的植物",
            "能承受大多数环境。"
        )
    );

    public static final SlimefunItemStack PLANT_RAW_COPPER = Theme.themedSlimefunItemStack(
        "CLT_PLANT_RAW_COPPER",
        Skins.SEED_ORANGE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 粗铜",
        List.of(
            "如果放任不管，这种植物",
            "有时会吸引闪电。"
        )
    );

    public static final SlimefunItemStack PLANT_RAW_GOLD = Theme.themedSlimefunItemStack(
        "CLT_PLANT_RAW_GOLD",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 粗金",
        List.of(
            "如果猪灵在边上，",
            "那这种植物一定会被偷走。"
        )
    );

    public static final SlimefunItemStack PLANT_REDSTONE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_REDSTONE",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 红石",
        List.of(
            "这种植物充满了能量。"
        )
    );

    public static final SlimefunItemStack PLANT_LAPIS = Theme.themedSlimefunItemStack(
        "CLT_PLANT_LAPIS",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 青金石",
        List.of(
            "这种植物有着微弱的魔法光环。"
        )
    );

    public static final SlimefunItemStack PLANT_DIAMOND = Theme.themedSlimefunItemStack(
        "CLT_PLANT_DIAMOND",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 钻石",
        List.of(
            "这种植物象征着财富。"
        )
    );

    public static final SlimefunItemStack PLANT_EMERALD = Theme.themedSlimefunItemStack(
        "CLT_PLANT_EMERALD",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 绿宝石",
        List.of(
            "这种植物的拥有着必须",
            "花费很大的代价才能负担得起。"
        )
    );

    public static final SlimefunItemStack PLANT_NETHER_QUARTZ = Theme.themedSlimefunItemStack(
        "CLT_PLANT_NETHER_QUARTZ",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 下界石英",
        List.of(
            "这种植物的刺非常锋利，很难处理。"
        )
    );

    public static final SlimefunItemStack PLANT_SCRAPPY = Theme.themedSlimefunItemStack(
        "CLT_PLANT_SCRAPPY",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 碎片",
        List.of(
            "这种植物象征着",
            "园艺学的巅峰。"
        )
    );

    public static final SlimefunItemStack PLANT_AMETHYST = Theme.themedSlimefunItemStack(
        "CLT_PLANT_AMETHYST",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 紫水晶",
        List.of(
            "这种植物喜欢在深邃",
            "且黑暗的地方茁壮成长。"
        )
    );

    public static final SlimefunItemStack PLANT_ECHO = Theme.themedSlimefunItemStack(
        "CLT_PLANT_ECHO",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 回声",
        List.of(
            "这种植物知道回家的路。"
        )
    );

    public static final SlimefunItemStack PLANT_SKELETON = Theme.themedSlimefunItemStack(
        "CLT_PLANT_SKELETON",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 骷髅",
        List.of(
            "这种植物在摇摆时",
            "会发出咔嗒声。"
        )
    );

    public static final SlimefunItemStack PLANT_SPIDER = Theme.themedSlimefunItemStack(
        "CLT_PLANT_SPIDER",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 蜘蛛",
        List.of(
            "快！赶快！杀了它!"
        )
    );

    public static final SlimefunItemStack PLANT_CREEPER = Theme.themedSlimefunItemStack(
        "CLT_PLANT_CREEPER",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 苦力怕",
        List.of(
            "Aw man…"
        )
    );

    public static final SlimefunItemStack PLANT_ZOMBIE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_ZOMBIE",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 僵尸",
        List.of(
            "这种植物正在滴落…什么东西…"
        )
    );

    public static final SlimefunItemStack PLANT_DROWNED = Theme.themedSlimefunItemStack(
        "CLT_PLANT_DROWNED",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 溺尸",
        List.of(
            "这种植物总是湿漉漉的。"
        )
    );

    public static final SlimefunItemStack PLANT_GUARDIAN = Theme.themedSlimefunItemStack(
        "CLT_PLANT_GUARDIAN",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 守卫者",
        List.of(
            "触摸植物时，",
            "会释放尖刺。"
        )
    );

    public static final SlimefunItemStack PLANT_ELDER_GUARDIAN = Theme.themedSlimefunItemStack(
        "CLT_PLANT_ELDER_GUARDIAN",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 远古守卫者",
        List.of(
            "靠近这种植物时，",
            "人们会变得迟钝。"
        )
    );

    public static final SlimefunItemStack PLANT_GHAST = Theme.themedSlimefunItemStack(
        "CLT_PLANT_GHAST",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 恶魂",
        List.of(
            "这种植物据说会随机发射火球。"
        )
    );

    public static final SlimefunItemStack PLANT_SLIME = Theme.themedSlimefunItemStack(
        "CLT_PLANT_SLIME",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 史莱姆",
        List.of(
            "为什么它这么黏？"
        )
    );

    public static final SlimefunItemStack PLANT_MAGMA_CUBE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_MAGMA_CUBE",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 岩浆怪",
        List.of(
            "当没人注意时，",
            "这种植物喜欢上下弹跳。"
        )
    );

    public static final SlimefunItemStack PLANT_BLAZE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_BLAZE",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 烈焰人",
        List.of(
            "这种植物的边缘被烧焦了。"
        )
    );

    public static final SlimefunItemStack PLANT_WITHER_SKELETON = Theme.themedSlimefunItemStack(
        "CLT_PLANT_WITHER_SKELETON",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 凋灵骷髅",
        List.of(
            "这种植物以难以捉摸和坚韧著称。"
        )
    );

    public static final SlimefunItemStack PLANT_WITHER = Theme.themedSlimefunItemStack(
        "CLT_PLANT_WITHER",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 凋灵",
        List.of(
            "这种致命的植物必须小心对待。"
        )
    );

    public static final SlimefunItemStack PLANT_PHANTOM = Theme.themedSlimefunItemStack(
        "CLT_PLANT_PHANTOM",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 幻翼",
        List.of(
            "这种植物有高耸的叶子。"
        )
    );

    public static final SlimefunItemStack PLANT_SHULKER = Theme.themedSlimefunItemStack(
        "CLT_PLANT_SHULKER",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 潜影盒",
        List.of(
            "这种植物经常从地面上浮起来。"
        )
    );

    public static final SlimefunItemStack PLANT_ENDERMAN = Theme.themedSlimefunItemStack(
        "CLT_PLANT_ENDERMAN",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 末影人",
        List.of(
            "如果不小心处理，",
            "这种植物可能会随机传送!"
        )
    );

    public static final SlimefunItemStack PLANT_ENDER_DRAGON = Theme.themedSlimefunItemStack(
        "CLT_PLANT_ENDER_DRAGON",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 末影龙",
        List.of(
            "真正的首领植物。"
        )
    );

    public static final SlimefunItemStack PLANT_WITCH = Theme.themedSlimefunItemStack(
        "CLT_PLANT_WITCH",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 凋灵",
        List.of(
            "这种植物听起来像是",
            "在低声咕哝咒语。"
        )
    );

    // endregion

    // region Bushes


    // endregion

    // region Tools

    public static final SlimefunItemStack CROP_STICKS = Theme.themedSlimefunItemStack(
        "CLT_CROP_STICKS",
        Material.STICK,
        CultivationThemes.TOOL,
        "作物架",
        "必须给放置的种子添加作物架",
        "才能让种子生长。",
        "放置第二个作物架",
        "可以进行作物培育。"
    );

    public static final SlimefunItemStack HARVESTING_TOOL_SIMPLE = Theme.themedSlimefunItemStack(
        "CLT_HARVESTING_TOOL_SIMPLE",
        Material.TRIPWIRE_HOOK,
        CultivationThemes.TOOL,
        "简易收获工具",
        "一个非常简单的工具",
        "可以收集农耕工艺植物。",
        Theme.WARNING + "仅适用于 T1 植物",
        "",
        Theme.applyThemeAsTitle(Theme.CLICK_INFO, "右键点击", "收获完全生长的农耕工艺植物"),
        "",
        LoreBuilder.usesLeft(50)
    );

    public static final SlimefunItemStack TRIMMING_TOOL_SIMPLE = Theme.themedSlimefunItemStack(
        "CLT_TRIMMING_TOOL_SIMPLE",
        Material.SHEARS,
        CultivationThemes.TOOL,
        "简易修剪工具",
        "一个非常简单的工具",
        "可以收集农耕工艺灌木。",
        "",
        Theme.applyThemeAsTitle(Theme.CLICK_INFO, "右键点击", "收获农耕工艺灌木"),
        "",
        LoreBuilder.usesLeft(50)
    );

    public static final SlimefunItemStack PLANT_ANALYSER = Theme.themedSlimefunItemStack(
        "CLT_PLANT_ANALYSER",
        Material.DIAMOND,
        CultivationThemes.TOOL,
        "植物分析仪",
        "一个基本的工具",
        "可以查看植物的信息",
        "",
        Theme.applyThemeAsTitle(
            Theme.CLICK_INFO,
            "右键点击",
            "查看植物种类与生长情况。"
        ),
        Theme.applyThemeAsTitle(Theme.CLICK_INFO, "潜行+右键点击", "显示植物/灌木的名称。")
    );

    public static final SlimefunItemStack RECIPE_UNLOCK = Theme.themedSlimefunItemStack(
        "CLT_RECIPE_UNLOCK",
        Material.PAPER,
        CultivationThemes.TOOL,
        "农耕工艺知识",
        "右键点击来学习一个",
        "农耕工艺的培育配方",
        "",
        Theme.CLICK_INFO.asTitle("解锁", "{0}")
    );

    public static final SlimefunItemStack SEED_PACK = Theme.themedSlimefunItemStack(
        "CLT_SEED_PACK",
        Material.COMPOSTER,
        CultivationThemes.TOOL,
        "种子袋",
        "右键点击以打开。",
        "",
        Theme.CLICK_INFO.asTitle("设置为", "空")
    );

    // endregion

    // region Machines

    public static final SlimefunItemStack GARDEN_CLOCHE = Theme.themedSlimefunItemStack(
        "CLT_GARDEN_CLOCHE",
        Material.GLASS,
        CultivationThemes.MACHINE,
        "园艺玻璃罩",
        "自动种植植物。",
        "",
        Theme.CLICK_INFO.asTitle("每粘液刻消耗电力", 100)
    );

    public static final SlimefunItemStack COUNTER_NOTHING = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_NOTHING",
        Material.STRIPPED_DARK_OAK_LOG,
        CultivationThemes.MACHINE,
        "厨房柜台: 空",
        "仅用于装饰!",
        "",
        Theme.CLICK_INFO + "提示：放置后，可通过潜行+右键点击",
        Theme.CLICK_INFO + "来将当前手持的物品作为厨房的新外观。",
        Theme.CLICK_INFO + "快去试试吧！"
    );

    public static final SlimefunItemStack COUNTER_CHOPPING = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_CHOPPING",
        Material.SMITHING_TABLE,
        CultivationThemes.MACHINE,
        "厨房柜台: 砧板",
        "右键点击进行切碎。",
        "",
        Theme.CLICK_INFO + "提示：放置后，可通过潜行+右键点击",
        Theme.CLICK_INFO + "来将当前手持的物品作为厨房的新外观。",
        Theme.CLICK_INFO + "快去试试吧！"
    );

    public static final SlimefunItemStack COUNTER_SLICING = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_SLICING",
        Material.CARTOGRAPHY_TABLE,
        CultivationThemes.MACHINE,
        "厨房柜台: 切片板",
        "右键点击进行切片。",
        "",
        Theme.CLICK_INFO + "提示：放置后，可通过潜行+右键点击",
        Theme.CLICK_INFO + "来将当前手持的物品作为厨房的新外观。",
        Theme.CLICK_INFO + "快去试试吧！"
    );

    public static final SlimefunItemStack COUNTER_MASHER = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_MASHER",
        Material.CRAFTING_TABLE,
        CultivationThemes.MACHINE,
        "厨房柜台: 捣碎碗",
        "右键点击进行捣碎。",
        "",
        Theme.CLICK_INFO + "提示：放置后，可通过潜行+右键点击",
        Theme.CLICK_INFO + "来将当前手持的物品作为厨房的新外观。",
        Theme.CLICK_INFO + "快去试试吧！"
    );

    public static final SlimefunItemStack COUNTER_GRINDER = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_GRINDER",
        Material.CAULDRON,
        CultivationThemes.MACHINE,
        "厨房柜台: 研磨杵和研钵",
        "右键点击进行剁碎。",
        "",
        Theme.CLICK_INFO + "提示：放置后，可通过潜行+右键点击",
        Theme.CLICK_INFO + "来将当前手持的物品作为厨房的新外观。",
        Theme.CLICK_INFO + "快去试试吧！"
    );

    public static final SlimefunItemStack COUNTER_BLENDER = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_BLENDER",
        Material.FLETCHING_TABLE,
        CultivationThemes.MACHINE,
        "厨房柜台: 搅拌机",
        "右键点击进行搅拌。",
        "",
        Theme.CLICK_INFO + "提示：放置后，可通过潜行+右键点击",
        Theme.CLICK_INFO + "来将当前手持的物品作为厨房的新外观。",
        Theme.CLICK_INFO + "快去试试吧！"
    );

    public static final SlimefunItemStack COUNTER_OVEN = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_OVEN",
        Material.FURNACE,
        CultivationThemes.MACHINE,
        "厨房柜台: 烤箱",
        "可以进行烘焙。",
        "",
        Theme.CLICK_INFO + "提示：放置后，可通过潜行+右键点击",
        Theme.CLICK_INFO + "来将当前手持的物品作为厨房的新外观。",
        Theme.CLICK_INFO + "快去试试吧！"
    );

    public static final SlimefunItemStack COUNTER_FRYER = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_FRYING",
        Material.BLACK_STAINED_GLASS,
        CultivationThemes.MACHINE,
        "厨房柜台: 煎锅",
        "可进行油炸。",
        "",
        Theme.CLICK_INFO + "提示：放置后，可通过潜行+右键点击",
        Theme.CLICK_INFO + "来将当前手持的物品作为厨房的新外观。",
        Theme.CLICK_INFO + "快去试试吧！"
    );

    public static final SlimefunItemStack COUNTER_BOILING = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_BOILING",
        Material.BLACK_STAINED_GLASS,
        CultivationThemes.MACHINE,
        "厨房柜台: 大锅",
        "可以进行煮沸。",
        "",
        Theme.CLICK_INFO + "提示：放置后，可通过潜行+右键点击",
        Theme.CLICK_INFO + "来将当前手持的物品作为厨房的新外观。",
        Theme.CLICK_INFO + "快去试试吧！"
    );

    public static final SlimefunItemStack COUNTER_GRILL = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_GRILL",
        Material.CAMPFIRE,
        CultivationThemes.MACHINE,
        "厨房柜台: 烤架",
        "可进行烧烤。",
        "",
        Theme.CLICK_INFO + "提示：放置后，可通过潜行+右键点击",
        Theme.CLICK_INFO + "来将当前手持的物品作为厨房的新外观。",
        Theme.CLICK_INFO + "快去试试吧！"
    );

    public static final SlimefunItemStack COUNTER_FINISHING = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_FINISHING",
        Material.CRAFTING_TABLE,
        CultivationThemes.MACHINE,
        "厨房柜台: 上菜",
        "可将产品/副产品制作为",
        "食物或其他副产品。",
        "",
        Theme.CLICK_INFO + "提示：放置后，可通过潜行+右键点击",
        Theme.CLICK_INFO + "来将当前手持的物品作为厨房的新外观。",
        Theme.CLICK_INFO + "快去试试吧！"
    );

    // endregion

    // region Produce

    public static final SlimefunItemStack BANANA = Theme.themedSlimefunItemStack(
        "CLT_BANANA",
        Skins.BANANA.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "香蕉",
        "我喜欢这东西！"
    );

    public static final SlimefunItemStack LEMON = Theme.themedSlimefunItemStack(
        "CLT_LEMON",
        Skins.LEMON.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "柠檬",
        "为什么愁眉苦脸？"
    );

    public static final SlimefunItemStack ORANGE = Theme.themedSlimefunItemStack(
        "CLT_ORANGE",
        Skins.ORANGE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "橘子",
        "难道这不应该上个发条么？"
    );

    public static final SlimefunItemStack GREEN_APPLE = Theme.themedSlimefunItemStack(
        "CLT_GREEN_APPLE",
        Skins.GREEN_APPLE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "青苹果",
        "这张纸条上写着…亲爱的老师？？"
    );

    public static final SlimefunItemStack PINEAPPLE = Theme.themedSlimefunItemStack(
        "CLT_PINEAPPLE",
        Skins.PINEAPPLE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "菠萝",
        "这应该加到每一块披萨上。",
        "怎么？你想打一架吗！"
    );

    public static final SlimefunItemStack MANGO = Theme.themedSlimefunItemStack(
        "CLT_MANGO",
        Skins.MANGO.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "芒果",
        "MAN, I gotta GO.",
        "写物品描述真的很难…"
    );

    public static final SlimefunItemStack PEACH = Theme.themedSlimefunItemStack(
        "CLT_PEACH",
        Skins.PEACH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "桃子",
        "我们不想讨论Emoji。"
    );

    public static final SlimefunItemStack APRICOT = Theme.themedSlimefunItemStack(
        "CLT_APRICOT",
        Skins.APRICOT.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "杏子",
        "你可以用这些制作精灵球。",
        "…",
        "什么意思，为什么你说那是不同的东西…？"
    );

    public static final SlimefunItemStack PEAR = Theme.themedSlimefunItemStack(
        "CLT_PEAR",
        Skins.PEAR.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "梨",
        "你不觉得这看上去很不戳吗？"
    );

    public static final SlimefunItemStack CHERRY = Theme.themedSlimefunItemStack(
        "CLT_CHERRY",
        Skins.CHERRY.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "樱桃",
        "哦，我以为它们是冰糖渍的，真遗憾!"
    );

    public static final SlimefunItemStack KIWI = Theme.themedSlimefunItemStack(
        "CLT_KIWI",
        Skins.KIWI.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "奇异果",
        "我是勉强把这个加进来的。",
        "奇异果是邪恶的，",
        "任何人接触到奇异果",
        "都会丢失100分。"
    );

    public static final SlimefunItemStack LIME = Theme.themedSlimefunItemStack(
        "CLT_LIME",
        Skins.KIWI.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "酸橙",
        "从前有一种美味的水果…"
    );

    public static final SlimefunItemStack CHESTNUT = Theme.themedSlimefunItemStack(
        "CLT_CHESTNUT",
        Skins.CHESTNUT.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "板栗",
        "应该立即烘烤。"
    );

    public static final SlimefunItemStack HAZELNUT = Theme.themedSlimefunItemStack(
        "CLT_HAZELNUT",
        Skins.HAZELNUT.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "榛子",
        "我不管你怎样，",
        "你现在必须把它做成咖啡！"
    );

    public static final SlimefunItemStack PECAN = Theme.themedSlimefunItemStack(
        "CLT_PECAN",
        Skins.PECAN.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "山核桃",
        "非常适合做成派。"
    );

    public static final SlimefunItemStack GRAPE = Theme.themedSlimefunItemStack(
        "CLT_GRAPE",
        Skins.GRAPE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "葡萄",
        "非常饱满!"
    );

    public static final SlimefunItemStack PEANUT = Theme.themedSlimefunItemStack(
        "CLT_PEANUT",
        Skins.PEANUT.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "花生",
        "Reece's 我来了！"
    );

    public static final SlimefunItemStack STRAWBERRY = Theme.themedSlimefunItemStack(
        "CLT_STRAWBERRY",
        Skins.STRAWBERRY.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "草莓",
        "只要加奶油!"
    );

    public static final SlimefunItemStack RICE = Theme.themedSlimefunItemStack(
        "CLT_RICE",
        Skins.RICE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "大米",
        "真是太香了！"
    );

    public static final SlimefunItemStack GARLIC = Theme.themedSlimefunItemStack(
        "CLT_GARLIC",
        Skins.GARLIC.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "大蒜",
        "赶紧，在吸血鬼来之前！"
    );

    public static final SlimefunItemStack CAYENNE_PEPPER = Theme.themedSlimefunItemStack(
        "CLT_CAYENNE_PEPPER",
        Skins.PEPPERS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "卡宴辣椒",
        "辛辣。"
    );

    public static final SlimefunItemStack TOMATO = Theme.themedSlimefunItemStack(
        "CLT_TOMATO",
        Skins.TOMATO.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "番茄",
        "直接从藤蔓上…灌木丛中采摘？"
    );

    public static final SlimefunItemStack BELL_PEPPER = Theme.themedSlimefunItemStack(
        "CLT_BELL_PEPPER",
        Skins.BELL_PEPPER.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "甜椒",
        "真的会触发警报。"
    );

    public static final SlimefunItemStack ONION = Theme.themedSlimefunItemStack(
        "CLT_ONION",
        Skins.ONION.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "洋葱",
        "等等，你为什么在哭？"
    );

    public static final SlimefunItemStack PEA = Theme.themedSlimefunItemStack(
        "CLT_PEA",
        Skins.GREEN_APPLE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "豌豆",
        "常常在一个豆荚中成对出现，",
        "我听说是这样的。"
    );

    public static final SlimefunItemStack RAPESEED = Theme.themedSlimefunItemStack(
        "CLT_RAPESEED",
        new ItemStack(Material.MELON_SEEDS),
        CultivationThemes.PRODUCE,
        "油菜",
        "通常用来产油。"
    );

    public static final SlimefunItemStack LETTUCE = Theme.themedSlimefunItemStack(
        "CLT_LETTUCE",
        Skins.LETTUCE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "生菜",
        "稀薄，水分多，很美味。"
    );

    public static final SlimefunItemStack MUSTARD_SEEDS = Theme.themedSlimefunItemStack(
        "CLT_MUSTARD_SEEDS",
        new ItemStack(Material.PUMPKIN_SEEDS),
        CultivationThemes.PRODUCE,
        "芥菜种子",
        "咀嚼它们，我敢打赌！"
    );

    public static final SlimefunItemStack BROCCOLI = Theme.themedSlimefunItemStack(
        "CLT_BROCCOLI",
        Skins.BROCCOLI.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "西兰花",
        "你是拿着树的巨人吗？",
        "不，只是一棵小树 :)"
    );

    public static final SlimefunItemStack CINNAMON = Theme.themedSlimefunItemStack(
        "CLT_CINNAMON",
        new ItemStack(Material.STICK),
        CultivationThemes.PRODUCE,
        "肉桂",
        "做成棒咀嚼的时候还是挺好吃的。"
    );

    public static final SlimefunItemStack BASIL = Theme.themedSlimefunItemStack(
        "CLT_BASIL",
        new ItemStack(Material.SMALL_DRIPLEAF),
        CultivationThemes.PRODUCE,
        "罗勒",
        "一片甜美的叶子，带着柔和的胡椒味，回味无穷。"
    );

    public static final SlimefunItemStack BAY_LEAF = Theme.themedSlimefunItemStack(
        "CLT_BAY_LEAF",
        new ItemStack(Material.LILY_PAD),
        CultivationThemes.PRODUCE,
        "香叶",
        "一种具有多种用途的香料。"
    );

    public static final SlimefunItemStack CILANTRO = Theme.themedSlimefunItemStack(
        "CLT_CILANTRO",
        new ItemStack(Material.MANGROVE_LEAVES),
        CultivationThemes.PRODUCE,
        "香菜",
        "一种柔和的香料，带有柑橘的味道。"
    );

    public static final SlimefunItemStack CHICORY = Theme.themedSlimefunItemStack(
        "CLT_CHICORY",
        new ItemStack(Material.BLUE_ORCHID),
        CultivationThemes.PRODUCE,
        "菊苣",
        "一种有坚果味的苦味根茎。"
    );

    public static final SlimefunItemStack CHIVES = Theme.themedSlimefunItemStack(
        "CLT_CHIVES",
        new ItemStack(Material.SEAGRASS),
        CultivationThemes.PRODUCE,
        "韭菜",
        "感觉像洋葱的调料。"
    );

    public static final SlimefunItemStack CLOVE = Theme.themedSlimefunItemStack(
        "CLT_CLOVE",
        new ItemStack(Material.POPPY),
        CultivationThemes.PRODUCE,
        "丁香",
        "超级温暖，有强烈的味道。"
    );

    public static final SlimefunItemStack CUMIN = Theme.themedSlimefunItemStack(
        "CLT_CUMIN",
        new ItemStack(Material.DANDELION),
        CultivationThemes.PRODUCE,
        "孜然",
        "温暖的柑橘类植物。"
    );

    public static final SlimefunItemStack CHILLI_PEPPER = Theme.themedSlimefunItemStack(
        "CLT_CHILLY_PEPPER",
        Skins.PEPPERS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "辣椒",
        "我能吃下整个辣椒，面色不改。",
        "好吧，一半。",
        "嘶…四分之一。",
        "…",
        "好的，我可以用舌头舔一下。"
    );

    public static final SlimefunItemStack CURRY_LEAF = Theme.themedSlimefunItemStack(
        "CLT_CURRY_LEAF",
        new ItemStack(Material.KELP),
        CultivationThemes.PRODUCE,
        "咖喱叶",
        "是许多美食的基础。"
    );

    public static final SlimefunItemStack DILL = Theme.themedSlimefunItemStack(
        "CLT_DILL",
        new ItemStack(Material.GRASS),
        CultivationThemes.PRODUCE,
        "莳萝",
        "吃起来有点像草。",
        "为什么会有人喜欢这个呢？"
    );

    public static final SlimefunItemStack FENNEL = Theme.themedSlimefunItemStack(
        "CLT_FENNEL",
        new ItemStack(Material.OXEYE_DAISY),
        CultivationThemes.PRODUCE,
        "茴香",
        "像是八角和甘草的混合物。"
    );

    public static final SlimefunItemStack GINGER = Theme.themedSlimefunItemStack(
        "CLT_GINGER",
        new ItemStack(Material.HANGING_ROOTS),
        CultivationThemes.PRODUCE,
        "姜",
        "切碎的生姜放入沸水中，",
        "可治疗所有疾病!"
    );

    public static final SlimefunItemStack HORSERADISH = Theme.themedSlimefunItemStack(
        "CLT_HORSERADISH",
        new ItemStack(Material.HANGING_ROOTS),
        CultivationThemes.PRODUCE,
        "辣根",
        "如果你能咬住你就能获得$100。"
    );

    public static final SlimefunItemStack JASMINE = Theme.themedSlimefunItemStack(
        "CLT_JASMINE",
        new ItemStack(Material.WHITE_TULIP),
        CultivationThemes.PRODUCE,
        "茉莉",
        "用来制作好茶。"
    );

    public static final SlimefunItemStack JUNIPER_BERRY = Theme.themedSlimefunItemStack(
        "CLT_JUNIPER_BERRY",
        new ItemStack(Material.GLOW_BERRIES),
        CultivationThemes.PRODUCE,
        "杜松子",
        "晒一晒就好。"
    );

    public static final SlimefunItemStack KAFFIR_LIME = Theme.themedSlimefunItemStack(
        "CLT_KAFFIR_LIME",
        new ItemStack(Material.KELP),
        CultivationThemes.PRODUCE,
        "泰国青柠叶",
        "一片具有强大活力的叶子。"
    );

    public static final SlimefunItemStack LAVENDER = Theme.themedSlimefunItemStack(
        "CLT_LAVENDER",
        new ItemStack(Material.PURPLE_DYE),
        CultivationThemes.PRODUCE,
        "薰衣草",
        "能让我缓慢地进入梦乡。"
    );

    public static final SlimefunItemStack LICORICE = Theme.themedSlimefunItemStack(
        "CLT_LICORICE",
        new ItemStack(Material.HANGING_ROOTS),
        CultivationThemes.PRODUCE,
        "甘草",
        "快，快跑!"
    );

    public static final SlimefunItemStack MACE = Theme.themedSlimefunItemStack(
        "CLT_MACE",
        new ItemStack(Material.RED_DYE),
        CultivationThemes.PRODUCE,
        "肉豆蔻",
        "用来甩到攻击者的脸上。",
        "…",
        "什么叫这不是狼牙棒？"
    );

    public static final SlimefunItemStack MARJORAM = Theme.themedSlimefunItemStack(
        "CLT_MARJORAM",
        new ItemStack(Material.DARK_OAK_LEAVES),
        CultivationThemes.PRODUCE,
        "马郁兰",
        "我现在有点急事，",
        "我们能不能晚点再谈？"
    );

    public static final SlimefunItemStack MINT = Theme.themedSlimefunItemStack(
        "CLT_MINT",
        new ItemStack(Material.MANGROVE_LEAVES),
        CultivationThemes.PRODUCE,
        "薄荷",
        "嚼嚼嚼。"
    );

    public static final SlimefunItemStack OREGANO = Theme.themedSlimefunItemStack(
        "CLT_OREGANO",
        new ItemStack(Material.SPRUCE_LEAVES),
        CultivationThemes.PRODUCE,
        "牛至",
        "厨房常备的调料。"
    );

    public static final SlimefunItemStack PARSLEY = Theme.themedSlimefunItemStack(
        "CLT_PARSLEY",
        new ItemStack(Material.ACACIA_LEAVES),
        CultivationThemes.PRODUCE,
        "欧芹",
        "史上最难吃的调料。"
    );

    public static final SlimefunItemStack ROSEMARY = Theme.themedSlimefunItemStack(
        "CLT_ROSEMARY",
        new ItemStack(Material.BIRCH_LEAVES),
        CultivationThemes.PRODUCE,
        "迷迭香",
        "经常与百里香搞混。"
    );

    public static final SlimefunItemStack SASSAFRAS = Theme.themedSlimefunItemStack(
        "CLT_SASSAFRAS",
        new ItemStack(Material.OAK_LEAVES),
        CultivationThemes.PRODUCE,
        "黄樟",
        "可食用的根汁啤酒。",
        "真的，你去搜一下，我马上去买。"
    );

    public static final SlimefunItemStack SHISO = Theme.themedSlimefunItemStack(
        "CLT_SHISO",
        new ItemStack(Material.MANGROVE_LEAVES),
        CultivationThemes.PRODUCE,
        "紫苏",
        "薄荷与爱的结合。"
    );

    public static final SlimefunItemStack STAR_ANISE = Theme.themedSlimefunItemStack(
        "CLT_STAR_ANISE",
        new ItemStack(Material.NETHER_STAR),
        CultivationThemes.PRODUCE,
        "八角",
        "最佳和最独特的口味之一。"
    );

    public static final SlimefunItemStack TARRAGON = Theme.themedSlimefunItemStack(
        "CLT_TARRAGON",
        new ItemStack(Material.JUNGLE_LEAVES),
        CultivationThemes.PRODUCE,
        "龙蒿",
        "我会把这个放在任何东西上。",
        "其实我并不是一个好厨师。"
    );

    public static final SlimefunItemStack THYME = Theme.themedSlimefunItemStack(
        "CLT_THYME",
        new ItemStack(Material.BIRCH_LEAVES),
        CultivationThemes.PRODUCE,
        "百里香",
        "经常与迷迭香搞混。"
    );

    public static final SlimefunItemStack TURMERIC = Theme.themedSlimefunItemStack(
        "CLT_TURMERIC",
        new ItemStack(Material.YELLOW_DYE),
        CultivationThemes.PRODUCE,
        "姜黄",
        "强烈的麝香味使许多菜肴更加丰富。"
    );

    public static final SlimefunItemStack VANILLA = Theme.themedSlimefunItemStack(
        "CLT_VANILLA",
        new ItemStack(Material.BLACK_DYE),
        CultivationThemes.PRODUCE,
        "香子兰",
        "说明：直接倒进一杯拿铁里。"
    );

    public static final SlimefunItemStack WASABI = Theme.themedSlimefunItemStack(
        "CLT_WASABI",
        new ItemStack(Material.HANGING_ROOTS),
        CultivationThemes.PRODUCE,
        "山萮菜",
        "救命…芥末…"
    );

    public static final SlimefunItemStack ARTICHOKE = Theme.themedSlimefunItemStack(
        "CLT_ARTICHOKE",
        Skins.CABBAGE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "洋蓟",
        "撕开它的心脏!"
    );

    public static final SlimefunItemStack AUBERGINE = Theme.themedSlimefunItemStack(
        "CLT_AUBERGINE",
        Skins.AUBERGINE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "茄冰蕉",
        "有着明亮的紫色，100%不是鸡蛋的形状。",
        "最好叫它茄子，对吧？"
    );

    public static final SlimefunItemStack ASPARAGUS = Theme.themedSlimefunItemStack(
        "CLT_ASPARAGUS",
        Skins.ASPARAGUS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "芦笋",
        "以后去厕所的时候小心点。"
    );

    public static final SlimefunItemStack BRUSSELS_SPROUTS = Theme.themedSlimefunItemStack(
        "CLT_BRUSSELS_SPROUTS",
        Skins.KALE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "球芽甘蓝",
        "一种喜悦。"
    );

    public static final SlimefunItemStack CABBAGE = Theme.themedSlimefunItemStack(
        "CLT_CABBAGE",
        Skins.CABBAGE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "卷心菜",
        "一包卷心菜。"
    );

    public static final SlimefunItemStack CAULIFLOWER = Theme.themedSlimefunItemStack(
        "CLT_CAULIFLOWER",
        Skins.CAULIFLOWER.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "花椰菜",
        "小型云!"
    );

    public static final SlimefunItemStack CELERY = Theme.themedSlimefunItemStack(
        "CLT_CELERY",
        new ItemStack(Material.BAMBOO),
        CultivationThemes.PRODUCE,
        "芹菜",
        "真的只是粘稠的水，",
        "除非你能说服我。"
    );

    public static final SlimefunItemStack KALE = Theme.themedSlimefunItemStack(
        "CLT_KALE",
        Skins.KALE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "羽衣甘蓝",
        "我只是!"
    );

    public static final SlimefunItemStack SPINACH = Theme.themedSlimefunItemStack(
        "CLT_SPINACH",
        new ItemStack(Material.KELP),
        CultivationThemes.PRODUCE,
        "菠菜",
        "因爱而枯萎。"
    );

    public static final SlimefunItemStack BLACK_BEANS = Theme.themedSlimefunItemStack(
        "CLT_BLACK_BEANS",
        new ItemStack(Material.MELON_SEEDS),
        CultivationThemes.PRODUCE,
        "黑豆",
        "美味的素食蛋白质。"
    );

    public static final SlimefunItemStack GREEN_BEANS = Theme.themedSlimefunItemStack(
        "CLT_GREEN_BEANS",
        new ItemStack(Material.FROGSPAWN),
        CultivationThemes.PRODUCE,
        "四季豆",
        "这命名真有创造性！"
    );

    public static final SlimefunItemStack CHICKPEAS = Theme.themedSlimefunItemStack(
        "CLT_CHICKPEAS",
        new ItemStack(Material.BEETROOT_SEEDS),
        CultivationThemes.PRODUCE,
        "鹰嘴豆",
        "黑眼豆可以唱歌，",
        "鹰嘴豆只能做成泥。"
    );

    public static final SlimefunItemStack SOY_BEANS = Theme.themedSlimefunItemStack(
        "CLT_SOY_BEANS",
        new ItemStack(Material.MELON_SEEDS),
        CultivationThemes.PRODUCE,
        "大豆",
        "大豆奶来咯。"
    );

    public static final SlimefunItemStack PINTO_BEANS = Theme.themedSlimefunItemStack(
        "CLT_PINTO_BEANS",
        new ItemStack(Material.MELON_SEEDS),
        CultivationThemes.PRODUCE,
        "斑豆",
        "现在是墨西哥卷饼时间。"
    );

    public static final SlimefunItemStack RUNNER_BEANS = Theme.themedSlimefunItemStack(
        "CLT_RUNNER_BEANS",
        new ItemStack(Material.KELP),
        CultivationThemes.PRODUCE,
        "红花菜豆",
        "总是试图逃跑。"
    );

    public static final SlimefunItemStack NETTLES = Theme.themedSlimefunItemStack(
        "CLT_NETTLES",
        new ItemStack(Material.AZALEA_LEAVES),
        CultivationThemes.PRODUCE,
        "荨麻",
        "请在拿起之前带上手套。"
    );

    public static final SlimefunItemStack OKRA = Theme.themedSlimefunItemStack(
        "CLT_OKRA",
        Skins.LETTUCE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "秋葵",
        "它应该在俄克拉荷马州有很多，对吧？"
    );

    public static final SlimefunItemStack LEEK = Theme.themedSlimefunItemStack(
        "CLT_LEEK",
        Skins.LEEK.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "韭葱",
        "因为某些原因它在滴水？",
        "也许是长出了韭菜？"
    );

    public static final SlimefunItemStack SHALLOT = Theme.themedSlimefunItemStack(
        "CLT_SHALLOT",
        Skins.ONION.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "青葱",
        "我确实很喜欢葱。"
    );

    public static final SlimefunItemStack JALAPENO = Theme.themedSlimefunItemStack(
        "CLT_JALAPENO",
        Skins.PEPPERS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "墨西哥胡椒",
        "辣辣辣。"
    );

    public static final SlimefunItemStack RADICCHIO = Theme.themedSlimefunItemStack(
        "CLT_RADICCHIO",
        Skins.RADDISH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "菊苣",
        "写这些物品描述真的花了很久。",
        "我不需要菊苣。"
    );

    public static final SlimefunItemStack RHUBARB = Theme.themedSlimefunItemStack(
        "CLT_RHUBARB",
        Skins.LEEK.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "大黄",
        "记得去掉叶子!"
    );

    public static final SlimefunItemStack CELERIAC = Theme.themedSlimefunItemStack(
        "CLT_CELERIAC",
        Skins.PARSNIP.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "块根芹",
        "在许多传统食谱中都用到的根茎。"
    );

    public static final SlimefunItemStack PARSNIP = Theme.themedSlimefunItemStack(
        "CLT_PARSNIP",
        Skins.PARSNIP.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "欧洲防风草",
        "需要马上烤干。"
    );

    public static final SlimefunItemStack RUTABAGA = Theme.themedSlimefunItemStack(
        "CLT_RUTABAGA",
        Skins.RUTABAGA.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "芜菁甘蓝",
        "不说这个是斯威德，其实是很痛苦的。"
    );

    public static final SlimefunItemStack RADDISH = Theme.themedSlimefunItemStack(
        "CLT_RADDISH",
        Skins.RADDISH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "小红萝卜",
        "新鲜、清脆、阳光。"
    );

    public static final SlimefunItemStack SWEET_POTATO = Theme.themedSlimefunItemStack(
        "CLT_SWEET_POTATO",
        new ItemStack(Material.BEETROOT),
        CultivationThemes.PRODUCE,
        "甘薯",
        "Yam yam yam。"
    );

    public static final SlimefunItemStack TURNIP = Theme.themedSlimefunItemStack(
        "CLT_TURNIP",
        Skins.TURNIP.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "大头菜",
        "将解决生活中的所有问题。"
    );

    public static final SlimefunItemStack SWEETCORN = Theme.themedSlimefunItemStack(
        "CLT_SWEETCORN",
        Skins.CORN.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "甜玉米",
        "也许是最好的蔬菜。"
    );

    public static final SlimefunItemStack COURGETTE = Theme.themedSlimefunItemStack(
        "CLT_COURGETTE",
        new ItemStack(Material.BAMBOO),
        CultivationThemes.PRODUCE,
        "西葫芦",
        "专家建议：将其研磨到任何",
        "意大利空心粉酱中",
        "已获得深度和质感。"
    );

    public static final SlimefunItemStack CUCUMBER = Theme.themedSlimefunItemStack(
        "CLT_CUCUMBER",
        new ItemStack(Material.BAMBOO),
        CultivationThemes.PRODUCE,
        "黄瓜",
        "就是水在绿色壳子中，",
        "除非你证明我错了。"
    );

    public static final SlimefunItemStack MARROW = Theme.themedSlimefunItemStack(
        "CLT_MARROW",
        Skins.SQUASH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "嫩葫芦",
        "你知道嫩葫芦可以在你骨头里吗？",
        "（这单词还有髓的意思）"
    );

    public static final SlimefunItemStack AVOCADO = Theme.themedSlimefunItemStack(
        "CLT_AVOCADO",
        Skins.AVOCADO.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "鳄梨",
        "潮人的梦乡。"
    );

    public static final SlimefunItemStack GREEN_ONION = Theme.themedSlimefunItemStack(
        "CLT_GREEN_ONION",
        Skins.GREEN_ONION.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "嫩葱",
        "很适合做玉米饼!"
    );

    public static final SlimefunItemStack BLACK_PEPPER = Theme.themedSlimefunItemStack(
        "CLT_PEPPER",
        Skins.BLACK_PEPPER.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "黑胡椒",
        "比盐辣一点。"
    );

    // endregion

    // region Crafted By Products

    public static final SlimefunItemStack PEANUT_BUTTER = Theme.themedSlimefunItemStack(
        "CLT_PEANUT_BUTTER",
        Skins.PEANUT_BUTTER.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "花生酱",
        "类似于液体黄金。"
    );

    public static final SlimefunItemStack GRAPE_JELLY = Theme.themedSlimefunItemStack(
        "CLT_GRAPE_JELLY",
        Skins.JAM_JAR_BLUE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "葡萄酱",
        "用勺子吃是犯罪。"
    );

    public static final SlimefunItemStack STRAWBERRY_JELLY = Theme.themedSlimefunItemStack(
        "CLT_STRAWBERRY_JELLY",
        Skins.JAM_JAR_RED.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "草莓酱",
        "用勺子吃是犯罪。"
    );

    public static final SlimefunItemStack OIL = Theme.themedSlimefunItemStack(
        "CLT_OIL",
        Skins.SPICE_YELLOW.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "油",
        "容易滋生霉菌。"
    );

    public static final SlimefunItemStack MAYONNAISE = Theme.themedSlimefunItemStack(
        "CLT_MAYONNAISE",
        new ItemStack(Material.MILK_BUCKET),
        CultivationThemes.PRODUCE,
        "蛋黄酱",
        "丝滑的蛋黄酱，几乎可以搭配任何食物。"
    );

    public static final SlimefunItemStack EGG_SALAD = Theme.themedSlimefunItemStack(
        "CLT_EGG_SALAD",
        Skins.SPICE_YELLOW.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "鸡蛋沙拉",
        "你敢在火车上打开这个吗？"
    );

    public static final SlimefunItemStack PIE_CRUST = Theme.themedSlimefunItemStack(
        "CLT_PIE_CRUST",
        Skins.PIE_CRUST.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "馅饼皮",
        "直接把这个当主食吃",
        "应该也是可以的。"
    );

    public static final SlimefunItemStack PASTA = Theme.themedSlimefunItemStack(
        "CLT_PASTA",
        Skins.PASTA.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "意大利通心粉",
        "只是普通的通心粉，简单但美味。"
    );

    public static final SlimefunItemStack BISCUIT_DOUGH = Theme.themedSlimefunItemStack(
        "CLT_BISCUIT_DOUGH",
        new ItemStack(Material.BROWN_DYE),
        CultivationThemes.PRODUCE,
        "饼干面团",
        "记得提醒自己“不要生吃”"
    );

    public static final SlimefunItemStack BISCUIT_BASE = Theme.themedSlimefunItemStack(
        "CLT_BISCUIT_BASE",
        new ItemStack(Material.OAK_TRAPDOOR),
        CultivationThemes.PRODUCE,
        "定型的饼干",
        "虽然现在是平的，",
        "但你并不能吃。"
    );

    public static final SlimefunItemStack MEATBALLS = Theme.themedSlimefunItemStack(
        "CLT_MEATBALLS",
        new ItemStack(Material.BROWN_DYE),
        CultivationThemes.PRODUCE,
        "肉球",
        "肉做成的球。"
    );

    public static final SlimefunItemStack PEPPERONI = Theme.themedSlimefunItemStack(
        "CLT_PEPPERONI",
        Skins.PEPPERONI.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "意大利香肠",
        "我可以请以吃掉一整根。"
    );

    public static final SlimefunItemStack DOUGH = Theme.themedSlimefunItemStack(
        "CLT_DOUGH",
        Skins.DOUGH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "面团",
        "只是普通的面团。"
    );

    public static final SlimefunItemStack CREAM_CHEESE = Theme.themedSlimefunItemStack(
        "CLT_CREAM_CHEESE",
        new ItemStack(Material.MILK_BUCKET),
        CultivationThemes.PRODUCE,
        "奶油芝士",
        "奶油味比芝士味更重一些。"
    );

    public static final SlimefunItemStack KETCHUP = Theme.themedSlimefunItemStack(
        "CLT_KETCHUP",
        Skins.JAM_JAR_RED.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "蕃茄酱",
        "奶油形态的西红柿。"
    );

    public static final SlimefunItemStack MUSTARD = Theme.themedSlimefunItemStack(
        "CLT_MUSTARD",
        Skins.JAM_JAR_YELLOW.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "芥末",
        "有点刺激!"
    );

    public static final SlimefunItemStack TORTILLAS = Theme.themedSlimefunItemStack(
        "CLT_TORTILLAS",
        Skins.TORILLAS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "玉米粉圆饼",
        "玉米面点心"
    );

    public static final SlimefunItemStack PICO_DE_GALLO = Theme.themedSlimefunItemStack(
        "CLT_PICO_DE_GALLO",
        Skins.SALSA.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "墨西哥莎莎酱",
        "充满纯正美味的温和莎莎酱。"
    );

    public static final SlimefunItemStack COOKED_BURGER_PATTY = Theme.themedSlimefunItemStack(
        "CLT_COOKED_BURGER_PATTY",
        new ItemStack(Material.COOKED_BEEF),
        CultivationThemes.PRODUCE,
        "熟汉堡肉饼",
        "正在流汁"
    );

    // endregion

    // region Finished Foods

    public static final SlimefunItemStack FOOD_PEANUT_BUTTER_JELLY_SANDWICH = Theme.themedSlimefunItemStack(
        "CLT_PEANUT_BUTTER_JELLY_SANDWICH",
        Skins.PEANUT_BUTTER_JELLY_SANDWICH.getPlayerHead(),
        CultivationThemes.FOOD,
        "花生酱果冻三明治",
        "三明治的巅峰之作。",
        "",
        Theme.CLICK_INFO.asTitle("治疗", "10 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "力量 + 3")
    );

    public static final SlimefunItemStack EGG_SALAD_SANDWICH = Theme.themedSlimefunItemStack(
        "CLT_EGG_SALAD_SANDWICH",
        Skins.CHEESY_SANDWICH.getPlayerHead(),
        CultivationThemes.FOOD,
        "鸡蛋沙拉三明治",
        "闻起来有点怪，但是很好吃!",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "10 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "急迫 + 2")
    );

    public static final SlimefunItemStack BACON_SANDWICH = Theme.themedSlimefunItemStack(
        "CLT_BACON_SANDWICH",
        Skins.MEATY_SANDWICH.getPlayerHead(),
        CultivationThemes.FOOD,
        "培根三明治",
        "简单的经典!",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "4 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "力量 + 1"),
        Theme.CLICK_INFO.asTitle("效果 2", "速度 + 1")
    );

    public static final SlimefunItemStack SALMON_NIGIRI = Theme.themedSlimefunItemStack(
        "CLT_SALMON_NIGIRI",
        Skins.SUSHI_SALMON.getPlayerHead(),
        CultivationThemes.FOOD,
        "三文鱼寿司",
        "令人愉悦又微妙的味道。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "4 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "生命恢复 + 1")
    );

    public static final SlimefunItemStack CAJUN_GARLIC_BUTTER_COD = Theme.themedSlimefunItemStack(
        "CLT_CAJUN_GARLIC_BUTTER_COD",
        Skins.MEAL_RED_GREEN_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "卡津大蒜黄油鳕鱼",
        "一道非常简单的美味佳肴。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "8 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "生命恢复 + 2"),
        Theme.CLICK_INFO.asTitle("效果 2", "速度 + 1")
    );

    public static final SlimefunItemStack SHAKSHUKA = Theme.themedSlimefunItemStack(
        "CLT_SHAKSHUKA",
        Skins.SHAKSHUKA.getPlayerHead(),
        CultivationThemes.FOOD,
        "沙卡蔬卡",
        "一道温暖人心的菜，可以吃上好几天的鸡蛋。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "8 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "村庄英雄 + 1"),
        Theme.CLICK_INFO.asTitle("效果 2", "幸运 + 1")
    );

    public static final SlimefunItemStack FUGU = Theme.themedSlimefunItemStack(
        "CLT_FUGU",
        Skins.SUSHI_TUNA.getPlayerHead(),
        CultivationThemes.FOOD,
        "河豚",
        "准备投掷骰子？",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "2 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "力量 + 5"),
        Theme.CLICK_INFO.asTitle("效果 2", "有 33% 几率直接死亡！")
    );

    public static final SlimefunItemStack SHEPHERDS_PIE = Theme.themedSlimefunItemStack(
        "CLT_SHEPHERDS_PIE",
        Skins.MEAL_YELLOW_RED_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "牧羊人派",
        "温暖、丰盛、简单而美好。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "20 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "生命恢复 + 2")
    );

    public static final SlimefunItemStack CHICKEN_POT_PIE = Theme.themedSlimefunItemStack(
        "CLT_CHICKEN_POT_PIE",
        Skins.PIE_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "鸡肉馅饼",
        "真正打动人心温暖之餐。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "20 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "跳跃提升 + 2"),
        Theme.CLICK_INFO.asTitle("效果 2", "饱和 + 1")
    );

    public static final SlimefunItemStack CHICKEN_PASTA_BAKE = Theme.themedSlimefunItemStack(
        "CLT_CHICKEN_PASTA_BAKE",
        Skins.PASTA_BAKE.getPlayerHead(),
        CultivationThemes.FOOD,
        "烤鸡意大利面",
        "学生的主食。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "10 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "夜视 + 1"),
        Theme.CLICK_INFO.asTitle("效果 2", "水下呼吸 + 1")
    );

    public static final SlimefunItemStack CHICKEN_ALFREDO_MAC_AND_CHEESE = Theme.themedSlimefunItemStack(
        "CLT_CHICKEN_ALFREDO_MAC_AND_CHEESE",
        Skins.MAC_AND_CHEESE.getPlayerHead(),
        CultivationThemes.FOOD,
        "鸡肉白酱通心粉",
        "普通经典的华丽转折。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "2 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "防火 + 2"),
        Theme.CLICK_INFO.asTitle("效果 2", "抗性提升 + 3")
    );

    public static final SlimefunItemStack KEY_LIME_PIE = Theme.themedSlimefunItemStack(
        "CLT_KEY_LIME_PIE",
        Skins.PIE_LIME.getPlayerHead(),
        CultivationThemes.FOOD,
        "青柠派",
        "最好的派。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "12 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "急迫 + 4")
    );

    public static final SlimefunItemStack FRUIT_SALAD = Theme.themedSlimefunItemStack(
        "CLT_FRUIT_SALAD",
        Skins.FRUIT_SALAD.getPlayerHead(),
        CultivationThemes.FOOD,
        "水果沙拉",
        "如果你觉得这是沙拉, ",
        "你想吃多少就吃多少, ",
        "因为它很健康。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "4 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "速度 + 3")
    );

    public static final SlimefunItemStack CAESAR_SALAD = Theme.themedSlimefunItemStack(
        "CLT_CAESAR_SALAD",
        Skins.FRUIT_SALAD.getPlayerHead(),
        CultivationThemes.FOOD,
        "凯撒沙拉",
        "健康经典。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "8 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "速度 + 1"),
        Theme.CLICK_INFO.asTitle("效果 2", "隐身 + 1"),
        Theme.CLICK_INFO.asTitle("效果 3", "缓降 + 1")
    );

    public static final SlimefunItemStack BISCUIT = Theme.themedSlimefunItemStack(
        "CLT_BISCUIT",
        new ItemStack(Material.COOKIE),
        CultivationThemes.FOOD,
        "饼干",
        "味道不错的小点心。",
        "",
        Theme.CLICK_INFO.asTitle("效果 1", "将你射向空中")
    );

    public static final SlimefunItemStack COMPRESSED_BISCUIT = Theme.themedSlimefunItemStack(
        "CLT_COMPRESSED_BISCUIT",
        new ItemStack(Material.COOKIE),
        CultivationThemes.FOOD,
        "压缩饼干",
        "味道更不错的小点心。",
        "",
        Theme.CLICK_INFO.asTitle("效果 1", "将你射向空中")
    );

    public static final SlimefunItemStack LEMON_DROP = Theme.themedSlimefunItemStack(
        "CLT_LEMON_DROP",
        new ItemStack(Material.YELLOW_DYE),
        CultivationThemes.FOOD,
        "柠檬糖",
        "调色盘清洗剂。",
        "",
        Theme.CLICK_INFO.asTitle("效果 1", "清除所有的效果，让你可以再次食用。")
    );

    public static final SlimefunItemStack GRILLED_SALMON_SALAD = Theme.themedSlimefunItemStack(
        "CLT_GRILLED_SALMON_SALAD",
        Skins.MEAL_SALAD.getPlayerHead(),
        CultivationThemes.FOOD,
        "烤三文鱼沙拉",
        "酥脆可口，调料丰富。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "8 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "生命恢复 + 1"),
        Theme.CLICK_INFO.asTitle("效果 2", "生命提升 + 5")
    );

    public static final SlimefunItemStack WITHER_ROSE_SALAD = Theme.themedSlimefunItemStack(
        "CLT_WITHER_ROSE_SALAD",
        Skins.MEAL_SALAD.getPlayerHead(),
        CultivationThemes.FOOD,
        "凋灵玫瑰沙拉",
        "充满力量但是有很大的副作用。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "满"),
        Theme.CLICK_INFO.asTitle("效果 1", "生命提升 + 20"),
        Theme.CLICK_INFO.asTitle("效果 2", "凋零 + 2")
    );

    public static final SlimefunItemStack ORANGE_JUICE = Theme.themedSlimefunItemStack(
        "CLT_ORANGE_JUICE",
        ItemStackGenerators.createPotion(Color.YELLOW),
        CultivationThemes.FOOD,
        "橙汁",
        "这真是开始一天的最好方式。",
        "",
        Theme.CLICK_INFO.asTitle("效果 1", "速度 + 4")
    );

    public static final SlimefunItemStack LASAGNA = Theme.themedSlimefunItemStack(
        "CLT_LASAGNA",
        Skins.MEAL_YELLOW_RED_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "宽面",
        "层层的美味。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "满"),
        Theme.CLICK_INFO.asTitle("效果 1", "生命恢复 + 1"),
        Theme.CLICK_INFO.asTitle("效果 2", "抗性提升 + 1")
    );

    public static final SlimefunItemStack SPAGHETTI = Theme.themedSlimefunItemStack(
        "CLT_SPAGHETTI",
        Skins.SPAGHETTI.getPlayerHead(),
        CultivationThemes.FOOD,
        "意大利面",
        "真好吃。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "2 点血量")
    );

    public static final SlimefunItemStack SPAGHETTI_AND_MEATBALLS = Theme.themedSlimefunItemStack(
        "CLT_SPAGHETTI_AND_MEATBALLS",
        Skins.SPAGHETTI.getPlayerHead(),
        CultivationThemes.FOOD,
        "肉球意大利面",
        "简单，经典，丰盛。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "8 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "不祥之兆 + 1")
    );

    public static final SlimefunItemStack PIZZA_CHEESE = Theme.themedSlimefunItemStack(
        "CLT_PIZZA_CHEESE",
        Skins.PIZZA_CHEESE.getPlayerHead(),
        CultivationThemes.FOOD,
        "芝士披萨",
        "为什么有人会只要芝士？我不知道。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "8 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "缓慢 + 1")
    );

    public static final SlimefunItemStack PIZZA_MUSHROOM = Theme.themedSlimefunItemStack(
        "CLT_PIZZA_MUSHROOM",
        Skins.PIZZA_MUSHROOM.getPlayerHead(),
        CultivationThemes.FOOD,
        "蘑菇披萨",
        "简单的富含蛋白质的素披萨。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "12 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "缓慢 + 1"),
        Theme.CLICK_INFO.asTitle("效果 1", "急迫 + 2")
    );

    public static final SlimefunItemStack PIZZA_PEPPERONI = Theme.themedSlimefunItemStack(
        "CLT_PIZZA_PEPPERONI",
        Skins.PIZZA_PEPPERONI.getPlayerHead(),
        CultivationThemes.FOOD,
        "意大利香肠披萨",
        "风味十足的纽约经典。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "12 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "速度 + 1"),
        Theme.CLICK_INFO.asTitle("效果 1", "急迫 + 1"),
        Theme.CLICK_INFO.asTitle("效果 1", "跳跃提升 + 1")
    );

    public static final SlimefunItemStack CHEESY_SCALLOPED_COURGETTE = Theme.themedSlimefunItemStack(
        "CLT_CHEESY_SCALLOPED_COURGETTE",
        Skins.MEAL_RED_GREEN_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "芝士西葫芦",
        "经典美食的低碳版本。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "4 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "夜视 + 1"),
        Theme.CLICK_INFO.asTitle("效果 1", "隐身 + 1")
    );

    public static final SlimefunItemStack PECAN_PIE = Theme.themedSlimefunItemStack(
        "CLT_PECAN_PIE",
        Skins.PIE_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "山核桃派",
        "唯一一个不会被批判的",
        "吃纯糖的方法。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "8 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "漂浮 + 1")
    );

    public static final SlimefunItemStack GARLIC_BUTTER_MUSHROOMS = Theme.themedSlimefunItemStack(
        "CLT_GARLIC_BUTTER_MUSHROOMS",
        new ItemStack(Material.MUSHROOM_STEW),
        CultivationThemes.FOOD,
        "蒜蓉黄油蘑菇",
        "也许是全世界最好吃的。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "4 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "发光 + 1")
    );

    public static final SlimefunItemStack RAMEN_BEEF = Theme.themedSlimefunItemStack(
        "CLT_RAMEN_BEEF",
        Skins.RAMEN_BEEF.getPlayerHead(),
        CultivationThemes.FOOD,
        "牛肉拉面",
        "并不是健康的选择。",
        "",
        Theme.CLICK_INFO.asTitle("效果 1", "生命提升 + 1")
    );

    public static final SlimefunItemStack RAMEN_CHICKEN = Theme.themedSlimefunItemStack(
        "CLT_RAMEN_CHICKEN",
        Skins.RAMEN_CHICKEN.getPlayerHead(),
        CultivationThemes.FOOD,
        "鸡肉拉面",
        "并不是充实的选择。",
        "",
        Theme.CLICK_INFO.asTitle("效果 1", "生命提升 + 1")
    );

    public static final SlimefunItemStack RAMEN_SEAFOOD = Theme.themedSlimefunItemStack(
        "CLT_RAMEN_SEAFOOD",
        Skins.RAMEN_SEAFOOD.getPlayerHead(),
        CultivationThemes.FOOD,
        "海鲜拉面",
        "并不是令人满意的选择。",
        "",
        Theme.CLICK_INFO.asTitle("效果 1", "生命提升 + 1")
    );

    public static final SlimefunItemStack RAMEN_BEEF_HEARTY = Theme.themedSlimefunItemStack(
        "CLT_RAMEN_BEEF_HEARTY",
        Skins.RAMEN_HEARTY.getPlayerHead(),
        CultivationThemes.FOOD,
        "丰盛的牛肉拉面",
        "健康的选择。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "满"),
        Theme.CLICK_INFO.asTitle("效果 1", "生命提升 + 2"),
        Theme.CLICK_INFO.asTitle("效果 2", "速度 + 1")
    );

    public static final SlimefunItemStack RAMEN_CHICKEN_HEARTY = Theme.themedSlimefunItemStack(
        "CLT_RAMEN_CHICKEN_HEARTY",
        Skins.RAMEN_HEARTY.getPlayerHead(),
        CultivationThemes.FOOD,
        "丰盛的鸡肉拉面",
        "充实的选择。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "满"),
        Theme.CLICK_INFO.asTitle("效果 1", "生命提升 + 2"),
        Theme.CLICK_INFO.asTitle("效果 2", "速度 + 1")
    );

    public static final SlimefunItemStack RAMEN_SEAFOOD_HEARTY = Theme.themedSlimefunItemStack(
        "CLT_RAMEN_SEAFOOD_HEARTY",
        Skins.RAMEN_HEARTY.getPlayerHead(),
        CultivationThemes.FOOD,
        "丰盛的海鲜拉面",
        "令人满意的选择。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "满"),
        Theme.CLICK_INFO.asTitle("效果 1", "生命提升 + 2"),
        Theme.CLICK_INFO.asTitle("效果 2", "速度 + 1")
    );

    public static final SlimefunItemStack BAGEL = Theme.themedSlimefunItemStack(
        "CLT_BAGEL",
        Skins.BAGEL.getPlayerHead(),
        CultivationThemes.FOOD,
        "贝果",
        "是烤的？还是…",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "5 点血量")
    );

    public static final SlimefunItemStack BAGEL_BITE = Theme.themedSlimefunItemStack(
        "CLT_BAGEL_BITE",
        Skins.BAGEL_BITE.getPlayerHead(),
        CultivationThemes.FOOD,
        "贝果零食",
        "在任何时间都可以吃披萨！",
        "",
        Theme.CLICK_INFO.asTitle("效果 1", "每吃一口都感觉烧起来了！")
    );

    public static final SlimefunItemStack BAGEL_CREAM_CHEESE = Theme.themedSlimefunItemStack(
        "CLT_BAGEL_CREAM_CHEESE",
        Skins.BAGEL_EVERYTHING.getPlayerHead(),
        CultivationThemes.FOOD,
        "奶油芝士贝果",
        "真的很好吃，你也许会想再来一个。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "10 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "生命提升 + 1")
    );

    public static final SlimefunItemStack MEATLOAF = Theme.themedSlimefunItemStack(
        "CLT_MEATLOAF",
        Skins.MEATLOAF.getPlayerHead(),
        CultivationThemes.FOOD,
        "肉饼",
        "没有什么比这更好了！",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "满"),
        Theme.CLICK_INFO.asTitle("效果 1", "生命提升 + 4"),
        Theme.CLICK_INFO.asTitle("效果 2", "抗性提升 + 3"),
        Theme.CLICK_INFO.asTitle("效果 3", "急迫 + 2"),
        Theme.CLICK_INFO.asTitle("效果 4", "缓慢 + 2")
    );

    public static final SlimefunItemStack SAUSAGE = Theme.themedSlimefunItemStack(
        "CLT_SAUSAGE",
        Skins.SAUSAGE.getPlayerHead(),
        CultivationThemes.FOOD,
        "香肠",
        "培根的兄弟。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "2 点血量")
    );

    public static final SlimefunItemStack SOYLENT = Theme.themedSlimefunItemStack(
        "CLT_SOYLENT",
        ItemStackGenerators.createPotion(Color.WHITE),
        CultivationThemes.FOOD,
        "Soylent",
        "包含身体所需的所有营养！",
        "",
        Theme.CLICK_INFO.asTitle("效果 1", "不祥之兆 + 1"),
        Theme.CLICK_INFO.asTitle("效果 2", "虚弱 + 4")
    );

    public static final SlimefunItemStack TATER_TOTS = Theme.themedSlimefunItemStack(
        "CLT_TATER_TOTS",
        Skins.TATER_TOT.getPlayerHead(),
        CultivationThemes.FOOD,
        "土豆饼",
        "小土豆烤饼。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "1 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "速度 + 2")
    );

    public static final SlimefunItemStack SWEET_BEEHIVE = Theme.themedSlimefunItemStack(
        "CLT_SWEET_BEEHIVE",
        Skins.BEEHIVE.getPlayerHead(),
        CultivationThemes.FOOD,
        "甜蜂巢",
        "不知道为什么你要做这个!",
        "",
        Theme.CLICK_INFO.asTitle("效果 1", "召唤蜜蜂")
    );

    public static final SlimefunItemStack TAQUITO = Theme.themedSlimefunItemStack(
        "CLT_TAQUITO",
        Skins.TAQUITO.getPlayerHead(),
        CultivationThemes.FOOD,
        "塔基托",
        "Zim 会感到自豪的！",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "4 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "召唤Gir来帮忙（放松，只是个铁傀儡）。")
    );

    public static final SlimefunItemStack BOWL_OF_STEVE = Theme.themedSlimefunItemStack(
        "CLT_BOWL_OF_STEVE",
        Skins.STEVE_HEAD_BOWL.getPlayerHead(),
        CultivationThemes.FOOD,
        "一碗…史蒂夫？",
        "什么玩意 &%£$",
        "",
        Theme.CLICK_INFO.asTitle("效果 1", "血量减少至 1 点"),
        Theme.CLICK_INFO.asTitle("效果 2", "挖掘疲劳 + 10"),
        Theme.CLICK_INFO.asTitle("效果 3", "缓慢 + 5"),
        Theme.CLICK_INFO.asTitle("效果 4", "力量 + 10")
    );

    public static final SlimefunItemStack CHEESE_BURGER = Theme.themedSlimefunItemStack(
        "CLT_CHEESE_BURGER",
        Skins.BURGER.getPlayerHead(),
        CultivationThemes.FOOD,
        "汉堡",
        "一个很简单的芝士汉堡，",
        "但没有什么比这更好的了！",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "4 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "生命恢复 + 3")
    );

    public static final SlimefunItemStack CINNAMON_ROLL = Theme.themedSlimefunItemStack(
        "CLT_CINNAMON_ROLL",
        Skins.CINNAMON_ROLL.getPlayerHead(),
        CultivationThemes.FOOD,
        "肉桂卷",
        "一种甜美的美食卷，让人感到愉悦。",
        "食用后会让世界翻转！",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "4 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "漂浮 + 1"),
        Theme.CLICK_INFO.asTitle("效果 2", "缓降 + 1")
    );

    public static final SlimefunItemStack BLUE_CANDY = Theme.themedSlimefunItemStack(
        "CLT_BLUE_CANDY",
        Skins.BLUE_CANDY.getPlayerHead(),
        CultivationThemes.FOOD,
        "蓝色糖果",
        "令人愉快的甜美糖果。",
        "",
        Theme.CLICK_INFO.asTitle("效果 1", "召唤一只悦灵")
    );

    public static final SlimefunItemStack SOFT_BOILED_EGG = Theme.themedSlimefunItemStack(
        "CLT_SOFT_BOILED_EGG",
        Skins.BOILED_EGG.getPlayerHead(),
        CultivationThemes.FOOD,
        "水煮蛋",
        "只是普通的水煮蛋，没什么好说的。",
        "",
        Theme.CLICK_INFO.asTitle("恢复", "1 点血量"),
        Theme.CLICK_INFO.asTitle("效果 1", "有时会召唤出一只坤坤。")
    );

    public static final SlimefunItemStack SUGARED_SKULL = Theme.themedSlimefunItemStack(
        "CLT_SUGARED_SKULL",
        Skins.SUGARED_SKULL.getPlayerHead(),
        CultivationThemes.FOOD,
        "加糖的骷髅头",
        "这真的是食物吗…？",
        "",
        Theme.CLICK_INFO.asTitle("效果 1", "黑暗 + 3")
    );

    // end region
}
