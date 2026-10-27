package InterfaceTraining;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan("Standing Fan", 45.0, "White", "Miyako");
        TV tv = new TV("OLED 4K", 15, 800.0, "Black", "Samsung");
        Refrigerator fridge = new Refrigerator(2, 500.0, "Silver", "LG");
        SmartFridge smartFridge = new SmartFridge(20, 4, 1500.0, "Dark Gray", "Samsung");

        // Display Info
        fan.getInfo();
        tv.getInfo();
        fridge.getInfo();
        smartFridge.getInfo();

        // Testing Interface methods
        System.out.println("--- Testing Audible Capabilities ---");
        tv.increaseVolume(5);
        smartFridge.decreaseVolume(3);
        
        System.out.println("TV new volume: " + tv.getVolume());
        System.out.println("Smart Fridge new volume: " + smartFridge.getVolume());
    }
}
