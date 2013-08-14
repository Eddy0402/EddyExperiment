package EddyExperiment.test02.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import EddyExperiment.test02.CommonProxy;
import EddyExperiment.test02.EntitySpyro;
import EddyExperiment.test02.ISidedProxy;

public class ClientProxy extends CommonProxy {

	public ClientProxy() {
		// nothing to do
	}

	@Override
	public void registerRender() {
		RenderingRegistry.registerEntityRenderingHandler(EntitySpyro.class, new RenderSpyro(new ModelSpyro(), 0.5F));

	}

}
