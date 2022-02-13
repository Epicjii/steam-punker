package Epicjii.steampunker.datagen;

import Epicjii.steampunker.SteamPunker;
import Epicjii.steampunker.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class SteamBlockTags extends BlockTagsProvider {

    public SteamBlockTags(DataGenerator pGenerator, @Nullable ExistingFileHelper helper) {
        super(pGenerator, SteamPunker.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.Boiler.get())
                .add(Registration.Pump.get())
                .add(Registration.Pipe.get());
    }

    @Override
    public String getName() {
        return "Steampunker tags";
    }

}
