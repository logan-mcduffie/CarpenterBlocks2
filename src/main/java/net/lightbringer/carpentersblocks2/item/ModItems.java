package net.lightbringer.carpentersblocks2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lightbringer.carpentersblocks2.CarpentersBlocks2;
import net.lightbringer.carpentersblocks2.item.custom.DowsingRodItem;
import net.lightbringer.carpentersblocks2.item.custom.ModArmorItem;
import net.lightbringer.carpentersblocks2.item.custom.ModPaxelItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
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

    public static final Item COAL_SLIVER = registerItem("coal_sliver",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    public static final Item ORICHALCUM_PICKAXE = registerItem("orichalcum_pickaxe",
            new PickaxeItem(ModToolMaterials.ORICHALCUM, 2, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).group(ModItemGroups.ORICHALCUM)));

    public static final Item ORICHALCUM_AXE = registerItem("orichalcum_axe",
            new AxeItem(ModToolMaterials.ORICHALCUM, 8, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).group(ModItemGroups.ORICHALCUM)));

    public static final Item ORICHALCUM_HOE = registerItem("orichalcum_hoe",
            new HoeItem(ModToolMaterials.ORICHALCUM, 0, -1f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).group(ModItemGroups.ORICHALCUM)));

    public static final Item ORICHALCUM_SHOVEL = registerItem("orichalcum_shovel",
            new ShovelItem(ModToolMaterials.ORICHALCUM, 2, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).group(ModItemGroups.ORICHALCUM)));

    public static final Item ORICHALCUM_SWORD = registerItem("orichalcum_sword",
            new SwordItem(ModToolMaterials.ORICHALCUM, 6, -2.4f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).group(ModItemGroups.ORICHALCUM)));

    public static final Item ORICHALCUM_PAXEL = registerItem("orichalcum_paxel",
            new ModPaxelItem(ModToolMaterials.ORICHALCUM, 8, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).group(ModItemGroups.ORICHALCUM)));

    public static final Item ORICHALCUM_HELMET = registerItem("orichalcum_helmet",
            new ModArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT).group(ModItemGroups.ORICHALCUM)));

    public static final Item ORICHALCUM_CHESTPLATE = registerItem("orichalcum_chestplate",
            new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT).group(ModItemGroups.ORICHALCUM)));

    public static final Item ORICHALCUM_LEGGINGS = registerItem("orichalcum_leggings",
            new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT).group(ModItemGroups.ORICHALCUM)));

    public static final Item ORICHALCUM_BOOTS = registerItem("orichalcum_boots",
            new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT).group(ModItemGroups.ORICHALCUM)));

    public static final Item ORICHALCUM_HORSE_ARMOR = registerItem("orichalcum_horse_armor",
            new HorseArmorItem(15, "orichalcum",
                    new FabricItemSettings().group(ItemGroup.COMBAT).group(ModItemGroups.ORICHALCUM)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CarpentersBlocks2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering mod items for " + CarpentersBlocks2.MOD_ID);
    }
}
