package hydroblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = HydroBlocks.modid, name = "HydroBlocks Mod", version ="1.0" )
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class HydroBlocks 
{
	public static final String modid = "pandateam_HydroBlocks";

	public static Block hydromixerBlock;
	
	public static Item hydronutrientsItem;
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{	//781 is the block ID and this can be updated
		hydromixerBlock = new BlockHydroMixerBlock(491, Material.rock).setUnlocalizedName("hydromixerBlock");
		
		GameRegistry.registerBlock(hydromixerBlock, modid + hydromixerBlock.getUnlocalizedName().substring(5));
		
		LanguageRegistry.addName(hydromixerBlock, "Hydro Mixer");
		
		//7811 is meant to be the block ID however it seems to be randomly set
		hydronutrientsItem = new Itemhydronutrients(4901).setUnlocalizedName("hydroponicnutrientsItem");
		
		LanguageRegistry.addName(hydronutrientsItem, "Hydroponic Nutrients");
	}
}