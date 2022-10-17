package net.lightbringer.carpentersblocks2.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.lightbringer.carpentersblocks2.CarpentersBlocks2;
import net.lightbringer.carpentersblocks2.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }
    private static void registerFuels() {
        System.out.println("Registering Fuels for " + CarpentersBlocks2.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.COAL_SLIVER, 400);
    }
}
