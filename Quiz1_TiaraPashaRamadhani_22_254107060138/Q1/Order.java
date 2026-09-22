package Q1;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private String orderId;
    private int amount;
    private LocalDateTime orderDate;
    private ArrayList<Product> products = new ArrayList<>();

    public Order(int amount, LocalDateTime orderDate) {
        this.amount = amount;
        this.orderDate = orderDate;
        this.products = new ArrayList<>();
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void addProductToOrder(Product product) {
        this.products.add(product);
    }
    public ArrayList<Product> getProducts() {
        return products;
    }

     public void createOrder() {
        System.out.println("Orders " + orderId + " successfully created with " + products.size() + " products.");
    }

    public void editOrder(int orderId){
        System.out.println("Order " + orderId + " edited successfully.");
    }

}
