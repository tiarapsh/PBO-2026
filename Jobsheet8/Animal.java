package Jobsheet8;

public abstract class Animal {
    public double weight;
    public String food;
    public String habitat;

    public Animal(double weight, String food, String habitat) {
        this.weight = weight;
        this.food = food;
        this.habitat = habitat;
    }

    public abstract void move();

    public abstract void breathe();

    public void printInfo() {
        System.out.println("Weight  : " + this.weight);
        System.out.println("Food    : " + this.food);
        System.out.println("Habitat : " + this.habitat);
    }
}