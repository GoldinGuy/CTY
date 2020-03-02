public class Variables2
{
	public static void main(String args[])
	{
	int var;  // this declares an int variable
	double x; // this declares a double-point variable
	var = 10; // assign var the value of 10
	x = 10.0; // assign x the value of 10.0

	System.out.println("Original value of var: "+ var) ;
	System.out.println("Original value of x: " + x) ;
	System.out.println() ; // print a new line
	// now, divide both by 4
	var = var + 9; // var is now 19
	var = var / 4; // what is var now????
	x = x / 4;
	System.out.println("var after division: " + var) ;
	System.out.println("x after division: " + x) ;

	} //end of main
} // end of class