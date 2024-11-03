package net.squidcat.coolstuff.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.squidcat.coolstuff.SCCoolStuff;

public class ModItems {
    public static  final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SCCoolStuff.MOD_ID);

    public static final DeferredItem<Item>TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>DAYTONACARD = ITEMS.register("daytona_card",
            () -> new Item(new Item.Properties()));



    public static  void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
