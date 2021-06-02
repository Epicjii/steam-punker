package net.Epicjii.steampunker.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> WRENCH = Registration.ITEMS.register("wrench", () ->
            new Item(new Item.Properties().setNoRepair().group(ItemGroup.TOOLS)));

    public static final RegistryObject<Item> STEEL_INGOT = Registration.ITEMS.register("steel_ingot", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    static void register() {
    }
}
