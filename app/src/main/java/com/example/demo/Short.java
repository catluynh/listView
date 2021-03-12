package com.example.demo;

public class Short {
    private String name;
    private String price;
    private int imageShort;

    public Short(String name, String price, int imageShort) {
        this.name = name;
        this.price = price;
        this.imageShort = imageShort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageShort() {
        return imageShort;
    }

    public void setImageShort(int imageShort) {
        this.imageShort = imageShort;
    }
}
