import java.io.*;
import java.util.Scanner;
class  Roster
{
		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
		
		Scanner fileScan =new Scanner (new File("Roster.txt"));
	
		Scanner input = new Scanner(System.in);
		
		String stu;
		int grade;
		int x;
		int g;
		int i;
		String name;
		String a;
		x=0;
		grade = 0;
		g = 0;


			System.out.println("Enter Student's name: ");
			name=keyboard.readLine();
			name=name.toUpperCase();
				

				
						while(fileScan.hasNext()) // no need sentinel
						{
							stu=fileScan.next();
							grade=fileScan.nextInt();


							if (stu.equals(name))
							{
								x = x+1;
								g = grade;
							}

							else
							{
								x = x+0;
							}
						}


					if (x==1)
					{
						System.out.println(name+ " is enrolled in the class. \nHis grade is: " +g);
					}

					if (x==0)
					{
						System.out.println("\nSorry, that student is not enrolled in the class."); 
					}



		fileScan.close();

	} // end of main
} // end of class




