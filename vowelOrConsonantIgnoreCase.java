import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        // Write a program that asks the user to enter a letter and tells the user whether it is a vowel or a consonant using if-else statements only.
      
        Scanner sc = new Scanner(System.in);

        String letter;

        System.out.print("Enter a letter: ");
        letter = sc.nextLine();

        if(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")){
            System.out.print(letter + " is a vowel.");
        }
        else{
            System.out.print(letter + " is a consonant.");
        }
        
    }
}
