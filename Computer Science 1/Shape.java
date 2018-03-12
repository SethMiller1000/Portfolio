package shapes;

import java.awt.*; 

public class Shape
{ 
	// Represents a generic shape, having a specific color. 
	protected Color color; 

	public Shape () 
	// PRE: None 
	// POS: None 
	// TAS: Creates a shape object with a default color of black. 
	{ 
		this.color = Color.black;
		
	} // END Shape constructor 

	public Shape (Color color) 
	// PRE: init<color> 
	// POS: this.color <- color 
	// TAS: Creates a Shape object with specified color. 
	{ 
		this.color = color; 
		
	} // END parameterized Shape constructor 

	public void draw (Graphics page) 
	// PRE: init<page> 
	// POS: none 
	// TAS: Draws the shape. 
	{ 
		
	} // method draw 

} // class Shape 