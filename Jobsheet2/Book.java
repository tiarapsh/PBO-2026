package Jobsheet2;

public class Book {
    public String title;
    public String color;
    public String paperSize;

    public void readBook(){
        System.out.println("Reading Book "+title +" with Color "+color+" and Paper Size "+paperSize);
    }

    public void writeBook(){
       System.out.println("Writing Book "+title +" with Color "+color+" and Paper Size "+paperSize);
    }
    public void displayInfo(){
        System.out.println("Book Title      :" +title);
        System.out.println("Book Color      :" +color);
        System.out.println("Book Paper Size :" +paperSize);
    }
}
