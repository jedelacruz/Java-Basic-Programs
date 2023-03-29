import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /*
        
        Write a program that takes an integer as input and increments it by 1.

        Sample Output 1
        Enter an integer: 11
        Result: 12
        
        */
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Enter an integer: ");
        num = sc.nextInt();

        int numInc = num + 1;
        
        System.out.print("Result: " + numInc);
    }
}
