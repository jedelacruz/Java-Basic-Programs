import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        /*
        
        Write a program that takes an input price. A 15% discount is calculated only if the purchased amount is greater than 1500 using if-else statements only.

        Sample Output 1

        Enter the price: 17000
        Final price: 14450.00
        
        Sample Output 2

        Enter the price: 1350
        Final price: 1350.00
        
        */
      
        Scanner sc = new Scanner(System.in);

        int price;
        System.out.print("Enter the price: ");
        price = sc.nextInt();

        double priceDec = price;

        if (price > 1500) {
            double finalPrice = priceDec * 0.85;
            System.out.printf("Final price: %.2f", finalPrice);
        } else {
            System.out.printf("Final price: %.2f", priceDec);
        }
    }
}
