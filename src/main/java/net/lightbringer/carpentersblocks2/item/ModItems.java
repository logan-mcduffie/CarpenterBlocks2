package net.lightbringer.carpentersblocks2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lightbringer.carpentersblocks2.CarpentersBlocks2;
import net.lightbringer.carpentersblocks2.item.custom.DowsingRodItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.ORICHALCUM)));
    public static final Item ORICHALCUM_NUGGET = registerItem("orichalcum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.ORICHALCUM)));
    public static final Item RAW_ORICHALCUM = registerItem("raw_orichalcum",
            new Item(new FabricItemSettings().group(ModItemGroups.ORICHALCUM)));
    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroups.ORICHALCUM).maxDamage(32)));
    public static final Item BLUEBERRIES = registerItem("blueberries",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BLUEBERRIES)));
    public static final Item BLUEBERRY_PIE = registerItem("blueberry_pie",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BLUEBERRY_PIE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CarpentersBlocks2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering mod items for " + CarpentersBlocks2.MOD_ID);
    }
}
