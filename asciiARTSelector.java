import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*
        
        Write a program that takes a number from 1 to 5 as input and prints the corresponding ASCII art using a switch statement.

        Sample Output 1

        Enter a number from 1 to 5: 1
            /|
           / |
          /  |
         /___|
        Sample Output 2

        Enter a number from 1 to 5: 2
           /\
          /  \
         /____\
           ||
           ||
        
        */
        
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number from 1 to 5: ");
        num = sc.nextInt();

        switch(num){
            case 1:
                System.out.println("    /|");
                System.out.println("   / |");
                System.out.println("  /  |");
                System.out.println(" /___|");
                break;
            case 2:
                System.out.println("   /\\");
                System.out.println("  /  \\");
                System.out.println(" /____\\");
                System.out.println("   ||");
                System.out.println("   ||");
                break;
            case 3:
                System.out.println("  .-\"\"\"\"\"-.");
                System.out.println(" /          \\");
                System.out.println("|  O      O  |");
                System.out.println("|     ()     |");
                System.out.println("|  0      0  |");
                System.out.println(" \\  0.__.0  /");
                System.out.println("  '-.____.-'");
                break;               
            case 4:
                System.out.println("   _____");
                System.out.println("  /     \\");
                System.out.println(" / o   o \\");
                System.out.println(" \\   ^   /");
                System.out.println("  \\ '-' /");
                System.out.println("   '\\_/'");
                break;
            case 5:
                System.out.println("        /\\_/\\    ");
                System.out.println("       ( o o )   ");
                System.out.println("      ==_~_~_~_==");
                System.out.println("      /         \\");
                System.out.println("   \\| |         | |/");
                System.out.println("    \\| |   0 0   | |/");
                System.out.println("     | |  = Y =  | |");
                System.out.println("   \\_/\\|` >._.< `|/\\_/");
                System.out.println("   /_/ \\_\\`-\\_/`/_/ \\_\\ ");
                break;
            default:
                System.out.print("Invalid input");
                break;
        }
        
    }
}
