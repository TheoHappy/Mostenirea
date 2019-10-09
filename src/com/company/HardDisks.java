package com.company;

public class HardDisks  extends  Product{
    private String format;
    private int capacity;
    private int rotationSpeed;
    private int cache;

    public HardDisks(String nameOfProduct, String brand, float price, boolean delivery, int stock, String format, int capacity, int rotationSpeed, int cache) {
        super(nameOfProduct, brand, price, delivery, stock);
        this.format = format;
        this.capacity = capacity;
        this.rotationSpeed = rotationSpeed;
        this.cache = cache;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    @Override
    public String toString() {
        return "Category: HardDisks {"+
                " Name of product = " + nameOfProduct +
                ", Brand = " + brand +
                ", Price = " + price + " $" +
                ", Delivery = " + delivery +
                ", Format = " + format +
                ", Capacity = " + capacity + " GB" +
                ", RotationSpeed = " + rotationSpeed +
                ", Cache = " + cache + " }";
    }

}
