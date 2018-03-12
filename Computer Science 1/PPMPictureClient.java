///////////////////////////////////////////////////////////////////////////////
// Author:       Seth Miller                                                 //
// Program:      4b  (Client)                                                //
// Description:  This is a client of the PPMPicture class. It calls the      //
//               result picture of the PPMPicture class and displays it.     //
///////////////////////////////////////////////////////////////////////////////

package program4;

import javax.swing.JOptionPane;

public class PPMPictureClient
{
	public static void main( String[] args )
	{
		
		// Set picture to gray scale and save result as new picture
		PPMPicture myPicture = new PPMPicture( "Senior_Picture.ppm" );
		myPicture.setToGrayScale();	
		myPicture.save( "MyArtGrayScale.ppm" );
		
		// Set picture to negative picture and save result as new picture
		PPMPicture myPicture2 = new PPMPicture( "Senior_Picture.ppm" );
		myPicture2.setToNegative();
		myPicture2.save( "MyArtNegative.ppm" );
		
		// Set picture to MyArtwork and save result as new picture
		PPMPicture myPicture3 = new PPMPicture( "Senior_Picture.ppm" );
		myPicture3.myArtwork();
		myPicture3.save( "MyArtwork.ppm" );
		
	}// end of main

}// end of PPMPictureClient
