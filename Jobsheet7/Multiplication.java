package Jobsheet7;

public class Multiplication {
    void multiply(int a, int b) {
        System.out.println(a * b);
    }

    void multiply(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String args[]) {
        Multiplication obj = new Multiplication();

        obj.multiply(25, 43);
        obj.multiply(34, 23, 56);
    }
}

