import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
        /*
      
      Write a program that takes two numbers and an arithmetic operator (+, -, *, /) as input and performs the operation using a switch statement.

      Sample Output 1

      Enter first number: 12
      Enter operator (+, -, *, /): -
      Enter second number: 3
      12.00 - 3.00 = 9.00
        
        */
      
        double num1,num2,result;
        String op;

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        sc.nextLine();
            
        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.nextLine();

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        if(op.equals("+")){
            result = num1 + num2;
            System.out.printf("%.2f + %.2f = %.2f", num1, num2, result);  
        }
        else if(op.equals("-")){
            result = num1 - num2;
            System.out.printf("%.2f - %.2f = %.2f", num1, num2, result); 
        }
        else if(op.equals("*")){
            result = num1 * num2;
            System.out.printf("%.2f * %.2f = %.2f", num1, num2, result); 
        }
        else if(op.equals("/")){
            result = num1 / num2;
            System.out.printf("%.2f / %.2f = %.2f", num1, num2, result); 
        }
    }
}
