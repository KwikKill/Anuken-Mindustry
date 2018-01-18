package io.anuke.mindustry.resource;

import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.ObjectMap.Entries;
import io.anuke.ucore.util.Mathf;

public class UpgradeRecipes {
    private static final ObjectMap<Upgrade, ItemStack[]> recipes = Mathf.map(
            Weapon.triblaster, list(stack(Item.iron, 4), stack(Item.steel, 4)),
            Weapon.clustergun, list(stack(Item.iron, 6), stack(Item.steel, 8)),
            Weapon.vulcan, list(stack(Item.iron, 6), stack(Item.steel, 12), stack(Item.titanium, 6)),
            Weapon.beam, list(stack(Item.steel, 24), stack(Item.titanium, 12), stack(Item.dirium, 8)),
            Weapon.shockgun, list(stack(Item.steel, 12), stack(Item.titanium, 12), stack(Item.dirium, 12))
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
