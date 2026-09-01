package Jobsheet2;

public class MahasiswaDemo {
    //Experiment 1, number 4
    public static void main(String[] args) {
        Mahasiswa m1 =  new Mahasiswa();
        Mahasiswa m2 =  new Mahasiswa();
        Mahasiswa m3 =  new Mahasiswa();
        m1.nim = "023432";
        m1.name = "Yansy Ayuningtyas";
        m1.address= "Nias, Sumatera Utara";
        m1.kelas = "2A";

        m2.nim = "023433";
        m2.name = "Ratih Ramadhani";
        m2.address = "Jombang";
        m2.kelas = "2G";

        m3.nim = "023434";
        m3.name = "Clevy";
        m3.address = "Malang";
        m3.kelas = "2G";

    // added 2 new student
        m1.displayBiodata();
        System.out.println("==============================");
        m2.displayBiodata();
        System.out.println("==============================");
        m3.displayBiodata();
    }
}
