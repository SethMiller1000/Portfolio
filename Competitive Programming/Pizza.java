// Seth Miller, Michael Buxbaum, and Nathan Hooper- Competitive Programming
// Pizza- Problem ID:
// Date Created: 03/05/2018 (mm/dd/yyyy)

package competitiveProgramming;

import java.util.Scanner;

public class Pizza
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int order = 0;
		
		while(scan.hasNext())
		{
			order++;
			
			int pizzaCount = scan.nextInt();
			if(pizzaCount == 0)
				break;
			
			int cheapestDiameter = 0;
			double cpi = Double.MAX_VALUE;
			
			for(int i = 0; i < pizzaCount; i++)
			{
				int dia = scan.nextInt();
				double price = scan.nextInt();
				double newCPI = price/(((dia/2.0)*(dia/2.0))*Math.PI);
				if ( newCPI < cpi )
				{
					cheapestDiameter = dia;
					cpi = newCPI;
					
				}// end of if newCPI < cpi
				
			}// end of for i < pizzaCount
			
			System.out.println("Menu " + order + ": "+cheapestDiameter);
			
		}// end of while scan.hasNext()
		
		scan.close();

	}// end of main

}// end of Pizza
