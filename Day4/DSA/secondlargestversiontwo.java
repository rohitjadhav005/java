public class secondlargestversiontwo {
    public static void main(String[] args) {
        int [] arr = {10,50,30,40,20};
        int largest = arr[0];
        int secondlargest;
            for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest= arr[i];
                System.out.println(largest);
            }
            if(arr[i]>largest){
                secondlargest= arr[i];
                System.out.println(secondlargest);
            }
        }
    }
}
