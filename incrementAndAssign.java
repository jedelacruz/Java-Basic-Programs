import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      
        /*
        
        Write a program that increments a variable by a certain amount using the += operator.

        Sample Output 1

        Enter value: 10
        Enter increment value: 5
        Before increment a = 10
        After increment a = 15
        
        */
      
        Scanner sc = new Scanner(System.in);

        int val,incVal;

        System.out.print("Enter value: ");
        val = sc.nextInt();

        System.out.print("Enter increment value: ");
        incVal = sc.nextInt();

        System.out.println("Before increment a = " + val);

        val+=incVal;
        
        System.out.print("After increment a = " + val);
    }
}
