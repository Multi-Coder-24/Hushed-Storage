package org.multicoder.hushed_storage;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.*;
import net.neoforged.fml.common.*;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.multicoder.hushed_storage.core.HushedStorageBlockEntities;
import org.multicoder.hushed_storage.core.HushedStorageBlocks;
import org.multicoder.hushed_storage.core.HushedStorageItems;
import org.slf4j.Logger;

@Mod(Hushed_storage.MODID)
public class Hushed_storage {
    public static final String MODID = "hushed_storage";
    private static final Logger LOG = LogUtils.getLogger();
    public static DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final DeferredHolder<CreativeModeTab,CreativeModeTab> HUSHED_TAB = TABS.register("hushed_blocks",() -> CreativeModeTab.builder().title(Component.translatable("tab.hushed_storage.hushed_blocks")).icon(() -> new ItemStack(Blocks.BLACK_CONCRETE)).build());

    public Hushed_storage(IEventBus modEventBus)
    {
        LOG.info("Hushed Storage Loading");
        HushedStorageBlocks.BLOCKS.register(modEventBus);
        HushedStorageItems.ITEMS.register(modEventBus);
        HushedStorageBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        Hushed_storage.TABS.register(modEventBus);
        modEventBus.addListener(this::addCreative);
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab().equals(Hushed_storage.HUSHED_TAB.value()))
        {
            HushedStorageBlocks.BLOCKS.getEntries().forEach(blockEntry -> event.accept(blockEntry.value()));
        }
    }
}
