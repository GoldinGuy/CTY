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

			String name, behavior;
			int grade, x=0, i;
			String array1[]= new String [1000000];
			String array2[]= new String [1000000];
			int array3[]= new int [1000000];


				while(fileScan.hasNext()) // no need sentinel
				{
					name=fileScan.next();
					behavior=fileScan.next();
					grade=fileScan.nextInt();

					name=name.toUpperCase();
					behavior=behavior.toUpperCase();

					array1[x]=name;
					array2[x]=behavior;
					array3[x]=grade;

					x=x+1;
					
				} // end of file

				fileScan.close();


					
					for (i=0; i<array1.length ;i++ )
					{

						
							if (array2[i].equals("NICE") & array3[i]>=85)
							{
								outputFile.println("\nCongratulations " + array1[i] + ", You Made The Honor Role!");
							}

							else if (array2[i].equals("MEAN"))
							{
								outputFile.println("\n" + array1[i] + ", Go To The Principal's Office Immediately!!!");
							}

							else if (array2[i].equals("NICE") & array3[i]<85)
							{
								outputFile.println("\nKeep Trying " + array1[i] + ".");
							}


							else
							{
								outputFile.println("\nINVALID ENTRY");
							}
						
					}
					
					

				outputFile.close();


	} //end of main
} //end class
