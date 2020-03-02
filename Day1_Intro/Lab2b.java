import java.util.Scanner; /* program uses class Scanner */

	public class Lab2b
	{
		public static void main(String args[])
		{
	/* create Scanner to obtain input from command window */
		Scanner input = new Scanner(System.in);
		int a; // first number to add
		int b; // second number to add
		int lessthan; // less than
		int greaterthan; // greater than
		int equal; // are they equal
		int notequal; // are they not equal

		System.out.print( "Enter first integer: ");// prompt
		a = input.nextInt(); // read first number from user

		System.out.print( "Enter second integer: ");// prompt
		b = input.nextInt(); // read second number from user


		
		if (a == b)
		{
		
		System.out.println(a + " == [is equal to] " + b);// prompt
						// display ==
		}
		
		if (a > b)
		{
		System.out.println(a + " > [is greater than] " + b);// prompt
						// display >
		}
		if (a < b)
		{
		System.out.println(a + " < [is less than] " + b);// prompt
						// display product
		}
		if (a != b)
		{
		System.out.println(a + " != [is not equal to] " + b);// prompt
						// display !=
		}


		} //end method main
	} // end class Addition