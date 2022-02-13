package Epicjii.steampunker.datagen;

import Epicjii.steampunker.SteamPunker;
import Epicjii.steampunker.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SteamItemModels extends ItemModelProvider {

    public SteamItemModels(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, SteamPunker.MODID, helper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.Boiler_Item.get().getRegistryName().getPath(), modLoc("block/boiler"));
        withExistingParent(Registration.Pump_Item.get().getRegistryName().getPath(), modLoc("block/pump"));
        withExistingParent(Registration.Pipe_Item.get().getRegistryName().getPath(), modLoc("block/pipe"));
    }
}
