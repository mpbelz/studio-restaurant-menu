package com.company.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {

        LocalDate dateUpdated = LocalDate.now();
        ArrayList<MenuItem> menu = new ArrayList<>();

        MenuItem newItem = new MenuItem("Hamburger", 1.00, "Single patty with lettuce and cheese", "Main");
        updateMenu(dateUpdated, menu, newItem);
        printMenu(dateUpdated, menu);


        MenuItem newItem2 = new MenuItem("Fries", 0.50, "Salted fries with ketchup", "Appetizer");
        updateMenu(dateUpdated, menu, newItem2);
        printMenu(dateUpdated, menu);

    }

    public static void printMenu(LocalDate date, ArrayList<MenuItem> list){

        System.out.println("\nMenu Updated: " + date);
        for (MenuItem item : list){
            System.out.println("\n*** " + item.getName() + " ***");
            if(item.isNew()){System.out.println("NEW");}
            System.out.println("Category: " + item.getCategory() +
                    "\nDescription: " + item.getDescription() +
                    "\nPrice: $" + item.getPrice());
        }
    }

    public static void updateMenu(LocalDate date, ArrayList<MenuItem> list, MenuItem newMenuItem){

        for(MenuItem item : list){
            item.setNew(false);
        }

        list.add(newMenuItem);
        date = LocalDate.now();

    }

}

