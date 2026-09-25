package id.ac.polinema.oop;

/**
 * The cafe menu: holds up to 10 {@link MenuItem} objects.
 *
 * This is an AGGREGATION: the MenuItem objects are created outside
 * and passed in — they can exist without the Menu.
 *
 * Complete every method body below (replace the
 * {@code throw new UnsupportedOperationException(...)} lines).
 * Use a plain array, NOT List/ArrayList.
 *
 * Declare the fields yourself: see the class diagram in the README
 * (all fields must be private).
 */
public class Menu {
    private MenuItem[] items;
    private int itemCount;
    
    /**
     * Creates an empty menu: initialize the array with capacity 10
     * and the counter with 0.
     */
    public Menu() {
        this.items = new MenuItem[10];
        this.itemCount = 0;
    }

    /**
     * Adds an item at index {@code itemCount}, then increments the counter.
     * When the menu is full (10 items), do nothing.
     *
     * @param item the menu item to add
     */
    public void addMenuItem(MenuItem item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        }
    }

    /**
     * Searches the stored items by exact name.
     *
     * @param name item name to look for
     * @return the matching MenuItem, or {@code null} when not found
     */
    public MenuItem findItem(String name) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getName().equals(name)) {
                return  items[i];
            }
        }
        return  null;
    }

    public int getItemCount() {
        return itemCount;
    }
}
