package Iterator;

import java.util.Iterator;

public class Waitress {
    BreakfastMenu breakfastMenu;
    DinnerMenu dinnerMenu;

    public Waitress(BreakfastMenu breakfastMenu, DinnerMenu dinnerMenu) {
        this.breakfastMenu = breakfastMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu(){
        Iterator breakfastIterator = breakfastMenu.createIterator();
        Iterator dinerIterator = dinnerMenu.createIterator();
        System.out.println("Breakfast: ");
        printMenu(breakfastIterator);
        System.out.println("Diner: ");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName());
            System.out.print(menuItem.getPrice());
        }
    }
}
