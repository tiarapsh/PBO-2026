package Jobsheet6.Task;

public class LaundryDemo {
    public static void main(String[] args) {
        Cashier cashier1 = new Cashier(101, "Siti Rahma", 3500000, 25);
        Operator operator1 = new Operator(201, "Budi Santoso", 3200000, 45.5f);

        System.out.println("--- CASHIER INFO ---");
        System.out.println(cashier1.getCashierInfo());

        System.out.println("--- OPERATOR INFO ---");
        System.out.println(operator1.getOperatorInfo());

        //modified data
        cashier1.name = "Siti Rahma, A.Md.";
        cashier1.salary = 3800000;
        cashier1.dailyTransaction = 40;

        operator1.salary = 3500000;
        operator1.laundryWeight = 60.0f;

        System.out.println("--- MODIFIED CASHIER INFO ---");
        System.out.println(cashier1.getCashierInfo());

        System.out.println("--- MODIFIED OPERATOR INFO ---");
        System.out.println(operator1.getOperatorInfo());
    }
}
