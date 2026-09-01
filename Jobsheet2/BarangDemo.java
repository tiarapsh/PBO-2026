package Jobsheet2;

public class BarangDemo {
    //Experiment 3, number 6
    public static void main(String[] args) {
        Barang barang1 = new Barang();
        barang1.code = "ATK01";
        barang1.name = "Bolpoin Pilot Hitam";
        barang1.grossPrice = 3500;
        barang1.discount = 0.1;
        
        barang1.displayInfo();
    }
   
}
