package model.items.prefabs.herbs;

import model.items.Item;
import model.items.Types;
import model.items.aspects.Craftable;

public class RedHerb extends Item implements Craftable {

    public RedHerb(int index) {
        super("RH", "Red Herb", Types.HERB, index, 15);
    }
}
