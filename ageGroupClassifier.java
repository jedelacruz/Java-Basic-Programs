import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /*
        
        Write a program that asks the user for their age and classifies them into the following age groups:

        0-2: Infant
        3-12: Child
        13-19: Teenager
        20-65: Adult
        66 and above: Senior Citizen
        
        */
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if(age >= 0 && age <= 2){
            System.out.print("You are an infant.");
        }
        else if(age >= 3 && age <= 12){
            System.out.print("You are a child.");
        }
        else if(age >= 13 && age <= 19){
            System.out.print("You are a teenager.");
        }
        else if(age >= 20 && age <= 65){
            System.out.print("You are an adult.");
        }
        else if(age >= 66){
            System.out.print("You are a senior citizen.");
        }
        
        
    }
}
