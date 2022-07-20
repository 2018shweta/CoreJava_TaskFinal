/*
 * Telephone Diary 


We need to create one diary app for user.
when user open app it display menu for operation 
e.g

1 Add new Contact
2 Edit Contact
3 Search Contact 
4 Remove Contact 
5 Exit From App 


1 Add contact will add new contact in app. we need to store first name last name and phone number of user. 
2 Edit contact will modify user info.  user can search via firstname once user found then only edit function will work
3 when user want to contact any person user can use this functionality, he can add first name of user and your app will list all users with matching first name 
4  remove contact will remove contact from app user can remove contact via first name , if multiple user found then app need to confirm which user need to be deleted , you have to manage this by your own way 
5 exit :) 
   		
 */
package Task_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Telephone_Diary {

	public static void main(String[] args) {
		ArrayList<Person> p1 = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(
					"\n1. add new contect \n 2. show contect \n 3. update contect \n 4. delete contect \n 5. exit");
			System.out.println("Enter choice");
			int choice = sc.nextInt();

			Person p = new Person();
			switch (choice) {
			case 1:
				System.out.println("Enter FirstName");
				p.firstname = sc.next();
				System.out.println("Enter LastName");
				p.lastname = sc.next();
				System.out.println("Enter Contect No");
				p.contect = sc.next();

				p1.add(p);
				break;
			case 2:
				System.out.println("Show Details");
				System.out.println(p1);
				p.toString();
				break;
			case 3:
				System.out.println("Update Contect");
				System.out.println("Enter the first name you want to edit??");
				String edit_firstname = sc.next();
				for (int i = 0; i < p1.size(); i++) {
					if (p1.get(i).getFirstname().equals(edit_firstname)) {
						System.out.println("1.Enter the editfirst name ?");
						System.out.println("2.Enter the editlast name ?");
						System.out.println("3.Enter the editnumber ?");
						int edit_choice = sc.nextInt();
						switch (edit_choice) {
						case 1:
							System.out.println("Enter the edit name you want to change first name:");
							String change_firstname = sc.next();
							p1.get(i).setFirstname(change_firstname);
							break;
						case 2:
							System.out.println("Enter the edit name you want to change first name:");
							String change_lastname = sc.next();
							p1.get(i).setLastname(change_lastname);
							break;
						case 3:
							System.out.println("Enter the edit name you want to change first name:");
							String change_contect = sc.next();
							p1.get(i).setContect(change_contect);
							break;
						default:
							System.out.println("something wrong!!");
						}

					} // end switch edit_choice
				} // end for loop i
				break;
			case 4:
				System.out.println("Delete Contect");
				System.out.println("Enter the name you want to remove ");
				String delete_name = sc.next();
				for (int i = 0; i < p1.size(); i++) {
					if (p1.get(i).getFirstname().equals(delete_name)) {
						p1.remove(i);
						System.out.println("remove done!!");
					}
				}
				break;

			case 5:
				System.exit(0);
				break;
			}// end switch choice

		}

	}// end class main

}// end class

class Person {
	String firstname;
	String lastname;
	String contect;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getContect() {
		return contect;
	}

	public void setContect(String contect) {
		this.contect = contect;
	}

	public String toString() {
		return (firstname + "" + lastname + "" + contect);
	}

}// end class person
