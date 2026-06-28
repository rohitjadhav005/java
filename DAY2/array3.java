import java.util.Scanner;
public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        int [] arr1 = new int[5];

        System.out.println("Enter 5 numbers: ");
        for (int i=0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("You entered: "+ " ");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        for (int i=0; i<arr.length; i++){
            arr1[i]= arr[i];
        }
        for (int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
}
}