import java.util.Random;
import java.util.Scanner;
import java.io.*;

class GameV1
{
		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
		int Rnd, Life1=10, Input, Life2=10, x=-1, y;
		String name="____";
		boolean on=true;
		Random randomNumbers=new Random();
		Scanner input = new Scanner(System.in);

		
		System.out.println("\n You are a Powerful Sorcerer on the world of Dominaria. \n \n You Have Been Called Upon to Save a Nearby Village \n from the Menacing Dragon Razaketh, the Foul-Blooded!");
		System.out.println("\nEnter Your Name:");
		name=keyboard.readLine();
		name=name.toUpperCase();


		System.out.println("\nPress 0 to QUIT the game at any time \n ");
		System.out.println("\n Good Luck, Sorcerer " + name + "!");

			System.out.println("\nPress 1 To Continue");
			y=input.nextInt(); 

			if (x==0|y==0)
			{
			
			System.out.println("\n \n The World of Dominaria is Grateful for Your Help, Sorcerer " + name + "!");
			on=false;

			} // end of if

		if (y!=0)
		{

		System.out.println("\n ROOOOOOOAAAAAAAAAARRRRRRRRR!!!!!! \n \n How Dare You Interrupt my Ravaging of this Village! \n For That, I Will DEEEEEESTROY YOU!!! \n\n -Razaketh");


		System.out.println("\nPress 1 To Continue");
		y=input.nextInt(); 

			if (x==0|y==0)
			{
			
			System.out.println("\n \n The World of Dominaria is Grateful for Your Help, Sorcerer " + name + "!");
			on=false;

			} // end of if
		}


		while (on)
		{

				if (Life1<0)
				{
					Life1=0;
				}

				if (Life2<0)
				{
					Life2=0;
				}

			System.out.println("\n \nYour HP: " +Life1);
			System.out.println("Razaketh the Foulblooded's HP: " +Life2);
			System.out.println("Press 0 to QUIT");

			System.out.println("\nPress 1 To Continue");
			y=input.nextInt(); 

					if (x==0|y==0)
					{
					
					System.out.println("\n \n The World of Dominaria is Grateful for Your Help, Sorcerer " + name + "!");
					on=false;

					} // end of if


			System.out.println("\n Dragonlord Razaketh swoops above and exhales a fireball at you.");

			System.out.println("\nPress 1 To Continue");
			y=input.nextInt(); 

					if (x==0|y==0)
					{
					
					System.out.println("\n \n The World of Dominaria is Grateful for Your Help, Sorcerer " + name + "!");
					on=false;

					} // end of if



				Rnd=1+randomNumbers.nextInt(100); // returns 0 through 100

				
									if (Rnd>=50)
									{

									Rnd=2+randomNumbers.nextInt(5); // returns 0 through 100

									System.out.println("\n Razaketh's Fireball Hits You! \n You Feel Scorching Pain from the Flames. \n Razaketh Revels in Your Suffering.");
									Life1=Life1-Rnd;

									}

									else if (Rnd<50)
									{

									System.out.println("\n Razaketh's Fireball Narrowly Misses You. He Growls in Fury.");

									}



					if (Life1<=0)
					{
					
					System.out.println("\n \n Sorcerer " + name + " Has Been Killed By the Dragon Razaketh! \n \n GAME OVER\n");
					on=false;

					} // end of if


					if (Life2<=0)
					{
					
					System.out.println("\n \n Sorcerer " + name + " Has Succeeded in Killing the Evil Dragon Razaketh! \n \n YOU WIN \n \n GAME OVER\n");
					on=false;

					} // end of if

					if (x==0)
					{
					
					System.out.println("\n \n The World of Dominaria is Grateful for Your Help, Sorcerer " + name + "!");
					on=false;

					} // end of if


				
				if (Life1<0)
				{
					Life1=0;
				}

				if (Life2<0)
				{
					Life2=0;
				}



				System.out.println("\n \nSorcerer " + name + "'s HP: " +Life1);
				System.out.println("Razaketh the Foulblooded's HP: " +Life2);




		
				if (Life1>0)
				{
				System.out.println("\nPress 1 To Continue");
				y=input.nextInt(); 

					if (x==0|y==0)
					{
					
					System.out.println("\n \n The World of Dominaria is Grateful for Your Help, Sorcerer " + name + "!");
					on=false;

					} // end of if


				System.out.println("\n \n \nChoose a Spell to cast against Dragonlord Razaketh: \n\n Spell of Fire and Ice (Press 1) \n Spell of Feast and Famine (Press 2) \n Spell of Light and Shadow (Press 3) ");
				x=input.nextInt(); 

				
				
								

									if (x==1)
									{


										Rnd=1+randomNumbers.nextInt(10); // returns 0 through 100

										System.out.println("\n \n You cast the Spell of Fire and Ice. \n \n Wisps of Flame and Frost Swirl Around You. \n \n A Burning Icicle Drops from the Sky and ");

											
											if (Rnd>=3)
											{
												System.out.print(" Impales Razaketh, Injuring Him! \n \n He Growls Ferociously in Pain.");

													Rnd=1+randomNumbers.nextInt(5); // returns 0 through 100		

												Life2=Life2-Rnd;

											}


											else if (Rnd<3)
											{
												System.out.print(" Does Not Hit Razaketh. \n \n He Laughs Maniacally at your Failed Attempt to Injure Him.");


											}

									} // fire and ice



	
									else if (x==2)
									{


										Rnd=1+randomNumbers.nextInt(10); // returns 0 through 100

										System.out.println("\n \n You cast the Spell of Feast and Famine. \n \n Green and Black \n Vapors of Mystical Power ");

											
											if (Rnd>=5)
											{
												System.out.print(" Envelop Razaketh, Draining Life from Him. \n \nHe Roars in Anguish.");

													Rnd=2+randomNumbers.nextInt(6); // returns 0 through 100		

												Life2=Life2-Rnd;

											}


											else if (Rnd<5)
											{
												System.out.print(" Dissipate into the Air, Failing to Damage Razaketh.");


											}

									} // feast and famine





									else if (x==3)
									{


										Rnd=1+randomNumbers.nextInt(10); // returns 0 through 100

										System.out.println("\n \n You cast the Spell of Light and Shadow. \n \n The Sky Splits Open and a Giant Beam of Light and Darkness Shoots Towards Razaketh, ");

											
											if (Rnd>=7)
											{
												System.out.print(" Coming into Contact with Him. \n Razaketh Roars in Anguish and Fury! \nHis Pain Restores your Health.");

													Rnd=2+randomNumbers.nextInt(7); // returns 0 through 100		

												Life2=Life2-Rnd;

													Rnd=2+randomNumbers.nextInt(5); // returns 0 through 100

												Life1=Life1+Rnd;

											}


											else if (Rnd<7)
											{
												System.out.print(" But He Quickly Flies Out of the Way, Causing Your Spell to Narrowly Miss Him.");

											}

									} // light and shadow
				}




						if (Life1<=0)
						{
						
						System.out.println("\n \n Sorcerer " + name + " Has Been Killed By the Dragon Razaketh! \n \n GAME OVER\n");
						on=false;

						} // end of if


						if (Life2<=0)
						{
						
						System.out.println("\n \n Sorcerer " + name + " Has Succeeded in Killing the Evil Dragon Razaketh! \n \n YOU WIN \n \n GAME OVER\n");
						on=false;

						} // end of if




					if (x==0|y==0)
					{
					
					System.out.println("\n \n The World of Dominaria is Grateful for Your Help, Sorcerer " + name + "!");
					on=false;

					} // end of if


		} // end of while
	

		
	} // end of main
} // end of class
