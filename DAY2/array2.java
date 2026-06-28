import java.util.Scanner;
public class array2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.println("Enter the numbers");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
         int larger = arr[0];
         int smaller = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>larger){
            larger = arr[i];
            }
            if (arr[i]<smaller){
            smaller = arr[i];
            }
        }
        System.out.println("Largest number from the array is: "+ larger);
        System.out.println("Smallest number from the array is: "+ smaller);
    }
    
}