import java.io.*;
import java.util.Scanner;
class Icecream3
{
	static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));


	public static void main(String[]args) throws IOException
	{
		
	Scanner input = new Scanner(System.in);
	double cones;
	int students;
	int i;
	students = 1;
	cones = 3.5;

	for(i=0;i<100;i++)
	{
	if(i % 10 == 0)
	{
	System.out.println("                                                        ");
	}

	System.out.println(students + " student(s) can eat " + cones + " ice cream cones.");
	cones = cones + 3.5;
	students = students + 1;
	
	}
	
	

	} //end of main
} //end class

