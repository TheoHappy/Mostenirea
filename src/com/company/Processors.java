package com.company;

public class Processors  extends  Product{
    boolean cooler;
    String cpuSocket;
    float frequency;
    int nrOfCores;
    int cache;

    public Processors(String nameOfProduct, String brand, float price, boolean delivery, int stock, boolean cooler, String cpuSocket, Float frequency, int nrOfCores, int cache)
    {
        super(nameOfProduct, brand, price, delivery, stock);
        this.cooler = cooler;
        this.cpuSocket = cpuSocket;
        this.frequency = frequency;
        this.nrOfCores = nrOfCores;
        this.cache = cache;
    }

    public boolean isCooler() {
        return cooler;
    }

    public void setCooler(boolean cooler) {
        this.cooler = cooler;
    }

    public String getCpuSocket() {
        return cpuSocket;
    }

    public void setCpuSocket(String cpuSocket) {
        this.cpuSocket = cpuSocket;
    }

    public Float getFrequency() {
        return frequency;
    }

    public void setFrequency(Float frequency) {
        this.frequency = frequency;
    }

    public int getNrOfCores() {
        return nrOfCores;
    }

    public void setNrOfCores(int nrOfCores) {
        this.nrOfCores = nrOfCores;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    @Override
    public String toString() {
        return "Category: Processors {" +
                " Name of product = " + nameOfProduct +
                ", Brand = " + brand +
                ", Price = " + price + " $" +
                ", Delivery = " + delivery +
                " Cooler = " + cooler +
                ", CpuSocket = " + cpuSocket  + " GHz"+
                ", Frequency = " + frequency +
                ", NrOfCores = " + nrOfCores +
                ", Cache = " + cache + "Mb"+
                '}';
    }
}
