package Com.Question4;
import java.util.Scanner;

public class Test {
	//method to create menu
	static void menu()
	{
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		System.out.println("Enter your choice: ");
	}


public static void main(String args[])
{

	//declaring variables
	int choice;
	float number1, number2, result = 0;
	
	//calling menu
	menu();
	
	//creating object
	Scanner sc = new Scanner(System.in);
	
	//taking input for choice
	choice = sc.nextInt();
	
	//taking input of 2 numbers
	System.out.println("Enter the first number: ");
	number1 = sc.nextFloat();
	System.out.println("Enter the second number: ");
	number2 = sc.nextFloat();
	
	
	//starting of switch case
	switch(choice)
	{
	case 1: result =Calculator.addition(number1, number2);
	break;
	case 2: result =Calculator.substraction(number1, number2);
	break;
	case 3: result =Calculator.multiplication(number1, number2);
	break;
	case 4: result =Calculator.division(number1, number2);
	break;
	case 5: System.exit(0);
	break;
	default:
		System.out.println("Invalid Input....");
	
	}
	
	//printing result
	System.out.println("Result is = " +result);
	sc.close();
	



}

}
