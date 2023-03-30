import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      
        /*
        
        Write a program that takes an integer as input and returns its absolute value.

        Sample Output 1
        Enter an integer: 5
        The absolute value of 5 is 5
        
        Sample Output 2
        Enter an integer: 17
        The absolute value of 17 is 17
        
        Sample Output 3
        Enter an integer: -39
        The absolute value of -39 is 39
        
        */
      
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Enter an integer: ");
        num = sc.nextInt();

        System.out.print("The absolute value of " + num + " is " + Math.abs(num));
        
    }
}
