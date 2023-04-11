package averageSubject;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            sum += num;
        }
        double average = sum / 5;
        int roundedAverage = (int) Math.round(average);
        System.out.println("Average: " + roundedAverage);
        if (roundedAverage < 75) {
            System.out.println("Failed");
        } else if (roundedAverage >= 75 && roundedAverage < 90) {
            System.out.println("Passed");
        } else if (roundedAverage >= 90 && roundedAverage < 95) {
            System.out.println("With Honors");
        } else if (roundedAverage >= 95 && roundedAverage < 98) {
            System.out.println("With High Honors");
        } else if (roundedAverage >= 98 && roundedAverage <= 100) {
            System.out.println("With Highest Honors");
        } else {
            System.out.println("Invalid");
        }
    }

}
