package model;

public class Player {
    private static final Player PLAYER = new Player();

    public static Player getInstance() {
        return PLAYER;
    }

    private String name;
    private int health;
    private int pistolAmmo, shotgunAmmo, magnumAmmo;

    private Player() {
        name = "Valentine";
        health = 100;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getAmmo(String name) throws IllegalArgumentException {
        switch(name) {
            case "Pistol": return pistolAmmo;
            case "Shotgun": return shotgunAmmo;
            case "Magnum": return magnumAmmo;
            default: throw new IllegalArgumentException("Items name must be an ammo prefab...");
        }
    }
}
