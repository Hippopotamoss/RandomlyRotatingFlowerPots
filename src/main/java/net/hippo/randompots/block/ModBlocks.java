package net.hippo.randompots.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hippo.randompots.RandomlyRotatingFlowerPots;
import net.hippo.randompots.block.custom.FlowerPotBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block FlowerPotBlock = registerBlock("flower_pot",
            new FlowerPotBlock(FabricBlockSettings.copyOf(Blocks.FLOWER_POT)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RandomlyRotatingFlowerPots.MOD_ID, name), block);
    }
    private static  Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RandomlyRotatingFlowerPots.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        RandomlyRotatingFlowerPots.LOGGER.info("Registering ModBlocks for " + RandomlyRotatingFlowerPots.MOD_ID);
    }
}
