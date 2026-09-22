package Q2;

public class MainBengkel {
    public static void main(String[] args) {
        Customer c1 = new Customer("Budi Santoso", "08123456789");
        Customer c2 = new Customer("Siti Rahma", "08987654321");

        Vehicle car1 = new Vehicle("B 1234 ABC", "Toyota", "Avanza", "Car", c1);
        Vehicle car2 = new Vehicle("N 5678 XYZ", "Honda", "CR-V", "Car", c2);
        Vehicle motor1 = new Vehicle("B 4321 DEF", "Yamaha", "NMAX", "Motorcycle", c1);
        Vehicle motor2 = new Vehicle("N 8765 QWE", "Honda", "Vario", "Motorcycle", c2);

        c1.addVehicle(car1);
        c1.addVehicle(motor1);
        c2.addVehicle(car2);
        c2.addVehicle(motor2);

        Service tuneUp = new Service("Tune Up", 150000);
        Service changeOil = new Service("Change Oil", 75000);

        Employee emp = new Employee("EMP-01", "Pak Joko", "Mechanic");

        Vehicle[] vehicles = {car1, car2, motor1, motor2};
        Service[] services = {tuneUp, changeOil, changeOil, tuneUp};

        System.out.println("Mechanic: " + emp.getName());
        System.out.println();

        for (int i = 0; i < vehicles.length; i++) {
            Vehicle v = vehicles[i];
            Service s = services[i];
            
            System.out.println("Customer  : " + v.getOwner().getName());
            System.out.println("Vehicle   : " + v.getBrand() + " " + v.getModel() + " (" + v.getVehicleType() + ")");
            System.out.println("Plate No  : " + v.getPlateNumber());
            System.out.println("Service   : " + s.getServiceName());
            System.out.println("Total     : Rp " + s.calculateTotalCost(v));
            System.out.println();
        }
    }
}
