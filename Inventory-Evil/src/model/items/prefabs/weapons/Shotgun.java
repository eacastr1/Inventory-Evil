package model.items.prefabs.weapons;

import model.items.Types;
import model.items.ShootableWeapon;

public class Shotgun extends ShootableWeapon {

    public Shotgun(int index) {
        super("SG", "Shotgun", Types.WEAPON, index, 250, 6, 12);
    }
}
