import java.util.Random;
import java.util.Scanner;
import java.io.*;

class Blackjack1
{
		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
		int Rnd, x=0, y=0, a=0, b=0, Input=0, t=0 , z=0, w=0, dt=0;
		String c="  ", d=" ", e=" ", f="  ", g= " ";
		boolean on=true;
		Random randomNumbers=new Random();
		Scanner input = new Scanner(System.in);

		
		String name[]=new String[14];
		name[0]=("Ace");
		name[1]=("King");
		name[2]=("King");
		name[3]=("King");
		name[4]=("King");
		name[5]=("King");
		name[6]=("King");
		name[7]=("King");
		name[8]=("King");
		name[9]=("King");
		name[10]=("King");
		name[11]=("Jack");
		name[12]=("Queen");
		name[13]=("King");
			
		
		int card[]=new int[14];
		card[0]=1;
		card[1]=2;
		card[2]=3;
		card[3]=4;
		card[4]=5;
		card[5]=6;
		card[6]=7;
		card[7]=8;
		card[8]=9;
		card[9]=10;
		card[10]=10;
		card[11]=10;
		card[12]=10;
		card[13]=10;


		int store[]=new int[10];
		store[0]=0;
		store[1]=0;
		store[2]=0;
		store[3]=0;
		store[4]=0;
		store[5]=0;
		store[6]=0;
		store[7]=0;
		store[8]=0;
		store[9]=0;


		String stname[]=new String[10];
		stname[0]=" ";
		stname[1]=" ";
		stname[2]=" ";
		stname[3]=" ";
		stname[4]=" ";
		stname[5]=" ";
		stname[6]=" ";
		stname[7]=" ";
		stname[8]=" ";
		stname[9]=" ";



		System.out.println("\nWelcome to BlackJack!");
		

		Rnd=randomNumbers.nextInt(13); // Dealer's Cards

		if (Rnd>=9)
		{	
		 c = name[Rnd];
		 System.out.println("\n \nDealer's Hand: ? , " + c);
		}

		b = card[Rnd];

		if (Rnd<9)
		{	
		 System.out.println("\n \nDealer's Hand: ? , " + b);
		}



		System.out.print("\n \nYour Hand: "); // your hand


		Rnd=randomNumbers.nextInt(13); // Find y

		if (Rnd>=9)
		{	
		 d = name[Rnd];
		 System.out.print(d + ", ");
		}

		y = card[Rnd];

		if (Rnd<9)
		{	
		System.out.print(y + ", ");
		}



		Rnd=randomNumbers.nextInt(13); //Find x

		if (Rnd>=9)
		{	
		 e = name[Rnd];
		 System.out.print(e);
		}

		x = card[Rnd];

		if (Rnd<9)
		{	
		System.out.print(x);
		}

		t = x+y; // find total

		System.out.println("\n\nTotal: " + t); // find total

				if (t==21)
				{
					System.out.print("\nBLACKJACK!");
				} // end of if



		while (on)
		{
			if (on=true)
			{
				System.out.println("\n To Hit, Press 1 \n \n To Stay, Press 2");
				Input=input.nextInt();


				if (Input==1)
				{
							Rnd=randomNumbers.nextInt(13); //Find new value

							if (Rnd>=9)
							{	
							 stname[w] = name[Rnd];
							 System.out.print("\nYou were dealt a " + d + e + store[w] + stname[0] + stname[1] + stname[2] + stname[3] + stname[4] + stname[5]);
							}

							store[w] = card[Rnd];

							if (Rnd<9)
							{	
							System.out.print("\nYou were dealt a " + d + e + store[w] + stname[0] +stname[1]+stname[2]+stname[3]+stname[4]+stname[5]);
							}

							t = x+y+store[0]+store[1]+store[2]+store[3]+store[4]+store[5]; // find total

							System.out.println("\n\nTotal: " + t); // find total
				} // end of if


			}

				if (t==21)
				{
					System.out.print("\nBLACKJACK!");
				} // end of if


				if (Input==2)
				{
					on=false;
				} // end of if

				if (t>21)
				{
					System.out.print("\nBUST! \nYOU LOST");
					on=false;
				} // end of if


				w = w+1;
			
		
		} // end of loop


		if (t<=21)
		{
			
			Rnd=randomNumbers.nextInt(13); // Dealer's Cards

			if (Rnd>=9)
			{	
			 g = name[Rnd];
			 System.out.println("\n \nDealer's Hand: " + g + ", " + c + b);
			}
			
			z = card[Rnd];

			if (Rnd<9)
			{	
			 System.out.println("\n \nDealer's Hand: " + z + ", " + c + b);
			}

			dt = b + z;


			while (dt<15)
			{	
						Rnd=randomNumbers.nextInt(13); // Dealer's Cards

						if (Rnd>=9)
						{	
						 stname[w] = name[Rnd];
						 System.out.println("\n \nDealer's Hand: " + g + ", " + c + b + stname[9] + stname[8]+ stname[7]+ stname[6]+ stname[5]+ stname[4]);
						}
						
						store[w] = card[Rnd];

						if (Rnd<9)
						{	
						 System.out.println("\n \nDealer's Hand: " + z + ", " + c + b + g + stname[w] + stname[9] + stname[8]+ stname[7]+ stname[6]+ stname[5]+ stname[4]);
						}

						dt = dt + store[w];
						w=w+1;

			}


			System.out.println("\n \nDealer's Total: " + dt);
			System.out.println("\n\nYour Total: " + t); // find total


	

				if (t>dt)
				{
					System.out.print("\nCongratulations! You Won!");
				} // end of if

				if (t==dt)
				{
					System.out.print("\nPUSH");
				} // end of if

				if (t<dt)
				{
					System.out.print("\nYou Lost");
				} // end of if





		} // end of if

		
	} // end of main
} // end of class
