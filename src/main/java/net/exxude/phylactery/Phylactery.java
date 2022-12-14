package net.exxude.phylactery;

import net.exxude.phylactery.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Phylactery implements ModInitializer {

    public static final String MOD_ID = "phylactery";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
