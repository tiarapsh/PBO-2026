package Jobsheet6.Task;

public class EmployeeLaundry {
    public int idEmployee;
    public String name;
    public int salary;

    public EmployeeLaundry() {
        this.idEmployee = 0;
        this.name = "";
        this.salary = 0;
    }

    //overloading
    public EmployeeLaundry(int idEmployee, String name, int salary) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.salary = salary;
    }

    //override
    public void addTransaction() {
        System.out.println("Processing general transaction...");
    }

    public String getEmployeeInfo() {
        String info = "";
        info += "ID Employee  : " + idEmployee + "\n";
        info += "Name         : " + name + "\n";
        info += "Salary       : Rp " + salary + "\n";
        return info;
    }
}
