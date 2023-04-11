package bank;

import java.util.Scanner;

public class mainconnect {
	
	Scanner s = new Scanner(System.in);
	String usernameGuess;
	String passwordGuess;
	int pin = 2098;
	int pinGuess;
	
	public void Login() {
		System.out.println("=============== Bank Of Lyceum ===============");
		System.out.println();
		
		System.out.println("Log-in");
		System.out.println();
		
		System.out.print("Username: ");
		usernameGuess = s.nextLine();
		
		System.out.print("Password: ");
		passwordGuess = s.nextLine();
		
		if(!usernameGuess.equals("je") && passwordGuess != "pogi") {
			System.out.println();
			System.out.println("Invalid account, Please try again");
			System.out.println();
			Login();
		}
		else {
			System.out.println();
			System.out.println("Login #1 Succesfuly");
			System.out.println();
			pin();
		}
	}
	
	public void pin() {
		System.out.print("Enter the pin to access: ");
		pinGuess = s.nextInt();
		
		if(pinGuess == pin) {
			System.out.println();
			System.out.println("Login #2 Succesfuly");
		}
		else {
			System.out.println();
			System.out.println("Pin is denied");
			System.out.println();
			pin();
		}
	}
	
}
