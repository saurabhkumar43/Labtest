/*
Program:WAP to print the tagline of various IT companies using enhanced switch case
@author: Saurabh Kumar
@Date: 26th oct 2022  
*/

package com.question2.ITCompanies;

//importing packages
import java.util.Scanner;

//creating class
public class ITCompanies {

	// Method for Tagline
	static void PrintTagline(String CompanyName) {
		// Switch case
		switch (CompanyName) {
		case "APPLE":
			System.out.println("Think Different");
			break;
		case "IBM":
			System.out.println("Think");
			break;
		case "GOOGLE":
			System.out.println("Don't Be Evil");
			break;
		case "FACEBOOK":
			System.out.println("It's free and always will be");
			break;
		case "TWITTER":
			System.out.println("We believe real change starts with conversations");
			break;
		}// end of switch case

	}// end of method tagline

	// main method
	public static void main(String args[]) {
		// creating scanner object
		Scanner sc = new Scanner(System.in);

		// taking input
		System.out.println("Enter the Brand Name: ");
		String CompanyName = sc.next().toUpperCase();
		PrintTagline(CompanyName);

	}// end of main

}// end of class
