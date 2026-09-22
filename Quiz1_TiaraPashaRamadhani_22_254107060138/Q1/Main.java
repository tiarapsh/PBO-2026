package Q1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
       System.out.println("=== New Customer ===");
        Customer customer1 = new Customer("Tiara Pasha", "Jl. Soekarno Hatta No. 9", "081234567890");
        customer1.setCustomerID("CUST-001");
        customer1.addCustomer();
        System.out.println("Customer Name: " + customer1.getCustomerName());

        System.out.println("\n=== Stock and Product===");
        Stock stockLaptop = new Stock(15, 1);
        stockLaptop.setStockId("STK-101");
        stockLaptop.addStock();

        Product product1 = new Product(12500000.0f, "Laptop");
        product1.setProductId(101);
        product1.addProduct();

        Product product2 = new Product(250000.0f, "Mouse Wireless");
        product2.setProductId(102);
        product2.addProduct();

        System.out.println("\n=== New Transactions ===");
        Order order1 = new Order(2, LocalDateTime.now());
        order1.setOrderId("ORD-20260922-01");

        order1.addProductToOrder(product1);
        order1.addProductToOrder(product2);

        order1.createOrder();

        System.out.println("\n=== Detail Products " + order1.getOrderId() + " ===");
        for (Product p : order1.getProducts()) {
            System.out.println("- " + p.getProductType() + " | Rp" + p.getProductPrice());
        }

        System.out.println("\n=== Edit Customer ===");
        customer1.editCustomer();
        stockLaptop.selectStockItem(product1.getProductId());
    }
}
