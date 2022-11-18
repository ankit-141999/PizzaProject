/*
 * Author : Pinky Sodhi
 * Date : 18-11-2022
 * Created Using : IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class Pizza {
    private String name;
    private double price;
    private int sizeInInches;

    public Pizza(String name, double price, int sizeInInches) {
        this.name = name;
        this.price = price;
        this.sizeInInches = sizeInInches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSizeInInches() {
        return sizeInInches;
    }

    public void setSizeInInches(int sizeInInches) {
        this.sizeInInches = sizeInInches;
    }

    @Override
    public String toString() {
        return String.format("%-15s\t₹%.2f\t%-5d", this.name, this.price, this.sizeInInches);
    }
}
