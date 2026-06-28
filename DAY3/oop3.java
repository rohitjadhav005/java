class book {
    String title;
    String author;
    int price;
}
public class oop3 {
    public static void main(String[] args) {
        book b1 = new book();
        b1.title = "Yayati";
        b1.author = "vi. sa. khandekar";
        b1.price = 500;
        System.out.println("Book Details:- ");
        System.out.println("Book Title: " +b1.title);
        System.out.println("Book Author: " +b1.author);
        System.out.println("Book Price: " +b1.price);
    }
}
