package com.wipro.project5;

import java.util.ArrayList;

public class StringList {

    private ArrayList<String> list = new ArrayList<>();

    public void insert(String item) {
        list.add(item);
        System.out.println("Inserted successfully");
    }

    public void search(String item) {
        if (list.contains(item))
            System.out.println(item + " Found");
        else
            System.out.println(item + " Not Found");
    }

    public void delete(String item) {
        if (list.remove(item))
            System.out.println("Deleted successfully");
        else
            System.out.println("Item not found");
    }

    public void display() {

        if (list.isEmpty()) {
            System.out.println("List is Empty");
        } else {
            System.out.println("Items in List");
            for (String s : list)
                System.out.println(s);
        }
    }
}