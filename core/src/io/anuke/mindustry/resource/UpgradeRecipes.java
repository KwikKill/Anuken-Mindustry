package io.anuke.mindustry.resource;

import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.ObjectMap.Entries;
import io.anuke.ucore.util.Mathf;

public class UpgradeRecipes {
    private static final ObjectMap<Upgrade, ItemStack[]> recipes = Mathf.map(
            Weapon.triblaster, list(stack(Item.iron, 20), stack(Item.steel, 20)),
            Weapon.clustergun, list(stack(Item.iron, 30), stack(Item.steel, 40)),
            Weapon.vulcan, list(stack(Item.iron, 15), stack(Item.steel, 30), stack(Item.titanium, 15)),
            Weapon.beam, list(stack(Item.steel, 120), stack(Item.titanium, 60), stack(Item.dirium, 40)),
            Weapon.shockgun, list(stack(Item.steel, 60), stack(Item.titanium, 60), stack(Item.dirium, 60))
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
