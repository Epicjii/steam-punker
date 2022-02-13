package Epicjii.steampunker.datagen;

import Epicjii.steampunker.SteamPunker;
import Epicjii.steampunker.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SteamBlockStates extends BlockStateProvider {

    public SteamBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, SteamPunker.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.Pump.get());
        simpleBlock(Registration.Boiler.get());
        simpleBlock(Registration.Pipe.get());
    }
}
