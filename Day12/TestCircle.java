import java.util.Scanner;

public class TestCircle
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		Double a;

		System.out.println("Enter Diameter: ");
		a=input.nextDouble();

		Circle Circ1 = new Circle(a);
		Circ1.area();
		Circ1.circumference();
		Circ1.display();

	} // end main
} // end class
