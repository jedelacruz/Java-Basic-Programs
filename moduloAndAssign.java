import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*

        Write a program that finds the remainder of a variable divided by a certain amount using the %= operator.

        Sample Output 1

        Enter value a: 10
        Enter value b: 3
        Before modulo a = 10
        After modulo a = 1

        */
      
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("Enter value a: ");
        a = sc.nextInt();

        System.out.print("Enter value b: ");
        b = sc.nextInt();
        
        System.out.println("Before modulo a = " + a);

        a%=b;
        
        System.out.print("After modulo a = " + a);
    }
}
