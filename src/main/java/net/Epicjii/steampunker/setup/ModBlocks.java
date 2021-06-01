package net.Epicjii.steampunker.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> PIPE = registerBuildingBlockItem(
            "pipe",
            () -> new Block(
                    AbstractBlock.Properties.of(Material.METAL)
                            .harvestTool(ToolType.PICKAXE)
                            .requiresCorrectToolForDrops()
                            .harvestLevel(2)
                            .sound(SoundType.METAL)
            ));

    static void register() {
    }

    private static <Type_Block extends Block> RegistryObject<Type_Block> registerBlock(
            String name, Supplier<Type_Block> block
    ) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <Type_Block extends Block> RegistryObject<Type_Block> registerMiscBlockItem(
            String name, Supplier<Type_Block> block
    ) {
        RegistryObject<Type_Block> reg_Block = registerBlock(name, block);
        Registration.ITEMS.register(
                name,
                () -> new BlockItem(reg_Block.get(), new Item.Properties().tab(ItemGroup.TAB_MISC))
        );
        return reg_Block;
    }

    private static <Type_Block extends Block> RegistryObject<Type_Block> registerBuildingBlockItem(
            String name, Supplier<Type_Block> block
    ) {
        RegistryObject<Type_Block> reg_Block = registerBlock(name, block);
        Registration.ITEMS.register(
                name,
                () -> new BlockItem(reg_Block.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS))
        );
        return reg_Block;
    }
}
