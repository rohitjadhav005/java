import java.util.Scanner;
public class string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String x = sc.nextLine();
        System.out.println("Hello "+x);//String Concatination
        sc.close();
    }
}