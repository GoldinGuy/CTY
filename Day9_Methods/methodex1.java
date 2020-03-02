import java.io.*;
import java.util.Scanner;

class  methodex1
{
	public static void main(String[] args) 
	{
		int a=3; int b=2;
		System.out.println("Sum of numbers is: " + sum());
		System.out.println("The result of the mult method is: " + mult(a,b));
		System.out.println("The value of b is still " + b);
	} // ends main

	static int sum()
	{
		Scanner input = new Scanner(System.in);
		int first, second;
		System.out.println("Enter your fist number: ");
		first=input.nextInt();
		System.out.println("Enter your second number: ");
		second=input.nextInt();
		return first + second;

	} // endssum

	static int mult(int a, int b) // primitive data types get passed by value
	{
		int numbresults;
		numbresults = a*b; // numbresults = 2*3=6
		b=888;
		System.out.println("The value of b in the method is: " + b);
		return numbresults;
	} // ends mult

} // ends class