package MidExam_TiaraPashaRamadhani_22_254107060138.Q2;

public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String brand, int speed, int numberOfDoors, double batteryCapacity) {
        super(brand, speed, "Battery / Electricity", numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double c) {
        this.batteryCapacity = c;
    }

    public void chargeBattery() {
        System.out.println("Charge the battery to full capacity...");
    }

    public void chargeBattery(int percentage) {
        System.out.println("Charge the battery to the target level: " + percentage + "%");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Car " + getBrand() + " speed up to " + getMaxSpeed() + " km/jam.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
