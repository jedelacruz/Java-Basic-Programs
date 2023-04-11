package wordLoop;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a text: ");
	        String text = sc.nextLine();
	        
	        System.out.print("How many times should the text be repeated? ");
	        int repeatCount = sc.nextInt();
	        
	        for (int i = 0; i < repeatCount; i++) {
	            System.out.println(text);
	        }
	}

}
