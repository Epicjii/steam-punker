package Epicjii.steampunker.setup;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static Epicjii.steampunker.SteamPunker.MODID;

public class Registration {

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);
    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.METAL).strength(5);

    //registration
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, MODID);

    //blocks
    public static final RegistryObject<Block> Pump = BLOCKS.register("water_pump", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Block> Boiler = BLOCKS.register("boiler", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Block> Pipe = BLOCKS.register("pipe", () -> new Block(BLOCK_PROPERTIES));

    //items
    public static final RegistryObject<Item> Pump_Item = fromBlock(Pump);
    public static final RegistryObject<Item> Boiler_Item = fromBlock(Boiler);
    public static final RegistryObject<Item> Pipe_Item = fromBlock(Pipe);


    //block -> item
    private static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        FLUIDS.register(bus);
    }
}
