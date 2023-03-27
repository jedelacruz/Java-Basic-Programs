import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*
        
        Write a program that accepts a number as input and outputs a message indicating whether the number is positive, negative, or zero.

        Sample Output 1
        Enter a number: 6
        6 is a positive number
        
        Sample Output 2
        Enter a number: -3
        -3 is a negative number
        
        Sample Output 3
        Enter a number: 0
        The number is zero
        
        */
      
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if(number > 0){
            System.out.print(number + " is a positive number");
        }
        else if(number == 0){
            System.out.print("The number is zero");
        }
        else{
            System.out.print(number + " is a negative number");
        }
    }
}
