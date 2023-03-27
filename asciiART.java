import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    
    /*
    
    Write a program that prints an ASCII art of a chosen character to the console.

    Sample Output 1

    Enter a character: k
    ASCII art of k:
       __k__
      /     \
     |   o   |
    (|  (_)  |)
     |   |   |
     |  / \  |
     |       |
     |       |
     |_______|
    
    */
      
    Scanner sc = new Scanner(System.in);

    String letter;

        System.out.print("Enter a character: ");
        letter = sc.nextLine();
        System.out.println("ASCII art of " + letter + ":");
        System.out.println("   __" + letter + "__");
        System.out.println("  /     \\");
        System.out.println(" |   o   |");
        System.out.println("(|  (_)  |)");
        System.out.println(" |   |   |");
        System.out.println(" |  / \\  |");
        System.out.println(" |       |");
        System.out.println(" |       |");
        System.out.println(" |_______|");
        
    
        
    }
}
