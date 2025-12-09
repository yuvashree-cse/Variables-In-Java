import java.util.Scanner;

class Employee{
String id;
String name;
String role;
int age;
}

public class EmployeeDetails{
    
public static void main(String[] args){

Scanner sc = new Scanner(System.in);    
    
System.out.println("Enter employee ID: ");
Employee emp = new Employee();

emp.id = sc.next();

System.out.println("Enter employee name: ");
emp.name = sc.next();

System.out.println("Enter employee role: ");
emp.role = sc.next();

System.out.println("Enter employee age: ");
emp.age = sc.nextInt();

System.out.println("Employee Details");
System.out.println("Employee ID: "+ emp.id);
System.out.println("Employee name: "+ emp.name);
System.out.println("Employee role: "+ emp.role);
System.out.println("Employee age: " + emp.age);
}
}

