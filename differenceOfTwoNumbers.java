import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a,b,diff;

        System.out.print("Enter value a: ");
        a = sc.nextInt();

        System.out.print("Enter value b: ");
        b = sc.nextInt();

        diff = a - b;
        
        System.out.print("The difference of " + a + " and " + b + " is " + diff);
    }
}
