package model.items.prefabs.herbs;

import model.items.Item;
import model.items.Items;
import model.items.aspects.Craftable;

public class RedHerb extends Item implements Craftable {

    public RedHerb(int index) {
        super("RH", Items.RED_HERB, index, 15);
    }
}
