package net.exxude.phylactery.item;

import net.exxude.phylactery.Phylactery;
import net.exxude.phylactery.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup PhylacteryItems = FabricItemGroupBuilder.build(
            new Identifier(Phylactery.MOD_ID, "phylactery_items"), () -> new ItemStack(ModItems.CRYSTAL_PRISMARINE));
    public static final ItemGroup PhylacteryBlocks = FabricItemGroupBuilder.build(
            new Identifier(Phylactery.MOD_ID, "phylactery_blocks"), () -> new ItemStack(ModBlocks.DARK_SOIL));

}
