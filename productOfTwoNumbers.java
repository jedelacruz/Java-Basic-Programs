import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a,b,product;

        System.out.print("Enter value a: ");
        a = sc.nextInt();

        System.out.print("Enter value b: ");
        b = sc.nextInt();

        product = a * b;
        
        System.out.print("Product of " + a + " and " + b + " is " + product);
    }
}
