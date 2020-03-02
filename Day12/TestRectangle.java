import java.util.Scanner;

public class TestRectangle
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		Double a, b;

		System.out.println("Enter Width: ");
		a=input.nextDouble();

		System.out.println("Enter Length: ");
		b=input.nextDouble();

		Rectangle Rect1 = new Rectangle(a,b);
		Rect1.area();
		Rect1.perimeter();
		Rect1.display();

	} // end main
} // end class
