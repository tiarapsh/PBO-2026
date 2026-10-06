package Jobsheet7;

class Human {
    public void breathe() {
        System.out.println("Humans need to breathe oxygen.");
    }

    public void eat() {
        System.out.println("Humans need to eat food.");
    }
}

// Class Lecturer (Subclass)
class Lecturer extends Human {
    @Override
    public void eat() {
        System.out.println("Lecturers eat while preparing lecture slides.");
    }

    public void overtime() {
        System.out.println("Lecturers are doing overtime grading papers.");
    }
}

// Class Student (Subclass)
class Student extends Human {
    @Override
    public void eat() {
        System.out.println("Students eat in the campus cafeteria.");
    }

    public void sleep() {
        System.out.println("Students sleep after finishing assignments.");
    }
}

public class DynamicDispatchMain {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        Human person1 = new Human();
        Human person2 = new Lecturer();
        Human person3 = new Student();

        System.out.println("--- Human Object ---");
        person1.breathe();
        person1.eat();

        System.out.println("\n--- Lecturer Reference (Human) ---");
        person2.breathe();
        person2.eat(); // Calls Lecturer's eat() method

        System.out.println("\n--- Student Reference (Human) ---");
        person3.breathe();
        person3.eat(); // Calls Student's eat() method
    }
}