package me.wally.wally.wally;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class blockss {
    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return register.BLOCKS.register(name, block);
    }
}
