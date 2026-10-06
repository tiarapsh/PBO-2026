package Jobsheet7.Task;

public class MainLaundry {
    public static void main(String[] args) {
        System.out.println("=== LAUNDRY MANAGEMENT SYSTEM TEST ===");

        System.out.println("\n--- CASHIER DEMO ---");
        Cashier cashier1 = new Cashier(101, "Siti Nurhaliza", 3500000, "Malang Branch", 5, 250000.0);
        System.out.println(cashier1.getCashierInfo());
        
        System.out.print("Testing Method Overriding  -> ");
        cashier1.addTransaction(); 
        
        System.out.print("Testing Method Overloading -> ");
        cashier1.addTransaction(3); 

        System.out.println("\n--- OPERATOR DEMO ---");
        Operator operator1 = new Operator(202, "Budi Santoso", 3200000, "Malang Branch", 12.5f, 3);
        System.out.println(operator1.getOperatorInfo());

        System.out.print("Testing Method Overloading 1 -> ");
        operator1.addWeight(5.0f); 
        
        System.out.print("Testing Method Overloading 2 -> ");
        operator1.addWeight(8.5f, "Express Dry Clean"); 

        System.out.println("\n--- FINAL KEYWORD DEMO ---");
        System.out.println("Employee ID (Final variable): " + cashier1.getIdEmployee());
    }
}
