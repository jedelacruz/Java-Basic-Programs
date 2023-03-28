import java.util.Scanner;

public class Main{
    public static void main(String[] agrs){
        
        /*

        Write a program that takes a number from 1 to 7 as input and prints the corresponding day of the week using a switch statement.

        */
      
        Scanner sc = new Scanner(System.in);
        int day;

        System.out.print("Enter a number from 1 to 7: ");
        day = sc.nextInt();

        switch(day){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Invalid");
                break;
        }
        
    }
}
