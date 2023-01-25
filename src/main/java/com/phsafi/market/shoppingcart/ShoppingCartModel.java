package com.phsafi.market.shoppingcart;

public class ShoppingCartModel {
    private int id;
    private String name;
    private float value;
    private int stock;

    public ShoppingCartModel(int id, String name, float value, int stock){
        this.id = id;
        this.name = name;
        this.value = value;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
