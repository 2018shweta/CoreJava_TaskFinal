/*
 * take 10 numbers from user. now read that number and store into odd.txt if number is odd and 
store into 	even.txt if number is even.
 */
package Task_19;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File_even_odd {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		File e = new File("even.txt");
		File o = new File("odd.txt");
		System.out.println(e.getAbsolutePath());
		System.out.println("Enter how many numbers you want:");
		int num = sc.nextInt();
		// FileOutputStream e1= new FileOutputStream(e);
		// FileOutputStream o1=new FileOutputStream(o);
		PrintWriter e1 = new PrintWriter(e);
		PrintWriter o1 = new PrintWriter(o);
		// e1.write(100);
		// o1.write(100);
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter the number :");
			int no = sc.nextInt();

			if (no % 2 == 0) {
				e1.println(no);
			} else if (no % 2 != 0) {
				o1.println(no);
			} else {
				System.out.println("you enter the invalid no");
			}
		}
		e1.close();
		o1.close();
	}
}
