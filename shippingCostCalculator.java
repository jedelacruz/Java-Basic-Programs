import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*
        
        Write a program that asks the user for the weight of a package and calculates the shipping cost based on the following criteria:

        If the weight is less than or equal to 2 pounds, the cost is $5.00.
        If the weight is greater than 2 pounds but less than or equal to 6 pounds, the cost is $8.00.
        If the weight is greater than 6 pounds but less than or equal to 10 pounds, the cost is $10.00.
        If the weight is greater than 10 pounds, the cost is $15.00.
        
        Sample Output 1

        Enter the weight of the package in pounds: 15
        The shipping cost for a package of 15.00 pounds is $15.00.
        
        */
      
        Scanner sc = new Scanner(System.in);
        double pound;

        System.out.print("Enter the weight of the package in pounds: ");
        pound = sc.nextDouble();

        if(pound <= 2){
            System.out.printf("The shipping cost for a package of %.2f pounds is $5.00.", pound);
        }
        else if(pound > 2 && pound <= 6){
             System.out.printf("The shipping cost for a package of %.2f pounds is $8.00.", pound);
        }
        else if(pound > 6 && pound <= 10){
             System.out.printf("The shipping cost for a package of %.2f pounds is $10.00.", pound);
        }
        else{
            System.out.printf("The shipping cost for a package of %.2f pounds is $15.00.", pound);
        }
    }
}
