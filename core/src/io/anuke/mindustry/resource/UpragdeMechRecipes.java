package io.anuke.mindustry.resource;

import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.ObjectMap.Entries;
import io.anuke.ucore.util.Mathf;

public class UpgradeMechRecipes {
    private static final ObjectMap<Upgrade, ItemStack[]> recipes = Mathf.map(
            Mech.omnimech, list(stack(Item.iron, 40), stack(Item.steel, 40)),
            Mech.speedmech, list(stack(Item.iron, 60), stack(Item.steel, 80)),
            Mech.defensemech, list(stack(Item.iron, 60), stack(Item.steel, 60), stack(Item.titanium, 30)),
        );

    private static final ItemStack[] empty = {};

    public static ItemStack[] get(Upgrade upgrade){
        return recipes.get(upgrade, empty);
    }

    public static Entries<Upgrade, ItemStack[]> getAllRecipes(){
        return recipes.entries();
    }

    private static ItemStack[] list(ItemStack... stacks){
        return stacks;
    }

    private static ItemStack stack(Item item, int amount){
        return new ItemStack(item, amount);
    }
}
