/* 
 Program:WAP of Piggiebank
 @Author: Saurabh Kumar
 @Date: 03rd Nov 2022
 */
//package
package Com.Question3.piggiebank;

//importing scanner
import java.util.Scanner;

import Com.Question3.Test.TestPiggieBank;

//Creating class
public class Piggiebank {

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating object of scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("WELCOME TO YOUR PIGGIE BANK");

		TestPiggieBank c1 = new TestPiggieBank();
		c1.setAmount(50);

		// declaring variable
		int addamt;

		// taking Input
		int choice;
		System.out.println("Do you want to add more: ");
		choice = sc.nextInt();

		switch (choice) { // Switch Case
		case 1:
			System.out.println("Enter the amount: ");
			addamt = sc.nextInt();
			c1.setAddamt(addamt);
			System.out.println("AMOUNT ADDED SUCCESSFULLY");
			System.out.print("Your Amount is: " + c1.getAddamt());
			break;
		case 2:
			System.out.print("Your Amount is: " + c1.getAmount());
			break;
		default:
			System.out.println("Invalid Input....");
		}// End of Switch Case

	}// end of main

}// end of class
