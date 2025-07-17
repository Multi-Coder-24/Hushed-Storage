package org.multicoder.hushed_storage.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.multicoder.hushed_storage.Hushed_storage;
import org.multicoder.hushed_storage.block.BaseHushedBlock;
import org.multicoder.hushed_storage.block.BaseHushedRotatedPilllarBlock;

public class HushedStorageBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, Hushed_storage.MODID);
    //  Wool Variants
    public static final DeferredHolder<Block,Block> HUSHED_WHITE_WOOL = REGISTER("coloured/hushed_white_wool");
    public static final DeferredHolder<Block,Block> HUSHED_ORANGE_WOOL = REGISTER("coloured/hushed_orange_wool");
    public static final DeferredHolder<Block,Block> HUSHED_MAGENTA_WOOL = REGISTER("coloured/hushed_magenta_wool");
    public static final DeferredHolder<Block,Block> HUSHED_LIGHT_BLUE_WOOL = REGISTER("coloured/hushed_light_blue_wool");
    public static final DeferredHolder<Block,Block> HUSHED_YELLOW_WOOL = REGISTER("coloured/hushed_yellow_wool");
    public static final DeferredHolder<Block,Block> HUSHED_LIME_WOOL = REGISTER("coloured/hushed_lime_wool");
    public static final DeferredHolder<Block,Block> HUSHED_PINK_WOOL = REGISTER("coloured/hushed_pink_wool");
    public static final DeferredHolder<Block,Block> HUSHED_GRAY_WOOL = REGISTER("coloured/hushed_gray_wool");
    public static final DeferredHolder<Block,Block> HUSHED_LIGHT_GRAY_WOOL = REGISTER("coloured/hushed_light_gray_wool");
    public static final DeferredHolder<Block,Block> HUSHED_CYAN_WOOL = REGISTER("coloured/hushed_cyan_wool");
    public static final DeferredHolder<Block,Block> HUSHED_PURPLE_WOOL = REGISTER("coloured/hushed_purple_wool");
    public static final DeferredHolder<Block,Block> HUSHED_BLUE_WOOL = REGISTER("coloured/hushed_blue_wool");
    public static final DeferredHolder<Block,Block> HUSHED_BROWN_WOOL = REGISTER("coloured/hushed_brown_wool");
    public static final DeferredHolder<Block,Block> HUSHED_GREEN_WOOL = REGISTER("coloured/hushed_green_wool");
    public static final DeferredHolder<Block,Block> HUSHED_RED_WOOL = REGISTER("coloured/hushed_red_wool");
    public static final DeferredHolder<Block,Block> HUSHED_BLACK_WOOL = REGISTER("coloured/hushed_black_wool");
    //  Wool Variants
    public static final DeferredHolder<Block,Block> HUSHED_WHITE_TERRACOTTA = REGISTER("coloured/hushed_white_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_ORANGE_TERRACOTTA = REGISTER("coloured/hushed_orange_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_MAGENTA_TERRACOTTA = REGISTER("coloured/hushed_magenta_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_LIGHT_BLUE_TERRACOTTA = REGISTER("coloured/hushed_light_blue_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_YELLOW_TERRACOTTA = REGISTER("coloured/hushed_yellow_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_LIME_TERRACOTTA = REGISTER("coloured/hushed_lime_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_PINK_TERRACOTTA = REGISTER("coloured/hushed_pink_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_GRAY_TERRACOTTA = REGISTER("coloured/hushed_gray_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_LIGHT_GRAY_TERRACOTTA = REGISTER("coloured/hushed_light_gray_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_CYAN_TERRACOTTA = REGISTER("coloured/hushed_cyan_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_PURPLE_TERRACOTTA = REGISTER("coloured/hushed_purple_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_BLUE_TERRACOTTA = REGISTER("coloured/hushed_blue_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_BROWN_TERRACOTTA = REGISTER("coloured/hushed_brown_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_GREEN_TERRACOTTA = REGISTER("coloured/hushed_green_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_RED_TERRACOTTA = REGISTER("coloured/hushed_red_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_BLACK_TERRACOTTA = REGISTER("coloured/hushed_black_terracotta");
    //  Concrete Variants
    public static final DeferredHolder<Block,Block> HUSHED_WHITE_CONCRETE = REGISTER("coloured/hushed_white_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_ORANGE_CONCRETE = REGISTER("coloured/hushed_orange_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_MAGENTA_CONCRETE = REGISTER("coloured/hushed_magenta_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_LIGHT_BLUE_CONCRETE = REGISTER("coloured/hushed_light_blue_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_YELLOW_CONCRETE = REGISTER("coloured/hushed_yellow_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_LIME_CONCRETE = REGISTER("coloured/hushed_lime_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_PINK_CONCRETE = REGISTER("coloured/hushed_pink_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_GRAY_CONCRETE = REGISTER("coloured/hushed_gray_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_LIGHT_GRAY_CONCRETE = REGISTER("coloured/hushed_light_gray_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_CYAN_CONCRETE = REGISTER("coloured/hushed_cyan_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_PURPLE_CONCRETE = REGISTER("coloured/hushed_purple_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_BLUE_CONCRETE = REGISTER("coloured/hushed_blue_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_BROWN_CONCRETE = REGISTER("coloured/hushed_brown_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_GREEN_CONCRETE = REGISTER("coloured/hushed_green_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_RED_CONCRETE = REGISTER("coloured/hushed_red_concrete");
    public static final DeferredHolder<Block,Block> HUSHED_BLACK_CONCRETE = REGISTER("coloured/hushed_black_concrete");
    //  Wood Variants
    public static final DeferredHolder<Block,Block> HUSHED_OAK_PLANKS = REGISTER("wooden/hushed_oak_planks");
    public static final DeferredHolder<Block,Block> HUSHED_SPRUCE_PLANKS = REGISTER("wooden/hushed_spruce_planks");
    public static final DeferredHolder<Block,Block> HUSHED_JUNGLE_PLANKS = REGISTER("wooden/hushed_jungle_planks");
    public static final DeferredHolder<Block,Block> HUSHED_DARK_OAK_PLANKS = REGISTER("wooden/hushed_dark_oak_planks");
    public static final DeferredHolder<Block,Block> HUSHED_ACACIA_PLANKS = REGISTER("wooden/hushed_acacia_planks");
    public static final DeferredHolder<Block,Block> HUSHED_BIRCH_PLANKS = REGISTER("wooden/hushed_birch_planks");
    public static final DeferredHolder<Block,Block> HUSHED_BAMBOO_PLANKS = REGISTER("wooden/hushed_bamboo_planks");
    public static final DeferredHolder<Block,Block> HUSHED_MANGROVE_PLANKS = REGISTER("wooden/hushed_mangrove_planks");
    public static final DeferredHolder<Block,Block> HUSHED_CHERRY_PLANKS = REGISTER("wooden/hushed_cherry_planks");
    public static final DeferredHolder<Block,Block> HUSHED_WARPED_PLANKS = REGISTER("wooden/hushed_warped_planks");
    public static final DeferredHolder<Block,Block> HUSHED_CRIMSON_PLANKS = REGISTER("wooden/hushed_crimson_planks");
    public static final DeferredHolder<Block,Block> HUSHED_OAK_LOG = REGISTER_LOG("wooden/hushed_oak_log");
    public static final DeferredHolder<Block,Block> HUSHED_SPRUCE_LOG = REGISTER_LOG("wooden/hushed_spruce_log");
    public static final DeferredHolder<Block,Block> HUSHED_JUNGLE_LOG = REGISTER_LOG("wooden/hushed_jungle_log");
    public static final DeferredHolder<Block,Block> HUSHED_DARK_OAK_LOG = REGISTER_LOG("wooden/hushed_dark_oak_log");
    public static final DeferredHolder<Block,Block> HUSHED_ACACIA_LOG = REGISTER_LOG("wooden/hushed_acacia_log");
    public static final DeferredHolder<Block,Block> HUSHED_BIRCH_LOG = REGISTER_LOG("wooden/hushed_birch_log");
    public static final DeferredHolder<Block,Block> HUSHED_MANGROVE_LOG = REGISTER_LOG("wooden/hushed_mangrove_log");
    public static final DeferredHolder<Block,Block> HUSHED_CHERRY_LOG = REGISTER_LOG("wooden/hushed_cherry_log");
    public static final DeferredHolder<Block,Block> HUSHED_BAMBOO_BLOCK = REGISTER_LOG("wooden/hushed_bamboo_block");
    public static final DeferredHolder<Block,Block> HUSHED_CRIMSON_STEM = REGISTER_LOG("wooden/hushed_crimson_stem");
    public static final DeferredHolder<Block,Block> HUSHED_WARPED_STEM = REGISTER_LOG("wooden/hushed_warped_stem");
    public static final DeferredHolder<Block,Block> HUSHED_STRIPPED_OAK_LOG = REGISTER_LOG("wooden/hushed_stripped_oak_log");
    public static final DeferredHolder<Block,Block> HUSHED_STRIPPED_SPRUCE_LOG = REGISTER_LOG("wooden/hushed_stripped_spruce_log");
    public static final DeferredHolder<Block,Block> HUSHED_STRIPPED_JUNGLE_LOG = REGISTER_LOG("wooden/hushed_stripped_jungle_log");
    public static final DeferredHolder<Block,Block> HUSHED_STRIPPED_DARK_OAK_LOG = REGISTER_LOG("wooden/hushed_stripped_dark_oak_log");
    public static final DeferredHolder<Block,Block> HUSHED_STRIPPED_ACACIA_LOG = REGISTER_LOG("wooden/hushed_stripped_acacia_log");
    public static final DeferredHolder<Block,Block> HUSHED_STRIPPED_BIRCH_LOG = REGISTER_LOG("wooden/hushed_stripped_birch_log");
    public static final DeferredHolder<Block,Block> HUSHED_STRIPPED_MANGROVE_LOG = REGISTER_LOG("wooden/hushed_stripped_mangrove_log");
    public static final DeferredHolder<Block,Block> HUSHED_STRIPPED_CHERRY_LOG = REGISTER_LOG("wooden/hushed_stripped_cherry_log");
    public static final DeferredHolder<Block,Block> HUSHED_STRIPPED_BAMBOO_BLOCK = REGISTER_LOG("wooden/hushed_stripped_bamboo_block");
    public static final DeferredHolder<Block,Block> HUSHED_STRIPPED_CRIMSON_STEM = REGISTER_LOG("wooden/hushed_stripped_crimson_stem");
    public static final DeferredHolder<Block,Block> HUSHED_STRIPPED_WARPED_STEM = REGISTER_LOG("wooden/hushed_stripped_warped_stem");
    //  Stone Blocks
    public static final DeferredHolder<Block,Block> HUSHED_STONE = REGISTER("stone/hushed_stone");
    public static final DeferredHolder<Block,Block> HUSHED_COBBLESTONE = REGISTER("stone/hushed_cobblestone");
    public static final DeferredHolder<Block,Block> HUSHED_ANDESITE = REGISTER("stone/hushed_andesite");
    public static final DeferredHolder<Block,Block> HUSHED_DIORITE = REGISTER("stone/hushed_diorite");
    public static final DeferredHolder<Block,Block> HUSHED_CALCITE = REGISTER("stone/hushed_calcite");
    public static final DeferredHolder<Block,Block> HUSHED_GRANITE = REGISTER("stone/hushed_granite");
    public static final DeferredHolder<Block,Block> HUSHED_TUFF = REGISTER("stone/hushed_tuff");
    public static final DeferredHolder<Block,Block> HUSHED_DEEPSLATE = REGISTER("stone/hushed_deepslate");
    public static final DeferredHolder<Block,Block> HUSHED_COBBLED_DEEPSLATE = REGISTER("stone/hushed_cobbled_deepslate");
    //  Other Blocks
    public static final DeferredHolder<Block,Block> HUSHED_BRICKS = REGISTER("other/hushed_bricks");
    public static final DeferredHolder<Block,Block> HUSHED_QUARTZ_BLOCK = REGISTER("other/hushed_quartz_block");
    public static final DeferredHolder<Block,Block> HUSHED_TERRACOTTA = REGISTER("other/hushed_terracotta");
    public static final DeferredHolder<Block,Block> HUSHED_CLAY = REGISTER("other/hushed_clay");
    public static final DeferredHolder<Block,Block> HUSHED_BLACKSTONE = REGISTER("other/hushed_blackstone");
    public static final DeferredHolder<Block,Block> HUSHED_BASALT = REGISTER_LOG("other/hushed_basalt");
    public static final DeferredHolder<Block,Block> HUSHED_NETHERRACK = REGISTER("other/hushed_netherrack");
    public static final DeferredHolder<Block,Block> HUSHED_OBSIDIAN = REGISTER("other/hushed_obsidian");
    public static final DeferredHolder<Block,Block> HUSHED_CRYING_OBSIDIAN = REGISTER("other/hushed_crying_obsidian");
    public static final DeferredHolder<Block,Block> HUSHED_SANDSTONE = REGISTER("other/hushed_sandstone");
    public static final DeferredHolder<Block,Block> HUSHED_RED_SANDSTONE = REGISTER("other/hushed_red_sandstone");
    public static final DeferredHolder<Block,Block> HUSHED_SAND = REGISTER("other/hushed_sand");
    public static final DeferredHolder<Block,Block> HUSHED_RED_SAND = REGISTER("other/hushed_red_sand");
    public static final DeferredHolder<Block,Block> HUSHED_GRAVEL = REGISTER("other/hushed_gravel");
    public static final DeferredHolder<Block,Block> HUSHED_DIRT = REGISTER("other/hushed_dirt");
    public static final DeferredHolder<Block,Block> HUSHED_COARSE_DIRT = REGISTER("other/hushed_coarse_dirt");
    public static final DeferredHolder<Block,Block> HUSHED_ROOTED_DIRT = REGISTER("other/hushed_rooted_dirt");

    public static DeferredHolder<Block,Block> REGISTER(String name)
    {
        DeferredHolder<Block,Block> Block = BLOCKS.register(name,BaseHushedBlock::new);
        HushedStorageItems.ITEMS.register(name,() -> new BlockItem(Block.value(),new Item.Properties()));
        return Block;
    }
    public static DeferredHolder<Block,Block> REGISTER_LOG(String name)
    {
        DeferredHolder<Block,Block> Block = BLOCKS.register(name, BaseHushedRotatedPilllarBlock::new);
        HushedStorageItems.ITEMS.register(name,() -> new BlockItem(Block.value(),new Item.Properties()));
        return Block;
    }
}
