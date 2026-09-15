package Jobsheet4.Task;

import java.time.LocalDate;

public class LaundryDemo {
    public static void main(String[] args) {
        Employee siti = new Employee("1001", "Siti Aminah");
        Employee rani = new Employee("1002", "Rani Wijaya");

        Employee budi = new Employee("2001", "Budi Santoso");
        Employee doni = new Employee("2002", "Doni Prasetyo");

        Customer customer1 = new Customer("08123456789", "Esta Jakra");
        customer1.addOrder(LocalDate.of(2026, 8, 11), "Wash & Iron", 3.5, 20000, siti, budi);
        customer1.addOrder(LocalDate.of(2026, 9, 11), "Duvet / Bed Cover", 5.0, 35000, rani, doni);
        System.out.println(customer1.getInfo());

        Customer customer2 = new Customer("08987654321", "Wira Arkana");
        System.out.println(customer2.getInfo());
    }
}
