package competitiveProgramming;

import java.util.Scanner;

public class GnomeSequencing
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		int lines = scan.nextInt();
		
		System.out.println( "Gnomes:" );
		
		for ( int i = 0; i < lines; i++ )
		{
			int gnome1 = scan.nextInt();
			int gnome2 = scan.nextInt();
			int gnome3 = scan.nextInt();
			
			if ( ( gnome1 >= gnome2 ) && ( gnome2 >= gnome3 ) )
			{
				System.out.println("Ordered");
				
			}// end of if gnome1 >= gnome2 >= gnome3
			
			else if ( ( gnome3 >= gnome2 ) && ( gnome2 >= gnome1 ) )
			{
				System.out.println("Ordered");
				
			}// end of if gnome3 >= gnome2 >= gnome1
			
			else
				System.out.println("Unordered");
			
		}// end of for i < lines
		
		scan.close();
		
	}// end of main
	
}// end of GnomeSequencing