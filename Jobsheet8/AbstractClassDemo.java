package Jobsheet8;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Bee bee1 = new Bee("Queen", 0.05, "Nectar", "Forest");
        bee1.printInfo();
        bee1.move();
        bee1.breathe();

        Snake snake1 = new Snake(true, 5.0, "Meat", "Jungle");
        System.out.println("=== SNAKE INFO ===");
        snake1.printInfo();
        snake1.move();
        snake1.breathe();
    }
}
