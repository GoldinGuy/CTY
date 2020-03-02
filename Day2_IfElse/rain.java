import java.io.*;
import java.util.Scanner;
class rain
{
	static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[]args) throws IOException
	{
	Scanner input = new Scanner(System.in);
	int x; // temp
	int y;
	boolean snow;
	snow = true;
	

	String reply; //variable that can hold "words"
	reply = keyboard.readLine(); // read in words from keyboard
	reply = reply.toUpperCase(); // makes all characters uppercase

	System.out.println("Press 1 if it is raining");

	System.out.print( "What temperature is it: ");// prompt
		x = input.nextInt(); // read first number from user




	if(rain.equals("YES")|(snow)|(x < 60));
	{
	System.out.println("Put on a jacket");
	}
	

	else
	{
	System.out.println("Just bring a sweater");
	}


	} // end main
} // end class