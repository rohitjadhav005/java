class Student{
     String name;
     int age;
     Student(){
        name = "Rohit";
        age = 18;
    }

}
public class defaultconstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
