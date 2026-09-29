package Jobsheet6.Task;

public class LaundryDemo {
    public static void main(String[] args) {
        Cashier cashier1 = new Cashier(101, "Siti Rahma", 3500000, 25);
        Operator operator1 = new Operator(201, "Budi Santoso", 3200000, 45.5f);

        System.out.println("--- CASHIER INFO ---");
        System.out.println(cashier1.getCashierInfo());

        System.out.println("--- OPERATOR INFO ---");
        System.out.println(operator1.getOperatorInfo());

        cashier1.addTransaction(); 
        operator1.addWeight(10.5f);

        cashier1.salary = 3800000;

        operator1.salary = 3500000;

        System.out.println("--- MODIFIED CASHIER INFO ---");
        System.out.println(cashier1.getCashierInfo());

        System.out.println("--- MODIFIED OPERATOR INFO ---");
        System.out.println(operator1.getOperatorInfo());
    }
}
