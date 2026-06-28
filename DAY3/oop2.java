class mobile {
    String brand;
    String model;
    int price;
}
public class oop2 {
    public static void main(String[] args) {
        mobile m1 = new mobile();
        m1.brand = "Mahindra";
        m1.model = "mahindra xuv";
        m1.price = 12000000;
        System.out.println("Car Details:- ");
        System.out.println("Car Brand: " +m1.brand);
        System.out.println("Car Model: " +m1.model);
        System.out.println("Car Price: " +m1.price);
    }
}
