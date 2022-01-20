package com.company.restaurant;

public class MenuItem {
    //Class Variables
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean isNew;

    //Constructors
    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "Uncategorized";
        this.isNew = false;
    }

    public MenuItem(String name, String description, double price, String category, boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;

        this.isNew = true;
    }


    //Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    //Methods
}
