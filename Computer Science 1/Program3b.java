////////////////////////////////////////////////////////////////////////////////
//	Name: Seth Miller								                          //
//	Program: 3b									                              //
//	Desc: This program displays a series of jpeg images in a	              //
// 		  frame.								                              //
//	Test cases:	Four pictures named 1.jpeg, 2.jpeg, 3.jpeg, and 4.jpeg, etc.  //
//	Assumptions:The pictures are all stored in top level of the 	          //
//			of the project folder						                      //
////////////////////////////////////////////////////////////////////////////////
package program3;

import java.awt.Dimension;	// So we can use Dimension objects
import javax.swing.*;		// JFrames, JScrollPanes, JLabels & ImageIcons
public class Program3b 
{
	public static void main(String[] args) 
	{
		////////  DECLARATIONS AND COMPONENTS   ///////
		
		String slideshowDirection;
		JFrame frame; 	        // The frame for holding everything
		ImageIcon image; 	    // The picture we will display
		JLabel imageLabel;      // The picture label
		JScrollPane sp; 	    // The scrolling pane will contain the label
					            // that holds the picture
		Integer Objecti = null; // An integer object

		// Ask user which direction they want to see the slide show in
		slideshowDirection = JOptionPane.showInputDialog("Do you want to see the slideshow forwards or in reverse? Or, enter stop to quit: ");
		
		////////          ALGORITHM              ///////
		
		while (! slideshowDirection.equals( "stop" ) )
			{ 
		
			// if statement that runs slide show regularly when the user enters forward
			if (slideshowDirection.equalsIgnoreCase ("forwards") ) 
			{
				// Twenty pictures, so write a loop that executes 20 times
				for (int i = 1; i < 17; i++)
				{
					// Step 1: Create an Integer object from int i
					Objecti = new Integer(i);
	
					// Step 2: image is created as “1.jpg” “2.jpg” and so on
					image = new ImageIcon (Objecti.toString()+".jpg");
			
					// Step 3: Set up the Frame
					frame = new JFrame ("Building Picture");
					frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
					
					// Step 4: Show the picture
					imageLabel = new JLabel (image);
					sp = new JScrollPane (imageLabel);
					sp.setPreferredSize(new Dimension (1100,600));
					frame.getContentPane().add(sp);
					frame.pack();
					frame.setVisible(true);
					
					// Step 5: Pause long enough to view the picture
					for (long j = 0; j < 1000000000; j++);
					
				}// end of for loop
				
			}// end of while for forward slide show
			
			// While loop that displays the slide show in reverse when user enters reverse
			else if (slideshowDirection.equalsIgnoreCase ("reverse") ) 
			{
				// Twenty pictures, so write a loop that executes twenty times
				for (int i = 16; i > 0; i--)
				{
					// Step 1: Create an Integer object from int i
					Objecti = new Integer(i);
	
					// Step 2: image is created as “1.jpg” “2.jpg” and so on
					image = new ImageIcon (Objecti.toString()+".jpg");
			
					// Step 3: Set up the Frame
					frame = new JFrame ("Building Picture");
					frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
					
					// Step 4: Show the picture
					imageLabel = new JLabel (image);
					sp = new JScrollPane (imageLabel);
					sp.setPreferredSize(new Dimension (1100,600));
					frame.getContentPane().add(sp);
					frame.pack();
					frame.setVisible(true);
					
					// Step 5: Pause long enough to view the picture
					for (long j = 0; j < 1000000000; j++);
					
				}// end of for loop for reverse slide show
				
			}// end of if statement for reverse slide show
			
			slideshowDirection = JOptionPane.showInputDialog("Enter forwards or reverse to watch the slideshow in that direction, or enter stop to quit:");
			}
		}// end of main
}// end of Program 3b