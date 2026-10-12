package MidExam_TiaraPashaRamadhani_22_254107060138.Q3;

public class Main {
    public static void main(String[] args) {
        UserProfile custProfile = new UserProfile(101, "custPass123", "Budi", 22, "budi@email.com", "ktp_budi.pdf");
        Customer customer = new Customer(custProfile);

        UserProfile adminProfile = new UserProfile(999, "adminPass123", "Siti (Admin)", 30, "admin@email.com", "cert_admin.pdf");
        Admin admin = new Admin(adminProfile);

        System.out.println("=== 1. DEMO LOGIN & AUTHENTICATION ===");
        customer.logIn(101, "custPass123");
        admin.logIn(999, "adminPass123");

        System.out.println("\n=== 2. FLOW PROCESS CUSTOMER ===");
        System.out.println("Latest Customer Verification Status: " + customer.getVerificationStatus());
        customer.applyVerification("ktp_budi.pdf");

        System.out.println("\n=== 3. FLOW PROCESS ADMIN ===");
        admin.verifyUser(customer);
        System.out.println("Latest Customer Verification Status: " + customer.getVerificationStatus());
        
        admin.addVehicle("Toyota Avanza");
        admin.updateVehicleDetails(5001);
        admin.retrieveComplain();

        System.out.println("\n=== 4. DEMO LOGOUT ===");
        customer.logOut();
        admin.logOut();
    }
}
