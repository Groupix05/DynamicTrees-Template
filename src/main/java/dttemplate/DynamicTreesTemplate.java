package dttemplate;

import com.ferreusveritas.dynamictrees.api.GatherDataHelper;
import com.ferreusveritas.dynamictrees.api.registry.RegistryHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.data.event.GatherDataEvent;

@Mod(DynamicTreesTemplate.MOD_ID)
public final class DynamicTreesTemplate {

    public static final String MOD_ID = "dttemplate";

    public DynamicTreesTemplate() {
        RegistryHandler.setup(MOD_ID);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::gatherData);
    }

    private void gatherData(final GatherDataEvent event) {
        GatherDataHelper.gatherTagData(MOD_ID, event);
        GatherDataHelper.gatherLootData(MOD_ID, event);
    }

}
