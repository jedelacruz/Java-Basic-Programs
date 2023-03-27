import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*  
        
        Write a program that prompts the user to enter the lengths of three sides of a triangle and classifies it as either equilateral, isosceles, or scalene. 
        An equilateral triangle has three sides of equal length, 
        an isosceles triangle has two sides of equal length, and 
        a scalene triangle has no sides of equal length.
        
        */
      
        Scanner sc = new Scanner(System.in);

        int side1,side2,side3;

        System.out.print("Enter first side: ");
        side1 = sc.nextInt();
        System.out.print("Enter second side: ");
        side2 = sc.nextInt();
        System.out.print("Enter third side: ");
        side3 = sc.nextInt();

        if(side1 == side2 && side1 == side3 && side2 == side3){
            System.out.print("The triangle is equilateral.");
        }
        if((side1 == side2 && side2 != side3) || (side2 == side3 && side3 != side1) || (side3 == side1 && side1 != side2)){
            System.out.print("The triangle is isosceles.");
        }
        if(side1 != side2 && side1 != side3 && side2 != side3){
            System.out.print("The triangle is scalene.");
        }
        
    }
}
