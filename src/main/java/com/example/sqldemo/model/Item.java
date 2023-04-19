package com.example.sqldemo.model;

import java.io.Serializable;

public class Item implements Serializable {
    private int id;
    private String price, date, category, title;

    public Item() {
    }

    public Item(int id, String price, String date, String category, String title) {
        this.id = id;
        this.price = price;
        this.date = date;
        this.category = category;
        this.title = title;
    }

    public Item(String price, String date, String category, String title) {
        this.price = price;
        this.date = date;
        this.category = category;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
