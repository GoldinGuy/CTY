import java.util.Scanner; /* program uses class Scanner */

	public class Lab2a
	{
		public static void main(String args[])
		{
	/* create Scanner to obtain input from command window */
		Scanner input = new Scanner(System.in);
		int a; // first number to add
		int b; // second number to add
		int c; // selection
		int sum; // sum of a and b
		int difference; //difference of a and b
		int product; // product of a and b
		System.out.print( "Enter first integer: ");// prompt
		a = input.nextInt(); // read first number from user

		System.out.print( "Enter second integer: ");// prompt
		b = input.nextInt(); // read second number from user
		
		System.out.print( "Press 1 for Sum, 2 for Difference, or 3 for Product: ");// prompt
		c = input.nextInt(); // read selection

		
		if (c == 1)
		{
		sum = a + b; // add numbers
		System.out.println( "Sum is: " + sum);// prompt
						// display sum
		}
		
		if (c == 2)
		{
		difference = a - b; // subtract numbers
		System.out.println( "Difference is: " + difference);// prompt
						// display difference
		}
		if (c == 3)
		{
		product = a * b; // multiply numbers
		System.out.println( "Product is: " + product);// prompt
						// display product
		}


		} //end method main
	} // end class Addition