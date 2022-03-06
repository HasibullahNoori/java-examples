package com.company.classobject;

public class BikeRunner {

    public static void main(String[] args) {
        //when we create an object it invoke/calls constructor
        //when we don't define any constructor java itself provide default constructor at runtime
        Bike bike1 = new Bike();
        //first we are creating object then initializating states of object
        bike1.color = "Blue";
        bike1.brand = "NIKE";
        bike1.model = "EF12";
        bike1.price =  122.5;
        bike1.name = "Sports Bike";
        bike1.speed = "100 MPH";
        bike1.run(bike1.name, bike1.brand);

        //creation and initialization object is done at same time
        Bike bike2= new Bike("Red", "Apache 120", "Bajaj", 115.66, "Z-series", "80 MPH");
        System.out.println(bike1);
        System.out.println(bike2);

        bike1.run(bike1.name, bike1.brand);
        bike2.run(bike2.name, bike2.brand);

        System.out.println(bike1.getSpeedOfBike());
        System.out.println(bike2.getSpeedOfBike());
    }
}
