import java.io.*;
import java.util.Scanner;
class Star2
{
	static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));


	public static void main(String[]args) throws IOException
	{
		
	Scanner input = new Scanner(System.in);
	int a;
	int i;
	int j;
	int k;
	int h;
	System.out.println("Enter the height of the mountain: ");
	a=input.nextInt();
	

	for(i=1;i<=a;i++)
	{
	
		for(j=1;j<=i; j++)
		{
		System.out.print("*");
		}
		System.out.print("\n");
			
		
	}
	for(k=2*a-2;k>=a;k--)
	{
	
		
		for(h=a;h<=k; h++)
		{
		System.out.print("*");
		}
		System.out.print("\n");

	
	}
	
	} //end of main
} //end class






