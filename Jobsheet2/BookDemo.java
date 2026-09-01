package Jobsheet2;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.color = "Blue";
        book1.paperSize = "A4";

        Book book2 = new Book();
        book2.title = "Databases";
        book2.color = "Red";
        book2.paperSize = "A5";

        book1.displayInfo();
        book1.readBook();
        System.out.println("================================");
        book2.displayInfo();
        book2.writeBook();
    }
}
