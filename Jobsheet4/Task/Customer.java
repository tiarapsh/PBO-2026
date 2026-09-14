package Jobsheet4.Task;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer {
    private String phoneNumber;
    private String name;
    private ArrayList<LaundryOrder> orderHistory;

    public Customer(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.orderHistory = new ArrayList<LaundryOrder>();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOrder(LocalDate date, String serviceType, double weight, double ratePerKg, Employee cashier, Employee operator) {
        LaundryOrder order = new LaundryOrder();
        order.setDate(date);
        order.setServiceType(serviceType);
        order.setWeight(weight);
        order.setRatePerKg(ratePerKg);
        order.setCashier(cashier);
        order.setOperator(operator);
        orderHistory.add(order);
    }

    public String getInfo() {
        String info = "";
        info += "Phone Number : " + this.phoneNumber + "\n";
        info += "Name         : " + this.name + "\n";
        if (!orderHistory.isEmpty()) {
            info += "Order History:\n";
            for (LaundryOrder order : orderHistory) {
                info += order.getInfo();
            }
        } else {
            info += "No order history available\n";
        }
        info += "\n";
        return info;
    }
}
