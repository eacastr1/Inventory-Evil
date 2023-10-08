package model.items;

import model.items.aspects.Equippable;
import model.items.aspects.Usable;

public abstract class WeaponItem extends Item implements Equippable, Usable {
    protected boolean isEquipped;

    public WeaponItem(String id, Items name, int index, int value) {
        super(id, name, index, value);
        isEquipped = false;
    }

    public abstract void use();
}
