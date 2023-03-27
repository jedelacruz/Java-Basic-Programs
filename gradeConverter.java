import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*
        
        Write a program that prompts the user to enter a percentage grade and converts it to a letter grade. Use the following grading scale:

        A: 90-100%
        B: 80-89%
        C: 70-79%
        D: 60-69%

        */
      
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter percentage grade: ");
        num = sc.nextInt();

        if(num >= 90 && num <= 100){
            System.out.print("Letter grade: A");
        }
        if(num >= 80 && num <= 89){
            System.out.print("Letter grade: B");
        }
        if(num >= 70 && num <= 79){
            System.out.print("Letter grade: C");
        }
        if(num >= 60 && num <= 69){
            System.out.print("Letter grade: D");
        }
        if(num < 60){
            System.out.print("Letter grade: F");
        }
        
    }
}
