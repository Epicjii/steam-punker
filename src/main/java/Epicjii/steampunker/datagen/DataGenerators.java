package Epicjii.steampunker.datagen;

import Epicjii.steampunker.SteamPunker;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = SteamPunker.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {

        }
        if (event.includeClient()) {
            generator.addProvider(new SteamBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new SteamItemModels(generator, event.getExistingFileHelper()));
        }

    }
}
