import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /*
        
        Write a program that takes an integer as input and decrements it by 1.

        Sample Output 1

        Enter an integer: 5
        The decremented value is: 4
        
        */
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Enter an integer: ");
        num = sc.nextInt();

        int numDec = num - 1;
        
        System.out.print("The decremented value is: " + numDec);
    }
}
