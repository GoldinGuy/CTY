import java.util.Scanner;
class Friends1
{


	public static void main(String[]args)
	{
		
	Scanner input = new Scanner(System.in);
	int Will;
	int Jerry;
	int Jesus;
	int Will2;
	int Alex;
	int i;
	int x;
	x = 0;

		for(i=0;i<4;i++)
		{
	
		System.out.println("Welcome to the friend zone!");
		System.out.println(" ");
		System.out.println("Will (Press 1)");
		System.out.println("Jerry (Press 2)");
		System.out.println("Jesus (Press 3)");
		System.out.println("Jason (Press 4)");
		System.out.println("Alex (Press 5)");
		System.out.println(" ");
		System.out.println("Choose a friend to learn more about: ");
		x=input.nextInt();


		if(x==1)
		{
		System.out.println(" ");
		System.out.println("You're so lit dude I confused you for a lightbulb! -Will");
		System.out.println(" ");
		}

		else if(x==2)
		{
		System.out.println(" ");
		System.out.println("The triganomic function of an imaginary number is equal to 2/15 of... -Jerry");
		System.out.println(" ");
		}
		
		else if(x==3)
		{
		System.out.println(" ");
		System.out.println("You've been blessed by the divine divinity of myself #JESUSLIFE -You know me");
		System.out.println(" ");
		}
		
		else if(x==4)
		{
		System.out.println(" ");
		System.out.println("Look at this dude! You can't just say something funny. -Jason)");
		System.out.println(" ");
		}

		else if(x==5)
		{
		System.out.println(" ");
		System.out.println("What? What? I just destroyed this guy in basketball. -Alex");
		System.out.println(" ");
		}
		
		else
		{
		System.out.println(" ");
		System.out.println("Please select a valid friend: Press 1-5");
		System.out.println(" ");
		}

		
		
	
		}

	} //end of main
} //end class







