import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        /*
        
        Write a program that takes two integers as input and returns the first number raised to the power of the second number.

        Sample Output 1

        Enter base number: 5
        Enter exponent number: 2
        Result: 25
        
        */
      
        Scanner sc = new Scanner(System.in);

        int number, expNum, result;

        System.out.print("Enter base number: ");
        number = sc.nextInt();

        System.out.print("Enter exponent number: ");
        expNum = sc.nextInt();

        result = (int) Math.round(Math.pow(number, expNum));

        System.out.print("Result: " + result);
    }
}
