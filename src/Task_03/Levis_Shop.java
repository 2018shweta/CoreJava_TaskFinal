/*class Levis 
 		name
 		price
 		category 
 		tax 
 		amount    
   	methods 
   		input 
   		print 
   		
   	user can purchase any item from levis . when user purchase they input all the details
   	of item for levis , tax need to calculate automatically. 
   	tax is based on price of levis item. 
   	like, if category is men then tax is 15% 
   	         category is women then tax is 10% 
   	         category is student then tax is 5% 
   	         
   	once all input done print all response. 
   	
   	ex: 
   	input:
   	    name : denim jeans  
   	    price : 1500
   	    category : men 
   	    
   	output : 
   	  denim jeans 	1500	men 225  1725 
   	  */
package Task_03;

import java.util.Scanner;

public class Levis_Shop {

	String name;
	char item;
	int price = 0;
	char category;
	int tax = 0, ammount = 0;

	void input_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		name = sc.nextLine();
		System.out.println("pent for and shirt for s!!");
		System.out.println("enter the item name:");
		item = sc.next().charAt(0);
		switch (item) {
		case 'p':
			System.out.println("for pent");
			System.out.println("enter the price of pent:");
			price = sc.nextInt();
			System.out.println("men for m, women for w and student for s!!");
			System.out.println("enter the category of buyer:");
			category = sc.next().charAt(0);
			switch (category) {
			case 'm':
				tax = (15 * price) / 100;
				ammount = tax + price;
				System.out.println("tax is :" + tax);

				System.out.println("ammout is :" + ammount);
				break;
			case 'w':
				tax = (10 * price) / 100;
				ammount = tax + price;
				System.out.println("tax is :" + tax);
				System.out.println("ammout is :" + ammount);
				break;
			case 's':
				tax = (5 * price) / 100;
				ammount = tax + price;
				System.out.println("tax is :" + tax);
				System.out.println("ammout is :" + ammount);
				break;
			default:
				System.out.println("invalid category");
			}// end switch category

			break;
		case 's':
			System.out.println("for Shirt");
			System.out.println("enter the price of shirt:");
			price = sc.nextInt();
			System.out.println("enter the category of buyer:");
			category = sc.next().charAt(0);
			switch (category) {
			case 'm':
				tax = (25 * price) / 100;
				ammount = tax + price;
				System.out.println("tax is :" + tax);

				System.out.println("ammout is :" + ammount);
				break;
			case 'w':
				tax = (20 * price) / 100;
				ammount = tax + price;
				System.out.println("tax is :" + tax);
				System.out.println("ammout is :" + ammount);
				break;
			case 's':
				tax = (15 * price) / 100;
				ammount = tax + price;
				System.out.println("tax is :" + tax);
				System.out.println("ammout is :" + ammount);
				break;
			default:
				System.out.println("invalid category");
			}// end switch category
			break;
		default:
			System.out.println("item is not available!!");
		}// end switch item

	}// end void input_1

	void print_1() {
		System.out.println(name + "\t" + item + "\t" + price + "\t" + category + "\t" + tax + "\t" + ammount);
	}// end print_1

	public static void main(String args[]) {
		// Scanner sc= new Scanner(System.in);
		Levis_Shop l1 = new Levis_Shop();
		l1.input_1();
		l1.print_1();
	}// end void main

}// end class
