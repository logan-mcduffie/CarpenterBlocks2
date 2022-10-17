package net.lightbringer.carpentersblocks2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lightbringer.carpentersblocks2.CarpentersBlocks2;
import net.lightbringer.carpentersblocks2.block.custom.OrichalcumLampBlock;
import net.lightbringer.carpentersblocks2.block.custom.SpeedyBlock;
import net.lightbringer.carpentersblocks2.item.ModItemGroups;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.ORICHALCUM);

    public static final Block ORICHALCUM_ORE = registerBlock("orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORICHALCUM);

    public static final Block DEEPSLATE_ORICHALCUM_ORE = registerBlock("deepslate_orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()), ModItemGroups.ORICHALCUM);

    public static final Block RAW_ORICHALCUM_BLOCK = registerBlock("raw_orichalcum_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroups.ORICHALCUM);

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroups.ORICHALCUM);

    public static final Block ORICHALCUM_STAIRS = registerBlock("orichalcum_stairs",
            new StairsBlock(ModBlocks.ORICHALCUM_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroups.ORICHALCUM);

    public static final Block ORICHALCUM_SLAB = registerBlock("orichalcum_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroups.ORICHALCUM);

    public static final Block ORICHALCUM_BUTTON = registerBlock("orichalcum_button",
            new StoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroups.ORICHALCUM);

    public static final Block ORICHALCUM_PRESSURE_PLATE = registerBlock("orichalcum_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroups.ORICHALCUM);

    public static final Block ORICHALCUM_FENCE = registerBlock("orichalcum_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroups.ORICHALCUM);

    public static final Block ORICHALCUM_FENCE_GATE = registerBlock("orichalcum_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroups.ORICHALCUM);

    public static final Block ORICHALCUM_WALL = registerBlock("orichalcum_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroups.ORICHALCUM);

    public static final Block CHERRY_BLOSSOM_DOOR = registerBlock("cherry_blossom_door",
            new DoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().nonOpaque()), ModItemGroups.ORICHALCUM);

    public static final Block CHERRY_BLOSSOM_TRAPDOOR = registerBlock("cherry_blossom_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().nonOpaque()), ModItemGroups.ORICHALCUM);

    public static final Block ORICHALCUM_LAMP = registerBlock("orichalcum_lamp",
            new OrichalcumLampBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()
                    .luminance((state) -> state.get(OrichalcumLampBlock.LIT) ? 15 : 0)), ModItemGroups.ORICHALCUM);

    public static final Block CHOCOLATE_CAKE = registerBlock("chocolate_cake",
            new CakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f).sounds(BlockSoundGroup.WOOL).nonOpaque()), ModItemGroups.ORICHALCUM);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(CarpentersBlocks2.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(CarpentersBlocks2.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering mod blocks for " + CarpentersBlocks2.MOD_ID);
    }
}
