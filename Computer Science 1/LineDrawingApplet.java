package lab4;

import javax.swing.JApplet;
import java.awt.Graphics;

public class LineDrawingApplet extends JApplet
{
	public void paint( Graphics g )
	{
		super.paint( g );
		
		g.drawLine( 100, 150, 100, 250);
		g.drawLine( 150, 75, 275, 75 );
		g.drawLine( 0, 0, 399, 299);
		
	}
}