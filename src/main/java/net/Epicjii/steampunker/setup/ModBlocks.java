package net.Epicjii.steampunker.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> STEEL_BLOCK = registerBuildingBlockItem("block_of_steel", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(6.0f,1200.0f)));

    public static final RegistryObject<Block> PIPE = registerBlock("pipe",() ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL).noDrops().zeroHardnessAndResistance()));

    static void register() {
    }

    private static <Type_Block extends Block> RegistryObject<Type_Block> registerBlock
            (String name, Supplier<Type_Block> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <Type_Block extends Block> RegistryObject<Type_Block> registerMiscBlockItem
            (String name, Supplier<Type_Block> block) {
        RegistryObject<Type_Block> reg_Block = registerBlock(name, block);
        Registration.ITEMS.register(
                name,
                () -> new BlockItem(reg_Block.get(), new Item.Properties().group(ItemGroup.MISC))
        );
        return reg_Block;
    }

    private static <Type_Block extends Block> RegistryObject<Type_Block> registerBuildingBlockItem
            (String name, Supplier<Type_Block> block) {
        RegistryObject<Type_Block> reg_Block = registerBlock(name, block);
        Registration.ITEMS.register(
                name,
                () -> new BlockItem(reg_Block.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS))
        );
        return reg_Block;
    }
}
