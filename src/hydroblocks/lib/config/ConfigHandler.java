package hydroblocks.lib.config;

import java.io.File;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	public static void init(File configFile) {
		
		Configuration config = new Configuration(configFile);
		
		final String BOOLEANS = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "booleans";
		
		config.load();
		
		Booleans.enableTool = config.get(BOOLEANS, Booleans.enableTool_name, 
		Booleans.enableTool_default).getBoolean(Booleans.enableTool_default);
		
		Booleans.hardRecipe = config.get(BOOLEANS, Booleans.hardRecipe_name, 
		Booleans.hardRecipe_default).getBoolean(Booleans.hardRecipe_default);
		
		Ids.tutBlock_actual = config.getBlock(config.CATEGORY_BLOCK, Names.tutBlock_name, 
		Ids.tutBlock_default).getInt();
		
		Ids.mixerBlock_actual = config.getBlock(config.CATEGORY_BLOCK, Names.mixerBlock_name, 
		Ids.mixerBlock_default).getInt();

		Ids.tutItem_actual = config.getItem(config.CATEGORY_ITEM, Names.tutItem_name, 
		Ids.tutItem_default).getInt() - 256;
		
		Ids.tutTool_actual = config.getItem(config.CATEGORY_ITEM, Names.tutTool_name, 
		Ids.tutTool_default).getInt() - 256;

		config.save();
		
		

}
}