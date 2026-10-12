package MidExam_TiaraPashaRamadhani_22_254107060138.Q2;

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla Model 3", 225, 4, 75.0);

        System.out.println("=== DEMO OVERRIDING ===");
        tesla.displayInfo();
        tesla.accelerate();  
        
        System.out.println("\n=== DEMO OVERLOADING ===");
        tesla.honk();         
        tesla.honk(3);       

        tesla.chargeBattery();   
        tesla.chargeBattery(80);  
    }
}
