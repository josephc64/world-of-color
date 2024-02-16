package net.josephc64.worldofcolor.item;

import net.josephc64.worldofcolor.WorldOfColor;
import net.josephc64.worldofcolor.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WorldOfColor.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TABS.register("items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALPHA_DYE.get()))
                    .title(Component.translatable("worldofcolor.items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ALPHA_DYE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALPHA_DYE.get()))
                    .title(Component.translatable("worldofcolor.blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.ALPHA_GRASS_BLOCK.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}