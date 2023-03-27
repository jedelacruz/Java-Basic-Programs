import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*
        
        Write a program that accepts the current hour of the day and outputs a greeting based on the following table:

        0-11: "Good morning"
        12-17: "Good afternoon"
        18-23: "Good evening"

        Sample Output 1

        Enter the current hour (0-23): 11
        Good morning
        
        */
      
        Scanner sc = new Scanner(System.in);
        int time;

        System.out.print("Enter the current hour (0-23): ");
        time = sc.nextInt();

        if(time > -1 && time < 12){
            System.out.print("Good morning");
        }
        if(time >= 12 && time <= 17){
            System.out.print("Good afternoon");
        }
        else if(time >= 18 && time <= 23){
            System.out.print("Good evening");
        }
        else if(time > 23){
            System.out.print("Invalid input");
        }
    }
}
