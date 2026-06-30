import java.util.Scanner;
class Student{
    private String name;
    private int age;
    void setName(String name){
        this.name= name;
    }
    void setAge(int age){
        if (age>0){
            this.age= age;
        } else{
            System.out.println("Invalid age");
        }
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
public class encapsulation {
    public static void main(String[] args){
 
    Scanner sc = new Scanner(System.in);
    Student s1 = new Student();

    System.out.println("Enter Name: ");
    String name = sc.nextLine();
    System.out.println("Enter Age: ");
    int age = sc.nextInt();

    s1.setName(name);
    s1.setAge(age);
    System.out.println("Name : "+s1.getName());
    System.out.println("Age : "+s1.getAge());
    sc.close();
    }  
}
