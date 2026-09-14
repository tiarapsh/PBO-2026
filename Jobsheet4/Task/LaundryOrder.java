package Jobsheet4.Task;

import java.time.LocalDate;

public class LaundryOrder {
    private LocalDate date;
    private String serviceType;
    private double weight;
    private double ratePerKg;
    private Employee cashier;
    private Employee operator;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getRatePerKg() {
        return ratePerKg;
    }

    public void setRatePerKg(double ratePerKg) {
        this.ratePerKg = ratePerKg;
    }

    public Employee getCashier() {
        return cashier;
    }

    public void setCashier(Employee cashier) {
        this.cashier = cashier;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public double calculateTotalCost() {
        return weight * ratePerKg;
    }

    public String getInfo() {
        String info = "";
        info += "\tDate: " + date;
        info += ", Service: " + serviceType;
        info += ", Weight: " + weight + " kg";
        info += ", Total: $" + calculateTotalCost();
        info += ", Cashier: " + cashier.getInfo();
        info += ", Operator: " + operator.getInfo();
        info += "\n";
        return info;
    }
}
