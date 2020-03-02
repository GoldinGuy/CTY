class Variables1
{
	public static void main(String args[])
	{
		int var1; // this declares a variable
		int var2; // this declares another variable

		var1 = 1024; // this asigns 1024 to var1

		System.out.println("var1 contains" + var1) ;
		
		var2 = var1/2; // use of the division op.

		System.out.print("var2 contains  var1 / 2: ");
		System.out.println(var2) ;
		var1 = var1 + var2;
		System.out.print("the new var1 is "+ var1) ;

		} //end of main

	} //end class Welcome1
