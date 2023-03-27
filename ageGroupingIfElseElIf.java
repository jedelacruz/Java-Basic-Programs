import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*

        Write a program that accepts a user's age and outputs their age group. 
        The age groups are: child (0-12), teenager (13-19), young adult (20-29), adult (30-59), senior (60+).

        */
      
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if(age >= 0 && age <= 12){
            System.out.print("You are a child.");
        }
        else if(age >= 13 && age <= 19){
            System.out.print("You are a teenager.");
        }
        else if(age >= 20 && age <= 29){
            System.out.print("You are a young adult.");
        }
        else if(age >= 30 && age <= 59){
            System.out.print("You are an adult.");
        }
        else if(age >= 60){
            System.out.print("You are a senior.");
        }
        else{
            System.out.print("Invalid age entered.");
        }
        
    }
}
