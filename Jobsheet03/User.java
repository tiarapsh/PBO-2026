public class User {
    //Experiment 3, number 1
    public String username;
    public String name;
    public String email;
    public String address;
    public String job;

    public User(String username, String name, String email) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.address = address;
        this.job = job;
    }

    public void displayUserInfo() {
        System.out.println("Username: " + this.username);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Address: " + this.address);
        System.out.println("Job: " + this.job);
        System.out.println("==============================");
    }
}
