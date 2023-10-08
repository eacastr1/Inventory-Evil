package model.items.prefabs.ammo;

import model.items.Items;
import model.items.StackableItem;

public class PistolAmmo extends StackableItem {

    public PistolAmmo(int index) {
        super("PA", Items.PISTOL_AMMO, index, 15, 60, 10);
    }
}
