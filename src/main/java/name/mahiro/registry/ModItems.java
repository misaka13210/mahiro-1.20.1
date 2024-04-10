package name.mahiro.registry;

import name.mahiro.Mahiro;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.OceanRuinStructure;

public class ModItems {
    public static Item registpsItem(String name, Item item, ItemGroup... itemGroups) {
        Item registeredItem= Registry.register(Registries.ITEM, new Identifier(Mahiro.MOD_ID,name), item)
    }

}
