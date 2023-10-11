/**
 * <h1>StackableItem.java</h1>
 * <p>An abstract class for stackable items.</p>
 *
 * @author Eddie Andres Castro
 * @version 0.1
 */
package model.items;

public abstract class StackableItem extends Item {
    private final int maxCapacity;
    private int currentCapacity;

    public StackableItem(String id, String name, Types type, int index, int value,
                         int maxCapacity, int startCapacity) {
        super(id, name, type, index, value);
        this.maxCapacity = maxCapacity;
        currentCapacity = startCapacity;
    }

    /**
     * Stacks items together, combining capacities.
     * @param item item to be stacked.
     * @return A result value of the combined current capacities to the maximum capacity.
     */
    public int stack(StackableItem item) {
        if(currentCapacity + item.currentCapacity > maxCapacity) {
            currentCapacity = maxCapacity;
            return 1;
        }
        else if(currentCapacity + item.currentCapacity == maxCapacity) {
            currentCapacity = maxCapacity;
            return 0;
        }
        else {
            currentCapacity += item.currentCapacity;
            return -1;
        }
    }

    public void consume() {
        if(currentCapacity > 0) {
            this.currentCapacity--;
        }
    }
}
