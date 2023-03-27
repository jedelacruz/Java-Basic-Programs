import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*

        Write a program that asks the user to enter two numbers and tells the user which number is greater.

        */
      
        Scanner sc = new Scanner(System.in);

        int num1,num2;

        System.out.print("Enter value a: ");
        num1 = sc.nextInt();

        System.out.print("Enter value b: ");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.print(num1 + " is greater than " + num2 + ".");
        }
        else if(num1 == num2){
            System.out.print(num1 + " is equal to " + num2 + ".");
        }
        else{
            System.out.print(num2 + " is greater than " + num1 + ".");
        }
    }
}
