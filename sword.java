package com.idtech.item;

import com.idtech.BaseMod;
import com.idtech.Utils;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static net.minecraft.item.ItemGroup.*;

public class sword extends SwordItem{

    private static Properties properties = new Item.Properties().group(TOOLS);

    public static IItemTier tier = ItemUtils.buildItemTier(4, 1561, 8.0F, 3.0F, 10, "iron");

    public static Item INSTANCE = new sword(tier, 999, 100,  properties).setRegistryName(BaseMod.MODID, "sword");

    public sword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}
