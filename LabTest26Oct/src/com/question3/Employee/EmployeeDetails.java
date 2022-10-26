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
package com.question3.Employee;

//importing scanner
import java.util.Scanner;

//creating employee class
public class EmployeeDetails {

	// creating Scanner object
	static Scanner sc = new Scanner(System.in);

	// declaring instance variables
	static int id, salary;
	static String name, department;

	// GetDetails method
	public static void GetDetails() {
		System.out.println("Enter your employee ID: ");
		id = sc.nextInt();
		System.out.println("Enter your name: ");
		name = sc.next();
		System.out.println("Enter your department: ");
		department = sc.next();
		System.out.println("Enter your salary: ");
		salary = sc.nextInt();

	}// end of GetDetails method

	// printDetails method
	public static void PrintDetails() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + salary);
	}// end of print details method
}// end of class