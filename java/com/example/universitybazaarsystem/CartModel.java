package com.example.universitybazaarsystem;

public class CartModel {
    private String Name,Price;

    public CartModel()
    {

    }
    public CartModel(String name, String price) {

        Name = name;
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
