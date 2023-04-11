package competition;

import java.util.Scanner; // imports the scanner class

public class main {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);	
	
	int month,date,year;
	
	System.out.println("Date Formatter");
	System.out.println();
	
	System.out.print("Month: ");
	month = scan.nextInt();
	System.out.print("Date: ");
	date = scan.nextInt();
	
	System.out.print("Year: ");
	year = scan.nextInt();
	
	System.out.println();
	
	
	switch(month) {
	case 1:
		System.out.print("January" + " " + date + ", " + year);
		break;
	case 2:
		System.out.print("February" + " " + date + ", " + year);
		break;
	case 3:
		System.out.print("March" + " " + date + ", " + year);
		break;
	case 4:
		System.out.print("April" + " " + date + ", " + year);
		break;
	case 5:
		System.out.print("May" + " " + date + ", " + year);
		break;
	case 6:
		System.out.print("June" + " " + date + ", " + year);
		break;
	case 7:
		System.out.print("July" + " " + date + ", " + year);
		break;
	case 8:
		System.out.print("August" + " " + date + ", " + year);
		break;
	case 9:
		System.out.print("September" + " " + date + ", " + year);
		break;
	case 10:
		System.out.print("October" + " " + date + ", " + year);
		break;
	case 11:
		System.out.print("November" + " " + date + ", " + year);
		break;
	case 12:
		System.out.print("December" + " " + date + ", " + year);
		break;
	default:
		System.out.print("Invalid Month");
	
	}
	
	if(date > 31) {
		System.out.println();
		System.out.print("Invalid Date");
	}
	
	}

}
