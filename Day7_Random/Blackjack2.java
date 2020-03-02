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
		int x, y, z;

		
		int card[]=new int[52];
		card[0]=1;
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
		card[14]=1;
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
		card[28]=1;
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
		card[42]=1;
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
		name[0]=("Ace");
		name[1]=("");
		name[2]=("");
		name[3]=("");
		name[4]=("");
		name[5]=("");
		name[6]=("");
		name[7]=("");
		name[8]=("");
		name[9]=("");
		name[10]=("Jack");
		name[11]=("Queen");
		name[12]=("King");
		name[13]=("Queen");		
		name[14]=("Ace");
		name[15]=("");
		name[16]=("");
		name[17]=("");
		name[18]=("");
		name[19]=("");
		name[20]=("");
		name[21]=("");
		name[22]=("");
		name[23]=("");
		name[24]=("Jack");
		name[25]=("Queen");
		name[26]=("King");
		name[27]=("King");
		name[28]=("Ace");
		name[29]=("");
		name[30]=("");
		name[31]=("");
		name[32]=("");
		name[33]=("");
		name[34]=("");
		name[35]=("");
		name[36]=("");
		name[37]=("");
		name[38]=("Jack");
		name[39]=("Queen");
		name[40]=("King");
		name[41]=("Jack");
		name[42]=("Ace");
		name[43]=("");
		name[44]=("");
		name[45]=("");
		name[46]=("");
		name[47]=("");
		name[48]=("");
		name[49]=("");
		name[50]=("");
		name[51]=("");


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








	} // end of main
} // end of class
