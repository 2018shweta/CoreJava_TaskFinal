/*
F * You need to design an api for google LLC.   your api will verify the syntax of email address ,  syntax for email is , 
it must contains gmail.com at last. 
The name can have a-z A_Z 0-9
Between name(tejasshah)  and domain(gmail.com)  it must contains “@”
If above rule is not followed then InvalidEmailException will throw by your api.  
 */
package Task_15;

import java.util.Scanner;

import javax.management.InvalidApplicationException;

public class Google_Api {

	
	public static void main(String args[]) throws Exception
	{
String email;
		
		try (Scanner snr = new Scanner(System.in)) {
			System.out.println("Enter Email");
			try {
				email = snr.next();
				if(email.contains("@") && email.endsWith("gmail.com") ) {
					System.out.println(email);
				}else {
					
					throw  new Exception("Invalid Email");
				}
			} catch (InvalidApplicationException e) {
				System.out.println(e);
			}
		}
	}
}
