import java.util.Scanner;
public class array3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter the array values: ");
        for (int i = 0; i<5;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter Number to Search: ");
        int num = sc.nextInt(); 
        boolean found = false;
         for (int i = 0; i < arr.length; i++){
            if (num == arr[i]){
                System.out.println("Element found at Index: " + i);
                found = true;
                 break;
            }
        }
        if (!found){
            System.out.println("Element not found!");
        }
        sc.close();
    }
}
