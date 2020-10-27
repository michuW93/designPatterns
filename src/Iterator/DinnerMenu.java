package Iterator;

import java.util.Iterator;

public class DinnerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem("spaghetti", false, 25);
        addItem("pizza", false, 29);
    }

    public void addItem(String name, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu is full, cant add");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}