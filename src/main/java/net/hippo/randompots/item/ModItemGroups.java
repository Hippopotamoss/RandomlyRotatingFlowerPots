package net.hippo.randompots.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hippo.randompots.RandomlyRotatingFlowerPots;
import net.hippo.randompots.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup POT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RandomlyRotatingFlowerPots.MOD_ID, "pot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pot"))
                    .icon(() -> new ItemStack(ModBlocks.FlowerPotBlock)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FlowerPotBlock);
                    }).build());
    public static void registerItemGroups(){
        RandomlyRotatingFlowerPots.LOGGER.info("Registering Item Groups for " + RandomlyRotatingFlowerPots.MOD_ID);
    }
}
