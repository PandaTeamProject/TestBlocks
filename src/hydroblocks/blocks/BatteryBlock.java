package hydroblocks.blocks;

import hydroblocks.hydroblocks;
import hydroblocks.blocks.tileentities.TileEntityBattery;
import hydroblocks.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BatteryBlock extends BlockContainer {

	public BatteryBlock(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Names.batteryBlock_unlocalizedName);
		this.setCreativeTab(hydroblocks.hydroblocks);
		this.setHardness(2F);
		this.setResistance(15F);
		this.setStepSound(Block.soundMetalFootstep);
					
		}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityBattery();
	}
	

}
