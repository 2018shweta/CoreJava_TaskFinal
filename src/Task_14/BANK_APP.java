/*
 * Bank App.

Bank provides various service to the user  like deposit money, wid money and customer can check balance. 
Bank have some conditions. 
Customer have to maintain 5000 min balance. 
Customer can perform max 5  transaction and then customer is charged 10 Rs per transaction.
Customer can access bank app via Username/Password. 
Customers have an account number which is generated via random algo. 

Menu
Login
Exit 

	1.1 wid
	1.2 Dep 
	1.3 CheckBal 
	1.4 Logout 
 */
package Task_14;

import java.util.ArrayList;
import java.util.Scanner;

public class BANK_APP {
	public static void main(String args[]) {
		ArrayList<Bank> userBank = new ArrayList<Bank>();
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		int task;
		while (true) {
			System.out.println("1.Add user");
			System.out.println("2.Show Details");
			System.out.println("3.deposit");
			System.out.println("4. Withdraw");
			System.out.println("5.Logout");
			System.out.println("What u want to action ?");
			task = sc.nextInt();
			switch (task) {
			case 1:
				System.out.println("Add new user");
				System.out.println("Enter username:");
				bank.setUsername(sc.next());
				System.out.println("Enter userpassword:");
				bank.setUserpassword(sc.next());
				while (true) {
					System.out.println("Enter money you are deposit");
					int i = sc.nextInt();
					if (i < 5000) {
						System.out.println("Plese Deposit minimum 5000");
					} else {
						bank.setUsermoney(i);
						break;
					}
				}
				int ac = (int) (Math.random() * 1000);
				bank.setUseracNumber(ac);
				userBank.add(bank);

				break;
			case 2:
				System.out.println("You are on Show detail section");
				System.out.println("Enter Name:");
				String Name = sc.next();
				System.out.println("Enter Password:");
				String Pass = sc.next();
				for (int j = 0; j < userBank.size(); j++) {
					if (userBank.get(j).getUsername().equals(Name) && userBank.get(j).getUserpassword().equals(Pass)) {
						System.out.println(userBank.get(j));
					}
				}
				break;
			case 3:
				System.out.println("3.withdraw");
				System.out.println("Enter Name:");
				Name = sc.next();
				System.out.println("Enter Password:");
				Pass = sc.next();
				for (int j = 0; j < userBank.size(); j++) {
					if (userBank.get(j).getUsername().equals(Name) && userBank.get(j).getUserpassword().equals(Pass)) {

						while (true) {
							System.out.println("Enter how many money you can wid...");
							int Money = sc.nextInt();
							Money = (int) (userBank.get(j).getUsermoney() - Money);
							if (Money < 5000) {
								System.out.println("Minimum Balance 5000!!!!!!!!!");
							} else {
								userBank.get(j).setUsermoney(Money);
								break;
							}
						}

					}
				}
				break;
			case 4:
				System.out.println("You are on Dep section");
				System.out.println("Enter Name:");
				Name = sc.next();
				System.out.println("Enter Password:");
				Pass = sc.next();
				for (int j = 0; j < userBank.size(); j++) {
					if (userBank.get(j).getUsername().equals(Name) && userBank.get(j).getUserpassword().equals(Pass)) {
						System.out.println("Enter how many money you can wid...");
						int Money = sc.nextInt();
						Money = (int) (userBank.get(j).getUsermoney() + Money);
						userBank.get(j).setUsermoney(Money);
						userBank.get(j).toString();
					}
				}
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("invalid selection!!");
			}
		}
	}
}

class Bank {
	String username;
	String userpassword;
	int useracNumber;
	int usermoney;
	int usermaxTanc;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public int getUseracNumber() {
		return useracNumber;
	}

	public void setUseracNumber(int useracNumber) {
		this.useracNumber = useracNumber;
	}

	public int getUsermoney() {
		return usermoney;
	}

	public void setUsermoney(int usermoney) {
		this.usermoney = usermoney;
	}

	public int getUsermaxTanc() {
		return usermaxTanc;
	}

	public void setUsermaxTanc(int usermaxTanc) {
		this.usermaxTanc = usermaxTanc;
	}

	public String toString() {
		return "\nName:" + username + "\nAc. Number:" + useracNumber + "\nPassword:" + userpassword + "\nBalance:"
				+ usermoney;
	}

}
