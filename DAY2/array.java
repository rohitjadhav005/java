import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.println("Enter the numbers");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Entered Numbers are:");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        int total = 0;
        for(int i = 0; i<arr.length ;i++){
            total = total + arr[i];

        }
        System.out.println("Addition of the all the array values is: "+ total);
    }
    
}
