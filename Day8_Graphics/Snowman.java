import javax.swing.JApplet;
import java.awt.*;
public class  Snowman extends JApplet
{
	public void paint(Graphics page)
	{
		int x[]={250,180,250}; 
		int y[]={110,110,88};

	
		page.setColor(Color.blue);
		page.fillRect(0,0,400,400);
		page.setColor(Color.orange);
		page.fillRect(0,300,400,400);

		page.setColor(Color.yellow);
		page.fillOval(-75,-75,200,200);
		page.setColor(Color.orange);
		page.fillOval(-75,-75,185,185);

		page.setColor(Color.black);
		page.drawLine(200,300,350,100);
		page.setColor(Color.black);
		page.drawLine(200,200,150,100);

		page.setColor(Color.white);
		page.fillOval(178,230,150,150);
		page.setColor(Color.white);
		page.fillOval(188,140,125,125);
		page.setColor(Color.white);
		page.fillOval(200,55,100,100);

		page.setColor(Color.black);
		page.fillOval(260,80,19,19);
		page.setColor(Color.black);
		page.fillOval(210,80,17,17);


		page.setColor(Color.black);
		page.fillOval(225,120,40,20);

		page.setColor(Color.black);
		page.fillRect(225,5,50,60);
		page.setColor(Color.black);
		page.fillRect(215,57,70,10);

		page.setColor(Color.orange);
		page.fillPolygon(x,y,3);


		page.setColor(Color.black);
		page.fillOval(237,170,20,20);
		page.setColor(Color.black);
		page.fillOval(235,200,23,23);
		page.setColor(Color.black);
		page.fillOval(233,230,25,25);
		



		
		
	} // end paint
} // end class

// save this in appropriate sub-directory. Compile it using javac to gernerate .class file. Insert that file into html
	
