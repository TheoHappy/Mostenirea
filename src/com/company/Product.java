package com.company;

public class Product {
    String nameOfProduct;
    String brand;
    float price;
    boolean delivery;
    int stock; // numarul de produse disponibile la depozit

    Product(String nameOfProduct, String brand, float price, boolean delivery, int stock)
    {
        this.nameOfProduct = nameOfProduct;
        this.brand = brand;
        this.price = price;
        this.delivery = delivery;
        this.stock = stock;
    }

    public String getNameOfProduct()
    {
        return this.nameOfProduct;
    }
    public String getBrand()
    {
        return this.brand;
    }
    public float getPrice()
    {
        return this.price;
    }
    public  boolean getDelivery() { return this.delivery; }
    public int getStock() {
        return this.stock;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return nameOfProduct + " " + brand + " " + price + " " + delivery + " " + stock ;
    }
}
