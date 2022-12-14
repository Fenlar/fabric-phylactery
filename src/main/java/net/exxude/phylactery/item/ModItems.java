package net.exxude.phylactery.item;

import net.exxude.phylactery.Phylactery;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item CRYSTAL_PRISMARINE = registerItem("crystal_prismarine",
            new Item(new FabricItemSettings().group(ModItemGroup.PhylacteryItems)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Phylactery.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Phylactery.LOGGER.debug("Registering Mod Items for " + Phylactery.MOD_ID);
    }
}
