import java.io.*;
import java.util.Scanner;
class Friends4
{
	static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));


	public static void main(String[]args) throws IOException
	{
		
	Scanner input = new Scanner(System.in);
	String name;
	int Alex;
	int i;
	boolean on;
	on = true;

		for(i=0;on;i--)
		{
	
		System.out.println("Welcome to the Friend Zone!");
		System.out.println(" ");
		System.out.println("Will");
		System.out.println("Jerry");
		System.out.println("Jesus");
		System.out.println("Jason");
		System.out.println("Alex");
		System.out.println("To Exit the Friend Zone (Type EXIT)");
		System.out.println(" ");
		System.out.println("Choose a friend to learn more about: ");
		name=keyboard.readLine();
		name=name.toUpperCase();
	


		if(name.equals("WILL"))
		{
		System.out.println(" ");
		System.out.println("You're so lit dude I confused you for a lightbulb! -Will");
		System.out.println(" ");
		}

		else if(name.equals("JERRY"))
		{
		System.out.println(" ");
		System.out.println("The triganomic function of an imaginary number is equal to 2/15 of... -Jerry");
		System.out.println(" ");
		}
		
		else if(name.equals("JESUS"))
		{
		System.out.println(" ");
		System.out.println("You've been blessed by the divine divinity of myself #JESUSLIFE -You know me");
		System.out.println(" ");
		}
		
		else if(name.equals("JASON"))
		{
		System.out.println(" ");
		System.out.println("Look at this dude! You can't just say something funny. -Jason");
		System.out.println(" ");
		}

		else if(name.equals("ALEX"))
		{
		System.out.println(" ");
		System.out.println("What? What? I just destroyed this guy in basketball. -Alex");
		System.out.println(" ");
		}
		
		else
		{
		System.out.println(" ");
		System.out.println("Please select a valid friend: Type a name listed above");
		System.out.println(" ");
		}

		if(name.equals("EXIT"))
		{
		System.out.println(" ");
		System.out.println("Thank you for visiting the Friend Zone! Goodbye!");
		System.out.println(" ");
		on = false;
		}
		
	
		}

	} //end of main
} //end class







