package net.bubbajay.floralfury.item;

import net.bubbajay.floralfury.FloralFury;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FloralFury.MOD_ID);

    public static final DeferredItem<Item> CRYSTAL_LOTUS = ITEMS.register("crystal_lotus",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
