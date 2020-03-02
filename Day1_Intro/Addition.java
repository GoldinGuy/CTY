import java.util.Scanner; /* program uses class Scanner */

	public class Addition
	{
		public static void main(String args[])
		{
	/* create Scanner to obtain input from command window */
		Scanner input = new Scanner(System.in);
		int number1; // first number to add
		int number2; // second number to add
		int sum; // sum of number 1 and number 2
		System.out.print( "Enter first integer: ");// prompt
		number1 = input.nextInt(); // read first number from user

		System.out.print( "Enter second integer: ");// prompt
		number2 = input.nextInt(); // read second number from user

		
		sum = number1 + number2; // add numbers
		System.out.println( "Sum is: " + sum);// prompt
						// display sum
	
		} //end method main
	} // end class Addition