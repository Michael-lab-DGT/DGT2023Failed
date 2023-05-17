package net.Dark1.tutorialmod.datagen;

import net.Dark1.tutorialmod.block.ModBlocks;
import net.Dark1.tutorialmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // block will drop itself
        dropSelf(ModBlocks.BLACK_OPAL_BLOCK.get());

        //block will drop ores
        add(ModBlocks.BLACK_OPAL_ORE.get(),
            (block) -> createOreDrop(ModBlocks.BLACK_OPAL_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));
        add(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.get(),
            (block) -> createOreDrop(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));
        add(ModBlocks.NETHERRACK_BLACK_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.NETHERRACK_BLACK_OPAL_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));
        add(ModBlocks.ENDSTONE_BLACK_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.ENDSTONE_BLACK_OPAL_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));

        //block will drop self
        this.dropSelf(ModBlocks.EBONY_LOG.get());
        this.dropSelf(ModBlocks.EBONY_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_EBONY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_EBONY_WOOD.get());
        this.dropSelf(ModBlocks.EBONY_PLANKS.get());
        this.dropSelf(ModBlocks.EBONY_SAPLING.get());

        //block will take leaves loot table
        this.add(ModBlocks.EBONY_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.EBONY_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
