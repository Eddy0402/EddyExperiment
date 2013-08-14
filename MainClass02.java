package EddyExperiment;

import EddyExperiment.test02.EntitySpyro;
import EddyExperiment.test02.ISidedProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;


@Mod(modid="eddytest02", name="EddyExperimentT02", version="0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MainClass02 {
	
	  @SidedProxy(clientSide="EddyExperiment.test02.client.ClientProxy",serverSide="EddyExperiment.test02.CommonProxy")
	  public static ISidedProxy proxy;

	  @Mod.PreInit
	  public void preInit(FMLPreInitializationEvent event)
	  {

	  }
	  

	  @Mod.Init
	  public void load(FMLInitializationEvent event) 
	  {
		  EntityRegistry.registerGlobalEntityID(EntitySpyro.class, "Spyro", EntityRegistry.findGlobalUniqueEntityId(), 3515848, 12102);
		  LanguageRegistry.instance().addStringLocalization("entity.Spyro.name", "Spyro");
	  }
	  
	  @Mod.PostInit
	  public void postInit(FMLPostInitializationEvent evt)
	  {
		  	proxy.registerRender();
	  }



}
