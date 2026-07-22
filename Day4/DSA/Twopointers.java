public class Twopointers {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int start = 0;
        int end = arr.length -1;
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        System.out.println("Reverse array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
