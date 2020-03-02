import java.io.*;
import java.util.Scanner;

class  Methods
{
	public static void main(String[] args) throws IOException
	{	
		Scanner input = new Scanner(System.in);
		Double numb;
		Double[] Bob = new Double [10];
		Loadit(Bob);
		System.out.println("Numbers in Your Array: ");
		display(Bob);
		average(Bob);
		System.out.println("Average Number Value in Your Array: " + average(Bob));
		System.out.print("\nEnter a Number Value: ");
		numb=input.nextDouble();
		check(Bob, numb);
			
			System.out.print("\nThe Value " + numb + " is ");
			
			if (check(Bob, numb))
			{
				System.out.print("in the Array. \n");
			}
			
			else
			{
				System.out.print("not in the Array. \n");
			}

		

		
 
	} // ends main

	static void Loadit(Double[] array)
	{
		Scanner input = new Scanner(System.in);

		for (int i=0;i<array.length ; i++ )
		{
			System.out.println("Enter a Number: ");
			array[i] = input.nextDouble();
		}
	

	} // ends loadit

	static void display(Double[] array)
	{
		for (int i=0;i<array.length ;i++ )
		{
			System.out.println(array[i] + " ");
		}
	} // ends display


	static Double average(Double[] array)
	{
		double avg=0;

		for (int i=0;i<array.length ;i++ )
		{
			avg=avg+array[i];
		}

		avg=avg/array.length;

		return avg;

	} // ends average

	static boolean check(Double[] array, Double numb)
	{


		boolean result=false; 

		for (int i=0;i<array.length ;i++ )
		{
			if (array[i]==numb)
			{
				result=true;
			}
		}

		return result;
	} // ends numb

} // ends class