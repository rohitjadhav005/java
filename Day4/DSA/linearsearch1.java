//find whether the 14 exist in the array or not
public class linearsearch1 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 40, 15};
        int target = 40;  
        linearSearch(arr, target);
    }  
   static int linearSearch(int[] arr,int target) {
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==target){
            System.out.println("Target found at index:"+i);
            return i;
    }
        
    }return -1;
}
}
