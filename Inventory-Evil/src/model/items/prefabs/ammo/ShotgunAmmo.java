package model.items.prefabs.ammo;

import model.items.Items;
import model.items.StackableItem;

public class ShotgunAmmo extends StackableItem {

    public ShotgunAmmo(int index) {
        super("SA", Items.SHOTGUN_AMMO, index, 30, 20, 5);
    }
}
