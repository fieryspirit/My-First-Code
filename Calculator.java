 // import that allows you to get input from user 
 //Created by Raymond McNeal
import java.util.Scanner;
        // class name
public class Main {
        // normal java code to start method
    public static void main(String[] args)
    {
        
       //Declaring scanner
        Scanner sc = new Scanner(System.in);
 
        // taking input from the user using the Scanner
        // prompting user
        System.out.println( "Enter the first and the Second number - ");
        // getting first input from number
        double a = sc.nextInt(); 
        // getting second input from user 
        double b = sc.nextInt();
 
        // selecting the operand for the calculations
        System.out.println( "Choose and Enter the type of operation you want to perform (+, -, *, /)");
        // getting operator 
        char op = sc.next().charAt(0);
        // passing numbers and operators to method 
        solve(a, b, op);
    }
    public static double solve(double a, double b, char op)
    {
        double ans = 0;
        
// addition
        if (op == '+') {
            ans = a + b;
            
        }
// substraction
        else if (op == '-') {
            ans = a - b;
         
        }
// multiplication
        else if (op == '*') {
           ans = a * b;
        
        }
//division
        else if (op == '/') {
            ans = a / b;
        }
 
 
// printing the final result
        System.out.println("Your answer is - " + ans);
        return ans;
    }
}

        
        
        
        
    
