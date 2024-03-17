package net.hippo.randompots;

import net.fabricmc.api.ModInitializer;

import net.hippo.randompots.block.ModBlocks;
import net.hippo.randompots.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomlyRotatingFlowerPots implements ModInitializer {
	public static final String MOD_ID = "randomlyrotatingflowerpots";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}