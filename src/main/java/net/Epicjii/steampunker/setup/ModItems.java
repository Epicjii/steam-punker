package net.Epicjii.steampunker.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> WRENCH = Registration.ITEMS.register("wrench", () ->
            new Item(new Item.Properties().setNoRepair().tab(ItemGroup.TAB_TOOLS)));

    static void register() {
    }
}
