package net.hippo.randompots.block.custom;

import com.mojang.serialization.MapCodec;
import net.hippo.randompots.block.entity.FlowerPotBlockEntity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public abstract class AbstractFlowerPotBlock
        extends BlockWithEntity {

    public AbstractFlowerPotBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    protected abstract MapCodec<? extends AbstractFlowerPotBlock> getCodec();

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new FlowerPotBlockEntity(pos, state);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState();
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (world.isClient) {
        }
    }

    public abstract float getRotationDegrees(BlockState state);
}