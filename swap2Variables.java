import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*

        Write a program that swaps the values of two variables using the assignment operator.

        Sample Output 1

        Enter value a: 5
        Enter value b: 10
        Before swap a = 5, b = 10
        After swap a = 10, b = 5

        */
      
        Scanner sc = new Scanner(System.in);
        int a,b,temp;

        System.out.print("Enter value a: ");
        a = sc.nextInt();

        System.out.print("Enter value b: ");
        b = sc.nextInt();

        System.out.println("Before swap a = " + a + ", b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.print("After swap a = " + a + ", b = " + b);

        
    }
}
