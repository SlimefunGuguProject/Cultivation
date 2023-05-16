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
            "这种灌木总是用光...百里香...*咳嗽*"
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
            "哎..。"
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
            "太棒了...咦惹。"
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
        "农耕工艺 - 植物: 黑暗",
        List.of(
            "一种在无尽的愤怒中沸腾的植物。"
        )
    );

    public static final SlimefunItemStack PLANT_LIGHT = Theme.themedSlimefunItemStack(
        "CLT_PLANT_LIGHT",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 光明",
        List.of(
            "一种散发着纯爱气息的植物。"
        )
    );

    public static final SlimefunItemStack PLANT_EARTH = Theme.themedSlimefunItemStack(
        "CLT_PLANT_EARTH",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 土地",
        List.of(
            "一种能填充周围世界的植物。"
        )
    );

    public static final SlimefunItemStack PLANT_WATER = Theme.themedSlimefunItemStack(
        "CLT_PLANT_WATER",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 水",
        List.of(
            "一种能滋养周边生物,",
            "也能提供生命的植物。"
        )
    );

    public static final SlimefunItemStack PLANT_FIRE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_FIRE",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 火",
        List.of(
            "一种同时提供了",
            "毁灭与新生的植物。"
        )
    );

    public static final SlimefunItemStack PLANT_AIR = Theme.themedSlimefunItemStack(
        "CLT_PLANT_AIR",
        Skins.SEED_CYAN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 空气",
        List.of(
            "一种静静地哼唱着周围自然旋律的植物。"
        )
    );

    public static final SlimefunItemStack PLANT_POWER = Theme.themedSlimefunItemStack(
        "CLT_PLANT_POWER",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 力量",
        List.of(
            "一种积极地散发力量的植物。"
        )
    );

    public static final SlimefunItemStack PLANT_WEALTH = Theme.themedSlimefunItemStack(
        "CLT_PLANT_WEALTH",
        Skins.SEED_ORANGE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 财富",
        List.of(
            "一种彰显荣华富贵的植物。"
        )
    );

    public static final SlimefunItemStack PLANT_SPECTRUM = Theme.themedSlimefunItemStack(
        "CLT_PLANT_SPECTRUM",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 光谱",
        List.of(
            "一种轻微改变着颜色的植物。"
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
            "这种植物到底有什么意义呢..."
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
            "Aw man..."
        )
    );

    public static final SlimefunItemStack PLANT_ZOMBIE = Theme.themedSlimefunItemStack(
        "CLT_PLANT_ZOMBIE",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "农耕工艺 - 植物: 僵尸",
        List.of(
            "这种植物正在滴落...什么东西..."
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
        Theme.applyThemeAsTitle(Theme.CLICK_INFO, "Shift + 右键点击", "显示植物/灌木的名称。")
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
        "仅用于装饰!"
    );

    public static final SlimefunItemStack COUNTER_CHOPPING = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_CHOPPING",
        Material.SMITHING_TABLE,
        CultivationThemes.MACHINE,
        "厨房柜台: 砧板",
        "右键点击进行切碎。"
    );

    public static final SlimefunItemStack COUNTER_SLICING = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_SLICING",
        Material.CARTOGRAPHY_TABLE,
        CultivationThemes.MACHINE,
        "厨房柜台: 切片板",
        "右键点击进行切片。"
    );

    public static final SlimefunItemStack COUNTER_MASHER = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_MASHER",
        Material.CRAFTING_TABLE,
        CultivationThemes.MACHINE,
        "厨房柜台: 捣碎碗",
        "右键点击进行捣碎。"
    );

    public static final SlimefunItemStack COUNTER_GRINDER = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_GRINDER",
        Material.CAULDRON,
        CultivationThemes.MACHINE,
        "厨房柜台: 研磨杵和研钵",
        "右键点击进行剁碎。"
    );

    public static final SlimefunItemStack COUNTER_BLENDER = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_BLENDER",
        Material.FLETCHING_TABLE,
        CultivationThemes.MACHINE,
        "厨房柜台: 搅拌机",
        "右键点击进行搅拌。"
    );

    public static final SlimefunItemStack COUNTER_OVEN = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_OVEN",
        Material.FURNACE,
        CultivationThemes.MACHINE,
        "厨房柜台: 烤箱",
        "可以进行烘焙。"
    );

    public static final SlimefunItemStack COUNTER_FRYER = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_FRYING",
        Material.BLACK_STAINED_GLASS,
        CultivationThemes.MACHINE,
        "厨房柜台: 煎锅",
        "可进行油炸。"
    );

    public static final SlimefunItemStack COUNTER_BOILING = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_BOILING",
        Material.BLACK_STAINED_GLASS,
        CultivationThemes.MACHINE,
        "厨房柜台: 大锅",
        "可以进行煮沸。"
    );

    public static final SlimefunItemStack COUNTER_GRILL = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_GRILL",
        Material.CAMPFIRE,
        CultivationThemes.MACHINE,
        "厨房柜台: 烤架",
        "可进行烧烤。"
    );

    public static final SlimefunItemStack COUNTER_FINISHING = Theme.themedSlimefunItemStack(
        "CLT_COUNTER_FINISHING",
        Material.CRAFTING_TABLE,
        CultivationThemes.MACHINE,
        "厨房柜台: 上菜",
        "可将产品/副产品制作为",
        "食物或其他副产品。"
    );

    // endregion

    // region Produce

    public static final SlimefunItemStack BANANA = Theme.themedSlimefunItemStack(
        "CLT_BANANA",
        Skins.BANANA.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Banana",
        "I like the look and peel of this!"
    );

    public static final SlimefunItemStack LEMON = Theme.themedSlimefunItemStack(
        "CLT_LEMON",
        Skins.LEMON.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Lemon",
        "Why the sour look？"
    );

    public static final SlimefunItemStack ORANGE = Theme.themedSlimefunItemStack(
        "CLT_ORANGE",
        Skins.ORANGE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Orange",
        "Isn't this meant to be clockwork？"
    );

    public static final SlimefunItemStack GREEN_APPLE = Theme.themedSlimefunItemStack(
        "CLT_GREEN_APPLE",
        Skins.GREEN_APPLE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Green Apple",
        "The note says... Dear Teacher？"
    );

    public static final SlimefunItemStack PINEAPPLE = Theme.themedSlimefunItemStack(
        "CLT_PINEAPPLE",
        Skins.PINEAPPLE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pineapple",
        "This belongs on every pizza in existence。",
        "Wanna fight about it!？"
    );

    public static final SlimefunItemStack MANGO = Theme.themedSlimefunItemStack(
        "CLT_MANGO",
        Skins.MANGO.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Mango",
        "MAN, I gotta GO。",
        "Lore is hard..。"
    );

    public static final SlimefunItemStack PEACH = Theme.themedSlimefunItemStack(
        "CLT_PEACH",
        Skins.PEACH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Peach",
        "We don't talk about the Emoji"
    );

    public static final SlimefunItemStack APRICOT = Theme.themedSlimefunItemStack(
        "CLT_APRICOT",
        Skins.APRICOT.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Apricot",
        "You can make Pokéballs out of these。",
        "..。",
        "What do you mean that's different thing...？"
    );

    public static final SlimefunItemStack PEAR = Theme.themedSlimefunItemStack(
        "CLT_PEAR",
        Skins.PEAR.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pear",
        "Wouldn't you say this looks pear-fect？"
    );

    public static final SlimefunItemStack CHERRY = Theme.themedSlimefunItemStack(
        "CLT_CHERRY",
        Skins.CHERRY.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Cherry",
        "Oh, I thought they grew Glacé'd, shame!"
    );

    public static final SlimefunItemStack KIWI = Theme.themedSlimefunItemStack(
        "CLT_KIWI",
        Skins.KIWI.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Kiwi",
        "I put this in the addon under duress。",
        "Kiwis are evil and anyone who",
        "uses them will automatically lose",
        "100 points。"
    );

    public static final SlimefunItemStack LIME = Theme.themedSlimefunItemStack(
        "CLT_LIME",
        Skins.KIWI.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Lime",
        "One upon a lime there was a delicious fruit..。"
    );

    public static final SlimefunItemStack CHESTNUT = Theme.themedSlimefunItemStack(
        "CLT_CHESTNUT",
        Skins.CHESTNUT.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Chestnut",
        "Designed to be baked, immediately。"
    );

    public static final SlimefunItemStack HAZELNUT = Theme.themedSlimefunItemStack(
        "CLT_HAZELNUT",
        Skins.HAZELNUT.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Hazelnut",
        "Do whatever you need to turn this into",
        "a coffee for me, now!"
    );

    public static final SlimefunItemStack PECAN = Theme.themedSlimefunItemStack(
        "CLT_PECAN",
        Skins.PECAN.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pecan",
        "Just begging to be made into a pie。"
    );

    public static final SlimefunItemStack GRAPE = Theme.themedSlimefunItemStack(
        "CLT_GRAPE",
        Skins.GRAPE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Grape",
        "So plump!"
    );

    public static final SlimefunItemStack PEANUT = Theme.themedSlimefunItemStack(
        "CLT_PEANUT",
        Skins.PEANUT.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Peanut",
        "Reece's here I come!"
    );

    public static final SlimefunItemStack STRAWBERRY = Theme.themedSlimefunItemStack(
        "CLT_STRAWBERRY",
        Skins.STRAWBERRY.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Strawberry",
        "Just add cream!"
    );

    public static final SlimefunItemStack RICE = Theme.themedSlimefunItemStack(
        "CLT_RICE",
        Skins.RICE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Rice",
        "Remember, you only live rice!"
    );

    public static final SlimefunItemStack GARLIC = Theme.themedSlimefunItemStack(
        "CLT_GARLIC",
        Skins.GARLIC.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Garlic",
        "Quick, before the vampires come!"
    );

    public static final SlimefunItemStack CAYENNE_PEPPER = Theme.themedSlimefunItemStack(
        "CLT_CAYENNE_PEPPER",
        Skins.PEPPERS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Cayenne Pepper",
        "A soft spicy treat。"
    );

    public static final SlimefunItemStack TOMATO = Theme.themedSlimefunItemStack(
        "CLT_TOMATO",
        Skins.TOMATO.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Tomato",
        "Right off of the vine.... err... bush？"
    );

    public static final SlimefunItemStack BELL_PEPPER = Theme.themedSlimefunItemStack(
        "CLT_BELL_PEPPER",
        Skins.BELL_PEPPER.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Bell Pepper",
        "Really rings true。"
    );

    public static final SlimefunItemStack ONION = Theme.themedSlimefunItemStack(
        "CLT_ONION",
        Skins.ONION.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Onion",
        "Wait, why are you crying？"
    );

    public static final SlimefunItemStack PEA = Theme.themedSlimefunItemStack(
        "CLT_PEA",
        Skins.GREEN_APPLE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Peas",
        "Often found in pairs within a pod, or so I hear。"
    );

    public static final SlimefunItemStack RAPESEED = Theme.themedSlimefunItemStack(
        "CLT_RAPESEED",
        new ItemStack(Material.MELON_SEEDS),
        CultivationThemes.PRODUCE,
        "Rapeseed",
        "Oft-used to create oils。"
    );

    public static final SlimefunItemStack LETTUCE = Theme.themedSlimefunItemStack(
        "CLT_LETTUCE",
        Skins.LETTUCE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Lettuce",
        "Thin, watery and yet delicious。"
    );

    public static final SlimefunItemStack MUSTARD_SEEDS = Theme.themedSlimefunItemStack(
        "CLT_MUSTARD_SEEDS",
        new ItemStack(Material.PUMPKIN_SEEDS),
        CultivationThemes.PRODUCE,
        "Mustard Seeds",
        "Chew them, I dare you!"
    );

    public static final SlimefunItemStack BROCCOLI = Theme.themedSlimefunItemStack(
        "CLT_BROCCOLI",
        Skins.BROCCOLI.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Broccoli",
        "Are you a giant holding a tree？",
        "Naw, just a tiny tree :)"
    );

    public static final SlimefunItemStack CINNAMON = Theme.themedSlimefunItemStack(
        "CLT_CINNAMON",
        new ItemStack(Material.STICK),
        CultivationThemes.PRODUCE,
        "Cinnamon",
        "Great to chew on in it's stick form。"
    );

    public static final SlimefunItemStack BASIL = Theme.themedSlimefunItemStack(
        "CLT_BASIL",
        new ItemStack(Material.SMALL_DRIPLEAF),
        CultivationThemes.PRODUCE,
        "Basil",
        "A sweet leaf with a soft peppery aftertaste。"
    );

    public static final SlimefunItemStack BAY_LEAF = Theme.themedSlimefunItemStack(
        "CLT_BAY_LEAF",
        new ItemStack(Material.LILY_PAD),
        CultivationThemes.PRODUCE,
        "Bay Leaf",
        "A strong aromat with many uses。"
    );

    public static final SlimefunItemStack CILANTRO = Theme.themedSlimefunItemStack(
        "CLT_CILANTRO",
        new ItemStack(Material.MANGROVE_LEAVES),
        CultivationThemes.PRODUCE,
        "Cilantro",
        "A soft spice with a hit of citrus。"
    );

    public static final SlimefunItemStack CHICORY = Theme.themedSlimefunItemStack(
        "CLT_CHICORY",
        new ItemStack(Material.BLUE_ORCHID),
        CultivationThemes.PRODUCE,
        "Chicory",
        "A nutty, bitter root。"
    );

    public static final SlimefunItemStack CHIVES = Theme.themedSlimefunItemStack(
        "CLT_CHIVES",
        new ItemStack(Material.SEAGRASS),
        CultivationThemes.PRODUCE,
        "Chives",
        "A sweat, onion-tasting, herb。"
    );

    public static final SlimefunItemStack CLOVE = Theme.themedSlimefunItemStack(
        "CLT_CLOVE",
        new ItemStack(Material.POPPY),
        CultivationThemes.PRODUCE,
        "Clove",
        "A super warm and intense flavour。"
    );

    public static final SlimefunItemStack CUMIN = Theme.themedSlimefunItemStack(
        "CLT_CUMIN",
        new ItemStack(Material.DANDELION),
        CultivationThemes.PRODUCE,
        "Cumin",
        "A warm citrusy plant。"
    );

    public static final SlimefunItemStack CHILLI_PEPPER = Theme.themedSlimefunItemStack(
        "CLT_CHILLY_PEPPER",
        Skins.PEPPERS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Chilly Pepper",
        "I can eat a whole pepper without crying。",
        "Well, half。",
        "WEEEELLL.... 1/4",
        "..。",
        "Ok I can touch one on my tounge"
    );

    public static final SlimefunItemStack CURRY_LEAF = Theme.themedSlimefunItemStack(
        "CLT_CURRY_LEAF",
        new ItemStack(Material.KELP),
        CultivationThemes.PRODUCE,
        "Curry Leaf",
        "The basis of so many wonderful foods。"
    );

    public static final SlimefunItemStack DILL = Theme.themedSlimefunItemStack(
        "CLT_DILL",
        new ItemStack(Material.GRASS),
        CultivationThemes.PRODUCE,
        "Dill",
        "Just taste like grass to me. Why",
        "do people like this？"
    );

    public static final SlimefunItemStack FENNEL = Theme.themedSlimefunItemStack(
        "CLT_FENNEL",
        new ItemStack(Material.OXEYE_DAISY),
        CultivationThemes.PRODUCE,
        "Fennel",
        "Like a mix of Anise and Liquorice。"
    );

    public static final SlimefunItemStack GINGER = Theme.themedSlimefunItemStack(
        "CLT_GINGER",
        new ItemStack(Material.HANGING_ROOTS),
        CultivationThemes.PRODUCE,
        "Ginger",
        "Chopped Ginger in boiling water, heals all ailments!"
    );

    public static final SlimefunItemStack HORSERADISH = Theme.themedSlimefunItemStack(
        "CLT_HORSERADISH",
        new ItemStack(Material.HANGING_ROOTS),
        CultivationThemes.PRODUCE,
        "Horseradish",
        "$100 if you bite right into it。"
    );

    public static final SlimefunItemStack JASMINE = Theme.themedSlimefunItemStack(
        "CLT_JASMINE",
        new ItemStack(Material.WHITE_TULIP),
        CultivationThemes.PRODUCE,
        "Jasmine",
        "Makes for a wonderful tea。"
    );

    public static final SlimefunItemStack JUNIPER_BERRY = Theme.themedSlimefunItemStack(
        "CLT_JUNIPER_BERRY",
        new ItemStack(Material.GLOW_BERRIES),
        CultivationThemes.PRODUCE,
        "Juniper Berries",
        "Dried to a peppery perfection。"
    );

    public static final SlimefunItemStack KAFFIR_LIME = Theme.themedSlimefunItemStack(
        "CLT_KAFFIR_LIME",
        new ItemStack(Material.KELP),
        CultivationThemes.PRODUCE,
        "Kaffir Lime Leaf",
        "A leaf with a mighty zest。"
    );

    public static final SlimefunItemStack LAVENDER = Theme.themedSlimefunItemStack(
        "CLT_LAVENDER",
        new ItemStack(Material.PURPLE_DYE),
        CultivationThemes.PRODUCE,
        "Lavender",
        "A smell that can make me drift slowly to sleep。"
    );

    public static final SlimefunItemStack LICORICE = Theme.themedSlimefunItemStack(
        "CLT_LICORICE",
        new ItemStack(Material.HANGING_ROOTS),
        CultivationThemes.PRODUCE,
        "Licorice",
        "Run, run away now!"
    );

    public static final SlimefunItemStack MACE = Theme.themedSlimefunItemStack(
        "CLT_MACE",
        new ItemStack(Material.RED_DYE),
        CultivationThemes.PRODUCE,
        "Mace",
        "Used to spray in the face of attackers。",
        "..。",
        "What do you mean that's not the right type of mace？"
    );

    public static final SlimefunItemStack MARJORAM = Theme.themedSlimefunItemStack(
        "CLT_MARJORAM",
        new ItemStack(Material.DARK_OAK_LEAVES),
        CultivationThemes.PRODUCE,
        "Marjoram",
        "I'm in a bit of a curry, could we talk later？"
    );

    public static final SlimefunItemStack MINT = Theme.themedSlimefunItemStack(
        "CLT_MINT",
        new ItemStack(Material.MANGROVE_LEAVES),
        CultivationThemes.PRODUCE,
        "Mint",
        "Chew chew chew。"
    );

    public static final SlimefunItemStack OREGANO = Theme.themedSlimefunItemStack(
        "CLT_OREGANO",
        new ItemStack(Material.SPRUCE_LEAVES),
        CultivationThemes.PRODUCE,
        "Oregano",
        "A classic staple cupboard herb。"
    );

    public static final SlimefunItemStack PARSLEY = Theme.themedSlimefunItemStack(
        "CLT_PARSLEY",
        new ItemStack(Material.ACACIA_LEAVES),
        CultivationThemes.PRODUCE,
        "Parsley",
        "Worst. Herb. Ever。"
    );

    public static final SlimefunItemStack ROSEMARY = Theme.themedSlimefunItemStack(
        "CLT_ROSEMARY",
        new ItemStack(Material.BIRCH_LEAVES),
        CultivationThemes.PRODUCE,
        "Rosemary",
        "Often misses thyme。"
    );

    public static final SlimefunItemStack SASSAFRAS = Theme.themedSlimefunItemStack(
        "CLT_SASSAFRAS",
        new ItemStack(Material.OAK_LEAVES),
        CultivationThemes.PRODUCE,
        "Sassafras",
        "Edible Root Beer, seriously google",
        "it, I buy it constantly now。"
    );

    public static final SlimefunItemStack SHISO = Theme.themedSlimefunItemStack(
        "CLT_SHISO",
        new ItemStack(Material.MANGROVE_LEAVES),
        CultivationThemes.PRODUCE,
        "Shiso",
        "Mint with a side of love。"
    );

    public static final SlimefunItemStack STAR_ANISE = Theme.themedSlimefunItemStack(
        "CLT_STAR_ANISE",
        new ItemStack(Material.NETHER_STAR),
        CultivationThemes.PRODUCE,
        "Star Anise",
        "One of the best and most unique flavours。"
    );

    public static final SlimefunItemStack TARRAGON = Theme.themedSlimefunItemStack(
        "CLT_TARRAGON",
        new ItemStack(Material.JUNGLE_LEAVES),
        CultivationThemes.PRODUCE,
        "Tarragon",
        "I literally put this on anything。",
        "Spoiler: Im not a good chef。"
    );

    public static final SlimefunItemStack THYME = Theme.themedSlimefunItemStack(
        "CLT_THYME",
        new ItemStack(Material.BIRCH_LEAVES),
        CultivationThemes.PRODUCE,
        "Thyme",
        "Often missed rosemary。"
    );

    public static final SlimefunItemStack TURMERIC = Theme.themedSlimefunItemStack(
        "CLT_TURMERIC",
        new ItemStack(Material.YELLOW_DYE),
        CultivationThemes.PRODUCE,
        "Turmeric",
        "A strong musky presence to fill out many dishes。"
    );

    public static final SlimefunItemStack VANILLA = Theme.themedSlimefunItemStack(
        "CLT_VANILLA",
        new ItemStack(Material.BLACK_DYE),
        CultivationThemes.PRODUCE,
        "Vanilla",
        "Instructions: Dip directly into a Latte"
    );

    public static final SlimefunItemStack WASABI = Theme.themedSlimefunItemStack(
        "CLT_WASABI",
        new ItemStack(Material.HANGING_ROOTS),
        CultivationThemes.PRODUCE,
        "Wasabi",
        "Help... wasabi..。"
    );

    public static final SlimefunItemStack ARTICHOKE = Theme.themedSlimefunItemStack(
        "CLT_ARTICHOKE",
        Skins.CABBAGE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Artichoke",
        "Rip out it's HEART!"
    );

    public static final SlimefunItemStack AUBERGINE = Theme.themedSlimefunItemStack(
        "CLT_AUBERGINE",
        Skins.AUBERGINE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Aubergine",
        "Bright purple and 100% NOT egg shaped。",
        "Better call it an eggplant, right？"
    );

    public static final SlimefunItemStack ASPARAGUS = Theme.themedSlimefunItemStack(
        "CLT_ASPARAGUS",
        Skins.ASPARAGUS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Asparagus",
        "Careful when visiting the bathroom later。"
    );

    public static final SlimefunItemStack BRUSSELS_SPROUTS = Theme.themedSlimefunItemStack(
        "CLT_BRUSSELS_SPROUTS",
        Skins.KALE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Brussels Sprouts",
        "A gassious delight。"
    );

    public static final SlimefunItemStack CABBAGE = Theme.themedSlimefunItemStack(
        "CLT_CABBAGE",
        Skins.CABBAGE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Cabbage",
        "A baggage of cabbage。"
    );

    public static final SlimefunItemStack CAULIFLOWER = Theme.themedSlimefunItemStack(
        "CLT_CAULIFLOWER",
        Skins.CAULIFLOWER.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Cauliflower",
        "A portable cloud!"
    );

    public static final SlimefunItemStack CELERY = Theme.themedSlimefunItemStack(
        "CLT_CELERY",
        new ItemStack(Material.BAMBOO),
        CultivationThemes.PRODUCE,
        "Celery",
        "Literally just stringy water. Convince",
        "me otherwise。"
    );

    public static final SlimefunItemStack KALE = Theme.themedSlimefunItemStack(
        "CLT_KALE",
        Skins.KALE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Kale",
        "Help, im a 2020 smoothie hipster!"
    );

    public static final SlimefunItemStack SPINACH = Theme.themedSlimefunItemStack(
        "CLT_SPINACH",
        new ItemStack(Material.KELP),
        CultivationThemes.PRODUCE,
        "Spinach",
        "Wilted with love。"
    );

    public static final SlimefunItemStack BLACK_BEANS = Theme.themedSlimefunItemStack(
        "CLT_BLACK_BEANS",
        new ItemStack(Material.MELON_SEEDS),
        CultivationThemes.PRODUCE,
        "Black Beans",
        "A delicious vegetarian protein。"
    );

    public static final SlimefunItemStack GREEN_BEANS = Theme.themedSlimefunItemStack(
        "CLT_GREEN_BEANS",
        new ItemStack(Material.FROGSPAWN),
        CultivationThemes.PRODUCE,
        "Green Beans",
        "How creatively named!"
    );

    public static final SlimefunItemStack CHICKPEAS = Theme.themedSlimefunItemStack(
        "CLT_CHICKPEAS",
        new ItemStack(Material.BEETROOT_SEEDS),
        CultivationThemes.PRODUCE,
        "Chickpeas",
        "Black eyed peas can sing a tune, chickpeas can only hummus one。"
    );

    public static final SlimefunItemStack SOY_BEANS = Theme.themedSlimefunItemStack(
        "CLT_SOY_BEANS",
        new ItemStack(Material.MELON_SEEDS),
        CultivationThemes.PRODUCE,
        "Soy Beans",
        "Soy milk cometh。"
    );

    public static final SlimefunItemStack PINTO_BEANS = Theme.themedSlimefunItemStack(
        "CLT_PINTO_BEANS",
        new ItemStack(Material.MELON_SEEDS),
        CultivationThemes.PRODUCE,
        "Pinto Beans",
        "Kaching! It's burrito time。"
    );

    public static final SlimefunItemStack RUNNER_BEANS = Theme.themedSlimefunItemStack(
        "CLT_RUNNER_BEANS",
        new ItemStack(Material.KELP),
        CultivationThemes.PRODUCE,
        "Runner Beans",
        "Always trying to get away。"
    );

    public static final SlimefunItemStack NETTLES = Theme.themedSlimefunItemStack(
        "CLT_NETTLES",
        new ItemStack(Material.AZALEA_LEAVES),
        CultivationThemes.PRODUCE,
        "Nettles",
        "Please put on your gloves before holding these。"
    );

    public static final SlimefunItemStack OKRA = Theme.themedSlimefunItemStack(
        "CLT_OKRA",
        Skins.LETTUCE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Okra",
        "Grown alot in okra-homa... right, RIGHT？"
    );

    public static final SlimefunItemStack LEEK = Theme.themedSlimefunItemStack(
        "CLT_LEEK",
        Skins.LEEK.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Leek",
        "for some reason it's dripping with water？",
        "Perhaps it's sprung a leek？"
    );

    public static final SlimefunItemStack SHALLOT = Theme.themedSlimefunItemStack(
        "CLT_SHALLOT",
        Skins.ONION.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Shallot",
        "I do love a lot of shallot。"
    );

    public static final SlimefunItemStack JALAPENO = Theme.themedSlimefunItemStack(
        "CLT_JALAPENO",
        Skins.PEPPERS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Jalapeno",
        "HOT HOT HOT。"
    );

    public static final SlimefunItemStack RADICCHIO = Theme.themedSlimefunItemStack(
        "CLT_RADICCHIO",
        Skins.RADDISH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Radicchio",
        "Writing all this lore takes so long。",
        "It's radicchio-less。"
    );

    public static final SlimefunItemStack RHUBARB = Theme.themedSlimefunItemStack(
        "CLT_RHUBARB",
        Skins.LEEK.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Rhubarb",
        "Just be sure to remove the leaves!"
    );

    public static final SlimefunItemStack CELERIAC = Theme.themedSlimefunItemStack(
        "CLT_CELERIAC",
        Skins.PARSNIP.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Celeriac",
        "A hearty root that's rooted (heh) in many",
        "traditional recipes。"
    );

    public static final SlimefunItemStack PARSNIP = Theme.themedSlimefunItemStack(
        "CLT_PARSNIP",
        Skins.PARSNIP.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Parsnip",
        "Requires roasting immediately。"
    );

    public static final SlimefunItemStack RUTABAGA = Theme.themedSlimefunItemStack(
        "CLT_RUTABAGA",
        Skins.RUTABAGA.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Rutabaga",
        "It actually hurts not calling this a swede。"
    );

    public static final SlimefunItemStack RADDISH = Theme.themedSlimefunItemStack(
        "CLT_RADDISH",
        Skins.RADDISH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Raddish",
        "Little pockets of fresh, crisp, sunshine。"
    );

    public static final SlimefunItemStack SWEET_POTATO = Theme.themedSlimefunItemStack(
        "CLT_SWEET_POTATO",
        new ItemStack(Material.BEETROOT),
        CultivationThemes.PRODUCE,
        "Sweet Potato",
        "Yam yam yam。"
    );

    public static final SlimefunItemStack TURNIP = Theme.themedSlimefunItemStack(
        "CLT_TURNIP",
        Skins.TURNIP.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Turnip",
        "Will solve all of life's problems。"
    );

    public static final SlimefunItemStack SWEETCORN = Theme.themedSlimefunItemStack(
        "CLT_SWEETCORN",
        Skins.CORN.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Sweetcorn",
        "Perhaps the best vegetable around。"
    );

    public static final SlimefunItemStack COURGETTE = Theme.themedSlimefunItemStack(
        "CLT_COURGETTE",
        new ItemStack(Material.BAMBOO),
        CultivationThemes.PRODUCE,
        "Courgette",
        "Pro Tip: Grate this into any pasta sauce",
        "for depth and texture。"
    );

    public static final SlimefunItemStack CUCUMBER = Theme.themedSlimefunItemStack(
        "CLT_CUCUMBER",
        new ItemStack(Material.BAMBOO),
        CultivationThemes.PRODUCE,
        "Cucumber",
        "Water in a green shell, prove me",
        "wrong。"
    );

    public static final SlimefunItemStack MARROW = Theme.themedSlimefunItemStack(
        "CLT_MARROW",
        Skins.SQUASH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Marrow",
        "Did you know marrows are found within",
        "your bones？",
        "Yup, Sefi Smort。"
    );

    public static final SlimefunItemStack AVOCADO = Theme.themedSlimefunItemStack(
        "CLT_AVOCADO",
        Skins.AVOCADO.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Avocado",
        "What hipsters dream about。"
    );

    public static final SlimefunItemStack GREEN_ONION = Theme.themedSlimefunItemStack(
        "CLT_GREEN_ONION",
        Skins.GREEN_ONION.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Green Onion",
        "Goes great on tacos!"
    );

    public static final SlimefunItemStack BLACK_PEPPER = Theme.themedSlimefunItemStack(
        "CLT_PEPPER",
        Skins.BLACK_PEPPER.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Black Pepper",
        "Spicier than salt。"
    );

    // endregion

    // region Crafted By Products

    public static final SlimefunItemStack PEANUT_BUTTER = Theme.themedSlimefunItemStack(
        "CLT_PEANUT_BUTTER",
        Skins.PEANUT_BUTTER.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Peanut Butter",
        "Akin only to liquid gold。"
    );

    public static final SlimefunItemStack GRAPE_JELLY = Theme.themedSlimefunItemStack(
        "CLT_GRAPE_JELLY",
        Skins.JAM_JAR_BLUE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Grape Jelly",
        "Eating it with a spoon is a criminal offence。"
    );

    public static final SlimefunItemStack STRAWBERRY_JELLY = Theme.themedSlimefunItemStack(
        "CLT_STRAWBERRY_JELLY",
        Skins.JAM_JAR_RED.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Strawberry Jelly",
        "Eating it with a spoon is a criminal offence。"
    );

    public static final SlimefunItemStack OIL = Theme.themedSlimefunItemStack(
        "CLT_OIL",
        Skins.SPICE_YELLOW.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Oil",
        "Oil. Need I say more？"
    );

    public static final SlimefunItemStack MAYONNAISE = Theme.themedSlimefunItemStack(
        "CLT_MAYONNAISE",
        new ItemStack(Material.MILK_BUCKET),
        CultivationThemes.PRODUCE,
        "Mayonnaise",
        "A silky smooth mayo that can go with nearly anything。"
    );

    public static final SlimefunItemStack EGG_SALAD = Theme.themedSlimefunItemStack(
        "CLT_EGG_SALAD",
        Skins.SPICE_YELLOW.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Egg Salad",
        "Open this on a train, I dare you!"
    );

    public static final SlimefunItemStack PIE_CRUST = Theme.themedSlimefunItemStack(
        "CLT_PIE_CRUST",
        Skins.PIE_CRUST.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pie Crust",
        "If it were legal to eat this own it's own",
        "it'd be my main food source。"
    );

    public static final SlimefunItemStack PASTA = Theme.themedSlimefunItemStack(
        "CLT_PASTA",
        Skins.PASTA.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pasta",
        "Just plain pasta, simple yet wonderful。"
    );

    public static final SlimefunItemStack BISCUIT_DOUGH = Theme.themedSlimefunItemStack(
        "CLT_BISCUIT_DOUGH",
        new ItemStack(Material.BROWN_DYE),
        CultivationThemes.PRODUCE,
        "Biscuit Dough",
        "Just remind yourself \"Don't eat it raw.\""
    );

    public static final SlimefunItemStack BISCUIT_BASE = Theme.themedSlimefunItemStack(
        "CLT_BISCUIT_BASE",
        new ItemStack(Material.OAK_TRAPDOOR),
        CultivationThemes.PRODUCE,
        "Biscuit Base",
        "Just 'cause it's flat now doesnt mean",
        "you can eat it raw。"
    );

    public static final SlimefunItemStack MEATBALLS = Theme.themedSlimefunItemStack(
        "CLT_MEATBALLS",
        new ItemStack(Material.BROWN_DYE),
        CultivationThemes.PRODUCE,
        "Meatballs",
        "Balls of meat, who'd-a-thunk it。"
    );

    public static final SlimefunItemStack PEPPERONI = Theme.themedSlimefunItemStack(
        "CLT_PEPPERONI",
        Skins.PEPPERONI.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pepperoni",
        "I could eat an entire log of this, easy。"
    );

    public static final SlimefunItemStack DOUGH = Theme.themedSlimefunItemStack(
        "CLT_DOUGH",
        Skins.DOUGH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Dough",
        "Just plain ol' dough!"
    );

    public static final SlimefunItemStack CREAM_CHEESE = Theme.themedSlimefunItemStack(
        "CLT_CREAM_CHEESE",
        new ItemStack(Material.MILK_BUCKET),
        CultivationThemes.PRODUCE,
        "Cream Cheese",
        "More creamy than cheesy。"
    );

    public static final SlimefunItemStack KETCHUP = Theme.themedSlimefunItemStack(
        "CLT_KETCHUP",
        Skins.JAM_JAR_RED.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Ketchup",
        "Just tomatoes in a creamy form。"
    );

    public static final SlimefunItemStack MUSTARD = Theme.themedSlimefunItemStack(
        "CLT_MUSTARD",
        Skins.JAM_JAR_YELLOW.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Mustard",
        "Has a little kick to it!"
    );

    public static final SlimefunItemStack TORTILLAS = Theme.themedSlimefunItemStack(
        "CLT_TORTILLAS",
        Skins.TORILLAS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Tortillas",
        "Corn-flour delights"
    );

    public static final SlimefunItemStack PICO_DE_GALLO = Theme.themedSlimefunItemStack(
        "CLT_PICO_DE_GALLO",
        Skins.SALSA.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pico de Gallo",
        "A mild salsa full of pure delicious。"
    );

    public static final SlimefunItemStack COOKED_BURGER_PATTY = Theme.themedSlimefunItemStack(
        "CLT_COOKED_BURGER_PATTY",
        new ItemStack(Material.COOKED_BEEF),
        CultivationThemes.PRODUCE,
        "Cooked Burger Patty",
        "Practically dripping"
    );

    // endregion

    // region Finished Foods

    public static final SlimefunItemStack FOOD_PEANUT_BUTTER_JELLY_SANDWICH = Theme.themedSlimefunItemStack(
        "CLT_PEANUT_BUTTER_JELLY_SANDWICH",
        Skins.PEANUT_BUTTER_JELLY_SANDWICH.getPlayerHead(),
        CultivationThemes.FOOD,
        "Peanut Butter Jelly Sandwich",
        "It really is the pinnacle of sandwich technology。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "5 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Power + 3")
    );

    public static final SlimefunItemStack EGG_SALAD_SANDWICH = Theme.themedSlimefunItemStack(
        "CLT_EGG_SALAD_SANDWICH",
        Skins.CHEESY_SANDWICH.getPlayerHead(),
        CultivationThemes.FOOD,
        "Egg Salad Sandwich",
        "Smells a bit, but tastes amazing!",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "5 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Haste + 2")
    );

    public static final SlimefunItemStack BACON_SANDWICH = Theme.themedSlimefunItemStack(
        "CLT_BACON_SANDWICH",
        Skins.MEATY_SANDWICH.getPlayerHead(),
        CultivationThemes.FOOD,
        "Bacon Sandwich",
        "A simple classic!",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "2 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Power + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Speed + 1")
    );

    public static final SlimefunItemStack SALMON_NIGIRI = Theme.themedSlimefunItemStack(
        "CLT_SALMON_NIGIRI",
        Skins.SUSHI_SALMON.getPlayerHead(),
        CultivationThemes.FOOD,
        "Salmon Nigiri",
        "A delightful yet subtle flavour。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "2 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Regen + 1")
    );

    public static final SlimefunItemStack CAJUN_GARLIC_BUTTER_COD = Theme.themedSlimefunItemStack(
        "CLT_CAJUN_GARLIC_BUTTER_COD",
        Skins.MEAL_RED_GREEN_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Cajun Garlic Butter Cod",
        "A very simple dish busting with flavour。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Regen + 2"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Speed + 1")
    );

    public static final SlimefunItemStack SHAKSHUKA = Theme.themedSlimefunItemStack(
        "CLT_SHAKSHUKA",
        Skins.SHAKSHUKA.getPlayerHead(),
        CultivationThemes.FOOD,
        "Shakshuka",
        "A heart warming dish with eggs for days。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Hero of the Village + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Luck + 1")
    );

    public static final SlimefunItemStack FUGU = Theme.themedSlimefunItemStack(
        "CLT_FUGU",
        Skins.SUSHI_TUNA.getPlayerHead(),
        CultivationThemes.FOOD,
        "Fugu",
        "Ready to roll the dice？",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "1 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Power + 5"),
        Theme.CLICK_INFO.asTitle("Effect 2", "33% Chance to just die!")
    );

    public static final SlimefunItemStack SHEPHERDS_PIE = Theme.themedSlimefunItemStack(
        "CLT_SHEPHERDS_PIE",
        Skins.MEAL_YELLOW_RED_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Shepherds Pie",
        "Warm, hearty and simply wonderful。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "10 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Regen + 2")
    );

    public static final SlimefunItemStack CHICKEN_POT_PIE = Theme.themedSlimefunItemStack(
        "CLT_CHICKEN_POT_PIE",
        Skins.PIE_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Chicken Pot Pie",
        "A warming meal that really hits home。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "10 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Jump + 2"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Saturation + 1")
    );

    public static final SlimefunItemStack CHICKEN_PASTA_BAKE = Theme.themedSlimefunItemStack(
        "CLT_CHICKEN_PASTA_BAKE",
        Skins.PASTA_BAKE.getPlayerHead(),
        CultivationThemes.FOOD,
        "Chicken Pasta Bake",
        "A student staple。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "5 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Night Vision + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Water Breathing + 1")
    );

    public static final SlimefunItemStack CHICKEN_ALFREDO_MAC_AND_CHEESE = Theme.themedSlimefunItemStack(
        "CLT_CHICKEN_ALFREDO_MAC_AND_CHEESE",
        Skins.MAC_AND_CHEESE.getPlayerHead(),
        CultivationThemes.FOOD,
        "Chicken Alfredo Mac and Cheese",
        "A posh twist on a common classic。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "1 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Fire Resistance + 2"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Damage Resistance + 3")
    );

    public static final SlimefunItemStack KEY_LIME_PIE = Theme.themedSlimefunItemStack(
        "CLT_KEY_LIME_PIE",
        Skins.PIE_LIME.getPlayerHead(),
        CultivationThemes.FOOD,
        "Key Lime Pie",
        "Simply the best!",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "6 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Haste + 4")
    );

    public static final SlimefunItemStack FRUIT_SALAD = Theme.themedSlimefunItemStack(
        "CLT_FRUIT_SALAD",
        Skins.FRUIT_SALAD.getPlayerHead(),
        CultivationThemes.FOOD,
        "Fruit Salad",
        "If you call it a salad, you can eat as much",
        "as you like, 'cause it's healthy。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "2 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Speed + 3")
    );

    public static final SlimefunItemStack CAESAR_SALAD = Theme.themedSlimefunItemStack(
        "CLT_CAESAR_SALAD",
        Skins.FRUIT_SALAD.getPlayerHead(),
        CultivationThemes.FOOD,
        "Caesar Salad",
        "A healthy classic。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Speed + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Invisibility + 1"),
        Theme.CLICK_INFO.asTitle("Effect 3", "Slow Falling + 1")
    );

    public static final SlimefunItemStack BISCUIT = Theme.themedSlimefunItemStack(
        "CLT_BISCUIT",
        new ItemStack(Material.COOKIE),
        CultivationThemes.FOOD,
        "Biscuit",
        "A little snack with a huge taste。",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Launches you into the air")
    );

    public static final SlimefunItemStack COMPRESSED_BISCUIT = Theme.themedSlimefunItemStack(
        "CLT_COMPRESSED_BISCUIT",
        new ItemStack(Material.COOKIE),
        CultivationThemes.FOOD,
        "Compressed Biscuit",
        "A little snack with a huge-er taste。",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Launches you into the air")
    );

    public static final SlimefunItemStack LEMON_DROP = Theme.themedSlimefunItemStack(
        "CLT_LEMON_DROP",
        new ItemStack(Material.YELLOW_DYE),
        CultivationThemes.FOOD,
        "Lemon Drop",
        "A palette cleanser。",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Clears all effects and makes you hungry again。")
    );

    public static final SlimefunItemStack GRILLED_SALMON_SALAD = Theme.themedSlimefunItemStack(
        "CLT_GRILLED_SALMON_SALAD",
        Skins.MEAL_SALAD.getPlayerHead(),
        CultivationThemes.FOOD,
        "Grilled Salmon Salad",
        "Delightfully flaky and brilliantly seasoned。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Regeneration + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Health Boost + 5")
    );

    public static final SlimefunItemStack WITHER_ROSE_SALAD = Theme.themedSlimefunItemStack(
        "CLT_WITHER_ROSE_SALAD",
        Skins.MEAL_SALAD.getPlayerHead(),
        CultivationThemes.FOOD,
        "Wither Rose Salad",
        "Teeming with power but with a harsh side-effect。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "Full"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 20"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Wither + 2")
    );

    public static final SlimefunItemStack ORANGE_JUICE = Theme.themedSlimefunItemStack(
        "CLT_ORANGE_JUICE",
        ItemStackGenerators.createPotion(Color.YELLOW),
        CultivationThemes.FOOD,
        "Orange Juice",
        "It really is the best way to start the day。",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Speed + 4")
    );

    public static final SlimefunItemStack LASAGNA = Theme.themedSlimefunItemStack(
        "CLT_LASAGNA",
        Skins.MEAL_YELLOW_RED_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Lasagna",
        "Layers of awesomeness。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "Full"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Regeneration + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Damage Reduction + 1")
    );

    public static final SlimefunItemStack SPAGHETTI = Theme.themedSlimefunItemStack(
        "CLT_SPAGHETTI",
        Skins.SPAGHETTI.getPlayerHead(),
        CultivationThemes.FOOD,
        "Spaghetti",
        "Just keep slurping。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "1 Heart")
    );

    public static final SlimefunItemStack SPAGHETTI_AND_MEATBALLS = Theme.themedSlimefunItemStack(
        "CLT_SPAGHETTI_AND_MEATBALLS",
        Skins.SPAGHETTI.getPlayerHead(),
        CultivationThemes.FOOD,
        "Spaghetti and Meatballs",
        "Simple, classic and hearty。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Bad Omen + 1")
    );

    public static final SlimefunItemStack PIZZA_CHEESE = Theme.themedSlimefunItemStack(
        "CLT_PIZZA_CHEESE",
        Skins.PIZZA_CHEESE.getPlayerHead(),
        CultivationThemes.FOOD,
        "Cheese Pizza",
        "Why anyone would order just cheese? I dont know。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Slowness + 1")
    );

    public static final SlimefunItemStack PIZZA_MUSHROOM = Theme.themedSlimefunItemStack(
        "CLT_PIZZA_MUSHROOM",
        Skins.PIZZA_MUSHROOM.getPlayerHead(),
        CultivationThemes.FOOD,
        "Mushroom Pizza",
        "A simple vegetarian pizza full of proteins。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "6 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Slowness + 1"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Haste + 2")
    );

    public static final SlimefunItemStack PIZZA_PEPPERONI = Theme.themedSlimefunItemStack(
        "CLT_PIZZA_PEPPERONI",
        Skins.PIZZA_PEPPERONI.getPlayerHead(),
        CultivationThemes.FOOD,
        "Pepperoni Pizza",
        "A New York classic full of flavour。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "6 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Speed + 1"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Haste + 1"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Jump + 1")
    );

    public static final SlimefunItemStack CHEESY_SCALLOPED_COURGETTE = Theme.themedSlimefunItemStack(
        "CLT_CHEESY_SCALLOPED_COURGETTE",
        Skins.MEAL_RED_GREEN_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Cheesy Scalloped Courgette",
        "A low carb version of an amazing classic。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "2 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Night Vision + 1"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Invisibility + 1")
    );

    public static final SlimefunItemStack PECAN_PIE = Theme.themedSlimefunItemStack(
        "CLT_PECAN_PIE",
        Skins.PIE_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Pecan Pie",
        "The only way to eat pure sugar without",
        "being totally judged。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Levitation + 1")
    );

    public static final SlimefunItemStack GARLIC_BUTTER_MUSHROOMS = Theme.themedSlimefunItemStack(
        "CLT_GARLIC_BUTTER_MUSHROOMS",
        new ItemStack(Material.MUSHROOM_STEW),
        CultivationThemes.FOOD,
        "Garlic Butter Mushrooms",
        "May easily be the best food item on earth。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "2 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Glowing + 1")
    );

    public static final SlimefunItemStack RAMEN_BEEF = Theme.themedSlimefunItemStack(
        "CLT_RAMEN_BEEF",
        Skins.RAMEN_BEEF.getPlayerHead(),
        CultivationThemes.FOOD,
        "Ramen (Beef)",
        "A not-so-healthy choice。",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 1")
    );

    public static final SlimefunItemStack RAMEN_CHICKEN = Theme.themedSlimefunItemStack(
        "CLT_RAMEN_CHICKEN",
        Skins.RAMEN_CHICKEN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Ramen (Chicken)",
        "A not-so-filling choice。",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 1")
    );

    public static final SlimefunItemStack RAMEN_SEAFOOD = Theme.themedSlimefunItemStack(
        "CLT_RAMEN_SEAFOOD",
        Skins.RAMEN_SEAFOOD.getPlayerHead(),
        CultivationThemes.FOOD,
        "Ramen (Seafood)",
        "A not-so-satisfying choice。",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 1")
    );

    public static final SlimefunItemStack RAMEN_BEEF_HEARTY = Theme.themedSlimefunItemStack(
        "CLT_RAMEN_BEEF_HEARTY",
        Skins.RAMEN_HEARTY.getPlayerHead(),
        CultivationThemes.FOOD,
        "Ramen (Beef) (Hearty)",
        "A healthy choice。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "Full"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 2"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Speed + 1")
    );

    public static final SlimefunItemStack RAMEN_CHICKEN_HEARTY = Theme.themedSlimefunItemStack(
        "CLT_RAMEN_CHICKEN_HEARTY",
        Skins.RAMEN_HEARTY.getPlayerHead(),
        CultivationThemes.FOOD,
        "Ramen (Chicken) (Hearty)",
        "A filling choice。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "Full"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 2"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Speed + 1")
    );

    public static final SlimefunItemStack RAMEN_SEAFOOD_HEARTY = Theme.themedSlimefunItemStack(
        "CLT_RAMEN_SEAFOOD_HEARTY",
        Skins.RAMEN_HEARTY.getPlayerHead(),
        CultivationThemes.FOOD,
        "Ramen (Seafood) (Hearty)",
        "A satisfying choice。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "Full"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 2"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Speed + 1")
    );

    public static final SlimefunItemStack BAGEL = Theme.themedSlimefunItemStack(
        "CLT_BAGEL",
        Skins.BAGEL.getPlayerHead(),
        CultivationThemes.FOOD,
        "Bagel",
        "Toasted? or..。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "5")
    );

    public static final SlimefunItemStack BAGEL_BITE = Theme.themedSlimefunItemStack(
        "CLT_BAGEL_BITE",
        Skins.BAGEL_BITE.getPlayerHead(),
        CultivationThemes.FOOD,
        "Bagel Bite",
        "Eat pizza anytime!",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Burns your mouth with every bite!")
    );

    public static final SlimefunItemStack BAGEL_CREAM_CHEESE = Theme.themedSlimefunItemStack(
        "CLT_BAGEL_CREAM_CHEESE",
        Skins.BAGEL_EVERYTHING.getPlayerHead(),
        CultivationThemes.FOOD,
        "Bagel (Cream Cheese)",
        "It's so good you'll probably want another。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "10"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 1")
    );

    public static final SlimefunItemStack MEATLOAF = Theme.themedSlimefunItemStack(
        "CLT_MEATLOAF",
        Skins.MEATLOAF.getPlayerHead(),
        CultivationThemes.FOOD,
        "Meatloaf",
        "Nothing like it! Let's go。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "Full"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 4"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Damage Reduction + 3"),
        Theme.CLICK_INFO.asTitle("Effect 3", "Haste + 2"),
        Theme.CLICK_INFO.asTitle("Effect 4", "Slowness + 2")
    );

    public static final SlimefunItemStack SAUSAGE = Theme.themedSlimefunItemStack(
        "CLT_SAUSAGE",
        Skins.SAUSAGE.getPlayerHead(),
        CultivationThemes.FOOD,
        "Sausage",
        "Bacon's brother。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "2")
    );

    public static final SlimefunItemStack SOYLENT = Theme.themedSlimefunItemStack(
        "CLT_SOYLENT",
        ItemStackGenerators.createPotion(Color.WHITE),
        CultivationThemes.FOOD,
        "Soylent",
        "Everything the body needs!",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Bad Omen + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Weakness + 4")
    );

    public static final SlimefunItemStack TATER_TOTS = Theme.themedSlimefunItemStack(
        "CLT_TATER_TOTS",
        Skins.TATER_TOT.getPlayerHead(),
        CultivationThemes.FOOD,
        "Tater Tots",
        "Little potato poppables。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "1"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Speed + 2")
    );

    public static final SlimefunItemStack SWEET_BEEHIVE = Theme.themedSlimefunItemStack(
        "CLT_SWEET_BEEHIVE",
        Skins.BEEHIVE.getPlayerHead(),
        CultivationThemes.FOOD,
        "Sweet Beehive",
        "Not sure what made you want to cook this!",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Summons some bees!")
    );

    public static final SlimefunItemStack TAQUITO = Theme.themedSlimefunItemStack(
        "CLT_TAQUITO",
        Skins.TAQUITO.getPlayerHead(),
        CultivationThemes.FOOD,
        "Taquito",
        "Zim would be proud!",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Summons Gir to help (It's an Iron Golem, relax)。")
    );

    public static final SlimefunItemStack BOWL_OF_STEVE = Theme.themedSlimefunItemStack(
        "CLT_BOWL_OF_STEVE",
        Skins.STEVE_HEAD_BOWL.getPlayerHead(),
        CultivationThemes.FOOD,
        "Bowl of... Steve？",
        "What the actual &%£$",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Reduces you to 1/2 heart"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Fatigue + 10"),
        Theme.CLICK_INFO.asTitle("Effect 3", "Slow + 5"),
        Theme.CLICK_INFO.asTitle("Effect 4", "Damage + 10")
    );

    public static final SlimefunItemStack CHEESE_BURGER = Theme.themedSlimefunItemStack(
        "CLT_CHEESE_BURGER",
        Skins.BURGER.getPlayerHead(),
        CultivationThemes.FOOD,
        "Burger",
        "A simple cheese burger, but nothing beats it!",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Regen + 3")
    );

    public static final SlimefunItemStack CINNAMON_ROLL = Theme.themedSlimefunItemStack(
        "CLT_CINNAMON_ROLL",
        Skins.CINNAMON_ROLL.getPlayerHead(),
        CultivationThemes.FOOD,
        "Cinnamon Roll",
        "A sweet delight rolled up for fun。",
        "Eating it turns the world on it's head!",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Levitation + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Slow Falling + 1")
    );

    public static final SlimefunItemStack BLUE_CANDY = Theme.themedSlimefunItemStack(
        "CLT_BLUE_CANDY",
        Skins.BLUE_CANDY.getPlayerHead(),
        CultivationThemes.FOOD,
        "Candy (Blue)",
        "A delightfully sweet candy。",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Spawns an Allay")
    );

    public static final SlimefunItemStack SOFT_BOILED_EGG = Theme.themedSlimefunItemStack(
        "CLT_SOFT_BOILED_EGG",
        Skins.BOILED_EGG.getPlayerHead(),
        CultivationThemes.FOOD,
        "Soft Boiled Egg",
        "Just a boiled egg, what's more to say。",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "1"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Can sometimes call a chicken to your aid。")
    );

    public static final SlimefunItemStack SUGARED_SKULL = Theme.themedSlimefunItemStack(
        "CLT_SUGARED_SKULL",
        Skins.SUGARED_SKULL.getPlayerHead(),
        CultivationThemes.FOOD,
        "Sugared Skull",
        "Is this even food...？",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Darkness + 3")
    );

    // end region
}
