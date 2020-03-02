
public class TwoD
{
	public static void main (String[] args)
	{
		int i, t,a=0,b=0;
		int table[][]=new int [20] [20];
		
		for (t=0;t<20;++t)
		{
			for (i=0;i<20;++i)
			{
				table[a][i]=(b); // row by row
				b=b+1;
				
				if (b==2)
				{
					b=0;
				}
				
			}
			a=a+1;
		}
		
		
		for (t=0;t<20;++t)
		{
			for (i=0;i<20;++i)
			{
				System.out.print(table[t][i] +" "); // row by row
			}
			System.out.println();
		}
	
		
		
	} // end of main
} // end of class
