import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      
        /*
        
        Write a program that takes a letter grade (A, B, C, D, or F) as input and prints the corresponding numerical grade using a switch statement.
        A = 4.0
        B = 3.0
        C = 2.0
        D = 1.0
        F = 0.0
        
        */
      
        Scanner sc = new Scanner(System.in);

        String grade;

        System.out.print("Enter the letter grade (A, B, C, D, or F): ");

        grade = sc.nextLine();

        switch(grade.toUpperCase()){
            case "A":
                System.out.print("Numerical grade: 4.0");
                break;
            case "B":
                System.out.print("Numerical grade: 3.0");
                break;
            case "C":
                System.out.print("Numerical grade: 2.0");
                break;
            case "D":
                System.out.print("Numerical grade: 1.0");
                break;
            case "F":
                System.out.print("Numerical grade: 0.0");
                break;
            default:
                System.out.print("Invalid grade!");
                break;
        }
        
    }
}
