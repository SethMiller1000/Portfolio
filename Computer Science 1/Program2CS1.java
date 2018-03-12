package program2CS1;

//////////////////////////////////////////////////////////////////////////
// Name: Seth Miller								                    //
// Program: 2b									                        //
// Description: This program accepts the name of a jpeg image and	    //
// displays the image.						                            //
// Test cases:	If the user inputs “Taylor” then taylor.jpg will be	    //
// displayed.  Otherwise, “admin.jpg” will			                    //
// be displayed.  							                            //
//////////////////////////////////////////////////////////////////////////

import java.awt.Dimension;	// So we can use Dimension objects
import javax.swing.*;		// JFrames, JScrollPanes, JLabels & ImageIcons

public class Program2CS1 
{

public static void main(String[] args) 
{
/////////  DECLARATIONS AND COMPONENTS   ///////
String picName;	// picName is the name of the picture
ImageIcon image; 	// The picture we will display
JLabel imageLabel;// The picture will be contained by a label
JScrollPane sp; 	// The scrolling pane will contain the label
// that holds the picture
JFrame frame; 	// The frame for holding everything


////////   ALGORITHM    /////// 

//STEP 1: Prompt for and get the picture name 
picName = JOptionPane.showInputDialog
("What building do you want to see?\nTaylor or Admin");

//STEP 2: Display the right picture
if (picName.equalsIgnoreCase ("Taylor"))
image = new ImageIcon ("taylor.jpg");
else 
image = new ImageIcon ("admin.jpg");		

//STEP 3: Set up the Frame
frame = new JFrame ("Building Picture");
frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);


//STEP 4: Get the image and put it into the scrollable pane
imageLabel = new JLabel (image);
sp = new JScrollPane (imageLabel);
sp.setPreferredSize(new Dimension (100,100));


//STEP 5: Put the pane on the frame and make it all visible
frame.getContentPane().add(sp);
frame.pack();
frame.setVisible(true);

	}
}