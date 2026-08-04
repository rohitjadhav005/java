
public class stringop1 {

    public static void main(String[] args) {
        String name = "Rohit";

        System.out.println(name.length());
        System.out.println("Program Running...");

        for (int i = name.length() - 1; i >= 0; i--) {

            System.out.print(name.charAt(i));
        }
    }
}
