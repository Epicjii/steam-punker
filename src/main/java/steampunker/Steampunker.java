package steampunker;

import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


@Mod("steampunker")
public class Steampunker {
    public Steampunker() {
        DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS,"steampunker");
        DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, "steampunker");
        DeferredRegister<Fluid> Fluids = DeferredRegister.create(ForgeRegistries.FLUIDS, "steampunker");
    }
}