import java.util.Random;
import java.util.Scanner;
import java.io.*;


class  Blackjack2
{

		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) 
	{
		boolean on=true;
		Random randomNumbers=new Random();
		Scanner input = new Scanner(System.in);

		String a, b, c, d;
		int x=0, y=0, z=0, t=0, dt=0, i=0, Rnd=0, Input=0;

		
		int card[]=new int[52];
		card[0]=11;
		card[1]=2;
		card[2]=3;
		card[3]=4;
		card[4]=5;
		card[5]=6;
		card[6]=7;
		card[7]=8;
		card[8]=9;
		card[9]=10;
		card[10]=10;
		card[11]=10;
		card[12]=10;
		card[13]=10;		
		card[14]=11;
		card[15]=2;
		card[16]=3;
		card[17]=4;
		card[18]=5;
		card[19]=6;
		card[20]=7;
		card[21]=8;
		card[22]=9;
		card[23]=10;
		card[24]=10;
		card[25]=10;
		card[26]=10;
		card[27]=10;
		card[28]=11;
		card[29]=2;
		card[30]=3;
		card[31]=4;
		card[32]=5;
		card[33]=6;
		card[34]=7;
		card[35]=8;
		card[36]=9;
		card[37]=10;
		card[38]=10;
		card[39]=10;
		card[40]=10;
		card[41]=10;
		card[42]=11;
		card[43]=2;
		card[44]=3;
		card[45]=4;
		card[46]=5;
		card[47]=6;
		card[48]=7;
		card[49]=8;
		card[50]=9;
		card[51]=10;

		String name[]=new String[52];
		name[0]=(" Ace ");
		name[1]=("");
		name[2]=("");
		name[3]=("");
		name[4]=("");
		name[5]=("");
		name[6]=("");
		name[7]=("");
		name[8]=("");
		name[9]=(" [10] ");
		name[10]=(" Jack ");
		name[11]=(" Queen ");
		name[12]=(" King ");
		name[13]=(" Queen ");		
		name[14]=(" Ace ");
		name[15]=("");
		name[16]=("");
		name[17]=("");
		name[18]=("");
		name[19]=("");
		name[20]=("");
		name[21]=("");
		name[22]=("");
		name[23]=(" [10] ");
		name[24]=(" Jack ");
		name[25]=(" Queen ");
		name[26]=(" King ");
		name[27]=(" King ");
		name[28]=(" Ace ");
		name[29]=(" ");
		name[30]=(" ");
		name[31]=(" ");
		name[32]=(" ");
		name[33]=(" ");
		name[34]=(" ");
		name[35]=(" ");
		name[36]=(" ");
		name[37]=(" [10] ");
		name[38]=(" Jack ");
		name[39]=(" Queen ");
		name[40]=(" King ");
		name[41]=(" Jack ");
		name[42]=(" Ace ");
		name[43]=(" ");
		name[44]=(" ");
		name[45]=(" ");
		name[46]=(" ");
		name[47]=(" ");
		name[48]=(" ");
		name[49]=(" ");
		name[50]=(" ");
		name[51]=(" [10] ");


		boolean pldeck[]=new boolean[52];
		pldeck[0]=true;
		pldeck[1]=true;
		pldeck[2]=true;
		pldeck[3]=true;
		pldeck[4]=true;
		pldeck[5]=true;
		pldeck[6]=true;
		pldeck[7]=true;
		pldeck[8]=true;
		pldeck[9]=true;
		pldeck[10]=true;
		pldeck[11]=true;
		pldeck[12]=true;
		pldeck[13]=true;		
		pldeck[14]=true;
		pldeck[15]=true;
		pldeck[16]=true;
		pldeck[17]=true;
		pldeck[18]=true;
		pldeck[19]=true;
		pldeck[20]=true;
		pldeck[21]=true;
		pldeck[22]=true;
		pldeck[23]=true;
		pldeck[24]=true;
		pldeck[25]=true;
		pldeck[26]=true;
		pldeck[27]=true;
		pldeck[28]=true;
		pldeck[29]=true;
		pldeck[30]=true;
		pldeck[31]=true;
		pldeck[32]=true;
		pldeck[33]=true;
		pldeck[34]=true;
		pldeck[35]=true;
		pldeck[36]=true;
		pldeck[37]=true;
		pldeck[38]=true;
		pldeck[39]=true;
		pldeck[40]=true;
		pldeck[41]=true;
		pldeck[42]=true;
		pldeck[43]=true;
		pldeck[44]=true;
		pldeck[45]=true;
		pldeck[46]=true;
		pldeck[47]=true;
		pldeck[48]=true;
		pldeck[49]=true;
		pldeck[50]=true;
		pldeck[51]=true;


		boolean dldeck[]=new boolean[52];
		dldeck[0]=true;
		dldeck[1]=true;
		dldeck[2]=true;
		dldeck[3]=true;
		dldeck[4]=true;
		dldeck[5]=true;
		dldeck[6]=true;
		dldeck[7]=true;
		dldeck[8]=true;
		dldeck[9]=true;
		dldeck[10]=true;
		dldeck[11]=true;
		dldeck[12]=true;
		dldeck[13]=true;		
		dldeck[14]=true;
		dldeck[15]=true;
		dldeck[16]=true;
		dldeck[17]=true;
		dldeck[18]=true;
		dldeck[19]=true;
		dldeck[20]=true;
		dldeck[21]=true;
		dldeck[22]=true;
		dldeck[23]=true;
		dldeck[24]=true;
		dldeck[25]=true;
		dldeck[26]=true;
		dldeck[27]=true;
		dldeck[28]=true;
		dldeck[29]=true;
		dldeck[30]=true;
		dldeck[31]=true;
		dldeck[32]=true;
		dldeck[33]=true;
		dldeck[34]=true;
		dldeck[35]=true;
		dldeck[36]=true;
		dldeck[37]=true;
		dldeck[38]=true;
		dldeck[39]=true;
		dldeck[40]=true;
		dldeck[41]=true;
		dldeck[42]=true;
		dldeck[43]=true;
		dldeck[44]=true;
		dldeck[45]=true;
		dldeck[46]=true;
		dldeck[47]=true;
		dldeck[48]=true;
		dldeck[49]=true;
		dldeck[50]=true;
		dldeck[51]=true;


		boolean deck[]=new boolean[52];
		deck[0]=true;
		deck[1]=true;
		deck[2]=true;
		deck[3]=true;
		deck[4]=true;
		deck[5]=true;
		deck[6]=true;
		deck[7]=true;
		deck[8]=true;
		deck[9]=true;
		deck[10]=true;
		deck[11]=true;
		deck[12]=true;
		deck[13]=true;		
		deck[14]=true;
		deck[15]=true;
		deck[16]=true;
		deck[17]=true;
		deck[18]=true;
		deck[19]=true;
		deck[20]=true;
		deck[21]=true;
		deck[22]=true;
		deck[23]=true;
		deck[24]=true;
		deck[25]=true;
		deck[26]=true;
		deck[27]=true;
		deck[28]=true;
		deck[29]=true;
		deck[30]=true;
		deck[31]=true;
		deck[32]=true;
		deck[33]=true;
		deck[34]=true;
		deck[35]=true;
		deck[36]=true;
		deck[37]=true;
		deck[38]=true;
		deck[39]=true;
		deck[40]=true;
		deck[41]=true;
		deck[42]=true;
		deck[43]=true;
		deck[44]=true;
		deck[45]=true;
		deck[46]=true;
		deck[47]=true;
		deck[48]=true;
		deck[49]=true;
		deck[50]=true;
		deck[51]=true;


		int plcard[]=new int[10];
		plcard[0]=0;
		plcard[1]=0;
		plcard[2]=0;
		plcard[3]=0;
		plcard[4]=0;
		plcard[5]=0;
		plcard[6]=0;
		plcard[7]=0;
		plcard[8]=0;
		plcard[9]=0;

		int dlcard[]=new int[10];
		dlcard[0]=0;
		dlcard[1]=0;
		dlcard[2]=0;
		dlcard[3]=0;
		dlcard[4]=0;
		dlcard[5]=0;
		dlcard[6]=0;
		dlcard[7]=0;
		dlcard[8]=0;
		dlcard[9]=0;




		System.out.println("\nWelcome to BlackJack!");



			while (dt==0)
			{
			
				Rnd=randomNumbers.nextInt(52); //Dealer's Cards
				
				 dlcard[i]= card[Rnd];
				 deck[Rnd]=false;
				 dldeck[Rnd]=false;

				 if (dlcard[i]>9)
				 {
					 System.out.println("\n \nDealer's Hand: ? , " + name[i]);
				 }

				 if (dlcard[i]<=9)
				 {
					  System.out.println("\n \nDealer's Hand: ? , [" + dlcard[i] + "]");
				 }

				 dt=dt+dlcard[i];

					i = i+1;

			
			} // dealers cards


				i = 0; // resets i to 0

	
		

				System.out.print("\n \nYour Hand: "); // your hand


				while (i<2)
				{

					Rnd=randomNumbers.nextInt(52); // Find y


					if (deck[Rnd]=true)
					{

						plcard[i]=card[Rnd];
						deck[Rnd]=false;
						pldeck[Rnd]=false;
						i=i+1;

					} // end of if


				} // end of while
				
						for (y=0; y<52 ;y++ )
						{
							if (pldeck[y]==false)
							{
								if (card[y]>9)
								{
										System.out.print(name[y]);
								}

								if (card[y]<=9)
								{
										System.out.print(" [" + card[y] + "] ");
								}
							
							}
						}

					

					t = plcard[0]+plcard[1]; // find total

					System.out.println("\n\nTotal: " + t); // find total

						
						
				if (t==21)
				{
					System.out.println("\nBLACKJACK! ");
					on = false;
				} // end of if




				if (t<21)
				{


					while (on)
					{
						if (on=true)
						{
							System.out.println("\n To Hit, Press 1 \n \n To Stay, Press 2");
							Input=input.nextInt();

							x=0;


							if (Input==1)
							{
								while (x<1)
								{
				
								Rnd=randomNumbers.nextInt(52); // Find y

								if (deck[Rnd]=true)
								{
									i=i+1;
									plcard[i]=card[Rnd];
									deck[Rnd]=false;
									pldeck[Rnd]=false;
									x=x+1;

									System.out.print("\n \nYour Hand: "); // your hand

									for (y=0; y<52 ;y++ )
									{
										if (pldeck[y]==false)
										{
											if (card[y]>9)
											{
													System.out.print(name[y]);
											}

											if (card[y]<=9)
											{
													System.out.print(" [" + card[y] + "] ");
											}
										
										}
									}

								

								t = plcard[0]+plcard[1]+plcard[2]+plcard[3]+plcard[4]+plcard[5]+plcard[6]+plcard[7]+plcard[8]; // find total

								if (t>21)
								{
									card[0]=1;
									t = plcard[0]+plcard[1]+plcard[2]+plcard[3]+plcard[4]+plcard[5]+plcard[6]+plcard[7]+plcard[8]; // find total

										if (t>21)
										{
											card[14]=1;
											t = plcard[0]+plcard[1]+plcard[2]+plcard[3]+plcard[4]+plcard[5]+plcard[6]+plcard[7]+plcard[8]; // find total	
										}

										if (t>21)
										{
											card[28]=1;
											t = plcard[0]+plcard[1]+plcard[2]+plcard[3]+plcard[4]+plcard[5]+plcard[6]+plcard[7]+plcard[8]; // find total
										}

										if (t>21)
										{
											card[42]=1;
											t = plcard[0]+plcard[1]+plcard[2]+plcard[3]+plcard[4]+plcard[5]+plcard[6]+plcard[7]+plcard[8]; // find total
										}
								
								}

								System.out.println("\n\nTotal: " + t); // find total

								} // end of if

							


								} // end of while


							} // end of if


						}

							if (t==21)
							{
								System.out.print("\nBLACKJACK!");
							} // end of if


							if (Input==2)
							{
								on=false;
							} // end of if

							if (t>21)
							{
								System.out.print("\nBUST! \nYOU LOST");
								on=false;
							} // end of if

						
					
					} // end of loop


					card[0]=11;
					card[14]=11;
					card[28]=11;
					card[42]=11;

				// space



					if (t<=21)
					{



							if (t<=21)
							{

								i=1;
								
								Rnd=randomNumbers.nextInt(52); // Dealer's Cards

								if (deck[Rnd]=true)
								{	
								 dlcard[i]=card[Rnd];
								  deck[Rnd]=false;
								  dldeck[Rnd]=false;
								}

							} // end of if

											System.out.print("\n \nDealer's Hand: "); // dealers hand

											for (y=0; y<52 ;y++ )
											{
												if (dldeck[y]==false)
												{
													if (card[y]>9)
													{
															System.out.print(name[y]);
													}

													if (card[y]<=9)
													{
															System.out.print(" [" + card[y] + "] ");
													}
												
												}
											}
								

								i=i+1;

								while (dt<15)
								{	
						
							
								Rnd=randomNumbers.nextInt(52); //Dealer's Cards

								

								 if (deck[Rnd]==true)
								 {
								
								 deck[Rnd]=false;
								 dldeck[Rnd]=false;
								 dlcard[i]=card[Rnd];

									 if (card[Rnd]<10)
									 {
										  System.out.println("\n \nThe Dealer Hit and was dealt a [" + card[Rnd] + "]"); // dealers hand
									 }

								 	 if (card[Rnd]>9)
									 {
										  System.out.println("\n \nThe Dealer Hit and was dealt a " + name[Rnd]); // dealers hand
									 }

								 dt=dlcard[0]+dlcard[1]+dlcard[2]+dlcard[3]+dlcard[4]+dlcard[5]+dlcard[6]+dlcard[7]+dlcard[8]; // find total;


									i = i+1;
								
								 }
					
								} // dealers cards


											System.out.print("\n \nDealer's Hand: "); // dealers hand

											for (y=0; y<52 ;y++ )
											{
												if (dldeck[y]==false)
												{
													if (card[y]>9)
													{
															System.out.print(name[y]);
													}

													if (card[y]<=9)
													{
															System.out.print(" [" + card[y] + "] ");
													}
												
												}
											}

								if (dt>21)
								{
									card[0]=1;
									dt=dlcard[0]+dlcard[1]+dlcard[2]+dlcard[3]+dlcard[4]+dlcard[5]+dlcard[6]+dlcard[7]+dlcard[8]; // find total;

										if (dt>21)
										{
											card[14]=1;
											dt=dlcard[0]+dlcard[1]+dlcard[2]+dlcard[3]+dlcard[4]+dlcard[5]+dlcard[6]+dlcard[7]+dlcard[8]; // find total;
										}

										if (dt>21)
										{
											card[28]=1;
											dt=dlcard[0]+dlcard[1]+dlcard[2]+dlcard[3]+dlcard[4]+dlcard[5]+dlcard[6]+dlcard[7]+dlcard[8]; // find total;
										}

										if (dt>21)
										{
											card[42]=1;
											dt=dlcard[0]+dlcard[1]+dlcard[2]+dlcard[3]+dlcard[4]+dlcard[5]+dlcard[6]+dlcard[7]+dlcard[8]; // find total;
										}
								
								}
								


								System.out.println("\n \nDealer's Total: " + dt);
								System.out.println("\nYour Total: " + t); // find total

					} // end of if t<21
						

									if (t>dt | dt>21)
									{
										System.out.println("\nCongratulations! You Won! ");
									} // end of if

									if (t==dt)
									{
										System.out.println("\nPUSH ");
									} // end of if

									if (t<dt & dt<22)
									{
										System.out.println("\nYou Lost ");
									} // end of if

		
					} // end of if






	} // end of main
} // end of class
