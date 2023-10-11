package model.items.prefabs.weapons;

import model.items.Items;
import model.items.ShootableWeapon;

public class Shotgun extends ShootableWeapon {

    public Shotgun(int index) {
        super("SG", Items.SHOTGUN, index, 250, 6, 12);
    }
}
