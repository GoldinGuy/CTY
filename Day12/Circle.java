class Circle
{
double diameter;
double area, circumference;

Circle(double a) 
	{
	diameter=a;
	}

	void area()
	{ 
		area= 3.14*(diameter/2)*(diameter/2);
	}

	void circumference()
	{
		circumference= 2*3.14*(diameter/2);
	}

	void display()
	{
		System.out.println("The area is " + area + " and the circumference is " + circumference);
	}

} // end class
