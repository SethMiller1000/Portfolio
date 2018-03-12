package lab4;

import javax.swing.JApplet;
import java.awt.Graphics;

public class DrawingTextApplet extends JApplet
{
	public void paint( Graphics g )
	{
		super.paint( g );
		g.drawString( "Programming is not", 140, 100);
		g.drawString( "a spectator sport!", 140, 115);
	}
}
