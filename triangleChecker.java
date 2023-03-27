import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      
        /*
        
        Write a program that accepts the lengths of three sides of a triangle as input and outputs a message indicating whether 
        the triangle is equilateral, isosceles, or scalene.

        Sample Output 1

        Enter value a: 5
        Enter value b: 5
        Enter value c: 5
        Equilateral triangle
        
        */
      
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.print("Enter value a: ");
        a = sc.nextInt();
        
        System.out.print("Enter value b: ");
        b = sc.nextInt();

        System.out.print("Enter value c: ");
        c = sc.nextInt();

        if(a == b && a == c && b == c){
            System.out.print("Equilateral triangle");
        }
        else if(a == b || a == c || b == c){
            System.out.print("Isosceles triangle");
        }
        else if(a != b && a != c && b != c){
            System.out.print("Scalene triangle");
        }
        
    }
}
