package Task_01;

import java.util.Scanner;

public class Right_Shift {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int ar1[] = { 1, 2, 3, 4, 5 }, n, k;
		System.out.println("Enter element to Shift");
		n = sc.nextInt();
		System.out.println("Before Shifting");

		for (int i = 0; i < ar1.length; i++) {
			System.out.print(" " + ar1[i]);
		} // end for loop i

		for (k = 1; k <= n; k++) {
			int temp = 0;
			temp = ar1[ar1.length - 1];

			for (int i = ar1.length - 1; i > 0; i--) {
				ar1[i] = ar1[i - 1];
			} // end for loop i
			ar1[0] = temp;

			if (k == n) {
				System.out.println("  ");
				System.out.println(" After shifting ans is");

				for (int i = 0; i < ar1.length; i++) {
					System.out.print(" " + ar1[i]);
				} // end for loop i
			} // end if
		} // end for loop k
	}// end main

}// end of class
