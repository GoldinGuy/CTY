import java.util.Random;
import java.util.Scanner;
import java.io.*;



class  diceroll
{
	public static void main(String[] args) throws IOException
	{
		int Die1, Die2, Roll, x;
		boolean on=true;
		Random randomNumbers=new Random();
		Scanner input = new Scanner(System.in);

		while (on)
		{

		System.out.println("\nPress 1 to Roll the Dice. \nPress 2 to QUIT.");
		x=input.nextInt(); 

				if (x==1)
				{

				Die1=1+randomNumbers.nextInt(6); // returns 0 through 12


				Die2=1+randomNumbers.nextInt(6); // returns 0 through 12

				System.out.println("\nYou rolled a " + Die1 + " and a " +Die2);

				Roll = Die1+Die2;
				
				System.out.println("\nTotal value of roll: " +Roll);


				
									if (Roll>6)
									{

									System.out.println("\nYou rolled a high roll.");

									}

									if (Roll<=6)
									{

									System.out.println("\nYou rolled a low roll.");

									}

									if (Roll==2)
									{

									System.out.println("\nYou rolled snake eyes!");

									}



				} // end of if


				if (x==2)
				{
				
				System.out.println("\nGoodbye!");
				on=false;

				} // end of if


		} // end of while
	

		
	} // end of main
} // end of class
