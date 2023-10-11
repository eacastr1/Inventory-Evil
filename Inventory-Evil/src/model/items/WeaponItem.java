/**
 * <h1>WeaponItem.java</h1>
 * <p>An abstract class for weapon item objects.</p>
 *
 * @author Eddie Andres Castro
 * @version 0.1
 */
package model.items;

import model.items.aspects.Equippable;
import model.items.aspects.Usable;

public abstract class WeaponItem extends Item implements Equippable, Usable {
    protected boolean isEquipped;

    public WeaponItem(String id, String name, Types type, int index, int value) {
        super(id, name, type, index, value);
        isEquipped = false;
    }

    public abstract void use();
}
