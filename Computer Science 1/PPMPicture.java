///////////////////////////////////////////////////////////////////////////////
// Author:       Seth Miller                                                 //
// Program:      4b                                                          //
// Description:  The Picture class encapsulates a PPM picture, and makes     //
//               changes to it by changing the red, green, and blue values   //
//               of each pixel. The first method makes a gray-scale of the   //
//               image, the second method makes a negative of the gray-scale //
//               , and the third method makes a digital piece of art         //
///////////////////////////////////////////////////////////////////////////////

package program4;

// import scanner and java.io
import java.util.Scanner;
import java.io.*;

public class PPMPicture
{
	// Initialize variables (DATA MEMBERS)
	private int [] pixels;
	private String firstLine;
	private String secondLine;
	private String thirdLine;
	private String fourthLine;
	private int x, y;
	
	/// CONSTRUCTOR ///
	public PPMPicture( String fileName )
	//TASK: Read the PPM file into the array named pixels
    //PREcondition : fileName is the name of a PPM file
    //POSTcondition : pixels contains the RGB values for the fileName
	
	{
		int size; //size of the array
        try
        {
            //Create a scanner to read from the ppm file
            File inputFile = new File ( "Senior_Picture.ppm" );
            Scanner picScanner = new Scanner (inputFile);
   
            if (picScanner.hasNext())//read the size of the array
            {
                firstLine = picScanner.nextLine(); //Read in the P3
                secondLine = picScanner.nextLine();// Read in the comment
                x = picScanner.nextInt();
                y = picScanner.nextInt();
                picScanner.nextLine();
                fourthLine = picScanner.nextLine();
                pixels = new int [x*y*3];           //width X height X 3 (RGB)
            }
            else //The file is empty
            {
                System.err.println("The file could not be found");
                return;
            }//else
   
            int location = 0;
            while (picScanner.hasNext())
            {
                pixels [location] = picScanner.nextInt();
                location++;
            }//while
        }//try
        catch (IOException e)
        {
            System.out.println (e.getStackTrace());
        }//catch

	}// end of PPMPicture
	
	public void save( String saveFileName )
	//TASK: This method will save the file as <saveFileName>.ppm
    //PRECondition: saveFileName must be in the form XYZ.ppm
    //POSTCondition: none
	{
		try
        {
            FileWriter fw = new FileWriter(saveFileName);
            BufferedWriter bw = new BufferedWriter(fw);
           
            bw.write(firstLine); //Write the P3
            bw.newLine();
            bw.write(secondLine); //comment
            bw.newLine();
            bw.write (new Integer(x).toString()); //x
            bw.write (" ");
            bw.write (new Integer(y).toString()); //y
            bw.newLine();
            bw.write(fourthLine); //255
            bw.newLine();
           
            for (int i = 0; i < pixels.length; i++)
            {
                bw.write(new Integer(pixels[i]).toString());
                bw.newLine();
            }//for
            bw.close();
           
        }//try
        catch (IOException ioe)
        {
            ioe.printStackTrace();  
        }//catch
	}// end of save
	
	public void setToGrayScale( )
	//TASK: This method changes the file to BW by averaging the RGB values
    //PREcondition:  pixels array contains the RGB values for a PPM file
    //POSTcondition: pixels array contains a grayScale version of the PPM file
	{
		// setToGrayScale for loop
		for ( int i = 0; i < pixels.length - 4; i += 3 ) 
		{
			int average = (pixels[i] + pixels[i + 1] + pixels[i + 2]) / 3;
			pixels[i] = average;
			pixels[i + 1] = average;
			pixels[i + 2] = average;
			
		}// end of setToGrayScale for loop
		
	}// end of setToGrayScale
	
	public void setToNegative( )
	//TASK: This method takes a gray scale image and produces a negative
    //PRECondition: pixels array contains a grayscale image of a PPM file
    //POSCondition: pixels contains a negative of the grayscale image
	{
		// setToGrayScale for loop
		for ( int i = 0; i < pixels.length - 4; i += 3 ) 
		{
			int average = (pixels[i] + pixels[i + 1] + pixels[i + 2]) / 3;
			pixels[i] = average;
			pixels[i + 1] = average;
			pixels[i + 2] = average;
			
		}// end of setToGrayScale for loop
		
		// setToNegative for loop
		for ( int i = 0; i < pixels.length - 4; i+= 3 ) 
		{
			pixels[i] = pixels[i] - 255;
			pixels[i + 1] = pixels[i + 1] - 255;
			pixels[i + 2] = pixels[i + 2] - 255;
			
		}// end of setToNegative for loop
		
	}// end of setToNegative
	
	public void myArtwork( )
	//TASK: This method modifies the pixel array such that it contains digital art
    //PRECondition: pixels array contains a gray-scale image of a PPM file
    //POSCondition: pixels array contains a modified, artistic image
	{
		// myArtwork for loop
		for ( int i = 0; i < pixels.length - 4; i+= 3 )
		{			
			// Decrease red value by 20, green value by 30, and blue value by 10
			pixels[i] -= 20;
			pixels[i + 1] -= 30;
			pixels[i + 2] -= 10;
			
		}// end of myArtwork for loop
		
	}// end of myArtWork
	
}// end of PPMPicture class
