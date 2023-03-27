import java.util.Scanner;

public class Main{
    public static void main(String[] agrs){
        
        /*
        
        Write a program that accepts a number between 1 and 7 as input and outputs the corresponding day of the week (Monday, Tuesday, Wednesday, etc.). 
        The program should output an error message if the input is not a number between 1 and 7.

        Sample Output 1

        Enter a number between 1 and 7: 1
        Monday
        
        */
      
        Scanner sc = new Scanner(System.in);
        int numDay;
        
        System.out.print("Enter a number between 1 and 7: ");
        numDay = sc.nextInt();

        if(numDay == 1){
            System.out.print("Monday");
        }
        else if(numDay == 2){
            System.out.print("Tuesday");
        }
        else if(numDay == 3){
            System.out.print("Wednesday");
        }
        else if(numDay == 4){
            System.out.print("Thursday");
        }
        else if(numDay == 5){
            System.out.print("Friday");
        }
        else if(numDay == 6){
            System.out.print("Saturday");
        }
        else if(numDay == 7){
            System.out.print("Sunday");
        }
        else{
            System.out.print("Error: Input must be between 1 and 7");
        }
    }
}
