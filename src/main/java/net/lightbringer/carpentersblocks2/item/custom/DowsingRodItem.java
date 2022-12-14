package net.lightbringer.carpentersblocks2.item.custom;

import net.lightbringer.carpentersblocks2.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DowsingRodItem extends Item {
    public DowsingRodItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if(!user.world.isClient()) {
            ServerWorld world = (ServerWorld) user.world;
            BlockPos position = entity.getBlockPos();

            EntityType.LIGHTNING_BOLT.spawn(world, null, null, user, position,
                    SpawnReason.TRIGGERED, true, true);
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY(); i++) {
                BlockState stateBelow = context.getWorld().getBlockState(positionClicked.down(i));
                Block blockBelow = stateBelow.getBlock();

                if(isValuableBlock(stateBelow)) {
                    outputValuableCoordinates(positionClicked.add(0, -i, 0), player, blockBelow);
                    foundBlock = true;
                    break;
                }
            }

            if(!foundBlock) {
                player.sendMessage(new TranslatableText("item.carpentersblocks2.dowsing_rod.no_valuables"), false);
            }
        }

        context.getStack().damage(1, context.getPlayer(),
                (player) -> player.sendToolBreakStatus(player.getActiveHand()));

        return super.useOnBlock(context);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.carpentersblocks2.dowsing_rode.tooltip.shift"));
        } else {
            tooltip.add(new TranslatableText("item.carpentersblocks2.dowsing_rode.tooltip"));
        }
    }

    private void outputValuableCoordinates(BlockPos blockPos, PlayerEntity player, Block blockBelow) {
        player.sendMessage(new LiteralText("Found " + blockBelow.asItem().getName().getString() + " at " +
                "(" + blockPos.getX() + ", " + blockPos.getY() + "," + blockPos.getZ() + ")"), false);
    }

    private boolean isValuableBlock(BlockState block) {
        return block.isIn(ModTags.Blocks.DOWSING_ROD_DETECTABLE_BLOCKS);
    }
}
