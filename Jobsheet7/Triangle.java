package Jobsheet7;

public class Triangle {
    private int angle;

    // 1. Calculate remaining angle (1 parameter)
    public int totalAngle(int angleA) {
        return 180 - angleA;
    }

    // 2. Calculate remaining angle (2 parameters - Overloading)
    public int totalAngle(int angleA, int angleB) {
        return 180 - (angleA + angleB);
    }

    // 3. Calculate perimeter of triangle (3 side parameters)
    public int perimeter(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }

    // 4. Calculate hypotenuse/perimeter (2 side parameters - Overloading)
    public double perimeter(int sideA, int sideB) {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    public static void main(String[] args) {
        Triangle tri = new Triangle();

        System.out.println("Remaining angle (180 - 60)      : " + tri.totalAngle(60));
        System.out.println("Remaining angle (180 - (60+30))  : " + tri.totalAngle(60, 30));
        System.out.println("Triangle perimeter (3, 4, 5)     : " + tri.perimeter(3, 4, 5));
        System.out.println("Hypotenuse / Side C (a=3, b=4)   : " + tri.perimeter(3, 4));
    }
}
