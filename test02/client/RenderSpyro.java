package EddyExperiment.test02.client;

import EddyExperiment.test02.EntitySpyro;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

@SideOnly(Side.CLIENT)
public class RenderSpyro extends RenderLiving {

	public RenderSpyro(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	
	public void renderSpyro(EntitySpyro par1EntitySpyro, double par2, double par4, double par6, float par8, float par9){
		super.doRenderLiving(par1EntitySpyro, par2, par4, par6, par8, par9);		
	}
	
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderSpyro((EntitySpyro)par1EntityLiving, par2, par4, par6, par8, par9);
    }
	
	
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderSpyro((EntitySpyro)par1Entity, par2, par4, par6, par8, par9);
    }
	
	
}
