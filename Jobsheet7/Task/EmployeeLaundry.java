package Jobsheet7.Task;

public class EmployeeLaundry {
    private final int idEmployee;
    private String name;
    private int salary;
    private String branch;

    // Default Constructor
    public EmployeeLaundry() {
        this.idEmployee = 0;
        this.name = "Unknown";
        this.salary = 0;
        this.branch = "Headquarter"; 
    }

    // Overloaded Constructor
    public EmployeeLaundry(int idEmployee, String name, int salary, String branch) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.salary = salary;
        this.branch = branch;
    }

    // Getter untuk idEmployee (karena final)
    public int getIdEmployee() {
        return idEmployee;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getBranch() {
        return branch;
    }

    // Method yang nantinya di override di Subclass
    public void addTransaction() {
        System.out.println("Processing standard laundry transaction...");
    }

    public String getEmployeeInfo() {
        return "ID: " + idEmployee + ", Name: " + name + ", Salary: Rp" + salary + ", Branch: " + branch;
    }

    public int calculateBonus() {
        return (int) (salary * 0.10); 
    }
}
