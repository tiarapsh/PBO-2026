package Jobsheet2;

public class Barang {
    //Experiment 3, number 1
    public String code;
    public String name;
    public double grossPrice;
    public double discount;

    //Experiment 3, number 4
    public double getNetPrice(){
        return grossPrice - discount * grossPrice;
    }

    //Experiment 3, number 5
    public void displayInfo(){
        System.out.println("Code            :"+code);
        System.out.println("Name            :"+name);
        System.out.println("Gross Price     :"+grossPrice);
        System.out.println("Discount        :"+discount);
        System.out.println("Net Price       :"+getNetPrice());
    }
}
