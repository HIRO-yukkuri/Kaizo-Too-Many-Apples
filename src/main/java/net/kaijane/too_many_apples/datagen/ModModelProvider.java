package net.kaijane.too_many_apples.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kaijane.too_many_apples.item.Apples;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models; // Modelsクラスは引き続き使用
import net.minecraft.item.Item;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // ブロックのモデルは生成しないため、このメソッドは空のままです。
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Apples.APPLESマップに登録されているすべてのリンゴアイテムのモデルを生成します。
        for (Item appleItem : Apples.APPLES.values()) {
            // エンチャントされたリンゴは、対応する通常のリンゴのテクスチャを使い回します。
            // Models.GENERATED は、アイテムのIDに基づいてテクスチャを自動的に探します。
            // ここで、エンチャントされたリンゴに対して、そのベースとなる通常リンゴのアイテムを
            // 第2引数として渡すことで、そのベースアイテムのテクスチャが使われるようにします。
            // これが元のコードの ENCHANTED_DIAMOND_APPLE のロジックの意図と合致します。
            if (appleItem.equals(Apples.ENCHANTED_COPPER_APPLE)) {
                itemModelGenerator.register(appleItem, Apples.COPPER_APPLE, Models.GENERATED);
            } else if (appleItem.equals(Apples.ENCHANTED_IRON_APPLE)) {
                itemModelGenerator.register(appleItem, Apples.IRON_APPLE, Models.GENERATED);
            } else if (appleItem.equals(Apples.ENCHANTED_REDSTONE_APPLE)) {
                itemModelGenerator.register(appleItem, Apples.REDSTONE_APPLE, Models.GENERATED);
            } else if (appleItem.equals(Apples.ENCHANTED_DIAMOND_APPLE)) {
                itemModelGenerator.register(appleItem, Apples.DIAMOND_APPLE, Models.GENERATED);
            } else if (appleItem.equals(Apples.ENCHANTED_NETHERITE_APPLE)) {
                itemModelGenerator.register(appleItem, Apples.NETHERITE_APPLE, Models.GENERATED);
            }
            // その他のリンゴ（通常のリンゴ、衰弱のリンゴ、古代のリンゴ）は、自身のIDに基づいてテクスチャを使用します。
            else {
                itemModelGenerator.register(appleItem, Models.GENERATED);
            }
        }
    }
}
