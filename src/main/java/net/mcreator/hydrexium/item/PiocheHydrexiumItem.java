
package net.mcreator.hydrexium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.hydrexium.itemgroup.HydrexiumtabItemGroup;
import net.mcreator.hydrexium.Hydrexium116ModElements;

@Hydrexium116ModElements.ModElement.Tag
public class PiocheHydrexiumItem extends Hydrexium116ModElements.ModElement {
	@ObjectHolder("hydrexium_1_16:pioche_hydrexium")
	public static final Item block = null;
	public PiocheHydrexiumItem(Hydrexium116ModElements instance) {
		super(instance, 131);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}, 1, -3f, new Item.Properties().group(HydrexiumtabItemGroup.tab)) {
		}.setRegistryName("pioche_hydrexium"));
	}
}
