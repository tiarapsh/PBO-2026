package MidExam_TiaraPashaRamadhani_22_254107060138.Q3;

public class Admin extends User {
    public Admin(UserProfile userProfile) {
        super(userProfile);
    }

    public void updateVehicleDetails(int vehicleId) {
        System.out.println("Admin " + userProfile.getName() + " update vehicle ID details: " + vehicleId);
    }

    public String addVehicle(String vehicleName) {
        System.out.println("Admin " + userProfile.getName() + " add new vehicle: " + vehicleName);
        return vehicleName;
    }

    public void retrieveComplain() {
        System.out.println("Admin " + userProfile.getName() + " retrieve user complaints.");
    }

    public void verifyUser(Customer customer) {
        customer.setVerificationStatus(true);
        System.out.println("Admin " + userProfile.getName() + " has verified the Customer account!");
    }
}
