import java.io.*;
import java.util.Scanner;
class WordsNums
{
	static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));


	public static void main(String[]args) throws IOException
	{
		
	Scanner input = new Scanner(System.in);
	String reply;
	String garment;
	int temperature;
	System.out.println("What is the temperature outside today?");
	temperature=input.nextInt();
	System.out.println("Is it raining outside?");
	reply=keyboard.readLine();
	reply=reply.toUpperCase();
	
	if(reply.equals("YES"))
	{
		if(temperature < 60) // nested if/else statement
		{
			garment="raincoat";
			System.out.println("When you go outside take your " +garment);
		}
		else
		{
			garment="umbrella";
			System.out.println("When you go outside take your " +garment);
		}
	
	}
	
	else if(reply.equals("NO"))
	{
		if(temperature < 60) // nested if/else statement
	
		{
			garment="jacket";
			System.out.println("When you go outside take your " +garment);
		}
		else
		{
			garment="shirt";
			System.out.println("When you go outside take your " +garment);
		}
	}
	else
	{
		System.out.println("Please enter a valid answer: YES or NO");
	}

	} //end of main
} //end class