package net.mcreator.hydrexium.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.hydrexium.block.Hydrexiumplantestage2Block;
import net.mcreator.hydrexium.Hydrexium116ModElements;
import net.mcreator.hydrexium.Hydrexium116Mod;

import java.util.Map;

@Hydrexium116ModElements.ModElement.Tag
public class Stage1GraineHydrexiumProcedure extends Hydrexium116ModElements.ModElement {
	public Stage1GraineHydrexiumProcedure(Hydrexium116ModElements instance) {
		super(instance, 73);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency x for procedure Stage1GraineHydrexium!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency y for procedure Stage1GraineHydrexium!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency z for procedure Stage1GraineHydrexium!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency world for procedure Stage1GraineHydrexium!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Hydrexiumplantestage2Block.block.getDefaultState(), 3);
	}
}
