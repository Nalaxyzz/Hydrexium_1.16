package net.mcreator.hydrexium.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.hydrexium.Hydrexium116ModElements;
import net.mcreator.hydrexium.Hydrexium116Mod;

import java.util.Map;

@Hydrexium116ModElements.ModElement.Tag
public class JambiereseffetHydrexiumavenceProcedure extends Hydrexium116ModElements.ModElement {
	public JambiereseffetHydrexiumavenceProcedure(Hydrexium116ModElements instance) {
		super(instance, 63);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency entity for procedure JambiereseffetHydrexiumavence!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 60, (int) 2));
	}
}
