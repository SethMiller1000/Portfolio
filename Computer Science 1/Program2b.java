//////////////////////////////////////////////////////////////////////////
//	Name: Seth Miller								                    //
//	Program:  2b									                    //
//	Desc: This program accepts an integer and	                        //
// 		  displays the image corresponding to that number.			    //
//	Test cases:	If the user inputs “LargestPark” then LargestPark.jpg   //
//         will be displayed. If the user inputs "OldScienceBuilding",  //
//         then OldScienceBuilding.jpg will be displayed. If user inputs//
//         "Statue", then Statue.jpg will be displayed. If user inputs  //
//         "EmployerHQ", then EmployerHQ.jpg will be displayed.         //
//////////////////////////////////////////////////////////////////////////

package program2CS1;

import java.awt.Dimension;	// So we can use Dimension objects
import javax.swing.*;		// JFrames, JScrollPanes, JLabels & ImageIcons

public class Program2b 
{

	public static void main(String[] args) 
	{
		/////////  DECLARATIONS AND COMPONENTS   ///////
		String picNumber;	// picNumber is the number corresponding to the picture
		ImageIcon image; 	// The picture we will display
		JLabel imageLabel;  // The picture will be contained by a label
		JScrollPane sp; 	// The scrolling pane will contain the label
					        // that holds the picture
		JFrame frame; 	    // The frame for holding everything
		

		////////          ALGORITHM              /////// 

		//STEP 1: Prompt for and get the picture name 
		picNumber = JOptionPane.showInputDialog
		("What do you want to see?\nBolivar's largest park? Then enter: 1."
	    + "\nWhere chemistry was taught at SBU in 1980? Then enter: 2."
	    + "\nA statue dedicated by President Harry S. Truman? Then enter: 3."
	    + "\nThe Bolivar HQ of the largest employer of SBU CIS Graduates? Then enter: 4.");
		
		//initializes image variable
		
		//STEP 2: Display the right picture
		if (picNumber.equals("1"))
			image = new ImageIcon ("LargestPark.jpg");
		else if (picNumber.equals("2"))
			image = new ImageIcon ("OldScienceBuilding.jpg");
		else if (picNumber.equals("3"))
			image = new ImageIcon ("Statue.jpg");
		else if (picNumber.equals("4"))
			image = new ImageIcon ("EmployerHQ.jpg");
		else
			image = new ImageIcon ("Nothing.jpg");

		//STEP 3: Set up the Frame
		frame = new JFrame ("Building Picture");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		

		//STEP 4: Get the image and put it into the scroll-able pane
		imageLabel = new JLabel (image);
		sp = new JScrollPane (imageLabel);
		sp.setPreferredSize(new Dimension (1030,770));
		

		//STEP 5: Put the pane on the frame and make it all visible
		frame.getContentPane().add(sp);
		frame.pack();
		frame.setVisible(true);

	}//main
}//ProgrammingAssignment2b
