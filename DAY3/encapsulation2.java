import java.util.Scanner;
class Bank{
    private String name;
    private double balance;
    void setName(String name){
        this.name = name;
    }   
     void setBalance(double balance){
        this.balance = balance;
    }   
    String getName(){
        return name;
    }
    double getBalance(){
        return balance;
    }
}
public class encapsulation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b1 = new Bank();
        System.out.println("Enter the Account Holders Name: ");
        String name = sc.nextLine();
        System.out.println("Enter the Balance: ");
        double balance = sc.nextDouble();
        b1.setName(name);
        b1.setBalance(balance);
        System.out.println("Account holders Name is: "+ b1.getName());
        System.out.println("Account holders Balance is : "+ b1.getBalance());

    }
    
}
