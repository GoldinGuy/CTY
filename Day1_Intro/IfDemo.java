class IfDemo
	{
		public static void main(String args[])
		{
		int a ,b , c;
		a = 2;
		b = 3;

		if (a > b)
		{
		System.out.println( "Seth for President"); // will it display anything?
		}

		if (a == b)
		{
		System.out.println( "You won't see this"); // will it display anything?
		}

		c = a - b;
		System.out.println("If c contains -1") ;
		
		if (c >= 0)
		{
		System.out.println( "c is non-negative"); // will it display anything?
		System.out.println( "Seth's dog is awesome");// will it display anything?
		}

		if (c < 0)
		{ 
		System.out.println( "c is negative"); // will it display anything?
		}
		 
		c = b - a; // c now contains 1
		System.out.println("If c contains 1") ;
		
		if (c >= 0)
		{
		System.out.println( "c is non-negative"); // will it display anything?
		}

		if (c < 0)
		{
		System.out.println( "c is negative"); // will it display anything?
		}

		} //end of main
	} // end of program