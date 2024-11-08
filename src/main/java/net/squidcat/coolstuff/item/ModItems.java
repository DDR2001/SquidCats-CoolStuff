package net.squidcat.coolstuff.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.squidcat.coolstuff.SCCoolStuff;

public class ModItems {
    public static  final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SCCoolStuff.MOD_ID);

    public static final DeferredItem<Item>TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>DAYTONACARD = ITEMS.register("daytona_card",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(1)));



    public static  void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
