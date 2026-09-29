package Jobsheet6.Task;

public class Operator extends EmployeeLaundry {
    public float laundryWeight;

    public Operator() {
        super();
        this.laundryWeight = 0.0f;
    }

    public Operator(int idEmployee, String name, int salary, float laundryWeight) {
        super(idEmployee, name, salary);
        this.laundryWeight = laundryWeight;
    }

    public void addWeight(float weight) {
        this.laundryWeight += weight;
    }

    public String getOperatorInfo() {
        String info = super.getEmployeeInfo();
        info += "Laundry      : " + laundryWeight + " kg\n";
        return info;
    }
}
