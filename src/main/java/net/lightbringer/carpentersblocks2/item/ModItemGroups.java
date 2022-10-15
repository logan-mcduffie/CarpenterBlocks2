package net.lightbringer.carpentersblocks2.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.lightbringer.carpentersblocks2.CarpentersBlocks2;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ORICHALCUM = FabricItemGroupBuilder.build(new Identifier(CarpentersBlocks2.MOD_ID, "orichalcum"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));
}
