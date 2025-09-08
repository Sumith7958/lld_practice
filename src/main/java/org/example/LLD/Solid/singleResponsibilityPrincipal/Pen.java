package org.example.LLD.Solid.singleResponsibilityPrincipal;


public class Pen {
    int product_id;
    String color;
    String type;
    int Price;
    int year;

    public Pen(int product_id, String color, String type, int price, int year) {
        this.product_id = product_id;
        this.color = color;
        this.type = type;
        Price = price;
        this.year = year;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}




