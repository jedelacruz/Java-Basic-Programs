import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*
        
        Write a program that decrements a variable by a certain amount using the -= operator.

        Sample Output 1

        Enter value: 10
        Enter decrement value: 5
        Before decrement a = 10
        After decrement a = 5
        
        */
      
        Scanner sc = new Scanner(System.in);
        int val,decVal;

        System.out.print("Enter value: ");
        val = sc.nextInt();

        System.out.print("Enter decrement value: ");
        decVal = sc.nextInt();

        System.out.println("Before decrement a = " + val);

        val -= decVal;

        System.out.println("After decrement a = " + val);
    }
}
