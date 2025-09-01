package net.kaijane.too_many_apples.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    // 銅のリンゴ
    public static final FoodComponent COPPER_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2, 5), 1.0f) // 再生6 2tick
            .snack()
            .alwaysEdible()
            .build();

    // エンチャントされた銅のリンゴ
    public static final FoodComponent ENCHANTED_COPPER_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.9f)
            .snack()
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3, 5), 1.0f) // 再生6 3tick
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 1), 1.0f)
            .build();

    // エンチャントしまくった銅のリンゴ
    public static final FoodComponent MORE_ENCHANTED_COPPER_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(1.2f)
            .snack()
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3, 5), 1.0f) // 再生6 3tick
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 2, 2), 1.0f)
            .build();

    // 鉄のリンゴ
    public static final FoodComponent IRON_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.9f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 60 * 3, 0), 1.0f) // 耐性1 3:00
            .build();

    // エンチャントされた鉄のリンゴ
    public static final FoodComponent ENCHANTED_IRON_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(1.0f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 60 * 5, 2), 1.0f) // 耐性3 5:00
            .build();

    // アメジストのリンゴ
    public static final FoodComponent AMETHYST_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.9f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20 * 60 * 3, 0), 1.0f) // 暗視 3:00
            .build();

    // プリズマリンのリンゴ
    public static final FoodComponent PRISMARINE_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.9f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 20 * 60 * 5, 0), 1.0f) // 水中呼吸 5:00
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 20 * 60 * 5, 1), 1.0f) // イルカの好意2 5:00
            .build();

    // レッドストーンのリンゴ
    public static final FoodComponent REDSTONE_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.9f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20 * 60 * 3, 0), 1.0f) // 採掘速度上昇1 3:00
            .build();

    // エンチャントされたレッドストーンのリンゴ
    public static final FoodComponent ENCHANTED_REDSTONE_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(1.0f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20 * 60 * 8, 4), 1.0f) // 採掘速度上昇5 8:00
            .build();

    // ダイヤモンドのリンゴ
    public static final FoodComponent DIAMOND_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.9f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 10, 2), 1.0f) // 再生3 0:10
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 60 * 5, 1), 1.0f) // 移動速度上昇2 5:00
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20 * 60 * 5, 1), 1.0f) // 跳躍力上昇2 5:00
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 60 * 5, 0), 1.0f) // 攻撃力上昇1 5:00
            .build();

    // エンチャントされたダイヤモンドのリンゴ
    public static final FoodComponent ENCHANTED_DIAMOND_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(1.0f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 30, 2), 1.0f) // 再生3 0:30
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 60 * 8, 6), 1.0f) // 移動速度上昇7 8:00
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20 * 60 * 8, 4), 1.0f) // 跳躍力上昇4 8:00
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 60 * 8, 1), 1.0f) // 攻撃力上昇2 8:00
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 60 * 3, 0), 1.0f) // 耐性2 3:00
            .build();

    // ネザライトのリンゴ
    public static final FoodComponent NETHERITE_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.9f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 60 * 8, 2), 1.0f) // 耐性3 8:00
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 60 * 8, 3), 1.0f) // 攻撃力上昇4 8:00
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 60 * 8, 0), 1.0f) // 火炎耐性 8:00
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20 * 60 * 8, 1), 1.0f) // 体力増強2 8:00
            .build();

    // エンチャントされたネザライトのリンゴ
    public static final FoodComponent ENCHANTED_NETHERITE_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(1.0f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 60 * 10, 3), 1.0f) // 耐性4 10:00
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 60 * 10, 5), 1.0f) // 攻撃力上昇6 10:00
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 60 * 10, 0), 1.0f) // 火炎耐性 10:00
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20 * 60 * 10, 4), 1.0f) // 体力増強5 10:00
            .build();

    // 衰弱のリンゴ (ID: wither_apple)
    public static final FoodComponent WITHER_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(5)
            .alwaysEdible()
            .saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20 * 30, 1), 1.0f) // 衰弱2 0:30
            .build();

    // 古代のリンゴ
    public static final FoodComponent ANCIENT_APPLE_FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(5)
            .saturationModifier(1.0f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 60 * 3, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 60 * 3, 5), 1.0f) // 再生6 3:00
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 60 * 3, 99), 1.0f) // 攻撃力上昇100 3:00
            .build();
}