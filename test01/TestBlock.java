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
	
	//�D���q���Render�覡
    @Override
    public int getRenderType() {
            return -1;
    }
	
	//�O�_�O������(�Y�D�A�Ϭ۾F���������Qrender)
    @Override
    public boolean isOpaqueCube() {
            return false;
    }

    //�I���c
    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
          this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.2F, 1.0F);
    }
    
    //������������~�ɪ����
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
	
    //��W�ϼ�
    public void registerIcons(IconRegister icon) {
            this.blockIcon = icon.registerIcon("/textures/blocks/stone.png");
    }

}
