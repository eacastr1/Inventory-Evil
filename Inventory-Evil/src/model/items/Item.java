/**
 *<h1>Item.java</h1>
 * <p>An abstract class for items in Inventory Evil.</p>
 *
 * @author Eddie Andres Castro
 * @version 0.1
 */
package model.items;

import java.io.Serializable;

public abstract class Item implements Comparable<Item>, Serializable {
    private final String id, name;
    private final Types type;
    private final int value;
    private int index;

    /**
     * Instantiates an Item object.
     * @param id The ID of the item.
     * @param name The name of the item.
     * @param index The index of the item, in the context of a List.
     * @param value The value of the item for which to be sold.
     */
    public Item(String id, String name, Types type, int index, int value) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.index = index;
        this.value = value;
    }

    public static boolean compareTypes(Item item1, Item item2) {
        return item1.getType().equals(item2.getType());
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public Types getType() { return type; }

    public int getValue() {
        return value;
    }

    public String getID() {
        return id;
    }

    /**
     * Compares concrete Item objects based on their value.
     * @param o the object to be compared.
     * @return a result value of the comparison between this object and the object to be compared.
     */
    @Override
    public int compareTo(Item o) {
        return Integer.compare(value, o.getValue());
    }
}
