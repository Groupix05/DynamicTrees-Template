package dttemplate;

import com.dtteam.dynamictrees.api.registry.RegistryHandler;
import com.dtteam.dynamictrees.DynamicTreesNeoForge;
import com.dtteam.dynamictrees.treepack.Resources;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod(DynamicTreesTemplate.MOD_ID)
public final class DynamicTreesTemplate {

    public static final String MOD_ID = "dttemplate";

    public DynamicTreesTemplate(IEventBus eventBus, ModContainer container) {
        DynamicTreesNeoForge.MOD_EVENT_BUS = eventBus;

        eventBus.addListener(this::gatherData);

        RegistryHandler.setup(MOD_ID);

        //Do not use this mod event bus outside this constructor.
        DynamicTreesNeoForge.MOD_EVENT_BUS = null;
    }

    private void gatherData(final GatherDataEvent event) {
        Resources.MANAGER.gatherData();
    }

}
