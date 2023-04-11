package competition;

import java.util.Scanner; // imports the scanner class

public class main {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);	
	
	int tempEnter;
	
	System.out.print("Enter temperature: ");
	tempEnter = scan.nextInt();
	
	System.out.print("Temperature: ");
	
	if(tempEnter < 0) {
		System.out.print("Frigid");
	}
	else if(tempEnter >= 0 && tempEnter <=4) {
		System.out.print("Cold");
	}
	else if(tempEnter >= 5 && tempEnter <=9) {
		System.out.print("Chilly");
	}
	else if(tempEnter >= 10 && tempEnter <= 14) {
		System.out.print("Chilly");
	}
	else if(tempEnter >= 15 && tempEnter <= 19) {
		System.out.print("Mild");
	}
	else if(tempEnter >= 20 && tempEnter <= 24) {
		System.out.print("Perfect");
	}
	else if(tempEnter >= 25 && tempEnter <= 26) {
		System.out.print("Warm");
	}
	else {
		System.out.print("Hot");
	}
	}

}
