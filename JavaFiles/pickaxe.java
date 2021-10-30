package com.idtech.item;

import com.idtech.BaseMod;
import com.idtech.Utils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static net.minecraft.item.ItemGroup.*;

public class pickaxe extends PickaxeItem {

    private static Properties properties = new Item.Properties().group(TOOLS);

    public static IItemTier tier = ItemUtils.buildItemTier(8, 1561, 20.0F, 3.0F, 10, "examplemod:gelore");

    public static Item INSTANCE = new pickaxe(tier, 8, 1,  properties).setRegistryName(BaseMod.MODID, "pickaxe");

    public pickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        BlockPos location = Utils.getBlockAtCursor(playerIn, 20.0d, true);
        if(location != null){
            Utils.createExplosion(worldIn, location, 0.5f);
            Utils.strikeLightning(worldIn, location);
            return ActionResult.resultSuccess(itemstack);
        }
        else {
            return ActionResult.resultFail(itemstack);
        }
    }

}
