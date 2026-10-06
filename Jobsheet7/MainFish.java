package Jobsheet7;

class Fish {
    public void swim() {
        System.out.println("Fish can swim");
    }
}

class Piranha extends Fish {
    @Override
    public void swim() {
        System.out.println("Piranha can eat meat");
    }
}

public class MainFish {
    public static void main(String[] args) {
        Fish a = new Fish();
        Fish b = new Piranha();

        a.swim();
        b.swim();
    }
}
