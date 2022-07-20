/*
 *   Insurance Calc 
		An insurance company follows following rules to calculate premium.
		a. If a person’s health is excellent and the person is between 25 and 35 years of age and lives in a
		city and is a male then the premium is Rs. 4 per thousand.
		b. If a person satisfies all the above conditions except that the gender is female then the premium is
		Rs. 3 per thousand.
		c. If a person’s health is poor and the person is between 25 and 35 years of age and lives in a
		village and is a male then the premium is Rs. 6 per thousand.
		d. In all other cases the person is not insured.
		Take a person's health, age, city and gender as an input and display the premium as per the rule.
		   
 */
package Task_11;

import java.util.Scanner;

public class Insurance_Calc {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String health, live, gender;
		int age;
		System.out.println("Enter the person health: [excellent / poor]");
		health = sc.next();
		System.out.println("Enetr the person age:");
		age = sc.nextInt();
		System.out.println("Enter the person live: [city / village]");
		live = sc.next();
		System.out.println("Enter the person gender:[female / male]");
		gender = sc.next();

		if (health.equals("excellent") && age >= 25 && age <= 35 && live.equals("city") && gender.equals("male")) {
			System.out.println("Male premium is rs 4 per thousand");
		} else if (health.equals("excellent") && age >= 25 && age <= 35 && live.equals("city")
				&& gender.equals("female")) {
			System.out.println("feMale premium is rs 3 per thousand");
		} else if (health.equals("poor") && age >= 25 && age <= 35 && live.equals("village") && gender.equals("male")) {
			System.out.println("feMale premium is rs 6 per thousand");
		} else {
			System.out.println(" the person is not insured");
		}

	}// end main

}// end class
