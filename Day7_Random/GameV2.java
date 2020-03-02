import java.util.Random;
import java.util.Scanner;
import java.io.*;

class GameV2
{
		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
		int Rnd, Life1=10, Input, Life2=10, x=0;
		String name="____";
		boolean on=true;
		Random randomNumbers=new Random();
		Scanner input = new Scanner(System.in);

		
		System.out.println("\nYou are a Powerful Sorcerer on the world of Dominaria. \nYou Have Been Called Upon to Save a Nearby Village from the Menacing Dragon Razaketh, the Foul-Blooded!");
		System.out.println("\nEnter Your Name:");
		name=keyboard.readLine();
		name=name.toUpperCase();


		System.out.println("\nPress 0 to QUIT the game at any time \n \n \n ");
		System.out.println("\nGood Luck, Sorcerer " + name + "!");


		System.out.println("\nROOOOOOOAAAAAAAAAARRRRRRRRR!!!!!! \nHow Dare You Interrupt my Ravaging of this Village! \nFor That, I Will DEEEEEESTROY YOU!!! \n-Razaketh");


		while (on)
		{
			System.out.println("\nYour HP: " +Life1);
			System.out.println("\nRazaketh the Foulblooded's HP: " +Life2);
			System.out.println("\nPress 0 to QUIT");


			System.out.println("\nDragonlord Razaketh swoops above and exhales a fireball at you.");



				Rnd=1+randomNumbers.nextInt(100); // returns 0 through 100

				
									if (Rnd>=50)
									{

									Rnd=2+randomNumbers.nextInt(3); // returns 0 through 100

									System.out.println("\nRazaketh's Fireball Hits You! \nYou Feel Scorching Pain from the Flames. \nRazaketh Revels in Your Suffering.");
									Life1=Life1-Rnd;

									}

									if (Rnd<50)
									{

									System.out.println("\nRazaketh's Fireball Narrowly Misses You. He Growls in Fury.");

									}

				System.out.println("\nSorcerer " + name + "'s HP: " +Life1);
				System.out.println("\nRazaketh the Foulblooded's HP: " +Life2);
				System.out.println("\nPress 0 to QUIT \n \n \n ");

				System.out.println("\nChoose a Spell to cast against Dragonlord Razaketh: \nSpell of Fire and Ice (Press 1) \nSpell of Feast and Famine (Press 2) \nSpell of Light and Shadow (Press 3) ");
				x=input.nextInt(); 

				
				
								

									if (x==1)
									{


										Rnd=1+randomNumbers.nextInt(10); // returns 0 through 100

										System.out.println("\nYou cast the Spell of Fire and Ice. \nWisps of Flame and Frost Swirl Around You as You Chant Louder and Louder. \nA Burning Icicle Drops from the Sky and ");

											
											if (Rnd>=3)
											{
												System.out.print("Impales Razaketh, Injuring Him! He Growls Ferociously in Pain.");

													Rnd=1+randomNumbers.nextInt(4); // returns 0 through 100		

												Life2=Life2-Rnd;

											}


											if (Rnd<3)
											{
												System.out.print("Does Not Hit Razaketh. \nHe Laughs Maniacally at your Failed Attempt to Injure Him.");


											}

									} // fire and ice



	
									if (x==2)
									{


										Rnd=1+randomNumbers.nextInt(10); // returns 0 through 100

										System.out.println("\nYou cast the Spell of Feast and Famine. \nThe Ground Trembles as You Chant Louder and Louder, Finally Breaking Apart to Reveal the Souls of the Dead Far Below. \nThey Join in Your Chanting, until the Green and Black Vapors of Mystical Power ");

											
											if (Rnd>=5)
											{
												System.out.print("Envelop Razaketh, Draining Life from Him. He Roars in Anguish.");

													Rnd=2+randomNumbers.nextInt(5); // returns 0 through 100		

												Life2=Life2-Rnd;

											}


											if (Rnd<5)
											{
												System.out.print("Dissipate into the Air, Failing to Damage Razaketh.");


											}

									} // feast and famine





									if (x==3)
									{


										Rnd=1+randomNumbers.nextInt(10); // returns 0 through 100

										System.out.println("\nYou cast the Spell of Light and Shadow. \nBeams of Light Intertwine with Clouds of Darkness Around You as You Chant Louder and Louder, until Finally the Ground and the Sky Split Open in Unison. \nA Giant Beam of Light and Darkness Shoots Towards Razaketh, ");

											
											if (Rnd>=7)
											{
												System.out.print("Coming into Contact with Him. Razaketh Roars in Anguish and Fury as He Feels His Life Being Sucked Away and Restored to You.");

													Rnd=2+randomNumbers.nextInt(6); // returns 0 through 100		

												Life2=Life2-Rnd;

													Rnd=2+randomNumbers.nextInt(4); // returns 0 through 100

												Life1=Life1+Rnd;

											}


											if (Rnd<7)
											{
												System.out.print("But He Quickly Flies Out of the Way, Causing Your Spell to Narrowly Miss Him.");

											}

									} // light and shadow




						if (Life1<=0)
						{
						
						System.out.println("\nSorcerer " + name + " Has Been Killed By the Dragon Razaketh! \n \nGAME OVER\n");
						on=false;

						} // end of if


						if (Life2<=0)
						{
						
						System.out.println("\nSorcerer " + name + " Has Succeeded in Killing the Evil Dragon Razaketh! \n \nYOU WIN \n \n GAME OVER\n");
						on=false;

						} // end of if




					if (x==0)
					{
					
					System.out.println("\nThe World of Dominaria is Grateful for Your Help, Sorcerer " + name + "!");
					on=false;

					} // end of if


		} // end of while
	

		
	} // end of main
} // end of class
