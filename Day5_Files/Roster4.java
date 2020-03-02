import java.io.*;
import java.util.Scanner;
class  Roster4
{
		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
	
		
		String a, name;
		String stu[]=new String[1000];
		int gds[]=new int[1000];
		int grade, x, y, j, g, i;
		boolean on;
		x=0;
		i=0;
		y=0;
		grade = 0;
		g = 0;
		j=0;
		on=true;

		
		Scanner fileScan =new Scanner (new File("Roster.txt"));
	
		Scanner input = new Scanner(System.in);

			
		while(fileScan.hasNext()) // no need sentinel
					{
						a=fileScan.next();
						g=fileScan.nextInt();

						stu[j]=a;
						gds[j]=g;
						j = j+1;
					}

				fileScan.close();



		while (on)
		{

				
			System.out.println("\nStudent Roster \n\nTo leave, type EXIT \n\nEnter Student's name: ");
			name=keyboard.readLine();
			name=name.toUpperCase();
				
					
				
					while(y<100) // no need sentinel
					{
						

						if (name.equals(stu[y]))
						{
							x = x+1;
							grade = gds[y];
						}
						else 
						{
							x = x+0;
						}

						y= y+1;

					}
							
							if (name.equals("EXIT"))
							{
								on=false;
								x=3;
							}

							if (x==1)
							{
								System.out.println(" ");
								System.out.println(name+ " is enrolled in the class. \nHis grade is: " +grade);
							}

							if (x==0)
							{
								System.out.println("\nSorry, that student is not enrolled in the class."); 
							}
							
						

							x=0;
							y=0;


		}


		
			
	} // end of main
} // end of class




