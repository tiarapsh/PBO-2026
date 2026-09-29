package Jobsheet6.Task;

public class Cashier extends EmployeeLaundry {
    public int dailyTransaction;

    public Cashier() {
        super();
        this.dailyTransaction = 0;
    }

    public Cashier(int idEmployee, String name, int salary, int dailyTransaction) {
        super(idEmployee, name, salary);
        this.dailyTransaction = dailyTransaction;
    }

    @Override
    public void addTransaction() {
        this.dailyTransaction++; 
    }

    public String getCashierInfo() {
        String info = super.getEmployeeInfo();
        info += "Daily Trans. : " + dailyTransaction + " transactions\n";
        return info;
    }
}
