import java.io.*;
import java.util.Scanner;
class fbi1
{
	static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));


	public static void main(String[]args) throws IOException
	{
		
	Scanner input = new Scanner(System.in);
	String name;
	String garment;
	double age;
	double height;
	System.out.println("What is your name?");
	name=keyboard.readLine();
	name=name.toUpperCase();
	System.out.println("What is your age? (years)");
	age=input.nextDouble();
	System.out.println("What is your height? (inches)");
	height=input.nextDouble();


	if(age <= 25 & age >= 20 ) // nested if/else statement
	{
		if(height <= 70 & height >= 66)
		{
			System.out.println(name + " IS A SUSPECT! ARREST HIM!");
		}
		else
		{
			System.out.println(name + "is an ok guy");
		}
	}
	
	
	else
	{
		System.out.println(name + "is an ok guy");
	}

	} //end of main
} //end class