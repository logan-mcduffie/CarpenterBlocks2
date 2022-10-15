package net.lightbringer.carpentersblocks2;

import net.fabricmc.api.ModInitializer;
import net.lightbringer.carpentersblocks2.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.lightbringer.carpentersblocks2.item.ModItems;

public class CarpentersBlocks2 implements ModInitializer {
	public static final String MOD_ID = "carpentersblocks2";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
