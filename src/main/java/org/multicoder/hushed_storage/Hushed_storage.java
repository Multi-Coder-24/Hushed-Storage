package org.multicoder.hushed_storage;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.*;
import net.neoforged.fml.common.*;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.multicoder.hushed_storage.core.HushedStorageBlockEntities;
import org.multicoder.hushed_storage.core.HushedStorageBlocks;
import org.multicoder.hushed_storage.core.HushedStorageItems;
import org.slf4j.Logger;

@Mod(Hushed_storage.MODID)
public class Hushed_storage {
    public static final String MODID = "hushed_storage";
    private static final Logger LOG = LogUtils.getLogger();

    public Hushed_storage(IEventBus modEventBus)
    {
        LOG.info("Hushed Storage Loading");
        HushedStorageBlocks.BLOCKS.register(modEventBus);
        HushedStorageItems.ITEMS.register(modEventBus);
        HushedStorageBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        modEventBus.addListener(this::addCreative);
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey().equals(CreativeModeTabs.BUILDING_BLOCKS))
        {
            HushedStorageBlocks.BLOCKS.getEntries().forEach(blockEntry -> event.accept(blockEntry.value()));
        }
    }
}
