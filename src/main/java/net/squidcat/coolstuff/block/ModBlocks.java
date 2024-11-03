package net.squidcat.coolstuff.block;

import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SupportType;
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
