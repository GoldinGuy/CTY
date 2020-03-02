import java.io.*;
import java.util.Scanner;
class  AmazonV1
{
		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
	
		Scanner input = new Scanner(System.in);
		int x;
		String category, item;
		boolean buy, on;
		buy = false;
		on = true;
		x=0;
		



		System.out.println("\nWelcome to AMAZON.com @ the DARK WEB!"); 

		while (on)
		{	
		System.out.println("\nChoose a Category:\n(Totally Legal) Pharmacy \n(Fortnite) Weapons \nExotic Fruit \n\nTo Leave, type EXIT\n"); 
		category=keyboard.readLine();
		category=category.toUpperCase();

			if (category.equals("PHARMACY"))
			{
				System.out.println("\nChoose an Item:\n\"TYLENOL\" \n\"ADVIL\""); 
				item=keyboard.readLine();
				item=item.toUpperCase();

					if (item.equals("TYLENOL"))
					{
						System.out.println("\nTo BUY, Press 1 \nTo Return to MENU, Press 2 \n"); 
						x=input.nextInt(); 

						if (x==1)
						{
							System.out.println("\nOtherwise known as (SEA)WEED, this medicine can cure symptoms of all kinds!\n");
							buy=true;
						}

						else if (x==2)
						{
							System.out.println("\nThank you for your consideration.\n");
						}

						else 
						{
							System.out.println("\nPlease enter a valid choice. \nTo BUY, Press 1. To Return to the MENU, Press 2\n");
						}
					}

							if (item.equals("ADVIL"))
							{
								System.out.println("\nTo BUY, Press 1 \nTo Return to MENU, Press 2 \n"); 
								x=input.nextInt(); 

								if (x==1)
								{
									System.out.println("\nConcoted in a School Science Lab by your favorite TV Show Baddie! \nTake an Advil a day to keepe the doctor away!\n");
									buy=true;
								}

								else if (x==2)
								{
									System.out.println("\nThank you for your consideration.\n");
								}

								else 
								{
									System.out.println("\nPlease enter a valid choice. \nTo BUY, Press 1. To Return to the MENU, Press 2\n");
								}
							}	
			} // end of (fake drugs)
		






			else if (category.equals("WEAPONS"))
			{
				System.out.println("\nChoose an Item:\nSCAR: \nSlurp Juice: "); 
				item=keyboard.readLine();
				item=item.toUpperCase();

					if (item.equals("SCAR"))
					{
						System.out.println("\nTo BUY, Press 1 \nTo Return to MENU, Press 2 \n"); 
						x=input.nextInt(); 

						if (x==1)
						{
							System.out.println("\nWith this at your side, you will be victorious for the one \nBATTLE ROYALEtm game that you can wield it!\n");
							buy=true;
						}

						else if (x==2)
						{
							System.out.println("\nThank you for your consideration.\n");
						}

						else 
						{
							System.out.println("\nPlease enter a valid choice. \nTo BUY, Press 1. To Return to the MENU, Press 2\n");
						}
					}

							if (item.equals("SLURP JUICE"))
							{
								System.out.println("\nTo BUY, Press 1 \nTo Return to MENU, Press 2 \n"); 
								x=input.nextInt(); 

								if (x==1)
								{
									System.out.println("\nWho needs a weapon? Use the Chug Jug (Slurp Juice) and you shall be VICTORIOUS!\n");
									buy=true;
								}

								else if (x==2)
								{
									System.out.println("\nThank you for your consideration.\n");
								}

								else 
								{
									System.out.println("\nPlease enter a valid choice. \nTo BUY, Press 1. To Return to the MENU, Press 2\n");
								}
							}	
			} // end of (water Guns)


			
			

			else if (category.equals("EXOTIC FRUIT"))
			{
				System.out.println("\nChoose an Item:\n(COCONUT)PINEAPPLE: \n(Do you like) PINA COLADA: "); 
				item=keyboard.readLine();
				item=item.toUpperCase();

					if (item.equals("PINEAPPLE"))
					{
						System.out.println("\nTo BUY, Press 1 \nTo Return to MENU, Press 2 \n"); 
						x=input.nextInt(); 

						if (x==1)
						{
							System.out.println("\nA combination of two incredible fruits and a pinecone, the (COCONUT) PINE-APPLE will satisfy your taste buds!\n");
							buy=true;
						}

						else if (x==2)
						{
							System.out.println("\nThank you for your consideration.\n");
						}

						else 
						{
							System.out.println("\nPlease enter a valid choice. \nTo BUY, Press 1. To Return to the MENU, Press 2\n");
						}
					}

							if (item.equals("PINA COLADA"))
							{
								System.out.println("\nTo BUY, Press 1 \nTo Return to MENU, Press 2 \n"); 
								x=input.nextInt(); 

								if (x==1)
								{
									System.out.println("\nDO YOU LIKE PINA COLADAS? Clearly you do!\n");
									buy=true;
								}

								else if (x==2)
								{
									System.out.println("\nThank you for your consideration.\n");
								}

								else 
								{
									System.out.println("\nPlease enter a valid choice. \nTo BUY, Press 1. To Return to the MENU, Press 2\n");
								}
							}	
			} // end of (Exotic Fruit)


			

				
			
			else if (category.equals("EXIT"))
			{
				System.out.println("\nThank you for visiting AMAZON.com @ The Dark Web\n "); 
				on = false;
	
			} // end of (water Guns)




		} // end of while
			
	} // end of main
} // end of class




