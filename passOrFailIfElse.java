import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
      /*
      
      Write a program that asks the user to enter their test score and tells the user whether 
      they passed or failed using if-else statements only. A passing score is 60 or higher.
      
      */
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter your test score: ");
        number = sc.nextInt();

        if(number >= 60 && number <= 100){
            System.out.print("You passed!");
        }
        else{
            System.out.print("You failed.");
        }
        
    }
}
