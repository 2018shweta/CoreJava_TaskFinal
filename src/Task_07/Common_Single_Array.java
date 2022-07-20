/*
 * Find common Numbers from 2 one dimension arrays.
		Array1:  1  2  3  4   5  6  7  
		Array2:  2  9  5  10 15  7  80
		Output : 2 5  7 
 */
package Task_07;

import java.util.Scanner;

public class Common_Single_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		// int arr1[] = {1 ,2,3,4,5,6,7};
		// int arr2[] = {2,9,5,10,15,7,80};
		System.out.println("Enter the array 1 elements:");
		for (int i = 0; i < 5; i++) {
			System.out.println("enter element:");
			arr1[i] = sc.nextInt();
		} // end for
		System.out.println("Enter the array 2 elements:");
		for (int i = 0; i < 5; i++) {
			System.out.println("enter element:");
			arr2[i] = sc.nextInt();
		} // end for
		System.out.println("Commomn number in two array:");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print("\t" + arr1[i]);
				} // end if
			} // end for loop j
		} // end for loop i
	}// end main
}// end class
