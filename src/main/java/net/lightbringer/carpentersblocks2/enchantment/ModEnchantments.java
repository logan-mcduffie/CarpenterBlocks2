package net.lightbringer.carpentersblocks2.enchantment;

import net.lightbringer.carpentersblocks2.CarpentersBlocks2;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {

    public static Enchantment LIGHTNING_STRIKER = register("lightning_striker",
            new LightningStrikerEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(CarpentersBlocks2.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering ModEnchantments for " + CarpentersBlocks2.MOD_ID);
    }
}
