package hydroblocks.blocks;

import hydroblocks.lib.config.Ids;
import hydroblocks.lib.config.Names;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
public static Block block;

public static void init() {
block = new TutBlock(Ids.tutBlock_actual);
GameRegistry.registerBlock(block, Names.tutBlock_name);
}

public static void addNames() {
LanguageRegistry.addName(block, Names.tutBlock_name);
}
}