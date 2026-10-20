package Jobsheet8;

public class Snake extends Animal {
    public boolean isVenomous;

    public Snake(boolean isVenomous, double weight, String food, String habitat) {
        super(weight, food, habitat);
        this.isVenomous = isVenomous;
    }

    @Override
    public void move() {
        System.out.println("Contract muscles on alternate sides to create lateral curves");
        System.out.println("Find resistance points against rocks or trees");
        System.out.println("Use belly scales to push the body forward");
    }

    @Override
    public void breathe() {
        System.out.println("Rib muscles contract, air enters through nostrils");
        System.out.println("Trachea passes air into the lungs");
        System.out.println("Rib muscles relax, air is pushed out through nostrils");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Venomous: " + (this.isVenomous ? "Yes" : "No"));
    }
}
