public class arrayrotation {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // Step 1: Save the first element
        int temp = arr[0];

        // Step 2: Shift all elements one position to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Step 3: Put the first element at the last position
        arr[arr.length - 1] = temp;

        // Step 4: Print the rotated array
        System.out.println("Array after left rotation:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}