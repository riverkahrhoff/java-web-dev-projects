package org.launchcode;


import java.time.LocalDate;

public class MenuItems {
    private String description;
    private Double price;
    private String[] category = {"appetizer", "main course", "dessert"};
    private LocalDate dateAdded;

    public MenuItems(String description, Double price, String[] category, LocalDate dateAdded) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = dateAdded;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String[] getCategory() {
        return category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }
}
