package com.qa.utils.javaObject;

public class Hotel {
    private String name;
    private String address;
    private String price;
    private int star;

    public Hotel(String name, String address, String price, int star) {
        this.name = name;
        this.address = address;
        this.price = price;
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}
