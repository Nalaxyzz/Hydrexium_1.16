
package net.mcreator.hydrexium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import net.mcreator.hydrexium.procedures.HammerProcedure;
import net.mcreator.hydrexium.itemgroup.HydrexiumtabItemGroup;
import net.mcreator.hydrexium.Hydrexium116ModElements;

import java.util.Map;
import java.util.HashMap;

@Hydrexium116ModElements.ModElement.Tag
public class HammerenHydrexiumItem extends Hydrexium116ModElements.ModElement {
	@ObjectHolder("hydrexium_1_16:hammeren_hydrexium")
	public static final Item block = null;
	public HammerenHydrexiumItem(Hydrexium116ModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1500;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlaqueHydrexiumItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(HydrexiumtabItemGroup.tab)) {
			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, BlockState bl, BlockPos pos, LivingEntity entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, bl, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					HammerProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("hammeren_hydrexium"));
	}
}
