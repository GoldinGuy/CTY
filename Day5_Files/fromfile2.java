import java.io.*;
import java.util.Scanner;
class fromfile2
{
	static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));


	public static void main(String[]args) throws IOException
	{
		
		Scanner fileScan =new Scanner (new File("data2.txt"));
		FileWriter file2 = new FileWriter("results2.txt");

	PrintWriter outputFile = new PrintWriter(file2);

	String name;
	int price;

		while(fileScan.hasNext()) // no need sentinel
		{
			price=fileScan.nextInt();
			name=fileScan.next();
			if (price>300) // fix spacing on paper
			{
				outputFile.println(price);
			}
			if (name.equals("Jesus")|name.equals("Will")|name.equals("JohnDoe"))
			{
				outputFile.println("This guy is cool: " +name);
			}
		}

		fileScan.close();
		outputFile.close();


	} //end of main
} //end class
