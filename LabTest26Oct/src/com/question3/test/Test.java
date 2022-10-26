/*
 Program:WAP to create a package called Employee having ID, name , department and salary .
Create 2 method 
GetDetails()
PrintDetails()
Create a Employee Test class in  a separate package to get the Details of 2 employees and print the details  of both of them"
@Author: Saurabh Kumar
@Date: 26th oct 2022
*/

//creating packages
package com.question3.test;

//importing employee package
import com.question3.Employee.EmployeeDetails;

//creating class
public class Test {

	// main method
	public static void main(String[] args) {

		// calling Get Details method
		EmployeeDetails.GetDetails();

		// calling Print Details method
		EmployeeDetails.PrintDetails();
	}// end of main

}// end of class}
