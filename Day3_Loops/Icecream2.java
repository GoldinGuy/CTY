import java.io.*;
import java.util.Scanner;
class Icecream2
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
	System.out.println(students + " student(s) can eat " + cones + " ice cream cones.");
	cones = cones + 3.5;
	students = students + 1;
	
	if((i == 9)|(i == 19)|(i == 29)|(i == 39)|(i == 49)|(i == 59)|(i == 69)|(i == 79)|(i == 89))
	{
	System.out.println("                                                        ");
	}
	}
	
	

	} //end of main
} //end class

