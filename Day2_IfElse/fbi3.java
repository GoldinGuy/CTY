import java.io.*;
import java.util.Scanner;
class fbi3
{
	static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));


	public static void main(String[]args) throws IOException
	{
		
		Scanner input = new Scanner(System.in);
		String name;
		String garment;
		double age;
		double shoe;
		double height;
		System.out.println("The FBI requires some information...");
		System.out.println("What is your name?");
		name=keyboard.readLine();
		name=name.toUpperCase();
	
		if(name.equals("STEPHEN"))
		{	
		System.out.println("What is your age? (years)");
		age=input.nextDouble();
		
			if(age <= 25 & age >= 20 )
			{
				System.out.println("What is your height? (inches)");
				height=input.nextDouble();

				if(height <= 70 & height >= 66)
				{
					System.out.println("What is your shoe size? ");
					shoe=input.nextDouble();
					{
		

						if(shoe < 6)
						{
							System.out.println(name + " is innocent");
						}



						if(shoe >= 6 & shoe <= 10)
						{
							System.out.println(name + " is a high-risk suspect");
						}

						if(shoe > 10)
						{
							System.out.println(name + " IS EXTREMELY DANGEROUS! ARREST HIM!");
						}
					}
			
				}
				else
				{
				System.out.println(name + " is innocent");
				}
			
			}
			else
			{
			System.out.println(name + " is innocent");
			}

		
		}
		else
		{
		System.out.println(name + " is innocent");
		}
	
	} //end of main
} //end class