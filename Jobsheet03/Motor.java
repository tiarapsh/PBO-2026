public class Motor {
    //Experiment 1, no 3
    public String licensePlate;
    public boolean isEngineOn;
    public int speed;
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