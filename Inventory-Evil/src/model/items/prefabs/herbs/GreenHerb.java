package model.items.prefabs.herbs;

import model.items.ConsumableItem;
import model.items.Types;
import model.items.aspects.Craftable;
import model.items.aspects.Usable;

public class GreenHerb extends ConsumableItem implements Usable, Craftable {

    public GreenHerb(int index) {
        super("GH", "Green Herb", Types.HERB, index,  10, 25);
    }
}
