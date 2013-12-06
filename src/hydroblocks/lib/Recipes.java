package hydroblocks.lib;

import hydroblocks.blocks.Blocks;
import hydroblocks.items.Items;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import cpw.mods.fml.common.registry.GameRegistry;


public class Recipes {
public static void init() {


	GameRegistry.addRecipe(new ItemStack(Blocks.block, 1),
			new Object[] {
			"DDD",
			"DDD",
			"DDD",
			'D', Block.dirt
			});
	
	CraftingManager.getInstance().addRecipe(new ItemStack(Items.item, 1),
			"CCC",
			"CCC",
			"CCC",
			Character.valueOf('C'), Block.cobblestone);
}
}



