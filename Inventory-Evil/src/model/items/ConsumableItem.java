/**
 * <h1>ConsumableItem.java</h1>
 * <p>A concrete class for consumable item objects.</p>
 *
 * @author Eddie Andres Castro
 * @version 0.1
 */
package model.items;

import model.Player;
import model.items.aspects.Usable;

public class ConsumableItem extends Item implements Usable {
    protected int recovery;

    public ConsumableItem(String id, Items name, int index, int value, int recovery) {
        super(id, name, index, value);
        this.recovery = recovery;
    }

    /**
     * Recovers the player's health when used.
     */
    @Override
    public void use() {
        Player player = Player.getInstance();
        player.setHealth(player.getHealth() + recovery);
    }
}
