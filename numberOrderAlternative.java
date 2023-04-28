import java.util.Arrays;
import java.util.Scanner;

public class numberOrderAlternative {
	public static void main(String[] args) {
		String letters = "abc";
		// empty list, length of 3
		int[] ls = new int[3];
		Scanner sc = new Scanner(System.in);
		// loop
		for (int x = 0; x <= 2; x++) {
			System.out.print("Enter value " + letters.charAt(x) + ": ");
			ls[x] = sc.nextInt();
		}
		// close scanner
		sc.close();
		// sort array
		Arrays.sort(ls);
		for (int a : ls){
			System.out.print(String.valueOf(a) + " ");
		}
	}
}
