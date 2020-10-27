package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BreakfastMenu {
    ArrayList menuItems;

    public BreakfastMenu() {
        this.menuItems = new ArrayList();

        addItem("egg", true, 7);
        addItem("bread with cheese", true, 5);
    }

    private void addItem(String name, boolean isVegetarian, double price){
        MenuItem menuItem = new MenuItem(name, isVegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
