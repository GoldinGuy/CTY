import java.io.*;
import java.util.Scanner;
class sethg
{
	static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));


	public static void main(String[]args) throws IOException
	{
		
		Scanner fileScan =new Scanner (new File("data.txt"));
		FileWriter file2 = new FileWriter("results.txt");

		PrintWriter outputFile = new PrintWriter(file2);

			String name, behavior, a, b;
			int grade, c;


				while(fileScan.hasNext()) // no need sentinel
				{
					name=fileScan.next();
					behavior=fileScan.next();
					grade=fileScan.nextInt();

					name=name.toUpperCase();
					behavior=behavior.toUpperCase();

					a=name;
					b=behavior;
					c=grade;

						
					if (b.equals("NICE") & c>=85)
					{
						outputFile.println("\nCongratulations " + a + ", You Made The Honor Role!");
					}

					else if (b.equals("MEAN"))
					{
						outputFile.println("\n" + a + ", Go To The Principal's Office Immediately!!!");
					}

					else if (b.equals("NICE") & c<85)
					{
						outputFile.println("\nKeep Trying " + a + ".");
					}


					else
					{
						outputFile.println("\nINVALID ENTRY");
					}



					
				} // end of file

				fileScan.close();

				outputFile.close();


	} //end of main
} //end class
