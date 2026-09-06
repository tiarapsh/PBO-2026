public class Motor2 {
    private String licensePlate;
    private boolean isEngineOn;
    private int speed;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (!this.isEngineOn && speed > 0) {
            System.out.println("The speed must not exceed 0 when the engine is off!");
        } else if (speed < 0) {
            System.out.println("Speed cannot be negative!");
        } else if (speed > 100) {
            System.out.println("Speed cannot exceed the maximum limit of 100!");
            this.speed = 100;
        } else {
            this.speed = speed;
        }
    }

    public void displayStatus(){
        System.out.println("License Plate: " + this.licensePlate);

        if(isEngineOn){
            System.out.println("Engine On");
        } else {
            System.out.println("Engine Off");
        }
        System.out.println("Speed: "+this.speed);
        System.out.println("==============================");
    }
}

