package EddyExperiment.test01;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TestBlock extends BlockContainer {

	public TestBlock(int par1, Material par2Material) {
		super(par1, par2Material);

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

    //碰撞箱
    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
          this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.2F, 1.0F);
    }
    
    //當此方塊成為物品時的邊界
    @Override
    public void setBlockBoundsForItemRender()
    {
         this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.2F, 1.0F);
    }
    
	@Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }


}
