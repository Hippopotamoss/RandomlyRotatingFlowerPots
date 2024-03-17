package net.hippo.randompots.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

public class FlowerPotBlockEntity
    extends BlockEntity {
    public FlowerPotBlockEntity(BlockPos pos, BlockState state) {
        this((BlockEntityType) BlockEntityType.SKULL, pos, state);
    }

    public FlowerPotBlockEntity(BlockEntityType blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
    }
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
    }
    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return this.createNbt();
    }
}