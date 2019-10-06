package com.company;


public class Computers extends Product {
    String cpu;
    String gpu;
    String motherboard;
    int ram;
    int rom;

    Computers(String nameOfProduct, String brand, float price, boolean delivery, int stock, String cpu, String gpu, String motherboard, int ram, int rom) {
        super(nameOfProduct, brand, price, delivery, stock);
        this.cpu = cpu;
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.ram = ram;
        this.rom = rom;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;

    }

    @Override
    public String toString() {
        return "Category: Computers {" +
                " Name of product = " + nameOfProduct +
                ", Brand = " + brand +
                ", Price = " + price + "$" +
                ", Delivery = " + delivery +
                ", Stock = " + stock +
                ", Cpu = " + cpu +
                ", Gpu = " + gpu +
                ", Motherboard = " + motherboard +
                ", RAM = " + ram + "GB" +
                ", ROM = " + rom + "GB }";

    }
}
