package org.multicoder.hushed_storage.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.multicoder.hushed_storage.Hushed_storage;
import org.multicoder.hushed_storage.block.BaseHushedBlock;

public class HushedStorageBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, Hushed_storage.MODID);
    //  Wool Variants
    public static final DeferredHolder<Block,Block> HUSHED_WHITE_WOOL = REGISTER("hushed_white_wool");
    public static final DeferredHolder<Block,Block> HUSHED_ORANGE_WOOL = REGISTER("hushed_orange_wool");
    public static final DeferredHolder<Block,Block> HUSHED_MAGENTA_WOOL = REGISTER("hushed_magenta_wool");
    public static final DeferredHolder<Block,Block> HUSHED_LIGHT_BLUE_WOOL = REGISTER("hushed_light_blue_wool");
    public static final DeferredHolder<Block,Block> HUSHED_YELLOW_WOOL = REGISTER("hushed_yellow_wool");
    public static final DeferredHolder<Block,Block> HUSHED_LIME_WOOL = REGISTER("hushed_lime_wool");
    public static final DeferredHolder<Block,Block> HUSHED_PINK_WOOL = REGISTER("hushed_pink_wool");
    public static final DeferredHolder<Block,Block> HUSHED_GRAY_WOOL = REGISTER("hushed_gray_wool");
    public static final DeferredHolder<Block,Block> HUSHED_LIGHT_GRAY_WOOL = REGISTER("hushed_light_gray_wool");
    public static final DeferredHolder<Block,Block> HUSHED_CYAN_WOOL = REGISTER("hushed_cyan_wool");
    public static final DeferredHolder<Block,Block> HUSHED_PURPLE_WOOL = REGISTER("hushed_purple_wool");
    public static final DeferredHolder<Block,Block> HUSHED_BLUE_WOOL = REGISTER("hushed_blue_wool");
    public static final DeferredHolder<Block,Block> HUSHED_BROWN_WOOL = REGISTER("hushed_brown_wool");
    public static final DeferredHolder<Block,Block> HUSHED_GREEN_WOOL = REGISTER("hushed_green_wool");
    public static final DeferredHolder<Block,Block> HUSHED_RED_WOOL = REGISTER("hushed_red_wool");
    public static final DeferredHolder<Block,Block> HUSHED_BLACK_WOOL = REGISTER("hushed_black_wool");
    //  Concrete Variants
    public static final DeferredHolder<Block,Block> HUSHED_WHITE_CONCRETE = REGISTER("hushed_white_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_ORANGE_CONCRETE = REGISTER("hushed_orange_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_MAGENTA_CONCRETE = REGISTER("hushed_magenta_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_LIGHT_BLUE_CONCRETE = REGISTER("hushed_light_blue_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_YELLOW_CONCRETE = REGISTER("hushed_yellow_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_LIME_CONCRETE = REGISTER("hushed_lime_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_PINK_CONCRETE = REGISTER("hushed_pink_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_GRAY_CONCRETE = REGISTER("hushed_gray_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_LIGHT_GRAY_CONCRETE = REGISTER("hushed_light_gray_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_CYAN_CONCRETE = REGISTER("hushed_cyan_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_PURPLE_CONCRETE = REGISTER("hushed_purple_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_BLUE_CONCRETE = REGISTER("hushed_blue_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_BROWN_CONCRETE = REGISTER("hushed_brown_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_GREEN_CONCRETE = REGISTER("hushed_green_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_RED_CONCRETE = REGISTER("hushed_red_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_BLACK_CONCRETE = REGISTER("hushed_black_concrete");
    //  Wood Plank Variants
    public static final DeferredHolder<Block,Block> HUSHED_OAK_PLANKS = REGISTER("hushed_oak_planks");
    public static final DeferredHolder<Block,Block> HUSHED_SPRUCE_PLANKS = REGISTER("hushed_spruce_planks");
    public static final DeferredHolder<Block,Block> HUSHED_JUNGLE_PLANKS = REGISTER("hushed_jungle_planks");
    public static final DeferredHolder<Block,Block> HUSHED_DARK_OAK_PLANKS = REGISTER("hushed_dark_oak_planks");
    public static final DeferredHolder<Block,Block> HUSHED_ACACIA_PLANKS = REGISTER("hushed_acacia_planks");
    public static final DeferredHolder<Block,Block> HUSHED_BIRCH_PLANKS = REGISTER("hushed_birch_planks");
    public static final DeferredHolder<Block,Block> HUSHED_BAMBOO_PLANKS = REGISTER("hushed_bamboo_planks");
    public static final DeferredHolder<Block,Block> HUSHED_MANGROVE_PLANKS = REGISTER("hushed_mangrove_planks");
    public static final DeferredHolder<Block,Block> HUSHED_CHERRY_PLANKS = REGISTER("hushed_cherry_planks");
    public static final DeferredHolder<Block,Block> HUSHED_WARPED_PLANKS = REGISTER("hushed_warped_planks");
    public static final DeferredHolder<Block,Block> HUSHED_CRIMSON_PLANKS = REGISTER("hushed_crimson_planks");
    //  Other Blocks
    public static final DeferredHolder<Block,Block> HUSHED_BRICKS = REGISTER("hushed_bricks");

    public static DeferredHolder<Block,Block> REGISTER(String name)
    {
        DeferredHolder<Block,Block> Block = BLOCKS.register(name,BaseHushedBlock::new);
        HushedStorageItems.ITEMS.register(name,() -> new BlockItem(Block.value(),new Item.Properties()));
        return Block;
    }
}
