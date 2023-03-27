import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      
        /*
        
        Write a program that asks the user to enter four numbers and tells the user which one is the largest using only if statements.
        
        */
      
        Scanner sc = new Scanner(System.in);

        int num1,num2,num3,num4;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        num3 = sc.nextInt();

        System.out.print("Enter fourth number: ");
        num4 = sc.nextInt();

        int largest = num1;
        
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }

        System.out.print("The largest number is " + largest);
    }
}
