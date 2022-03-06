package com.company.classobject;

public class Mobile {

    String mobileName;
    String color;
    int year;
    String model;
    int price;

    public Mobile() {
    }

    public Mobile(String mobileName, String color, int year, String model, int price) {
        this.mobileName = mobileName;
        this.color = color;
        this.year = year;
        this.model = model;
        this.price = price;
    }

    public int getprice(){
        return this.price;
    }

    public void printMobileColor(String mobileName){
        System.out.println(mobileName + " is of colour " + this.color);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "mobileName='" + mobileName + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

