package lab4;

//Lab4 Postlab
//Author: SethMiller

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class PostlabApplet extends JApplet
{
	public void paint( Graphics g )
	{
		super.paint( g );
		
		// 16. This code sets the current color to red
		g.setColor( Color.RED );
		
		// 17. This code draws the String “Fill In the Code” with the lower-left corner of the first character (the F) being at the coordinate (100, 250).
		g.drawString("Fill in the Code", 100, 250);
		
		// 18. This code draws a filled rectangle with a width of 100 pixels and a height of 300 pixels, starting at the coordinate (50, 30).
		g.drawRect( 50, 30, 100, 300);
		
		// 19. This code draws a filled rectangle starting at (50, 30) for its upper-left corner with a lower-right corner at (100, 300).
		g.fillRect(50, 30, 50, 270);
		
		// 20. This code draws a circle of radius 100 with its center located at (200, 200).
		int centerX = 200, centerY = 200;
	    int radius = 100;
	    g.drawOval( centerX - radius, centerY - radius, radius* 2, radius * 2 );
		
		// 21. Where is the error in this code sequence?
		Graphics g = new Graphics( );
		// Cannot instantiate the type Graphics
		
		// 22. Where is the error in this code sequence?
		g.drawString("Find the bug", 100, 200);
		// You must use double quotes: ("Find the bug", 100, 200)
		
		// 23. Where is the error in this code sequence?
		g.setColor( GREEN );
		// It should say: ( Color.GREEN )
		
		// 24. Where is the error in this code sequence?
		g.setColor( Color.COBALT );
		// No error
		
		// 25. Where is the error in this code sequence?
		g.color = Color.RED;
		// It should be: g.setcolor(Color.RED);
		
		// 26. Where is the error in this statement?
		import Graphics;
		// It should say: import java.awt.Graphics
		
		// 27. Where is the error in this statement?
		import java.awt.JApplet;
		//It should say: javax.swing.JApplet
	}
	
}