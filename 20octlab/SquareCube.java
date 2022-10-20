/*
Program:WAP to find the 1.square
2. cube 
3. check number is even or odd using switch case."
@Author: Saurabh Kumar
@Date: 20oct2022
*/

//importing packages
import java.util.Scanner;
//Creating class
class SquareCube
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		// taking input
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("1, Square");
		System.out.println("2, Cube");
		System.out.println("3, Even/Odd");
		System.out.println("4, Exit");
		
		int choice= sc.nextInt();
		
		//Switch case
		switch(choice)
		{
			case '1': square(int number1);
			break;
			case '2': cube(int number1);
			break;
			case '3': EvenOdd(int number1);
			break;
			case '4': System.exit(0);
			break;
			default:
			System.out.println("Wrong Input");
			
		}//end of switch case
		
	}
	//Method for Square
	static void square(int number1)
	{
		int square = number*number;
		System.out.println("Square of number is : "+square);
	}
	
	//Method for Cube
	static void cube(int number1)
	{
		int cub = number*number*number;
		System.out.println("Square of number is : "+cube);
	}
	
	//Method for Even/Odd
	static void EvenOdd(int number1)
	{
		if(number1%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}
	
	
}//end of class