import java.io.*;
import java.util.Scanner;
class  Roster3
{
		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
	
		
		String a;
		String stu[]=new String[1000]
		int gds[]=new int[1000];
		int grade;
		int x;
		int y;
		int j;
		int g;
		int i;
		boolean on;
		String name;
		x=0;
		grade = 0;
		g = 0;
		on=true;

		
		Scanner fileScan =new Scanner (new File("Roster.txt"));
	
		Scanner input = new Scanner(System.in);

			for (j=0;j<1000;j++)
			{
				while(fileScan.hasNext()) // no need sentinel
						{
							a=fileScan.next();
							g=fileScan.nextInt();

							stu[j]=a;
							gds[j]=g;

						}
			}

				fileScan.close();



		while (on)
		{

				
			System.out.println("\nStudent Roster \n\nTo leave, type EXIT \n\nEnter Student's name: ");
			name=keyboard.readLine();
			name=name.toUpperCase();
				

				
						for (y=0; y<1000; y++) // no need sentinel
						{
						

							if stu[y]=(name)
							{
								x = x+1;
								grade = gds[y];
							}

						}


					if (x==1)
					{
						System.out.println(" ");
						System.out.println(name+ " is enrolled in the class. \nHis grade is: " +g);
					}

					if (x==0)
					{
						System.out.println("\nSorry, that student is not enrolled in the class."); 
					}
					
					if (name.equals("EXIT"))
					{
						on=false;
					}

					x=0;


		}


		
			
	} // end of main
} // end of class




