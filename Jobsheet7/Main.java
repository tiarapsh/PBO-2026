package Jobsheet7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff\n");

        Manager man[] = new Manager[2];
        Staff staff1[] = new Staff[2];
        Staff staff2[] = new Staff[3];

        // Manager 1 Creation
        man[0] = new Manager();
        man[0].setName("Tedjo");
        man[0].setNip("101");
        man[0].setGroup("1");
        man[0].setAllowance(5000000);
        man[0].setDepartment("Administration");

        // Manager 2 Creation
        man[1] = new Manager();
        man[1].setName("Atika");
        man[1].setNip("102");
        man[1].setGroup("1");
        man[1].setAllowance(2500000);
        man[1].setDepartment("Marketing");

        // Staff Group 1
        staff1[0] = new Staff();
        staff1[0].setName("Usman");
        staff1[0].setNip("0003");
        staff1[0].setGroup("2");
        staff1[0].setOvertime(10);
        staff1[0].setOvertimePay(10000);

        staff1[1] = new Staff();
        staff1[1].setName("Anugrah");
        staff1[1].setNip("0005");
        staff1[1].setGroup("2");
        staff1[1].setOvertime(10);
        staff1[1].setOvertimePay(55000);

        man[0].setStaff(staff1);

        // Staff Group 2
        staff2[0] = new Staff();
        staff2[0].setName("Hendra");
        staff2[0].setNip("0004");
        staff2[0].setGroup("3");
        staff2[0].setOvertime(15);
        staff2[0].setOvertimePay(5500);

        staff2[1] = new Staff();
        staff2[1].setName("Arie");
        staff2[1].setNip("0006");
        staff2[1].setGroup("4");
        staff2[1].setOvertime(5);
        staff2[1].setOvertimePay(100000);

        staff2[2] = new Staff();
        staff2[2].setName("Mentari");
        staff2[2].setNip("0007");
        staff2[2].setGroup("3");
        staff2[2].setOvertime(6);
        staff2[2].setOvertimePay(20000);

        man[1].setStaff(staff2);

        // Print Manager & Staff Information
        man[0].displayInfo();
        man[1].displayInfo();
    }
}
