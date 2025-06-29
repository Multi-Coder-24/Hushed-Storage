package org.multicoder.hushed_storage.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.multicoder.hushed_storage.Hushed_storage;

public class HushedStorageItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, Hushed_storage.MODID);
}
