/*
Program:WAP to find whether student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not."
@author: Saurabh Kumar
@Date: 26th oct 2022  
*/
//Packages
package com.question1.student;

//importing scanner
import java.util.Scanner;

//creating class
public class Student {
	// object of scanner
	static Scanner sc = new Scanner(System.in);

	// declaring instance variables
	static float total, attended, percentage;

	// input method
	public static void input() {

		// taking input
		System.out.println("Enter the total number of classes: ");
		total = sc.nextFloat();
		System.out.println("Enter the number of classes you attended: ");
		attended = sc.nextFloat();

		// calling calculate method
		calculate(attended, total);
	}

	// calculating percentage
	public static void calculate(float attended, float total) {
		float percentage = (attended / total) * 100;

		// calling print method
		print(percentage);
	}

	// print method
	public static void print(float percentage) {
		System.out.println("Your Percentage of class is:" + percentage);
		// if else
		if (percentage >= 75) {
			System.out.println("Congratulations!You are allowed  to sit in the examination");
		} else
			System.out.println("Sorry!You are not allowed to sit in the examination");
	} // end of if else

}// end of class
