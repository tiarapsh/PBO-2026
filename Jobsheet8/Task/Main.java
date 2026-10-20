package Jobsheet8.Task;

public class Main {
    public static void main(String[] args) {
        Car mobil1 = new Car("Toyota", 2023, 120.0, 4, "Solar");
        System.out.println("=== CAR TRIAL ===");
        mobil1.startEngine();
        mobil1.move();
        mobil1.refuel();
        mobil1.openTrunk();
        mobil1.stopEngine();

        System.out.println();

        Airplane pesawat1 = new Airplane("Garuda Indonesia", 2022, 900.0, 35000, 60.5);
        System.out.println("=== AIRPLANE TRIAL ===");
        pesawat1.startEngine();
        pesawat1.move();
        pesawat1.refuel();
        pesawat1.land();
        pesawat1.stopEngine();
    }
}
