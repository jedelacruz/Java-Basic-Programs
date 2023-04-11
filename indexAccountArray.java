package competition;

import java.util.Scanner; // imports the scanner class

public class main {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);	
	
	int choice;
		
	String email[] = {"jepogi21@gmail.com" , "jamesbading@gmail.com" , "redentorpe@gmail.com" , "brunomacho@gmail.com" , "jinky@gmail.com" };
	String username[] = {"sinisterJE" , "jamesbading" , "torpebaako?" , "brunoMACHO" , "jinkybilat"};
	String password[] = {"jesopogi" , "akosijames" , "redenlovejepoy" , "akosibruno" , "jinkysubu"};

	System.out.println("What account do you want to open? ( 0 - 4 )");
	
	System.out.println();
	
	System.out.print("Index: ");
	choice = scan.nextInt();
	
	if(choice == 0) {
		System.out.println("Email: " + email[0]);
		System.out.println("Username: " + username[0]);
		System.out.println("Password: " + password[0]);
	}
	else if(choice == 1) {
		System.out.println("Email: " + email[1]);
		System.out.println("Username: " + username[1]);
		System.out.println("Password: " + password[1]);
	}
	else if(choice == 2) {
		System.out.println("Email: " + email[2]);
		System.out.println("Username: " + username[2]);
		System.out.println("Password: " + password[2]);
	}
	else if(choice == 3) {
		System.out.println("Email: " + email[3]);
		System.out.println("Username: " + username[3]);
		System.out.println("Password: " + password[3]);
	}
	else if(choice == 4) {
		System.out.println("Email: " + email[4]);
		System.out.println("Username: " + username[4]);
		System.out.println("Password: " + password[4]);
	}
	
	}

}
