package com.idtech.block;

import com.idtech.BaseMod;
import com.idtech.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class SkeletonSupriseBlock extends Block {

    private static Properties properties = Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE);
    public static Block INSTANCE = new SkeletonSupriseBlock(properties).setRegistryName(BaseMod.MODID,"skeleton_block");
    public static Item ITEM = BlockUtils.createBlockItem(INSTANCE, ItemGroup.MISC);



    public SkeletonSupriseBlock(Properties properties){ super(properties);}

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState blockstate, PlayerEntity player) {
        super.onBlockHarvested(worldIn, pos, blockstate, player);
        Utils.spawnEntity(worldIn, EntityType.SKELETON, pos);
        Utils.spawnEntity(worldIn, EntityType.SKELETON, pos);
    }
}
