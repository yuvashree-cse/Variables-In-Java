import java.util.Scanner;

public class Datatypes{
    
public static void main(String[] args){
    
Scanner sc = new Scanner(System.in);    
    
System.out.println("Enter value for variable 'a': ");
int a = sc.nextInt();

System.out.println("Enter value for variable 'b': ");
int b = sc.nextInt();

System.out.println("Enter your choice: ");
char choice = sc.next().charAt(0);

int result;

switch(choice){
    
    case '+':
        result = a + b;
        System.out.println("Addition: "+ result);
        break;
        
    case '-':
        result = a - b;
        System.out.println("Subtraction: "+ result);
        break;
       
    case '*':
        result = a * b;
        System.out.println("Multiplication: "+ result);
        break;
        
    case '/':
        result = a / b;
        System.out.println("Division: "+ result);
        break;
        
    case '%':
        result = a % b;
        System.out.println("Modulus: "+ result);
        break;      
}
}
}
