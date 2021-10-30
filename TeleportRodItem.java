package com.idtech.item;

import com.idtech.Utils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.idtech.Utils.*;

public class TeleportRodItem extends Item {

    private static Properties properties = new Item.Properties().group(ItemGroup.MISC);
    public static Item INSTANCE = new TeleportRodItem(properties).setRegistryName("teleportrod");

    public TeleportRodItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        BlockPos pos = getBlockAtCursor(playerIn, 20.0d, true);
        if(pos != null){
            playerIn.setPosition(pos.getX(), pos.getY(), pos.getZ());

            return ActionResult.resultSuccess(itemstack);
        }
        else {
            return ActionResult.resultFail(itemstack);
        }
    }
}
