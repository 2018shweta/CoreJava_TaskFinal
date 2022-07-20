package Task_20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Total_Vowel {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		System.out.println("Enter the entire path:");
		String Fpath = sc.next();
		File fp = new File(Fpath);
		BufferedReader br = new BufferedReader(new FileReader(fp));
		if (fp.exists()) {

			System.out.println("file is present!!");
			while (true) {
				int asc = br.read();
				if (asc == -1) {
					break;
				}
				if (asc == 'a' || asc == 'e' || asc == 'i' || asc == 'o' || asc == 'u' || asc == 'A' || asc == 'E'
						|| asc == 'I' || asc == 'O' || asc == 'U') {
					total++;

				}

			}
			System.out.println(total);
		} else {
			System.out.println("file is not present");
		}

	}
}
