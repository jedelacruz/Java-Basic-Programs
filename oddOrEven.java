import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        /*
        
        Write a program that takes an integer as input and prints whether the number is odd or even.
        
        */
      
        Scanner sc = new Scanner(System.in);

        int num1;
        System.out.print("Enter an integer: ");
        num1 = sc.nextInt();

        if(num1 %2){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }

        
    }
}
