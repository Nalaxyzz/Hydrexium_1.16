
package net.mcreator.hydrexium.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.hydrexium.item.CoeurenHydrexiumItem;
import net.mcreator.hydrexium.Hydrexium116ModElements;

@Hydrexium116ModElements.ModElement.Tag
public class HydrexiumtabItemGroup extends Hydrexium116ModElements.ModElement {
	public HydrexiumtabItemGroup(Hydrexium116ModElements instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabhydrexiumtab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CoeurenHydrexiumItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
