package model.items;

public enum Items {
    GREEN_HERB("Green Herb"),
    RED_HERB("Red Herb"),
    SUPER_YELLOW_HERB("Super Yellow Herb"),
    SUPER_GREEN_HERB("Super Green Herb"),
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
