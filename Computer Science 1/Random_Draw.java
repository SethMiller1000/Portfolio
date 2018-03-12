package shapes;

import javax.swing.JApplet; 
import java.awt.*; 
import java.util.Random; 

//================================================================== 
//  This applet creates and draws multiple random shapes. 
//================================================================== 

public class Random_Draw extends JApplet 
{ 
   final int MAX_SHAPE = 50; 
   Shape[] shapes; //The array is named shapes 
   Shape_Creator creator; 

   public void init() 
   //PRE: none 
   //POS: Initialize the shape array 
   //TAS: Creates and stores multiple shapes in an array of 
   //     shapes.  These references are potentially polymorphic 
   { 
      shapes = new Shape[MAX_SHAPE]; 
      creator = new Shape_Creator(); 
      for (int index = 0; index < MAX_SHAPE; index++) 
      { 
         shapes[index] = creator.new_shape(); 
      } 
      
   } // method init 

   //------------------------------------------------------ 
   //   
   //------------------------------------------------------ 
   public void paint (Graphics page) 
   //PRE: init<page> 
   //POS: none 
   //TAS: Draws all of the shapes on the applet 
   { 
      for (int index = 0; index < MAX_SHAPE; index++) 
      { 
         shapes[index].draw (page); 
         
      } // end for index < MAX_SHAPE
      
   } // method paint 

} // class Random_Draw 
  
  

class Shape_Creator 
{ 
   //================================================================== 
   //  The Shape_Creator class contains code to create random shapes, 
   //  each with random size, color, and location. 
   //================================================================== 

   final int COLOR_MAX = 255; 
   final int DIMENSION_MAX = 400; 
   final int NUM_SHAPES = 3; 
   final int LINE = 1; 
   final int RECTANGLE = 2;
   final int SQUARE = 3;
   
   Random rand = new Random(); 

   public int random_int (int max) 
   //PRE: init<max> 
   //POS: Returns a random integer between 1 and max 
   //TAS: 
   { 
      return Math.abs(rand.nextInt()) % max + 1; 
      
   } // method random_int 

   public Color random_color() 
   //PRE: none 
   //POS: none 
   //TAS: Returns a random color created using random RGB values 
   { 
      return new Color (random_int (COLOR_MAX), 
                        random_int (COLOR_MAX), 
                        random_int (COLOR_MAX)); 
	   
   } // method random_color 

   public Shape new_shape() 
   //PRE: none 
   //POS: none 
   //TAS: Returns a random shape with random characteristics 
   { 
      Shape result; 
      int x1, y1, x2, y2, x, y, width, height; 

      switch (random_int(NUM_SHAPES)) 
      { 
         case LINE:
            x1 = random_int (DIMENSION_MAX); 
            y1 = random_int (DIMENSION_MAX); 
            x2 = random_int (DIMENSION_MAX); 
            y2 = random_int (DIMENSION_MAX); 
            result = new Line (random_color(), x1, y1, x2, y2); 
            break; 

         case RECTANGLE: 
            x = random_int (DIMENSION_MAX); 
            y = random_int (DIMENSION_MAX); 
            width = random_int (DIMENSION_MAX); 
            height = random_int (DIMENSION_MAX); 
            result = new Rectangle (random_color(), x, y, width, height); 
            break;
            
         case SQUARE:
        	 x = random_int (DIMENSION_MAX); 
             y = random_int (DIMENSION_MAX); 
             width = random_int (DIMENSION_MAX);  
             result = new Square (random_color(), x, y, width); 
             break;	 

         default: 
            result = new Shape(); 

      } //switch 

      return result;
      
   } // method new_shape 

} // class Shape_Creator 
