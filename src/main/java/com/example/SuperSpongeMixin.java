package com.example.revorn.mixin;

import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(Block.class)
public class SuperSpongeMixin {

    @ModifyConstant(method = "absorbWater", constant = @Constant(intValue = 64))
    private int modifyMaxBlockCount(int original) {
        return 2000;
    }

    @ModifyConstant(method = "absorbWater", constant = @Constant(intValue = 6))
    private int modifyMaxDepth(int original) {
        return 20;
    }
}
