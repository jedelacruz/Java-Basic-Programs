import java.util.Scanner;

public class Main{
    public static void main(String[] agrs){
      
        /*
        
        Write a program that accepts three numbers as input and outputs them in ascending order.

        Sample Output 1

        Enter value a: 3
        Enter value b: 5
        Enter value c: 6
        3 5 6
        
        */
      
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.print("Enter value a: ");
        a = sc.nextInt();

        System.out.print("Enter value b: ");
        b = sc.nextInt();

        System.out.print("Enter value c: ");
        c = sc.nextInt();

        if(a < b && b < c){
            System.out.print(a + " " + b + " " + c);
        }
        else if(b < a && c > b){
            System.out.print(b + " " + a + " " + c);
        }
        else if(c > a && c < b){
            System.out.print(a + " " + c + " " + b);
        }
        else if(c < b && c  < a){
            System.out.print(c + " " + b + " " + a);
        }
        else if(a == b && b == c && a == c){
            System.out.print(a + " " + b + " " + c);
        }
    }
}
