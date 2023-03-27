import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
      
      /*
        
      Write a program that calculates a user's BMI based on their weight and height, and outputs their BMI category (underweight, healthy weight, overweight, obese). 
      The program should use if...else if...else statements to evaluate the BMI and output the appropriate category.

      Underweight <= 18.5
      Healthy Weight> 18.5 and <= 25
      Overweight > 25 and <= 30
      Obese > 30
      
      */

        Scanner sc =  new Scanner(System.in);
        double weight,height,result;

        System.out.print("Enter your weight in kilograms: ");
        weight = sc.nextDouble();
        System.out.print("Enter your height in meters: ");
        height = sc.nextDouble();

        result = weight/(height * height);
        
        System.out.println("Your BMI is " + String.format("%.2f", result));

        if(result <= 18.5){
            System.out.print("You are underweight.");
        }
        else if(result > 18.5 && result <=25){
            System.out.print("You are at a healthy weight.");
        }
        else if(result > 25 && result <= 30){
            System.out.print("You are overweight.");
        }
        else{
            System.out.print("You are obese.");
        }
        
    }
}
