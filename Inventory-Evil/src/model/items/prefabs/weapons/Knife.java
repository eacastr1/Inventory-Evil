package model.items.prefabs.weapons;

import model.items.Types;
import model.items.WeaponItem;

public class Knife extends WeaponItem {
    private int durability = 10;

    public Knife(int index) {
        super("KN", "Knife", Types.WEAPON, index, 10);
    }

    @Override
    public void use() {
        if(isEquipped && durability > 0) {
            durability--;
        }
    }

    public int getDurability() {
        return durability;
    }
}
