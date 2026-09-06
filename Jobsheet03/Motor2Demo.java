public class Motor2Demo {
     public static void main(String[] args) {
        Motor2 motor1 = new Motor2();
        motor1.displayStatus();
        
        //Experiment 2, number 6
        motor1.setLicensePlate("B 0838 XZ");
        motor1.setSpeed(50);
        motor1.displayStatus();

        Motor2 motor2 = new Motor2();
        motor2.setLicensePlate("N 9840 AB");
        motor2.setEngineOn(true);
        motor2.setSpeed(40);
        motor2.displayStatus();

        Motor2 motor3 = new Motor2();
        motor3.setLicensePlate("D 8343 CV");
        motor3.setSpeed(60);
        motor3.displayStatus();
     }
}
