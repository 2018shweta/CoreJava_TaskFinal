/*Student 
			-studentId 
			-name 
			-email
			-password 
			
	when any student registered studentId will automatically assign 
	an unique number. 
	name email and password will input by student. 
	
    create two methods 1) input 2) print 
    
    
    111111	ram	ram@gmail.com	ram123 
   */
package Task_02;

import java.util.Scanner;

public class Student_AutoId {

	Scanner sc = new Scanner(System.in);
	int studentid;
	String name;
	String eid;
	String pw;

	Student_AutoId() {
		System.out.println("enter the name :");
		name = sc.nextLine();
		System.out.println("enter the email id :");
		eid = sc.nextLine();
		System.out.println("enter the pw :");
		pw = sc.nextLine();
		studentid = (int) (Math.random() * 100000);
		// p_u();
		System.out.println("name:" + name + "\t" + " email id:" + eid + "\t" + " password:" + pw + "\t" + " studentid: "
				+ studentid);

	}

	public static void main(String args[]) {

		Student_AutoId s1 = new Student_AutoId();
		// s1.input_u();

	}// end main

}// end class
