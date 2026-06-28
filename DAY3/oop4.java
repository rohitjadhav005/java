class Employee{
    String name;
    String department;
    int salary;
}
public class oop4 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Rohit Jadhav";
        e1.department = "Frontend dept";
        e1.salary = 50000;
        System.out.println("Employee Details:- ");
        System.out.println("Employee name: " +e1.name);
        System.out.println("Employee department: " +e1.department);
        System.out.println("Employee salary: " +e1.salary+ " Rs");
    }
}

