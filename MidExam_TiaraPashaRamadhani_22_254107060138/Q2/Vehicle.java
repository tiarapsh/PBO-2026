package MidExam_TiaraPashaRamadhani_22_254107060138.Q2;

public class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return speed;
    }

    public void setMaxSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        System.out.println(brand + " with accelerating " + speed + " km/jam.");
    }

    public void accelerate(int increment) {
        this.speed += increment;
        System.out.println(brand + " increase speed " + increment + " km/jam. Speed now: " + this.speed
                + " km/jam.");
    }

    public void displayInfo() {
        System.out.println("Brand          : " + brand);
        System.out.println("Max Speed : " + speed + " km/jam");
    }
}
