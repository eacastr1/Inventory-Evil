/**
 * <h1>Items.java</h1>
 * <p>An enumerator used to store Item name constants.</p>
 *
 * @author Eddie Andres Castro
 * @version 0.1
 */
package model.items;

public enum Items {
    GREEN_HERB("Green Herb"),
    RED_HERB("Red Herb"),
    MIXED_HERB("Mixed Herb"),
    MIXED_GREEN_HERB("Mixed Green Herb"),
    LIGHT_GUNPOWDER("Light Gunpowder"),
    HEAVY_GUNPOWDER("Heavy Gunpowder"),
    PISTOL_AMMO("Pistol Ammo"),
    SHOTGUN_AMMO("Shotgun Ammo"),
    MAGNUM_AMMO("Magnum Ammo"),
    PISTOL("Pistol"),
    SHOTGUN("Shotgun"),
    MAGNUM("Magnum"),
    KNIFE("Knife");

    private final String name;
    private Items(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
