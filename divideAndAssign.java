import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*

        Write a program that divides a variable by a certain amount using the /= operator.

        Sample Output 1

        Enter value a: 10
        Enter value b: 2
        Before division a = 10
        After division a = 5

        */
      
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("Enter value a: ");
        a = sc.nextInt();

        System.out.print("Enter value b: ");
        b = sc.nextInt();

        System.out.println("Before division a = " + a);

        a/=b;

        System.out.print("After division a = " + a);
        
        
    }
}
