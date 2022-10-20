/*
Program:WAP and take input of age of 3 people by user and determine oldest and youngest among them.
@author: Saurabh Kumar
@Date: 20oct2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class OldestYoungest
{
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		int age1,age2,age3;
		
		//taking input
		System.out.println("Enter the sge of first person:");
		age1= sc.nextInt();
		System.out.println("Enter the age of second person:");
		age2= sc.nextInt();
		System.out.println("Enter the age of third person:");
		age3= sc.nextInt();
		
		//checking oldest and youngest
		if(age1>age2&&age1>age3)
	     	 System.out.println("The oldest person is :"+age1);
			   
		else if(age2>age1&&age2>age3)
			 System.out.println("The oldest person is :"+age2);
		else if(age3>age2&&age3>age1)
			 System.out.println("The oldest person is :"+age3);
		else if(age1<age2&&age1<age3)
	     	 System.out.println("The youngest person is :"+age1);
		else if(age2<age1&&age2<age3)
			 System.out.println("The youngest person is :"+age2);
		else
		    System.out.println("The youngest person is:"+age3);
			
			
		//end of ifelse	
		
		    
	}
		
	// end of main
}
// end of class 