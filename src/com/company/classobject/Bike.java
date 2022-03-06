package com.company.classobject;

public class Bike {

    //states of an object
    //these are some variable
    //states means parameters to identify any object
    String color;
    String name;
    String brand;
    Double price;
    String model;
    String speed;

    //default constructor
    public Bike() {
    }

    //custom constructor
    public Bike(String color, String name, String brand, Double price, String model, String speed) {
        this.color = color;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.speed = speed;
    }

//    methods

    //behavior we call it method in java term
    //return type void means not returning anything
    public void run(String bikeName, String bikeBrand){
        System.out.println(bikeName + " of " + bikeBrand + " is running");
    }

    //method takes some parameter and return some value
    //here it is returning some string value
    public String getSpeedOfBike(){
        return this.speed;
    }


//to string is method to print content of class
    //if we dont override it will pring address of that class

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
