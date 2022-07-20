/*
 * Take array of n numbers from user , now modify array so positive and negative  numbers are set in alternate position,
 
input ->   1   3   -4    5   -6   23    -45    67    43   44   56   -90   100
output->   1  -4   3    -6   5   -45     23   -90   67   43   44    56    100

input->   1    2   3   4    5     -1    -2    -3   -4    -5 
output->   1  -1   2   -2    3    -3     4    -4     5    -5
 */
package Task_08;

import java.util.Scanner;

public class Alternate_Possition {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int arr_plus[] = new int[10];
		int arr_minus[] = new int[10];
		int final_arr[] = new int[10];
		int i, j, k, temp = 0, plus = 0, minus = 0;
		System.out.println("enter the value of array");
		for (i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		for (i = 0; i < 10; i++) {
			for (j = i + 1; j < 10; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("sorted arra is:");
		for (i = 0; i < 10; i++) {
			System.out.println(final_arr[i]);
		}
		j = 0;
		k = 0;
		for (i = 0; i < 10; i++) {
			System.out.println(arr[i]);
			if (arr[i] > 0) {
				plus++;

				arr_plus[j] = arr[i];
				j++;
			} else {
				minus++;
				arr_minus[j] = arr[i];
				k++;
			}
		}

		int m = 0;

		j = 0;
		k = 0;
		do {
			if (m % 2 == 0) {
				if (plus <= 0) {
					final_arr[m] = arr_minus[k];
					k++;
					m++;
					minus--;
				}
				final_arr[m] = arr_plus[j];
				m++;
				plus--;
				k++;
			} else {
				if (minus <= 0) {
					final_arr[m] = arr_minus[k];
					k++;
					m++;
					plus--;
				}
				final_arr[m] = arr_minus[k];
				k++;
				minus--;
				m++;
			}

		} while (m < 10);

		for (int x = 0; x < 10; x++) {
			System.out.println(final_arr[x]);
		}

	}
}
