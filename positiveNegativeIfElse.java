import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Write a program that asks the user to enter a number and tells the user whether the number is positive or negative. Using if only (do not use if else).
        
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if(num > 0){
            System.out.print("The number is positive" );
        }
        if(num == 0){
            System.out.print("The number is zero" );
        }
        if(num < 0){
            System.out.print("The number is negative" );
        }
    
        
    }
}
