class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;//this keyword used for filling the object's fields with the values passed to the constructor.
        this.age = age;//this keyword used for filling the object's fields with the values passed to the constructor.
    }
}
public class parameterizedconstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Rohit",21);
        Student s2 = new Student("Neha",20);                    
        Student s3 = new Student("Himendra",19);
        Student s4 = new Student("Krishna",18);
        Student s5 = new Student("Babu",22);
        Student s6 = new Student("Tanvi",12);
        System.out.println("Hello "+ s1.name + " ohh you are"+ " " + s1.age+" year old");
        System.out.println("Hello "+ s2.name + " ohh you are"+ " " + s2.age+" year old");
        System.out.println("Hello "+ s3.name + " ohh you are"+ " " + s3.age+" year old");
        System.out.println("Hello "+ s4.name + " ohh you are"+ " " + s4.age+" year old");
        System.out.println("Hello "+ s5.name + " ohh you are"+ " " + s5.age+" year old");
        System.out.println("Hello "+ s6.name + " ohh you are"+ " " + s6.age+" year old");
    }
    
}
