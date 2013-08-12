package EddyExperiment.test01;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TestBlock extends BlockContainer {

	public TestBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityTestBlockEntity();
	}
	
	//非普通方塊Render方式
    @Override
    public int getRenderType() {
            return -1;
    }
	
	//是否是完整方塊(若非，使相鄰的方塊材質被render)
    @Override
    public boolean isOpaqueCube() {
            return false;
    }

	@Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }
}
