public class stringop2 {
     public static void main(String[] args) {

        String name = "Rohit";

        StringBuilder sb = new StringBuilder(name);

        sb.reverse();

        System.out.println("Original String : " + name);
        System.out.println("Reversed String : " + sb);
    }
}
