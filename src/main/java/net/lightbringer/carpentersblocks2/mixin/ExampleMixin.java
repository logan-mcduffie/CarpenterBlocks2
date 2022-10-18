package net.lightbringer.carpentersblocks2.mixin;

import net.lightbringer.carpentersblocks2.behaviors.dispenser.CakePlacingDispenserBehavior;
import net.lightbringer.carpentersblocks2.block.ModBlocks;
import net.lightbringer.carpentersblocks2.item.ModItems;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.DispenserBehavior;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DispenserBehavior.class)
public interface ExampleMixin {
	@Inject(at = @At("HEAD"), method = "registerDefaults")
	private static void carpentersblocks2$registerDefaults(CallbackInfo info) {
		DispenserBlock.registerBehavior(Items.CAKE, new CakePlacingDispenserBehavior());
		DispenserBlock.registerBehavior(ModBlocks.CHOCOLATE_CAKE.asItem(), new CakePlacingDispenserBehavior());
	}
}
