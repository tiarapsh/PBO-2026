package Jobsheet7.Task;

public class Operator extends EmployeeLaundry {
    private float laundryWeight;
    private int machineNumber;

    // Default Constructor
    public Operator() {
        super();
        this.laundryWeight = 0.0f;
        this.machineNumber = 0;
    }

    // Overloaded Constructor
    public Operator(int idEmployee, String name, int salary, String branch, float laundryWeight, int machineNumber) {
        super(idEmployee, name, salary, branch);
        this.laundryWeight = laundryWeight;
        this.machineNumber = machineNumber;
    }

    // Method addWeight(float weight)
    public void addWeight(float weight) {
        this.laundryWeight += weight;
        System.out.println("Added " + weight + " kg of laundry. Total weight: " + laundryWeight + " kg");
    }

    // Overloading method addWeight(float weight, String service)
    public void addWeight(float weight, String service) {
        this.laundryWeight += weight;
        System.out.println("Added " + weight + " kg for [" + service + "] service. Total weight: " + laundryWeight + " kg");
    }

    public String getOperatorInfo() {
        return getEmployeeInfo() + ", Total Laundry Weight: " + laundryWeight + " kg, Machine No: " + machineNumber;
    }
}
