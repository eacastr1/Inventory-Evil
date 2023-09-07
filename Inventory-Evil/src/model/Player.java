package model;

public class Player {
    private static final Player PLAYER = new Player();

    public static Player getInstance() {
        return PLAYER;
    }

    private String name;
    private int health;

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
}
