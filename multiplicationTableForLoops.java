import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        // Write a program that takes an integer as input and prints its multiplication table up to 10.
      
        Scanner sc = new Scanner(System.in);

        int number;
        
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.println(number + " x " + i +" = "+ number*i);
//                               5        x     1    =      5 (result)
        }
        
    }
}
