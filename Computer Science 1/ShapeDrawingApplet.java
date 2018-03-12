package lab4;

import javax.swing.JApplet;
import java.awt.Graphics;

public class ShapeDrawingApplet extends JApplet
{
	public void paint( Graphics g )
	{
		super.paint( g );
		
		g.drawRect( 100, 50, 40, 100 );
		g.fillRect( 200, 70, 80, 80 );
		
		g.fillOval( 100, 50, 40, 100 );
		g.drawOval( 100, 200, 100, 40 );
		
		
		int centerX = 250, centerY = 225;
		int radius = 25;
		g.drawOval( centerX - radius, centerY - radius, radius * 2, radius * 2 );
		
	}
}