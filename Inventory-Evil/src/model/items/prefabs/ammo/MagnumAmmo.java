package model.items.prefabs.ammo;

import model.items.Items;
import model.items.StackableItem;

public class MagnumAmmo extends StackableItem {

    public MagnumAmmo(int index) {
        super("MA", Items.MAGNUM_AMMO, index, 60, 12, 3);
    }
}
