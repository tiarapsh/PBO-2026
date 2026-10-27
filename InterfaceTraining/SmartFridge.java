package InterfaceTraining;

public class SmartFridge extends Refrigerator implements Audible {
   private int volume;

    public SmartFridge(int volume, int numberOfDoors, double price, String color, String brand) {
        super(numberOfDoors, price, color, brand);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void increaseVolume(int increment) {
        this.volume += increment;
    }

    @Override
    public void decreaseVolume(int decrement) {
        this.volume -= decrement;
    }

    @Override
    public void getInfo() {
        System.out.println("=== Smart Fridge Info ===");
        super.getInfo();
        System.out.println("Volume: " + volume);
        System.out.println();
    }
}
