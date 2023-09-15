//Menu.java
package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {

        this.lastUpdated = lastUpdated;
    }


    public void setItems(ArrayList<MenuItem> items) {

        this.items = items;
    }

    public Date getLastUpdated() {

        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {

        return items;
    }
    public void addItem(MenuItem item) {
        items.add(item);
        lastUpdated = new Date();
    }
    public void removeItem(MenuItem item) {
        items.remove(item);
        lastUpdated = new Date();
    }

    public void printMenuItem(MenuItem item) {
        System.out.println("Price: $" + item.getPrice());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Category: " + item.getCategory());
        System.out.println("Is New: " + (item.isNewItem() ? "Yes" : "No"));
    }
    public void printMenu() {
        System.out.println("Menu last updated on: " + lastUpdated);

        for (MenuItem item : items) {
            System.out.println("********************");
            printMenuItem(item);
            System.out.println("********************");
        }
    }
}


