package Jobsheet7;

public class Manager extends Employee {
    private double allowance;
    private String department;
    private Staff st[];

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setStaff(Staff st[]) {
        this.st = st;
    }

    public void viewStaff() {
        System.out.println("---------------------------------");
        for (int i = 0; i < st.length; i++) {
            st[i].displayInfo();
        }
        System.out.println("---------------------------------");
    }

    public void displayInfo() {
        System.out.println("Manager      : " + this.getDepartment());
        System.out.println("NIP          : " + this.getNip());
        System.out.println("Name         : " + this.getName());
        System.out.println("Group        : " + this.getGroup());
        System.out.printf("Allowance    : %.0f\n", this.getAllowance());
        System.out.printf("Salary       : %.0f\n", this.getSalary());
        System.out.println("Department   : " + this.getDepartment());
        this.viewStaff();
    }

    // Method Overriding
    @Override
    public double getSalary() {
        return super.getSalary() + allowance;
    }
}
