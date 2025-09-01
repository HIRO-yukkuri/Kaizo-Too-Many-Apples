package net.kaijane.too_many_apples.item;

import net.kaijane.too_many_apples.TooManyApples;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity; // Rarityをインポート
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap; // LinkedHashMapをインポート
import java.util.List;
import java.util.Map;

import static net.kaijane.too_many_apples.TooManyApples.LOGGER;

public class Apples {
    public static final Map<String, Item> APPLES = new LinkedHashMap<>();

    // 通常のリンゴ
    public static final Item COPPER_APPLE = registerItem("copper_apple",
            new Item(new Item.Settings().food(ModFoodComponents.COPPER_APPLE_FOOD_COMPONENT).rarity(Rarity.COMMON))); // レアリティ設定

    public static final Item IRON_APPLE = registerItem("iron_apple",
            new Item(new Item.Settings().food(ModFoodComponents.IRON_APPLE_FOOD_COMPONENT).rarity(Rarity.COMMON))); // レアリティ設定

    public static final Item AMETHYST_APPLE = registerItem("amethyst_apple",
            new Item(new Item.Settings().food(ModFoodComponents.AMETHYST_APPLE_FOOD_COMPONENT).rarity(Rarity.COMMON))); // レアリティ設定

    public static final Item PRISMARINE_APPLE = registerItem("prismarine_apple",
            new Item(new Item.Settings().food(ModFoodComponents.PRISMARINE_APPLE_FOOD_COMPONENT).rarity(Rarity.COMMON))); // レアリティ設定

    public static final Item REDSTONE_APPLE = registerItem("redstone_apple",
            new Item(new Item.Settings().food(ModFoodComponents.REDSTONE_APPLE_FOOD_COMPONENT).rarity(Rarity.COMMON))); // レアリティ設定

    public static final Item DIAMOND_APPLE = registerItem("diamond_apple",
            new Item(new Item.Settings().food(ModFoodComponents.DIAMOND_APPLE_FOOD_COMPONENT).rarity(Rarity.UNCOMMON))); // レアリティ設定

    public static final Item NETHERITE_APPLE = registerItem("netherite_apple",
            new Item(new Item.Settings().food(ModFoodComponents.NETHERITE_APPLE_FOOD_COMPONENT).fireproof().rarity(Rarity.UNCOMMON))); // レアリティ設定

    // エンチャントされたリンゴ
    public static final Item ENCHANTED_COPPER_APPLE = registerItem("enchanted_copper_apple",
            new GlintItem(new Item.Settings().food(ModFoodComponents.ENCHANTED_COPPER_APPLE_FOOD_COMPONENT).rarity(Rarity.UNCOMMON))); // レアリティ設定

    public static final Item MORE_ENCHANTED_COPPER_APPLE = registerItem("more_enchanted_copper_apple",
            new GlintItem(new Item.Settings().food(ModFoodComponents.MORE_ENCHANTED_COPPER_APPLE_FOOD_COMPONENT).rarity(Rarity.RARE))); // レアリティ設定

    public static final Item ENCHANTED_IRON_APPLE = registerItem("enchanted_iron_apple",
            new GlintItem(new Item.Settings().food(ModFoodComponents.ENCHANTED_IRON_APPLE_FOOD_COMPONENT).rarity(Rarity.RARE))); // レアリティ設定

    public static final Item ENCHANTED_REDSTONE_APPLE = registerItem("enchanted_redstone_apple",
            new GlintItem(new Item.Settings().food(ModFoodComponents.ENCHANTED_REDSTONE_APPLE_FOOD_COMPONENT).rarity(Rarity.RARE))); // レアリティ設定

    public static final Item ENCHANTED_DIAMOND_APPLE = registerItem("enchanted_diamond_apple",
            new GlintItem(new Item.Settings().food(ModFoodComponents.ENCHANTED_DIAMOND_APPLE_FOOD_COMPONENT).rarity(Rarity.RARE))); // レアリティ設定

    public static final Item ENCHANTED_NETHERITE_APPLE = registerItem("enchanted_netherite_apple",
            new GlintItem(new Item.Settings().food(ModFoodComponents.ENCHANTED_NETHERITE_APPLE_FOOD_COMPONENT).fireproof().rarity(Rarity.RARE))); // レアリティ設定

    // 特殊なリンゴ、アイテム
    public static final Item WITHER_APPLE = registerItem("wither_apple",
            new Item(new Item.Settings().food(ModFoodComponents.WITHER_APPLE_FOOD_COMPONENT).rarity(Rarity.UNCOMMON))); // レアリティ設定

    public static final Item ANCIENT_APPLE = registerItem("ancient_apple",
            new GlintItem(new Item.Settings().food(ModFoodComponents.ANCIENT_APPLE_FOOD_COMPONENT).fireproof().rarity(Rarity.EPIC))); //

    public static final Item ANCIENT_INGOT = registerItem("ancient_ingot",
            new GlintItem(new Item.Settings().fireproof().rarity(Rarity.RARE))); // レアリティ設定



    static {

        APPLES.put("copper_apple", COPPER_APPLE);
        APPLES.put("iron_apple", IRON_APPLE);
        APPLES.put("amethyst_apple", AMETHYST_APPLE);
        APPLES.put("prismarine_apple", PRISMARINE_APPLE);
        APPLES.put("redstone_apple", REDSTONE_APPLE);
        APPLES.put("diamond_apple", DIAMOND_APPLE);
        APPLES.put("netherite_apple", NETHERITE_APPLE);

        APPLES.put("enchanted_copper_apple", ENCHANTED_COPPER_APPLE);
        APPLES.put("more_enchanted_copper_apple", MORE_ENCHANTED_COPPER_APPLE);
        APPLES.put("enchanted_iron_apple", ENCHANTED_IRON_APPLE);
        APPLES.put("enchanted_redstone_apple", ENCHANTED_REDSTONE_APPLE);
        APPLES.put("enchanted_diamond_apple", ENCHANTED_DIAMOND_APPLE);
        APPLES.put("enchanted_netherite_apple", ENCHANTED_NETHERITE_APPLE);

        APPLES.put("wither_apple", WITHER_APPLE);
        APPLES.put("ancient_apple", ANCIENT_APPLE);
        APPLES.put("ancient_ingot", ANCIENT_INGOT);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TooManyApples.MOD_ID, name), item);
    }

    public static void registerApples() {
        LOGGER.info("Registering apples");
    }

}
