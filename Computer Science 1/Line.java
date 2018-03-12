package shapes;

import java.awt.*; 

public class Line extends Shape 
{ 
  // Represents a line of specific size & color, drawn at a 
  // particular position. 

  protected int x1, y1, x2, y2;  // Starting && ending points 
  
  public Line (int x1, int y1, int x2, int y2) 
  //PRE: init<x1, y1, x2, y2> 
  //POS: this.x1 <- x1, etc. 
  //TAS: Specifies starting and ending points, defaults color 
  { 
    super(); 
    this.x1 = x1; 
    this.y1 = y1; 
    this.x2 = x2; 
    this.y2 = y2; 
    
  } // constructor Line 

  public Line (Color color,  int x1, int y1, int x2, int y2) 
  // PRE: init<color, x1, y1, x2, y2> 
  // POS: this.x1 <- x1, etc. 
  // TAS: Specifies starting and ending points, and color. 
  { 
    super(color); 
    this.x1 = x1; 
    this.y1 = y1; 
    this.x2 = x2; 
    this.y2 = y2; 
    
  } // constructor Line 

  public void draw (Graphics page) 
  // PRE: init<page> 
  // POS: none 
  // TAS: Draws the line. 
  { 
    page.setColor (color); 
    page.drawLine (x1, y1, x2, y2); 
    
  } // method draw 
} // class Line 