package model.items;

import model.Player;
import model.items.aspects.Usable;

public class ConsumableItem extends Item implements Usable {
    protected int recovery;

    public ConsumableItem(String id, String name, int index, int value, int recovery) {
        super(id, name, index, value);
        this.recovery = recovery;
    }

    @Override
    public void use() {
        Player player = Player.getInstance();
        player.setHealth(player.getHealth() + recovery);
    }
}
