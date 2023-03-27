import java.util.Scanner;

public class Main{
    public static void main(String[] agrs){
        
        // Write a program that asks the user to enter their test score and tells the user whether they passed or failed. The passing grade is 60.
        
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter your test score: ");
        num = sc.nextInt();

        if(num >= 60){
            System.out.print("You passed!");
        }
        if(num < 60){
            System.out.print("You failed!");
        }
        
    }
}
