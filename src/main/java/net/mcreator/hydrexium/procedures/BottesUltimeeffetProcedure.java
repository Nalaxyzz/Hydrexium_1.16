package net.mcreator.hydrexium.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.hydrexium.Hydrexium116ModElements;
import net.mcreator.hydrexium.Hydrexium116Mod;

import java.util.Map;

@Hydrexium116ModElements.ModElement.Tag
public class BottesUltimeeffetProcedure extends Hydrexium116ModElements.ModElement {
	public BottesUltimeeffetProcedure(Hydrexium116ModElements instance) {
		super(instance, 134);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency entity for procedure BottesUltimeeffet!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 3));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 60, (int) 3));
	}
}
