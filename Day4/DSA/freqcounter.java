public class freqcounter{
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,5,6,7,7,};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==2){
                count = count+1;
            }     
        }
        System.out.println("count is :"+count);
    }
}