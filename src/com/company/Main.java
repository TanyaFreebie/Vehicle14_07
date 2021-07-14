package com.company;

import java.util.Scanner;

public class Main {
    // 6th Task:
    // Create a class called Vehicle. Let this car have features like,
    // length of the vehicle, the number of seats, // no of tires, name/brand of the vehicle, current speed.

    // methods include: speed up(increases speed by 5), slow down (reduce speed by 5), start engine, stop engine.


    public static void main(String[] args) {
        Vehicle car =new Vehicle();
        Scanner id = new Scanner(System.in);

        System.out.println("Car brand: ");
        car.setBrand(id.next());

        System.out.println("Car color: ");
        car.setColor(id.next());

        System.out.println("Number of tires: ");
        car.setTires(id.nextInt());

        System.out.println("Number of seats: ");
        car.setSeats(id.nextInt());

        System.out.println("you are in " + car.getBrand());
        System.out.println("car is " + car.getColor());
        System.out.println("there is " + car.getSeats() + " seats");
        System.out.println("and there is " + car.getTires() + " tires");

        System.out.println("did you start an engine?(true/false)");
        car.startEngine(id.nextBoolean());

        System.out.println("do you want to go faster?(true/false) ");
        car.Speed(id.nextBoolean());

        car.stopEngine();








//        car.setColor("Blue");
//        System.out.println(car.getColor());
//
//        car.setNoOfTires(8);
//        car.setBrand("BMW limousine");
//        System.out.println(car.getNoOfTires());
//        System.out.println(car.getBrand());
//        System.out.println(Car.color);
//        System.out.println(Car.noOfTires);
//        System.out.println(Car.brand);
        // car.startEngine(true);
    }
}
