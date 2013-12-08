package hydroblocks.blocks;

import hydroblocks.hydroblocks;
import hydroblocks.blocks.tileentities.TileEntityBattery;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BatteryBlock extends BlockContainer {

	public BatteryBlock(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Names.batteryBlock_unlocalizedName);
		this.setCreativeTab(hydroblocks.hydroblocks);
		this.setHardness(2F);
		this.setResistance(15F);
		this.setStepSound(Block.soundMetalFootstep);
					
		}
	
	@SideOnly(Side.CLIENT)
	private Icon dischargedIcon;

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityBattery();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName + "_charged");
		dischargedIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName + "_discharged");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return meta == 0 ? blockIcon :dischargedIcon;

}
	
}

