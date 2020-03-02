import javax.swing.JApplet;
import java.awt.*;
public class  Einstein extends JApplet
{
	public void paint(Graphics page)
	{
		page.drawRect(50,50,40,40);
		page.drawRect(60,80,225,30);
		page.drawOval(75,65,20,20);
		page.drawLine(35,60,100,120);
		page.drawString("Simplify, but don't simplify things too much", 110,70);
		page.drawString("--Albert Einstein",130,100);
		
		
	} // end paint
} // end class

// save this in appropriate sub-directory. Compile it using javac to gernerate .class file. Insert that file into html
