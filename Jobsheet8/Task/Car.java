package Jobsheet8.Task;

public class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    public Car(String brand, int year, double speed, int numberOfDoors, String fuelType) {
        super(brand, year, speed);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    @Override
    public void move() {
        System.out.println("Car " + brand + " driving on the highway at a speed of " + speed + " km/jam.");
    }

    @Override
    public void refuel() {
        System.out.println("Fueling a car with " + fuelType + ".");
    }

    public void openTrunk() {
        System.out.println("Car trunk type " + numberOfDoors + " this door is open.");
    }
}
