import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*
        
        Write a program that takes two strings as input and concatenates them together, printing the resulting string to the console.

        Sample Output 1

        Enter the first string: Hello
        Enter the second string: World!
        Concatenated String: HelloWorld!
        
        */
       
        Scanner sc = new Scanner(System.in);
        String text1,text2;

        System.out.print("Enter the first string: ");
        text1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        text2 = sc.nextLine();

        System.out.print("Concatenated String: " + text1 + text2);
        
    }
}
