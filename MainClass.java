package EddyExperiment;

import EddyExperiment.test01.TileEntityTestBlockEntity;
import EddyExperiment.test01.TileEntityTestBlockRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;


@Mod(modid="eddy", name="EddyExperiment", version="0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MainClass {
	
      public static Block TestBlock;
	

	  @Mod.PreInit
	  public void preInit(FMLPreInitializationEvent event)
	  {
		    TestBlock = new EddyExperiment.test01.TestBlock(1024, Material.rock);
		    TestBlock.setUnlocalizedName("TestBlock");
		    //1.6 TestBlock.func_111022_d("TestBlock");
		    TestBlock.setLightValue(15.0f);
		    TestBlock.setCreativeTab(CreativeTabs.tabDecorations);
		  	GameRegistry.registerBlock(TestBlock, "´ú¸Õ");
		    LanguageRegistry.addName(TestBlock, "Techne´ú¸Õ¤è¶ô");
	  }
	  

	  @Mod.Init
	  public void load(FMLInitializationEvent event) 
	  {
		  ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTestBlockEntity.class, new TileEntityTestBlockRenderer());
		  GameRegistry.registerTileEntity(TileEntityTestBlockEntity.class,"tileEntityTestBlock");

	  }
	  
	  @Mod.PostInit
	  public void postInit(FMLPostInitializationEvent evt)
	  {

	  }



}
