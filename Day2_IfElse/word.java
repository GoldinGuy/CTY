/* How to read/process words/senctences in Java and the if/else statement in Java 2018 */
import java.io.*;
class word
{
	static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[]args) throws IOException
	{
	String reply; //variable that can hold "words"
	String garment;
	System.out.println("Is it raining outside?");
	reply = keyboard.readLine(); // read in words from keyboard
	reply = reply.toUpperCase(); // makes all characters uppercase
	if(reply.equals("YES")) // Comparing words
	{
		garment="raincoat";
	}
	else
	{
		garment="T-shirt";
	}
	System.out.println("Before you go outside wear your " +garment);
	} // end main
} // end class