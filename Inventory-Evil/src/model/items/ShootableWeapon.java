package model.items;

public class ShootableWeapon extends WeaponItem {
    protected final int defaultAmmo, maxAmmo;
    // The current ammunition in the weapon, and the ammunition available to be added.
    protected int currentAmmo, availableAmmo;
    private StackableItem ammo;

    public ShootableWeapon(String id, Items name, int index, int value,
                           int defaultAmmo, int maxAmmo) {
        super(id, name, index, value);
        this.defaultAmmo = defaultAmmo;
        this.maxAmmo = maxAmmo;
        this.availableAmmo = 0;
        currentAmmo = defaultAmmo;
    }

    @Override
    public void use() {
        if(isEquipped && currentAmmo > 0) {
            currentAmmo--;
        }
    }

    /*
    public void reload() {
        if(currentAmmo + availableAmmo >= maxAmmo) {
            availableAmmo -= maxAmmo - currentAmmo;
            this.currentAmmo = maxAmmo;
        } else {
            int amount = maxAmmo - currentAmmo;
            availableAmmo -= amount;
            // BLAH TOO TIRED AND HUNGRY TO CODE
        }
    }*/

    /**
     * Adds ammo into the available ammo stockpile.
     * @param ammo The ammo to add.
     */
    public void setAvailableAmmo(int ammo) {
        availableAmmo += ammo;
    }

    public int getAvailableAmmo() {
        return availableAmmo;
    }

    public void setCurrentAmmo(int ammo) {
        currentAmmo = ammo;
    }

    public int getCurrentAmmo() {
        return currentAmmo;
    }
}
