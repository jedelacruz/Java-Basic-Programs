import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*

        Write a program that asks the user to enter two numbers and tells the user which one is larger using if-else statements only.

        Sample Output 1

        Enter first number: 7
        Enter second number: 6
        7 is larger

        Sample Output 2

        Enter first number: 1
        Enter second number: 3
        3 is larger

        */
      
        Scanner sc = new Scanner(System.in);
        int num1,num2;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.print(num1 + " is larger");
        }
        else{
            System.out.print(num2 + " is larger");
        }

        // alternative:    
        // System.out.print(num1 > num2 ? num1 : num2 + " is larger");
    }
}
