package InterfaceTraining;

public class Fan extends ElectronicDevice {
    private String type;

    public Fan(String type, double price, String color, String brand) {
        super(price, color, brand);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void getInfo() {
        System.out.println("=== Fan Info ===");
        super.getInfo();
        System.out.println("Type: " + type);
        System.out.println();
    }
}
