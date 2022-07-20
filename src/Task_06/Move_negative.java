/*
 * Move all the negative elements to one side of the array. 
		input -> 1  3  -4  5  -6   23   -45    67   43   44   56   -90   100
		Output -> 1  3   5    23   67   43    56    100   -4   -6  -45   -90  
 */
package Task_06;

import java.util.Scanner;

public class Move_negative {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int arr1[] = new int[10], i, j, temp = 0;
		System.out.println("enter the value of array:");
		for (i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		} // end for i loop
		for (i = 0; i < 10; i++) {
			for (j = i + 1; j < 10; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				} // end if loop
			} // end for loop j
		} // end for loop i
		System.out.println("new series is:");
		for (i = 0; i < 10; i++) {
			System.out.print("\t" + arr[i]);
		} // end for i

	}// end main

}// end class
