package net.arogog.arogogs_compilation.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AROGOGS_TAB = new CreativeModeTab("arogogsmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CAT_EAR.get());
        }
    };
}
