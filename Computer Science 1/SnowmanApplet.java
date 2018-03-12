package lab4;

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;

public class SnowmanApplet extends JApplet
{
	public void paint (Graphics g)
	{
		super.paint( g );
		
		//arms
		g.setColor( Color.ORANGE);
		
		g.fillRect(105, 280, 80, 15);
		
		g.fillRect(315, 280, 80, 15);
		
		g.fillRect(125, 260, 15, 60);
		
		g.fillRect(360, 260, 15, 60);
		
		//Top snowball
		g.setColor( Color.BLACK);
		g.drawOval( 200, 100, 100, 100);
		g.setColor( Color.WHITE);
		g.fillOval( 200, 100, 100, 100);
		
		//Middle snowball
		g.setColor( Color.BLACK);
		g.drawOval( 175, 205, 150, 150);
		g.setColor( Color.WHITE);
		g.fillOval( 175, 205, 150, 150);
		
		//Bottom snowball
		g.setColor( Color.BLACK);
		g.drawOval( 150, 360, 200, 200);
		g.setColor( Color.WHITE);
		g.fillOval( 150, 360, 200, 200);
		
		//hat
		g.setColor( Color.BLACK);
		g.fillRect( 220, 40, 60, 60);
		g.fillRect( 190, 80, 120, 20);
		
		//nose
		
		
		
		
	}
}