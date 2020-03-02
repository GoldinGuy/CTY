import java.io.*;
class word3
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
	System.out.println("Before you go outside wear your " +garment);
	}

	if(reply.equals("NO")) // Comparing words
	{
		garment="T-shirt";
	System.out.println("Before you go outside wear your " +garment);
	}
	
	if (reply.equals("")
	{
	System.out.println("Invalid response: Please enter YES or NO");
	}
	

	} // end main
} // end class