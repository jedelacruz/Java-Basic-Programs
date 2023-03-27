import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Write a program that asks the user to enter a number and tells the user whether the number is even or odd using if-else statements only.
      
        Scanner sc = new Scanner(System.in);
        int number;
        
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if(number % 2 == 0){
            System.out.print(number + " is even.");
        }
        else{
            System.out.print(number + " is odd.");
        }
        
    }
}
