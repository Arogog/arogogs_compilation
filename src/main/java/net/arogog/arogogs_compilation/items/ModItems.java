package net.arogog.arogogs_compilation.items;

import net.arogog.arogogs_compilation.ArogogsCompilation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArogogsCompilation.MOD_ID);

    public  static final RegistryObject<Item> CAT_EAR = ITEMS.register("catear",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AROGOGS_TAB)));
    public  static final RegistryObject<Item> CAT_EARS = ITEMS.register("catears",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AROGOGS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
