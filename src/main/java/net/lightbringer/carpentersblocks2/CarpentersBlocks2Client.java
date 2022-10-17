package net.lightbringer.carpentersblocks2;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.lightbringer.carpentersblocks2.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class CarpentersBlocks2Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_BLOSSOM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_BLOSSOM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHOCOLATE_CAKE, RenderLayer.getCutout());
    }
}
