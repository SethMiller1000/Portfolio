package shapes;

import java.awt.*; 
//Represents a rectangle of specific size & color, drawn // in a particular location. 

public class Rectangle extends Shape
{ 
	protected int x, y;            //Specifies the location of the rectangle 
	protected int width, height;   //Specifies the width and height of the rectangle 
	
	// Specifies location and size, defaults color. 
	
	public Rectangle (int x, int y, int width, int height) 
	//PRE: init<x, y, width, height> 
	//POS: this.x <- x, etc. 
	//TAS: Create a rectangle object at x, y with width and height specified 
	{ 
		super(); 
		this.x = x; 
		this.y = y; 
		this.width = width; 
		this.height = height;
		
	} // constructor Rectangle 
	
	public Rectangle ( Color color, int x, int y, int width, int height) 
	// PRE: init<color, x, y, width, height> 
	// POS: this.x <- x, etc. 
	// TAS: Specifies location, size, and color for this rectangle 
	{ 
		super(color);
		this.x = x;
		this.y = y;
		this.width = width; 
		this.height = height;
		
	} // constructor Rectangle 
	
	// Draws the rectangle. 
	public void draw (Graphics page)
	// PRE: init<page> 
	// POS: none 
	// TAS: Draw the rectangle 
	{ 
		page.setColor (color); 
		page.drawRect (x, y, width, height);
		
	} // method draw 

} // class Rectangle 
