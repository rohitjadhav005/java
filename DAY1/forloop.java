public class forloop {
    public static void main(String[] args) {
    // Normal for loop   
        System.out.println("# Normal loop\n");
        for(int i = 1; i <=10 ; i ++){
    
            System.out.println(i+" ");
        }
    // reverse for loop
        System.out.println("\n# Reverse for loop\n");
        for(int i = 10 ;i>=1;i--){
            System.out.println(i+" ");
        }
    // print even number
       System.out.println("\n# Print even number\n");
       for(int i = 1; i<=100;i+=2){
        System.out.println(i);
       }   
    }
}
