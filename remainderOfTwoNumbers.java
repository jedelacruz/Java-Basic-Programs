import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a,b,quot;

        System.out.print("Enter dividend: ");
        a = sc.nextInt();

        System.out.print("Enter divisor: ");
        b = sc.nextInt();

        if(b == 0){
            System.out.print("Error: divisor cannot be zero.");
        }
        else{

        quot = a % b;
        
        System.out.print("Remainder = " + quot);

        }
    }
}
