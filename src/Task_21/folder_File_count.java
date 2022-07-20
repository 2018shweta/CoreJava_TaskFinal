package Task_21;

import java.io.File;
import java.util.Scanner;

public class folder_File_count {

	public static void main(String args[])

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the folder:");
		String s1 = sc.next();
		File f = new File(s1);
		if (f.exists()) {
			int total_f = 0, total_j = 0;
			File[] f_list = f.listFiles();
			for (File l1 : f_list) {
				System.out.println(l1);
				total_f++;
				if (l1.getName().contains("java")) {
					total_j++;
				}
			}
			System.out.println("total files" + total_f);
			System.out.println("total java " + total_j);
		}

	}
}
