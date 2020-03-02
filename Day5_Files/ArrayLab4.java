import java.io.*;
import java.util.Scanner;
class  ArrayLab4
{
		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		int nums[]={1,2,3,4,5};
		boolean guess[]=new boolean[nums.length];
		int x;
		int i;
		int z;
		int a;
		int b;
		boolean on;
		int y;
		on = true;
		y=0;
		z=0;

		for (i=0;i<nums.length ;i++ )
		{
					
			guess[i]=false;
				
				
		}


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
						guess[i] = true;
		
					
					}

					else if (x==100)
					{
						on = false;
					}
				}

				if (y==1)
					{
						System.out.println("\nGOOD JOB! :) You guessed correctly!\n");


						for (i=0;i<nums.length ;i++ )
						{
					
							if (guess[i]==true)
							{
								z=z+1;
							}
						}
							
						
					}

				if (y==0)
					{
						System.out.println("\nYou guessed wrong :( Try Again:\n");
						z=0;

							for (i=0;i<nums.length ;i++ )
							{
								guess[i]=false;
				
							}
					}

				if (z>nums.length)
					{
						System.out.println("\nCongratulations! You guessed all five numbers in a row!\n");
						on = false;
					}

				y=0;
				z=0;
			
		}
	
		
	}
}




