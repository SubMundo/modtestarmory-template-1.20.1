package net.kendy.modtestarmory;

import net.fabricmc.api.ModInitializer;

import net.kendy.modtestarmory.item.ModItems;
import net.kendy.modtestarmory.item.Moditemgroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Modtestarmory implements ModInitializer {
	public static final String MOD_ID = "modtestarmory";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Moditemgroups.registerItemGroups();

		ModItems.registerModItems();
	}
}