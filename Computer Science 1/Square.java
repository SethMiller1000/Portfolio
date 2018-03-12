/** Square class
 *  Seth Miller
 *  Lab 11- Inheritance & Polymorphism: CIS 1144
 */

package shapes;

import java.awt.*;

public class Square extends Rectangle
{
	protected int x, y, width;
	
	// default Square constructor
	
	public Square (int x, int y, int width)
	//PRE: init<x, y, width> 
	//POS: this.x <- x, etc. 
	//TAS: Create a square object at x, y with width specified 
	{
		super(x, y, width, width);
		
	}// end of default Square constructor
	
	// overloaded Square constructor
	
	public Square (Color color, int x, int y, int width)
	// PRE: init<color, x, y, width> 
	// POS: this.x <- x, etc. 
	// TAS: Specifies location, size, and color for this square 
	{
		super(color, x, y, width, width);
		
	}// end of overloaded Square constructor
	
}// end of Square class
