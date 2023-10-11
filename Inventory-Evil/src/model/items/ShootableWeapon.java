package model.items;

public class ShootableWeapon extends WeaponItem {
    protected final int defaultAmmo, maxAmmo;
    // The current ammunition in the weapon, and the ammunition available to be added.
    protected int currentAmmo, availableAmmo;

    public ShootableWeapon(String id, String name, Types type, int index, int value,
                           int defaultAmmo, int maxAmmo) {
        super(id, name, type, index, value);
        this.defaultAmmo = defaultAmmo;
        this.maxAmmo = maxAmmo;
        this.availableAmmo = 0;
        currentAmmo = defaultAmmo;
    }

    @Override
    public void use() {
        if(currentAmmo > 0) {
            currentAmmo--;
        }
    }

    /**
     * Adds ammo into the available ammo stockpile.
     * @param ammo The ammo to add.
     */
    public void setAvailableAmmo(int ammo) throws IllegalArgumentException {
        if(ammo < 0) {
            throw new IllegalArgumentException("Ammo cannot be negative!");
        }
        availableAmmo = ammo;
    }

    public int getAvailableAmmo() {
        return availableAmmo;
    }

    public void setCurrentAmmo(int ammo) throws IllegalArgumentException {
        if(ammo < 0) {
            throw new IllegalArgumentException("Ammo cannot be negative!");
        }
        currentAmmo = ammo;
    }

    public int getCurrentAmmo() {
        return currentAmmo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }
}
