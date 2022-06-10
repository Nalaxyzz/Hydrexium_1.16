
package net.mcreator.hydrexium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.hydrexium.itemgroup.HydrexiumtabItemGroup;
import net.mcreator.hydrexium.Hydrexium116ModElements;

@Hydrexium116ModElements.ModElement.Tag
public class EpeeenHydrexiumavenceItem extends Hydrexium116ModElements.ModElement {
	@ObjectHolder("hydrexium_1_16:epeeen_hydrexiumavence")
	public static final Item block = null;
	public EpeeenHydrexiumavenceItem(Hydrexium116ModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 9f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlaqueHydrexiumItem.block, (int) (1)));
			}
		}, 3, -2.4f, new Item.Properties().group(HydrexiumtabItemGroup.tab)) {
		}.setRegistryName("epeeen_hydrexiumavence"));
	}
}
