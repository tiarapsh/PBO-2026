package Jobsheet8.Task;

public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected double speed;

    public Vehicle(String brand, int year, double speed) {
        this.brand = brand;
        this.year = year;
        this.speed = speed;
    }

    public void startEngine() {
        System.out.println("Engine " + brand + " on.");
    }

    public void stopEngine() {
        System.out.println("Engine " + brand + " off.");
    }

    public abstract void move();

    public abstract void refuel();
}
