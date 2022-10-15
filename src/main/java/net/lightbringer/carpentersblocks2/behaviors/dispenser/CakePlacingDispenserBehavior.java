package net.lightbringer.carpentersblocks2.behaviors.dispenser;

import net.minecraft.block.Blocks;
import net.minecraft.block.dispenser.ItemDispenserBehavior;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraft.block.DispenserBlock;


public class CakePlacingDispenserBehavior extends ItemDispenserBehavior {
    public CakePlacingDispenserBehavior() {
    }

    @Override
    public ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
        World world = pointer.getWorld();
        Position position = DispenserBlock.getOutputLocation(pointer);
        Direction direction = (Direction)pointer.getBlockState().get(DispenserBlock.FACING);
        this.placeCake(world, position, direction);
        stack.decrement(1);
        return stack;
    }
    
    private void placeCake(World world, Position position, Direction direction) {
        // This is the method that actually places the cake, so you can use this to get the position of the cake, and then use that to place the block
        BlockPos blockPos = new BlockPos(position.getX(), position.getY(), position.getZ());
        world.setBlockState(blockPos, Blocks.CAKE.getDefaultState());
    }
}

