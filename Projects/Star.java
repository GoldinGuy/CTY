import java.io.*;
import java.util.Scanner;
class Star
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
	for(k=a-1;k>=1;k--)
	{
	
		
		for(h=k;h>0; h--)
		{
		System.out.print("*");
		}
		System.out.print("\n");

	
	}
	
	} //end of main
} //end class






