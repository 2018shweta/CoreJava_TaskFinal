package Task_09;

import java.util.Scanner;

public class Max_From_Eachrow {
	Scanner sc = new Scanner(System.in);
	int a = 3;
	int no1[][] = new int[a][a];
	int big[] = new int[a];

	public void main() {
		System.out.println("Enter the value of element in first Array");
		for (int i = 0; i < no1.length; i++) {
			for (int j = 0; j < no1.length; j++) {
				no1[i][j] = sc.nextInt();
			}
		}

		System.out.println("First Array");
		for (int i = 0; i < no1.length; i++) {
			for (int j = 0; j < no1.length; j++) {
				System.out.print(no1[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < no1.length; i++) {
			big[i] = 0;
			for (int j = 0; j < no1.length; j++) {
				if (big[i] < no1[i][j]) {
					big[i] = no1[i][j];
				}
			}
		}
		System.out.println("the max number from array is");
		for (int i = 0; i < big.length; i++) {
			System.out.println(big[i]);
		}
	}

	public static void main(String[] args) {
		Max_From_Eachrow obj = new Max_From_Eachrow();
		obj.main();
	}
}// end of class
