import java.io.*;
import java.util.Scanner;
class  ArrayLab3
{
		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		int nums[]={1,2,3,4,5};
		int x;
		int i;
		int z;
		boolean on;
		int y;
		on = true;
		y=0;
		z=0;
	


		while(on)
		{
				
				System.out.println("Welcome to GUESS A NUMBER! \n \nEnter 100 to Exit \n \nGuess a number: ");
				x=input.nextInt(); 
				
				for (i=0;i<nums.length;i++)
				{
					if (nums[i]==x)
					{
						y = y+1;
						z = z+1;
						a == true;
					
					}

					else if (x==100)
					{
						on = false;
					}
				}

				if (y==1)
					{
						System.out.println("\nGOOD JOB! :) You guessed correctly!\n");
						
						if (a==
					}

				if (y==0)
					{
						System.out.println("\nYou guessed wrong :( Try Again:\n");
						z=0;
					}

				if (z==5)
					{
						System.out.println("\nCongratulations! You guessed all five numbers in a row!\n");
						on = false;
					}

				y=0;
			
		}
	
		
	}
}




