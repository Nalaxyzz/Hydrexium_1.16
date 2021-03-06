
package net.mcreator.hydrexium.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.hydrexium.procedures.PlastronUltimeeffetProcedure;
import net.mcreator.hydrexium.procedures.JambieresUltimeeffetProcedure;
import net.mcreator.hydrexium.procedures.CasqueUltimeeffetProcedure;
import net.mcreator.hydrexium.procedures.BottesUltimeeffetProcedure;
import net.mcreator.hydrexium.itemgroup.HydrexiumtabItemGroup;
import net.mcreator.hydrexium.Hydrexium116ModElements;

import java.util.Map;
import java.util.HashMap;

@Hydrexium116ModElements.ModElement.Tag
public class UltimateArmorItem extends Hydrexium116ModElements.ModElement {
	@ObjectHolder("hydrexium_1_16:ultimate_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("hydrexium_1_16:ultimate_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("hydrexium_1_16:ultimate_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("hydrexium_1_16:ultimate_armor_boots")
	public static final Item boots = null;
	public UltimateArmorItem(Hydrexium116ModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 50;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{11, 15, 15, 11}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CoeurenHydrexiumItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "ultimate_armor";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 5f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(HydrexiumtabItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "hydrexium_1_16:textures/models/armor/nightmarev3__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onArmorTick(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					CasqueUltimeeffetProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("ultimate_armor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(HydrexiumtabItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "hydrexium_1_16:textures/models/armor/nightmarev3__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					PlastronUltimeeffetProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("ultimate_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(HydrexiumtabItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "hydrexium_1_16:textures/models/armor/nightmarev3__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					JambieresUltimeeffetProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("ultimate_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(HydrexiumtabItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "hydrexium_1_16:textures/models/armor/nightmarev3__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					BottesUltimeeffetProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("ultimate_armor_boots"));
	}
}
