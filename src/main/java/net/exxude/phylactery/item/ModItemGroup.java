package net.exxude.phylactery.item;

import net.exxude.phylactery.Phylactery;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ApothecaryItems = FabricItemGroupBuilder.build(
            new Identifier(Phylactery.MOD_ID, "apothecary_items"), () -> new ItemStack(ModItems.DARK_SOIL));
}
