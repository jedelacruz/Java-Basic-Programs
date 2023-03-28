import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    
        /*
        
        Write a program that asks the user to enter their credit score and tells the user whether they are eligible for a loan or not. 
        If their credit score is greater than or equal to 700, they are eligible for a loan. Otherwise, they are not eligible.
        
        */
    
        Scanner sc = new Scanner(System.in);
        int score;

        System.out.print("Enter your credit score: ");
        score = sc.nextInt();

        if(score >= 700){
            System.out.print("You are eligible for a loan.");
        }
        else{
            System.out.print("You are not eligible for a loan.");
        }
    }
}
