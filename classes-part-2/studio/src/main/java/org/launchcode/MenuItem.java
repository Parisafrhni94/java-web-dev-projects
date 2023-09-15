//MenuItem.java
package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }
    //price
    public void setPrice(double price) {

        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    //Description
    public void setDescription(String description) {

        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    //category
    public void setCategory(String category) {

        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public void setNew(boolean aNew) {

        isNew = aNew;
    }

    //Method to Determine if Menu Item is new
    public boolean isNewItem() {
        return isNew;
    }

}

