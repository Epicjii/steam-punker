package net.Epicjii.steampunker.setup;

import it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    static void register() {}

    private static <Type_Block extends Block> RegistryObject<Type_Block> registerNoItem(String name, Supplier<Type_Block> block) {
       return Registration.BLOCKS.register(name, block);
    }

    private static <Type_Block extends Block> RegistryObject<Type_Block> register(String name, Supplier<Type_Block> block) {
        RegistryObject<Type_Block> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(ItemGroup.TAB_MISC)));
        return ret;
    }
}
