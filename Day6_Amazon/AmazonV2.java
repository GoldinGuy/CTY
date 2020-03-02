import java.io.*;
import java.util.Scanner;
class  AmazonV2
{
		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
	
		Scanner input = new Scanner(System.in);
		FileWriter file2 = new FileWriter("Reciept1.txt");

		PrintWriter outputFile = new PrintWriter(file2);
		int x, y, i, a;
		double s, r;
		String category, reply;

		String item[]=new String[9];
		item[0]=("MYPHONE(BY BANANA)");
		item[1]=("4K ROUND-SCREEN TV");
		item[2]=("4D PRINTER");
		item[3]=("DESIGNER ONESIE");
		item[4]=("SHREDDED JEAN-SHIRT");
		item[5]=("TIE-DYED SOCKS");
		item[6]=("(DO YOU LIKE)PINA COLADAS");
		item[7]=("PINE-APPLES");
		item[8]=("TANGO-MANGOS");
			

		int cost[]=new int[9];
		cost[0]=999;
		cost[1]=3999;
		cost[2]=2499;
		cost[3]=89;
		cost[4]=76;
		cost[5]=32;
		cost[6]=26;
		cost[7]=17;
		cost[8]=15;

		boolean bought[]=new boolean[9];
		bought[0]=false;
		bought[1]=false;
		bought[2]=false;
		bought[3]=false;
		bought[4]=false;
		bought[5]=false;
		bought[6]=false;
		bought[7]=false;
		bought[8]=false;
		
		boolean on, card;
		on = true;
		card = false;
		int gift, member;
		gift = 0;
		member = 0;
		x=0;
		r=0;
		y=1;
		s=0;

		while (y!=0)
		{
			System.out.println("\nWelcome to AMAZON.com @ the DARK WEB! \n\nEnter Membership Code to Access: ");
			member=input.nextInt();

			if (member==1234)
			{
			

				System.out.println("\nWelcome to AMAZON.com @ the DARK WEB!"); 

				while (on)
				{	
					System.out.println("\nChoose a Category:\nELECTRONICS \nCLOTHING \nEXOTIC FRUIT \n\nTo Leave AMAZON and obtain Receipt, type EXIT\n"); 
					category=keyboard.readLine();
					category=category.toUpperCase();


						if (category.equals("ELECTRONICS"))
						{
						System.out.println("\nChoose an Item: \n" + item[0] + ": $999 \n" + item[1] + ": $3999 \n"+ item[2] + ": $2499"); 
						reply=keyboard.readLine();
						reply=reply.toUpperCase();

							for (i=0;i<item.length;i++)
							{
								if (reply.equals(item[i]))
								{
									System.out.println("\nThank you for purchasing " + reply + "!\n "); 
									r = r+ cost[i];
									x = x+1;
									bought[i]=true;
								}

							
							}	

								if (x==0)
								{
									System.out.println("Inalid Choice. \nPlease enter the exact name of the item you would like to purchase."); 
								}

								
						} // end of (Electronics)




						else if (category.equals("CLOTHING"))
						{
						System.out.println("\nChoose an Item: \n" + item[3] + ": $89 \n" + item[4] + ": $76 \n"+ item[5] + ": $32"); 
						reply=keyboard.readLine();
						reply=reply.toUpperCase();

							for (i=0;i<item.length;i++)
							{
								if (reply.equals(item[i]))
								{
									System.out.println("\nThank you for purchasing " + reply + "!\n "); 
									r = r+ cost[i];
									x = x+1;
									bought[i]=true;
								}

							}

									if (x==0)
								{
									System.out.println("Inalid Choice. \nPlease enter the exact name of the item you would like to purchase."); 
								}

						} // end of (Clothing)
					





						else if (category.equals("EXOTIC FRUIT"))
						{
						System.out.println("\nChoose an Item: \n" + item[6] + ": $26 \n" + item[7] + ": $17 \n"+ item[8] + ": $15"); 
						reply=keyboard.readLine();
						reply=reply.toUpperCase();

							for (i=0;i<item.length;i++)
							{
								if (reply.equals(item[i]))
								{
									System.out.println("\nThank you for purchasing " + reply + "!\n "); 
									r = r+ cost[i];
									x = x+1;
									bought[i]=true;
								}

							}

									if (x==0)
								{
									System.out.println("Inalid Choice. \nPlease enter the exact name of the item you would like to purchase."); 
								}

						} // end of (Electronics)


						
						else if (category.equals("EXIT"))
						{

							System.out.println("\nEnter a Gift-Card Code to get $100 Off! \nPress 0 to SKIP this step.");
							gift=input.nextInt();
							
							System.out.println("\nThank you for visiting AMAZON.com @ The Dark Web \n\nYour Reciept is: "); 
							outputFile.println("\nThank you for visiting AMAZON.com @ The Dark Web \n\nYour Reciept is: ");

							for (i=0;i<item.length;i++)
							{
								if (bought[i]==true)
								{
									System.out.println(item[i] + ": $" + cost[i]); 
									outputFile.println(item[i] + ": $" + cost[i]); 
								}
							}

								
							System.out.println("\nTotal Cost: $" + r);
							outputFile.println("\nTotal Cost: $" + r);


							if (gift==123456789)
								{
									System.out.println("- $100    (Gift Card)");
									outputFile.println("- $100    (Gift Card)");
									r = r-100;
								}

							s = r * 0.06;


							System.out.println("\nSales Tax: $" + s);
							outputFile.println("\nSales Tax: $" + s);

							r = r+s;

							System.out.println("\nTotal Cost w/ Sales Tax: $" + r);
							outputFile.println("\nTotal Cost w/ Sales Tax: $" + r);
							
							
							on = false;
							y = 0;
				
						} // end of (EXIT)


						x=0;
						i=0;
				
				} // end of if

			
			} // end of while

			else
				{
					System.out.println("\nINVALID CODE. Please enter a valid membership code.");
				}

		} // end of while
			

	outputFile.close();


	} // end of main
} // end of class




