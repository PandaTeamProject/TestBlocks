package hydroblocks.blocks;

import hydroblocks.blocks.tileentities.TileEntityBattery;
import hydroblocks.blocks.tileentities.TileEntityBomb;
import hydroblocks.lib.config.Ids;
import hydroblocks.lib.config.Names;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
public static Block block;
public static Block mixerBlock;
public static Block bombBlock;
public static Block batteryBlock;


public static void init() {
block = new TutBlock(Ids.tutBlock_actual);
GameRegistry.registerBlock(block, Names.tutBlock_name);

mixerBlock = new MixerBlock(Ids.mixerBlock_actual);
GameRegistry.registerBlock(mixerBlock, Names.mixerBlock_name);

bombBlock = new BombBlock(Ids.bombBlock_actual);
GameRegistry.registerBlock(bombBlock, Names.bombBlock_name);

batteryBlock = new BatteryBlock(Ids.batteryBlock_actual);
GameRegistry.registerBlock(batteryBlock, Names.batteryBlock_name);
}

public static void addNames() {
LanguageRegistry.addName(block, Names.tutBlock_name);
LanguageRegistry.addName(mixerBlock, Names.mixerBlock_name);
LanguageRegistry.addName(bombBlock, Names.bombBlock_name);
LanguageRegistry.addName(batteryBlock, Names.batteryBlock_name);
}

public static void registerTileEntities() {
	GameRegistry.registerTileEntity(TileEntityBomb.class, Names.bombTile);
	GameRegistry.registerTileEntity(TileEntityBattery.class, Names.batteryTile);
}


}
