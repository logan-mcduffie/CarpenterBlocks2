package net.lightbringer.carpentersblocks2.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static FoodComponent BLUEBERRIES = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).build();
    public static FoodComponent BLUEBERRY_PIE = new FoodComponent.Builder().hunger(10).saturationModifier(0.5F).build();

}
