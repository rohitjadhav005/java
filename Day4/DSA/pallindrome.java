public class pallindrome{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3,2,1};
        int start = 0;
        int end = arr.length -1;
        boolean isPalindromme = true;
        while(start<end){
            if(arr[start]!=arr[end]){
                isPalindromme = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindromme==true){
            System.out.println("Array is Palindromme!");
        }
        else{
            System.out.println("Array is not Palindromme!");
        }
    }
}   