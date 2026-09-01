package Jobsheet2;

public class Square {
    //Assignment 1
    public int longs;
    public int wide;

    public int getArea(){
        return longs * wide;
    }

    public int getCircumference(){
        return 2 * (longs + wide);
    }

    public void displayInfo(){
        System.out.println("Long           :"+longs);
        System.out.println("Wide           :"+wide);
        System.out.println("Area           :"+getArea());
        System.out.println("Circumference  :"+getCircumference());
    }


}
