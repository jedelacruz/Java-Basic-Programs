// package competition;

import java.util.Scanner;

public class longestWordChecker {
  public static void main(String[] args) {
  	
	  Scanner sc = new Scanner(System.in);
    System.out.print("Enter a list of words separated by spaces: ");
    String input = sc.nextLine();
    String[] words = input.split(" ");
    String longest = words[0];
    for (int i = 1; i < words.length; i++) {
      if (words[i].length() > longest.length()) {
        longest = words[i];
      }
    }
    System.out.println("Longest word: " + longest);
     
  }
}
