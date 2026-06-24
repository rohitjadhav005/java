import java.util.Scanner;
public class input {
    public static void main( String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a name: ");
            String name = sc.nextLine();
            System.out.println("Helloo "+ name+" !");
        }
    }
}
