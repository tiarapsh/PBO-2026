package Jobsheet8;

public class Bee extends Animal {
    public String caste;

    public Bee(String caste, double weight, String food, String habitat) {
        super(weight, food, habitat);
        this.caste = caste;
    }

    @Override
    public void breathe() {
        System.out.println("Abdominal muscles relax, air enters through spiracles in body segments");
        System.out.println("Tracheae deliver oxygen directly to tissues");
        System.out.println("Abdominal muscles contract, forcing air out");
    }

    @Override
    public void move() {
        System.out.println("Flap wings forward");
        System.out.println("Rotate wings nearly 90 degrees");
        System.out.println("Flap wings backward");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Caste   : " + this.caste);
    }
}

