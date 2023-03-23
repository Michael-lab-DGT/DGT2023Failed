package net.Dark1.tutorialmod.item;

import net.Dark1.tutorialmod.TutorialMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//Creating new Creative Mode Tab
@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab TUTORIAL_TAB;

    //Icon and Name of Mod Creative Mode Tab
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        TUTORIAL_TAB = event.registerCreativeModeTab(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_tab"),
            builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
                    .title(Component.translatable("creativemodetab.tutorial_tab")));
    }

}

