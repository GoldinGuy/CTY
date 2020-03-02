//Demostrate the switch/case statement.
class SwitchDemo
{
	
	public static void main(String[]args) 
	{
		
		int i;
		for(i=0; i<10; i++) // you don't need a for loop for switch case
		{
			switch(i) //control variable must be a int.or character
			{
		case 0:
			System.out.println("i is zero");
			System.out.println("pac man eats a lot");
			break; // means it will get out of the statement
		case 1:
			System.out.println("i is one");
			break;
		case 2:
			System.out.println("i is two");
			break;
		case 3: 
			System.out.println("i is three");
			System.out.println("seth rules the world");
			break;
		default: //same function as else statement
			System.out.println("i is not always 1-3");

			} // ends switch statement
		} // end loop

	} //end of main
} //end class

