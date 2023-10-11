package model.items.prefabs.herbs;

import model.items.ConsumableItem;
import model.items.Items;

public class MixedHerb extends ConsumableItem {
    public MixedHerb(int index) {
        super("MH", Items.MIXED_HERB, index, 25, 100);
    }
}
