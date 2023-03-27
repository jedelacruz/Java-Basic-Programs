import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*
        
        Write a program that asks the user to enter their age and tells the user which age category they belong to. 
        The categories are: infant (0-1), toddler (1-3), preschooler (3-5), school age (5-12), teenager (12-18), adult (18-65), senior (65+).
        
        */
      
        Scanner sc = new Scanner(System.in);
        
        int age;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if(age >= 0 && age <= 1){
            System.out.print("You belong to the infant age category.");
        }
        if(age >= 1 && age <= 3){
            System.out.print("You belong to the toddler age category.");
        }
        if(age > 3 && age <= 5){
            System.out.print("You belong to the preschooler age category.");
        }
        if(age >= 5 && age <= 12){
            System.out.print("You belong to the school age category.");
        }
        if(age > 12 && age <= 18){
            System.out.print("You belong to the teenager age category.");
        }
        if(age >= 18 && age <= 65){
            System.out.print("You belong to the adult age category.");
        }
        if(age > 65){
            System.out.print("You belong to the senior age category.");
        }
        
        
    }
}
