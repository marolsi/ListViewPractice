package com.example.listviewpractice;

/**
 * Created by mariah on 10/21/17.
 */

public class ColorItem {
    private String name;
    private int id;

    public ColorItem(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
