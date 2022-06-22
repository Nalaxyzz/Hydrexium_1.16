
package net.mcreator.hydrexium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.hydrexium.itemgroup.HydrexiumtabItemGroup;
import net.mcreator.hydrexium.Hydrexium116ModElements;

@Hydrexium116ModElements.ModElement.Tag
public class HoeenHydrexiumItem extends Hydrexium116ModElements.ModElement {
	@ObjectHolder("hydrexium_1_16:hoeen_hydrexium")
	public static final Item block = null;
	public HoeenHydrexiumItem(Hydrexium116ModElements instance) {
		super(instance, 132);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlaqueHydrexiumItem.block, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(HydrexiumtabItemGroup.tab)) {
		}.setRegistryName("hoeen_hydrexium"));
	}
}
