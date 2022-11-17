package Com.question1;
import java.util.Scanner;
public class HangmanGame {

	public static void main(String args[])
	{
		String arr[] = {"Saurabh","Rohan", "Shyam", "Rahul", "Rohit"};
		System.out.println("Select an array Index to choose words: ");
		System.out.println("Array Index should not be greater than 5");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = arr[n].length();
		System.out.println("Input your guessing: ");
		for(int i=0; i<=len;i++)
		{
			System.out.print("_");
		}
		System.out.println();
		
		String a = sc.next().toUpperCase();
		if(a == arr[n])
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("Wrong");
		}
		sc.close();
		
	}

}
