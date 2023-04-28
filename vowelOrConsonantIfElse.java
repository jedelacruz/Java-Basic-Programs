import java.util.Scanner;

public class vowelOrConsonantIfElse{
    public static void main(String[] args){
        // alphabet list
        String vowels = "aeiou";
        String consonants = "bcdfghkjlmnpqrstvwxyz";
        /*
        
        Write a program that asks the user to enter a letter and tells the user whether the letter is a vowel or a consonant.

        Sample Output 1

        Enter a letter: A
        A is a vowel.

        Sample Output 2

        Enter a letter: b
        b is a consonant.
        
        */
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = sc.next().toLowerCase();

/*        if(letter.equals("a") || letter.equals("A") || letter.equals("e") || letter.equals("E") || letter.equals("i") || letter.equals("I") || letter.equals("o") || letter.equals("O") || letter.equals("u") || letter.equals("U")){
            System.out.print(letter + " is a vowel.");
        }
        else{
            System.out.print(letter + " is a consonant.");
        }*/

        if (vowels.contains(letter)) {
            System.out.println(letter + " is a vowel");
        } else if (consonants.contains(letter)) { 
            System.out.println(letter + " is a consonant");
        } else {
            System.out.println(letter + " isn't a letter");
        }
        
    }
}
