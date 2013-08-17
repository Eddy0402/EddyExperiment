package EddyExperiment.test03;

import EddyExperiment.MainClass03;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class PotionEventHandler {

@ForgeSubscribe
public void onEntityUpdate(LivingUpdateEvent event){
	if (event.entityLiving.isPotionActive(MainClass03.potionEddy)) {

		event.entityLiving.attackEntityFrom(DamageSource.generic, 5);

		}	
}

}
