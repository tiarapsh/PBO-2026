package Jobsheet8.Task;

public class Airplane extends Vehicle {
    private int maxAltitude;
    private double wingSpan;

    public Airplane(String brand, int year, double speed, int maxAltitude, double wingSpan) {
        super(brand, year, speed);
        this.maxAltitude = maxAltitude;
        this.wingSpan = wingSpan;
    }

    @Override
    public void move() {
        System.out.println("Airplane " + brand + " flying in the sky at an altitude of " + maxAltitude + " feet.");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the airplane with aviation fuel.");
    }

    public void land() {
        System.out.println("Airplane with wing span " + wingSpan + " meters is ready for landing.");
    }
}
