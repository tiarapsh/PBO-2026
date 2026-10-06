package Jobsheet7;

public class Staff extends Employee {
    private int overtime;
    private double overtimePay;

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    // Method Overloading
    public double getSalary(int overtime, double overtimePay) {
        return super.getSalary() + (overtime * overtimePay);
    }

    // Method Overriding
    @Override
    public double getSalary() {
        return super.getSalary() + (overtime * overtimePay);
    }

    public void displayInfo() {
        System.out.println("NIP          : " + this.getNip());
        System.out.println("Name         : " + this.getName());
        System.out.println("Group        : " + this.getGroup());
        System.out.println("Overtime     : " + this.getOvertime() + " hours");
        System.out.printf("Overtime Pay : %.0f\n", this.getOvertimePay());
        System.out.printf("Salary       : %.0f\n", this.getSalary());
    }
}
