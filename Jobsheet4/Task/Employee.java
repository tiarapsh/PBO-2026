package Jobsheet4.Task;

public class Employee {
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() { 
        return employeeId; 
    }

    public void setEmployeeId(String nip) {
         this.employeeId = nip; 
    }

    public String getName() { 
        return name; 
    }
    
    public void setName(String name) { 
        this.name = name; 
    }

    public String getInfo() {
        return name + " (Employee ID: " + employeeId + ")";
    }
}
