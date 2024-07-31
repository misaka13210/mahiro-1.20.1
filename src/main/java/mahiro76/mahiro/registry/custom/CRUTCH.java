package com.example.myswordmod.items;

import mahiro76.mahiro.registry.ModItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CRUTCH extends ToolItem {

    public CRUTCH() {
        super(ToolMaterials.IRON, new Item.Settings().group(ItemGroup.));
    }

    // 你可以重写一些方法来定义特殊效果，比如攻击、耐久等
}