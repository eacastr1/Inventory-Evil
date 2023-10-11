package model.items.prefabs.weapons;

import model.items.Items;
import model.items.ShootableWeapon;

public class Pistol extends ShootableWeapon {

    public Pistol(int index) {
        super("PG", Items.PISTOL, index, 100, 5, 15);
    }
}
