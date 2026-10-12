package MidExam_TiaraPashaRamadhani_22_254107060138.Q3;

public class Customer extends User{
    private boolean verificationStatus = false;

    public Customer(UserProfile userProfile) {
        super(userProfile);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(boolean status) {
        this.verificationStatus = status;
    }

    public void applyVerification(String doc) {
        System.out.println("Customer " + userProfile.getName() + " upload verification documents: " + doc);
    }
}
