package EddyExperiment.test02;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemCreateEntityWand extends ItemSword {

	public ItemCreateEntityWand(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		
	}

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	if(!par2World.isRemote) //在伺服端生成實體
    	{
        EntitySpyro entity = new EntitySpyro(par2World);
        par2World.spawnEntityInWorld(entity);
    	}
        return par1ItemStack;
    }
    
}
	
