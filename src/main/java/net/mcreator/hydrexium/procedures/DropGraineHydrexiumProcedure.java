package net.mcreator.hydrexium.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.hydrexium.item.LingotHydrexiumItem;
import net.mcreator.hydrexium.item.GraineenHydrexiumItem;
import net.mcreator.hydrexium.Hydrexium116ModElements;
import net.mcreator.hydrexium.Hydrexium116Mod;

import java.util.Map;

@Hydrexium116ModElements.ModElement.Tag
public class DropGraineHydrexiumProcedure extends Hydrexium116ModElements.ModElement {
	public DropGraineHydrexiumProcedure(Hydrexium116ModElements instance) {
		super(instance, 58);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency x for procedure DropGraineHydrexium!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency y for procedure DropGraineHydrexium!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency z for procedure DropGraineHydrexium!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency world for procedure DropGraineHydrexium!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() > 0.1)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(GraineenHydrexiumItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 120);
				world.addEntity(entityToSpawn);
			}
		} else {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(LingotHydrexiumItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 120);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
