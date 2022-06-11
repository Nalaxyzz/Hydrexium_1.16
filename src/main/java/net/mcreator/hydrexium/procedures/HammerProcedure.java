package net.mcreator.hydrexium.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.mcreator.hydrexium.Hydrexium116ModElements;
import net.mcreator.hydrexium.Hydrexium116Mod;

import java.util.Map;

@Hydrexium116ModElements.ModElement.Tag
public class HammerProcedure extends Hydrexium116ModElements.ModElement {
	public HammerProcedure(Hydrexium116ModElements instance) {
		super(instance, 125);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency entity for procedure Hammer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency x for procedure Hammer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency y for procedure Hammer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency z for procedure Hammer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				Hydrexium116Mod.LOGGER.warn("Failed to load dependency world for procedure Hammer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity.rotationPitch) > 40) || ((entity.rotationPitch) < (-40)))) {
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
				}
			}
		} else if ((((entity.getHorizontalFacing()) == Direction.NORTH) || ((entity.getHorizontalFacing()) == Direction.SOUTH))) {
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
			}
		} else if ((((entity.getHorizontalFacing()) == Direction.WEST) || ((entity.getHorizontalFacing()) == Direction.EAST))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
			}
		}
	}
}
