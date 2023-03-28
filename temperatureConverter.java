import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*
        
        1. Temperature Converter

        Write a program that converts a temperature from Celsius to Fahrenheit or vice versa. The program should accept a temperature and a choice of conversion
        (C to F or F to C), and use if...else if...else statements to perform the appropriate conversion.

        Sample Output 1

        Enter temperature: 38
        Convert to (C/F): C
        38.00F = 3.33C
        
        */
      
        Scanner sc = new Scanner(System.in);

        double temp;
        String choice;

        System.out.print("Enter temperature: ");
        temp = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Convert to (C/F): ");
        choice = sc.nextLine();

        if (choice.equalsIgnoreCase("c")) {
            double tempC = (temp - 32) * 5.0 / 9.0;
            String result = String.format("%.2fF = %.2fC", temp, tempC);
            System.out.print(result);
        } else if (choice.equalsIgnoreCase("f")) {
            double tempF = temp * 9.0 / 5.0 + 32;
            String result = String.format("%.2fC = %.2fF", temp, tempF);
            System.out.print(result);
        } else {
            System.out.print("Invalid choice");
        }
        
    }
}
