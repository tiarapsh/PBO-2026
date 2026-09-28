package Jobsheet6;

public class Employee {
    public String nip;
    public String name;
    public double salary;
    
    // public Employee(){
    //     System.out.println("Employee's object created");
    // }
    public Employee(String nip, String name, double salary){
        this.nip = nip;
        this.name = name;
        this.salary = salary;
    }

    public String getInfo(){
        String info = "";
        info += "NIP     : " + nip + "\n";
        info += "Name    : " + name + "\n";
        info += "Salary  : " + salary + "\n";
        return info;
    }
}
