package org.multicoder.hushed_storage.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.*;
import org.multicoder.hushed_storage.Hushed_storage;
import org.multicoder.hushed_storage.block.entity.BaseHushedBlockEntity;
import java.util.Set;

public class HushedStorageBlockEntities
{
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, Hushed_storage.MODID);

    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<?>> BASE_BLOCK_ENTITY = HUSHED_STORAGE_BLOCK_ENTITY("hushed_block_entity");

    public static DeferredHolder<BlockEntityType<?>,BlockEntityType<?>> HUSHED_STORAGE_BLOCK_ENTITY(String name)
    {
        return BLOCK_ENTITIES.register(name,() -> new BlockEntityType<>(BaseHushedBlockEntity::new,Set.of(
                HushedStorageBlocks.HUSHED_WHITE_WOOL.value(),
                HushedStorageBlocks.HUSHED_ORANGE_WOOL.value(),
                HushedStorageBlocks.HUSHED_MAGENTA_WOOL.value(),
                HushedStorageBlocks.HUSHED_YELLOW_WOOL.value(),
                HushedStorageBlocks.HUSHED_LIGHT_BLUE_WOOL.value(),
                HushedStorageBlocks.HUSHED_LIME_WOOL.value(),
                HushedStorageBlocks.HUSHED_PINK_WOOL.value(),
                HushedStorageBlocks.HUSHED_GRAY_WOOL.value(),
                HushedStorageBlocks.HUSHED_LIGHT_GRAY_WOOL.value(),
                HushedStorageBlocks.HUSHED_CYAN_WOOL.value(),
                HushedStorageBlocks.HUSHED_PURPLE_WOOL.value(),
                HushedStorageBlocks.HUSHED_BLUE_WOOL.value(),
                HushedStorageBlocks.HUSHED_BROWN_WOOL.value(),
                HushedStorageBlocks.HUSHED_GREEN_WOOL.value(),
                HushedStorageBlocks.HUSHED_RED_WOOL.value(),
                HushedStorageBlocks.HUSHED_BLACK_WOOL.value(),
                HushedStorageBlocks.HUSHED_WHITE_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_ORANGE_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_MAGENTA_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_YELLOW_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_LIGHT_BLUE_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_LIME_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_PINK_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_GRAY_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_LIGHT_GRAY_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_CYAN_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_PURPLE_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_BLUE_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_BROWN_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_GREEN_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_RED_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_BLACK_CONCRETE.value(),
                HushedStorageBlocks.HUSHED_OAK_PLANKS.value(),
                HushedStorageBlocks.HUSHED_BIRCH_PLANKS.value(),
                HushedStorageBlocks.HUSHED_SPRUCE_PLANKS.value(),
                HushedStorageBlocks.HUSHED_ACACIA_PLANKS.value(),
                HushedStorageBlocks.HUSHED_JUNGLE_PLANKS.value(),
                HushedStorageBlocks.HUSHED_MANGROVE_PLANKS.value(),
                HushedStorageBlocks.HUSHED_CHERRY_PLANKS.value(),
                HushedStorageBlocks.HUSHED_WARPED_PLANKS.value(),
                HushedStorageBlocks.HUSHED_CRIMSON_PLANKS.value(),
                HushedStorageBlocks.HUSHED_BAMBOO_PLANKS.value(),
                HushedStorageBlocks.HUSHED_DARK_OAK_PLANKS.value(),
                HushedStorageBlocks.HUSHED_BRICKS.value()
        ),null));
    }
}
