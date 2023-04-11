package competition;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            int num = sc.nextInt();
            sum += num;
        }
        double avg = (double) sum / n;
        System.out.println("Average: " + avg);
       
    }
}
