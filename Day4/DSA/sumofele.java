public class sumofele {
   public static void main(String[] args) {
    int []arr = {10,20,30,40};
    int sum = 0;
    int avg ;
    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];    
    }
    avg = sum/arr.length;
       System.out.println("Sum of  the array elements is :"+ sum);
       System.out.println("Avg of the element is :"+ avg);
   }
}
