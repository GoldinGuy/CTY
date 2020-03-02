import java.util.Scanner;

public class TestQuadratic
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		Double a, b, c;

		System.out.println("A Quadratic Equation is: ax^2 + bx + c ");

		System.out.println("Enter a: ");
		a=input.nextDouble();

		System.out.println("Enter b: ");
		b=input.nextDouble();

		System.out.println("Enter c: ");
		c=input.nextDouble();

		Quadratic Quad1 = new Quadratic(a, b, c);
		Quad1.Doit();
		Quad1.Display();

	} // end main
} // end class
