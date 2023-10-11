package model.items.prefabs.ammo;

import model.items.Types;
import model.items.StackableItem;

public class PistolAmmo extends StackableItem {

    public PistolAmmo(int index) {
        super("PA", "Pistol Ammo", Types.AMMO, index, 15, 60, 10);
    }
}
