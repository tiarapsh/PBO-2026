package Jobsheet7.Task;

public class Cashier extends EmployeeLaundry {
    private int dailyTransaction;
    private double totalCashReceived;

    // Default Constructor
    public Cashier() {
        super();
        this.dailyTransaction = 0;
        this.totalCashReceived = 0.0;
    }

    // Overloaded Constructor
    public Cashier(int idEmployee, String name, int salary, String branch, int dailyTransaction, double totalCashReceived) {
        super(idEmployee, name, salary, branch);
        this.dailyTransaction = dailyTransaction;
        this.totalCashReceived = totalCashReceived;
    }

    // Overriding method addTransaction() dari Superclass
    @Override
    public void addTransaction() {
        this.dailyTransaction++;
        System.out.println("Cashier added 1 transaction. Total daily transactions: " + dailyTransaction);
    }

    // Overloading method addTransaction(int count)
    public void addTransaction(int count) {
        this.dailyTransaction += count;
        System.out.println("Cashier added " + count + " transactions at once. Total daily transactions: " + dailyTransaction);
    }

    public String getCashierInfo() {
        return getEmployeeInfo() + ", Daily Transactions: " + dailyTransaction + ", Total Cash: Rp" + totalCashReceived;
    }
}
