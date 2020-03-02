class Quadratic2
{
Double r1, r2, a1, b1, c1;
Double dis;
String sign;
boolean discriminant;

Quadratic2(Double a, Double b, Double c)
	{
		a1=a;
		b1=b;
		c1=c;
	}

	void Doit()
	{ 
		r1= (-b1 + Math.sqrt(dis))/(2*a1);
		r2= (-b1 - Math.sqrt(dis))/(2*a1);
	}

	boolean Checkit()
	{
		dis = (b1*b1) - (4*a1*c1);

		if (dis<0)
		{
			discriminant=false;
			dis= dis*(-1);
		}

		else 
		{
			discriminant=true;
		}

		if (discriminant == true)
		{
			sign=("positive (+)");
		}

		else if (discriminant == false)
		{
			sign=("negative (-)");
		}


		return discriminant;
	}

	void Display()
	{
		
		if (discriminant==true)
		{
		System.out.println("The Roots of the Equation are " + r1 + " and " + r2 + " \nThe Discriminant is " + sign);
		}

		if (discriminant==false)
		{
			System.out.println("The Roots of the Equation are i" + r1 + " and i" + r2 + " \nThe Discriminant is " + sign);
		}
	}

} // end class
