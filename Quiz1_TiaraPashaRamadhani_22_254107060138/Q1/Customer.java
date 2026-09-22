package Q1;


public class Customer {
    private String customerID;
    private String customerName;
    private String address;
    private String phoneNumber;

    public Customer(String customerName, String address, String phoneNumber) {
        this.customerName = customerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerID(String customerID ) {
        this.customerID = customerID;
    }
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void addCustomer() {
        System.out.println("Customer added successfully.");
       
    }

   public void editCustomer(){
       System.out.println("Customer edited successfully.");
   }
    public void deleteCustomer() {
        System.out.println("Customer deleted successfully.");
    }
    
}
