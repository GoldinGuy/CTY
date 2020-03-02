class Rectangle 
{
double width, length;
double area, perimeter;

Rectangle(double a, double b) 
	{
	width=a;
	length=b;
	}

	void area()
	{ 
		area= width*length;
	}

	void perimeter()
	{
		perimeter= 2*width + 2*length;
	}

	void display()
	{
		System.out.println("The area is " + area + " and the perimeter is " + perimeter);
	}

} // end class
