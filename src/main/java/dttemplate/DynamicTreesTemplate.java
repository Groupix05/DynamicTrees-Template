package dttemplate;

import com.dtteam.dynamictrees.registry.NeoForgeRegistryLoader;
import com.dtteam.dynamictrees.treepack.Resources;
import com.dtteam.dynamictrees.event.handler.OptionalHandlers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod(DynamicTreesTemplate.MOD_ID)
public final class DynamicTreesTemplate {

    public static final String MOD_ID = "dttemplate";
    public static IEventBus MOD_EVENT_BUS;

    public DynamicTreesTemplate(IEventBus eventBus, ModContainer container) {
        MOD_EVENT_BUS = eventBus;

        eventBus.addListener(this::gatherData);
        MOD_EVENT_BUS = null;
    }

    private void gatherData(final GatherDataEvent event) {
        Resources.MANAGER.gatherData();
    }

}
