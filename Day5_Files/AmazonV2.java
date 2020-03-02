import java.io.*;
import java.util.Scanner;
class  AmazonV2
{
		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
	
		Scanner input = new Scanner(System.in);
		int x, y, i, r, a;
		String category, reply,

		String item[]=new String[9];
		item[0]= MYPHONE(BY BANANA);
		item[1]= 4K ROUND-SCREEN TV;
		item[2]= 4D PRINTER;
		item[3]= DESIGNER ONESIE;
		item[4]= SHREDDED JEAN-SHIRT;
		item[5]= TIE-DYED SOCKS;
		item[6]= (DO YOU LIKE) PINA COLADAS;
		item[7]= PINE-APPLES;
		item[8]= TANGO-MANGOS;
			

		int cost[]=new int[9];
		cost[0]= 999;
		cost[1]= 3999;
		cost[2]= 2499;
		cost[3]= 89;
		cost[4]= 76;
		cost[5]= 32;
		cost[6]= 26;
		cost[7]= 17;
		cost[8]= 15;
		
		boolean buy, on;
		buy = false;
		on = true;
		x=0;
		r=0;
		



		System.out.println("\nWelcome to AMAZON.com @ the DARK WEB!"); 

		while (on)
		{	
		System.out.println("\nChoose a Category:\nELECTRONICS \nCLOTHING \nEXOTIC FRUIT \n\nTo Leave, type EXIT\n"); 
		category=keyboard.readLine();
		category=category.toUpperCase();


			if (category.equals("ELECTRONICS"))
			{
			System.out.println("\nChoose an Item: \n" + item[0] + ": $999 \n" + item[1] + ": $3999 \n"+ item[2] + ": $2499 ); 
			reply=keyboard.readLine();
			reply=reply.toUpperCase();

				for (i=0;i<item.length;i++)
				{
					if (reply.equals(item[i]))
					{
						System.out.println("\nThank you for purchasing " + reply + "!\n "); 
						r = r+ cost[i];
						x = x+1;
					}

					else if (x==0)
					{
						System.out.println("Inalid Choice. \nPlease enter the exact name of the item you would like to purchase."); 
					}
				}

					
			} // end of (Electronics)




			else if (category.equals("CLOTHING"))
			{
			System.out.println("\nChoose an Item: \n" + item[3] + ": $89 \n" + item[4] + ": $76 \n"+ item[5] + ": $32 ); 
			reply=keyboard.readLine();
			reply=reply.toUpperCase();

				for (i=0;i<item.length;i++)
				{
					if (reply.equals(item[i]))
					{
						System.out.println("\nThank you for purchasing " + reply + "!\n "); 
						r = r+ cost[i];
						x = x+1;
					}

					else if (x==0)
					{
						System.out.println("Inalid Choice. \nPlease enter the exact name of the item you would like to purchase."); 
					}
				}

					
			} // end of (Clothing)
		





			else if (category.equals("EXOTIC FRUIT"))
			{
			System.out.println("\nChoose an Item: \n" + item[6] + ": $26 \n" + item[7] + ": $17 \n"+ item[8] + ": $15 ); 
			reply=keyboard.readLine();
			reply=reply.toUpperCase();

				for (i=0;i<item.length;i++)
				{
					if (reply.equals(item[i]))
					{
						System.out.println("\nThank you for purchasing " + reply + "!\n "); 
						r = r+ cost[i];
						x = x+1;
					}

					else if (x==0)
					{
						System.out.println("Inalid Choice. \nPlease enter the exact name of the item you would like to purchase."); 
					}
				}

					
			} // end of (Electronics)




			
			else if (category.equals("EXIT"))
			{
				System.out.println("\nThank you for visiting AMAZON.com @ The Dark Web\n "); 
				on = false;
	
			} // end of (EXIT)


			x=0;
			i=0;



		} // end of while
			
	} // end of main
} // end of class




