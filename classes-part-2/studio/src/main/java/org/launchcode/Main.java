package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem(10.99, "Caesar Salad", "Salad", true);
        MenuItem item2 = new MenuItem(19.99, "Pasta", "Launch", false);
        MenuItem item3 = new MenuItem(7.99, "Cheese Cake", "Dessert", true);

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(item1);
        menuItems.add(item2);
        menuItems.add(item3);

        Menu menu = new Menu(new Date(), menuItems);

        // Print the entire menu
        menu.printMenu();

        // Print an individual menu item
        menu.printMenuItem(item2);

        // Remove an item and reprint the menu
        menu.removeItem(item1);
        menu.printMenu();
    }
}
