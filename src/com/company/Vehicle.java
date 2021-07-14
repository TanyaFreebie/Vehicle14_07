package com.company;

import java.util.Scanner;

public class Vehicle {
    Scanner sc = new Scanner(System.in);
    private  String brand;
    private  String color;
    private float length;
    private  int tires;
    private int seats;
    private int increase;
    private int decrease;
    private int currentSpeed;





    public void startEngine(boolean yes){
        if(yes){
            System.out.println("Engine switched on!");
        } else {
            System.out.println("Please start engine");
        }
    }
    public int Speed(boolean faster) {
        System.out.println("how fast are you going? ");
        currentSpeed = sc.nextInt();

        if(faster) {

            System.out.println("How many times you want to increase your speed by 5kmph? ");
            increase = sc.nextInt();
            currentSpeed = currentSpeed + (increase * 5);
        } else {if(currentSpeed == 0){
            System.out.println("you aren't moving at all!");
        } else {
            System.out.println("How many times you want to decrease your speed by 5kmph? ");
            decrease = sc.nextInt();
            currentSpeed = currentSpeed - (decrease * 5);
        }

        }
        System.out.println("Done! your current speed now is " + currentSpeed);
        return currentSpeed;
    }

    public void stopEngine(){

        System.out.println("Engine switched off!");
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public int getTires() {
        return this.tires;
    }
    public void setTires(int tires){
        this.tires = tires;
    }
    public int getSeats() {
        return this.seats;
    }
    public void setSeats(int seats){
        this.seats = seats;
    }


}
