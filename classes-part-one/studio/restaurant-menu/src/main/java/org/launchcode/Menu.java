package org.launchcode;


import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItems> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public Menu(ArrayList<MenuItems> menuItems, LocalDate lastUpdated) {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItems> getMenuItems() {
        return menuItems;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setMenuItems(ArrayList<MenuItems> menuItems) {
        this.menuItems = menuItems;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
