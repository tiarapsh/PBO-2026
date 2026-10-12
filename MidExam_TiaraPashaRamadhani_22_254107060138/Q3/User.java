package MidExam_TiaraPashaRamadhani_22_254107060138.Q3;

public class User {
    protected UserProfile userProfile;

    public User(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public boolean logIn(int userId, String password) {
        if (this.userProfile.getUserId() == userId && this.userProfile.getPassword().equals(password)) {
            System.out.println("Login successful! Welcome, " + userProfile.getName() + ".");
            return true;
        }
        System.out.println("Login failed! Incorrect ID or password.");
        return false;
    }

    public void recoverPassword() {
        System.out.println("Password recovery instructions were sent to your email: " + userProfile.getEmail());
    }

    public void logOut() {
        System.out.println("User " + userProfile.getName() + " successfully logged out.");
    }
}
