import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of iterations for the Fibonacci sequence: ");
        int iterations = sc.nextInt();
        
        int prev = 0;
        int current = 1;
        System.out.print(prev + " " + current + " ");
        for (int i = 2; i < iterations; i++) {
            int next = prev + current;
            System.out.print(next + " ");
            prev = current;
            current = next;
        }
    }
}
