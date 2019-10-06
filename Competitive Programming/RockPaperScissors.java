package competitiveProgramming;

import java.util.Scanner;

public class RockPaperScissors
{
	public static void main( String [] args )
	{
		Scanner scan = new Scanner( System.in );
		
		String player1 = scan.next();
		String player2 = scan.next();
		
		while ( !(player1.equals("E")) && !(player2.equals("E")) )
		{
			int player1win = 0;
			int player2win = 0;
			
			for ( int i = 0; i < player1.length(); i++ )
			{
				if ( player1.charAt(i) == 'R' && player2.charAt(i) == 'S' )
				{
					player1win++;
					
				}// end of if player1 = R && player2 = S
				
				else if ( player1.charAt(i) == 'S' && player2.charAt(i) == 'P' )
				{
					player1win++;
					
				}// end of if player1 = S && player2 = P
				
				else if ( player1.charAt(i) == 'P' && player2.charAt(i) == 'R' )
				{
					player1win++;
					
				}// end of if player1 = P && player2 = R
				
				else if ( player2.charAt(i) == 'R' && player1.charAt(i) == 'S' )
				{
					player2win++;
					
				}// end of if player2 = R && player1 = S
				
				else if ( player2.charAt(i) == 'S' && player1.charAt(i) == 'P' )
				{
					player2win++;
					
				}// end of if player2 = S && player1 = P
				
				else if ( player2.charAt(i) == 'P' && player1.charAt(i) == 'R' )
				{
					player2win++;
					
				}// end of if player2 = P && player1 = R
				
			}// end of for i < player1.length() ( and therefore player2.length() )
			
			System.out.println("P1: " + player1win);
			System.out.println("P2: " + player2win);
			
			player1 = scan.next();
			player2 = scan.next();
				
		}// end of while player1 and player2 != "E"
		
		scan.close();
		
	}// end of main
	
}// end of RockPaperScissors