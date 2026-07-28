public class secondlargest {
    public static void main(String[] args) {
        int [] arr = {50, 10, 40, 30, 20};
        int largest = arr[0];
        int secondlargest = arr[1];
        for(int i = 0; i< arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest= arr[i];
            }
            else if (arr[i]>secondlargest && arr[i]!= largest){
                secondlargest=arr[i];
            }
        }
        System.out.println("Second largest element form the given araay is : "+ secondlargest);
    }
}