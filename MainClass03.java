package EddyExperiment;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import EddyExperiment.test03.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "eddytest03", name = "EddyExperimentT03", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MainClass03 {

	@SidedProxy(clientSide = "EddyExperiment.test03.client.ClientProxy", serverSide = "EddyExperiment.test03.CommonProxy")
	public static ISidedProxy proxy;
	public static Potion potionEddy;

	@Mod.PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Potion[] potionTypes = null;

		for (Field field : Potion.class.getDeclaredFields()) {
			field.setAccessible(true);
			try {
				if (field.getName().equals("potionTypes") || field.getName().equals("field_76425_a")) {
					Field modfield = Field.class.getDeclaredField("modifiers");
					modfield.setAccessible(true);
					modfield.setInt(field, field.getModifiers() & ~Modifier.FINAL);

					potionTypes = (Potion[]) field.get(null);
					final Potion[] newPotionTypes = new Potion[256];
					System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
					field.set(null, newPotionTypes);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		MinecraftForge.EVENT_BUS.register(new PotionEventHandler());
	}

	@Mod.Init
	public void load(FMLInitializationEvent event) {
		potionEddy = (new PotionEddy(32, false, 0)).setIconIndex(0, 0).setPotionName("potion.eddyPotion");
	}

	@Mod.PostInit
	public void postInit(FMLPostInitializationEvent evt) {

	}

}
