package net.squidcat.coolstuff.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.squidcat.coolstuff.SCCoolStuff;
import net.squidcat.coolstuff.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_DEFERRED_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SCCoolStuff.MOD_ID);

    public static  final Supplier<CreativeModeTab> SCCS_ITEMS = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("sccs_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.TESTITEM.get()))
                    .title(Component.translatable("creativetab.sccoolstuff.sccs_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TESTITEM);
                        output.accept(ModItems.DAYTONACARD);
                        output.accept(ModBlocks.CHARCOAL_BLOCK);
                        output.accept(ModBlocks.CHARCOAL_BRICK_BLOCK);
                        output.accept(ModBlocks.CARVED_CHARCOAL_BRICK_BLOCK);
                        output.accept(ModBlocks.PAPER_BLOCK);
                        output.accept(ModBlocks.ORANGE_PAPER_BLOCK);
                        output.accept(ModBlocks.MAGENTA_PAPER_BLOCK);
                        output.accept(ModBlocks.LIGHT_BLUE_PAPER_BLOCK);
                        output.accept(ModBlocks.YELLOW_PAPER_BLOCK);
                        output.accept(ModBlocks.LIME_PAPER_BLOCK);
                        output.accept(ModBlocks.PINK_PAPER_BLOCK);
                        output.accept(ModBlocks.GRAY_PAPER_BLOCK);
                        output.accept(ModBlocks.LIGHT_GRAY_PAPER_BLOCK);
                        output.accept(ModBlocks.CYAN_PAPER_BLOCK);
                        output.accept(ModBlocks.PURPLE_PAPER_BLOCK);
                        output.accept(ModBlocks.BLUE_PAPER_BLOCK);
                        output.accept(ModBlocks.BROWN_PAPER_BLOCK);
                        output.accept(ModBlocks.GREEN_PAPER_BLOCK);
                        output.accept(ModBlocks.RED_PAPER_BLOCK);
                        output.accept(ModBlocks.BLACK_PAPER_BLOCK);




                    }).build() );



    public static  void  register(IEventBus eventBus) {
        CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(eventBus);
    }

}
