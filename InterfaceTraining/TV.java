package InterfaceTraining;

public class TV extends ElectronicDevice implements Audible {
    private String screenType;
    private int volume;

    public TV(String screenType, int volume, double price, String color, String brand) {
        super(price, color, brand);
        this.screenType = screenType;
        this.volume = volume;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
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
        System.out.println("=== TV Info ===");
        super.getInfo();
        System.out.println("Screen Type: " + screenType);
        System.out.println("Volume: " + volume);
        System.out.println();
    }
}
