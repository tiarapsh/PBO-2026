package MidExam_TiaraPashaRamadhani_22_254107060138.Q2;

public class Car extends Vehicle {
    private String fuelType;
    private int numberOfDoors;

    public Car(String brand, int speed, String fuelType, int numberOfDoors) {
        super(brand, speed);
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String f) {
        this.fuelType = f;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int doors) {
        this.numberOfDoors = doors;
    }

    public void honk() {
        System.out.println("Car horn: Tin tin!");
    }

    public void honk(int times) {
        System.out.print("Car horn sounded " + times + " times: ");
        for (int i = 0; i < times; i++) {
            System.out.print("Tin! ");
        }
        System.out.println();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Type      : " + fuelType);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
