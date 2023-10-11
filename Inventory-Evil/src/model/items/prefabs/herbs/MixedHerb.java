package model.items.prefabs.herbs;

import model.items.ConsumableItem;
import model.items.Types;

public class MixedHerb extends ConsumableItem {
    public MixedHerb(int index) {
        super("MH", "Mixed Herb", Types.HERB, index, 25, 100);
    }
}
