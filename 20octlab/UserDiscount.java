/*
Program:WAP to give 10% discount to the user whose shopping bill id greater than 2000.(ask the qty , cost of one unit is 540)
@author: Saurabh Kumar
@Date: 20oct2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class UserDiscount
{
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.println("Please enter the quantity of diwali lights:");
		int quantity=sc.nextInt();
		int total=540*quantity;
		System.out.println("Your total bill amount is="+total);
		
		//starting ifelse
		if(total>=2000)
		{
			int bill =total-(total*10)/100;
	     	System.out.println("Your bill after getting 10% discount is :"+bill);
		}
		     
			 
		else
		{
		    System.out.println("Thank you for shopping!Visit Again");
			
		}	
		//end of ifelse	
		
		    
	}
		
	// end of main
}
// end of class 