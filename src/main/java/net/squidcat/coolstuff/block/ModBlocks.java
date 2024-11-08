package net.squidcat.coolstuff.block;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import net.minecraft.world.level.block.*;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.squidcat.coolstuff.SCCoolStuff;
import net.squidcat.coolstuff.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static  final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SCCoolStuff.MOD_ID);

    public static final DeferredBlock<Block> CHARCOAL_BLOCK = registerBlock("charcoal_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> CHARCOAL_BRICK_BLOCK = registerBlock("charcoal_brick_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> CARVED_CHARCOAL_BRICK_BLOCK = registerBlock("carved_charcoal_brick_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> PAPER_BLOCK = registerBlock("paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));

    public static final DeferredBlock<Block> LIGHT_GRAY_PAPER_BLOCK = registerBlock("light_gray_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> GRAY_PAPER_BLOCK = registerBlock("gray_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> BLACK_PAPER_BLOCK = registerBlock("black_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> RED_PAPER_BLOCK = registerBlock("red_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> ORANGE_PAPER_BLOCK = registerBlock("orange_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> YELLOW_PAPER_BLOCK = registerBlock("yellow_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> LIME_PAPER_BLOCK = registerBlock("lime_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> GREEN_PAPER_BLOCK = registerBlock("green_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> LIGHT_BLUE_PAPER_BLOCK = registerBlock("light_blue_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> CYAN_PAPER_BLOCK = registerBlock("cyan_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> BLUE_PAPER_BLOCK = registerBlock("blue_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> PURPLE_PAPER_BLOCK = registerBlock("purple_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> MAGENTA_PAPER_BLOCK = registerBlock("magenta_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> PINK_PAPER_BLOCK = registerBlock("pink_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static final DeferredBlock<Block> BROWN_PAPER_BLOCK = registerBlock("brown_paper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.LADDER)));
    public static  final  DeferredBlock<SlabBlock> CHARCOAL_BRICK_SLAB = registerBlock("charcoal_brick_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE).strength(1f).requiresCorrectToolForDrops()));
    public static final  DeferredBlock<RotatedPillarBlock> CHARCOAL_PILLAR_BLOCK = registerBlock("charcoal_pillar_block",
            ()-> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> CHARCOAL_BRICK_WALL = registerBlock("charcoal_brick_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE).strength(1f).requiresCorrectToolForDrops()));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name , block);
        registerBlockItem(name, toReturn);
        return  toReturn;
    }


private static  <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
    ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
}



    public  static  void  register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
