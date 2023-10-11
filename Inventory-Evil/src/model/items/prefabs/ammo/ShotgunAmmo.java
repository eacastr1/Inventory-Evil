package model.items.prefabs.ammo;

import model.items.Types;
import model.items.StackableItem;

public class ShotgunAmmo extends StackableItem {

    public ShotgunAmmo(int index) {
        super("SA", "Shotgun Ammo", Types.AMMO, index, 30, 20, 5);
    }
}
