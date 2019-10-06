// Andrew Smith (writer), Seth Miller, & Michael Buxbaum
// SBU Competitive Programming - 03/26/2018 (mm/dd/yyyy)
// Queen Collisions - Problem ID #: 4922
package competitiveProgramming;

import java.util.*;
public class QueenCollisions 
{
	public static void main ( String [] args )
	{
		Scanner s = new Scanner(System.in);
		
		int qcount = 0;
		
		while(true)
		{
			int num=s.nextInt();
			
			if( num == 0 )
				break;
			
			int boardSize = num;
				int g = Integer.parseInt( s.next() );
				
				char [][] board = new char [boardSize][boardSize];
				
				for ( int i = 0; i < boardSize; i++ )
				{
					for ( int j = 0; j < boardSize; j++ )
					{
						board[i][j] = 'O';
						
					}// end of for ( int j = 0; j < boardSize; j++ )
					
				}// end of for ( int i = 0; i < boardSize; i++ )
				int cnt = 0;
				
				while( cnt < g )
				{
					int k = s.nextInt();
					int x = s.nextInt();
					int y = s.nextInt();
					int ss = s.nextInt();
					int t = s.nextInt();
					
					for ( int i = 0; i < k; i++ )
						board[x+(i*ss)-1][y+(i*t)-1]='X';
					
					cnt++;
					
				}// end of while ( cnt < g )
				
				for ( int i = 0; i < boardSize; i++ )
				{
					for ( int j = 0; j < boardSize; j++ )
					{
						if ( board[i][j] == 'X' )
						{
							System.out.println( "Found queen: (" + i + "," + j + ")" );
							
							for ( int d = 0; j < boardSize; j++ )
							{
								if ( board[i][d] == 'X' )
								{
									qcount++;
									
								}// end of if ( board[i][d] == 'X' )
								
							}// end of for ( int d = 0; j < boardSize; j++ )
							
							for ( int d = 0; j < boardSize; j++ )
							{
								if ( board[d][j] == 'X' )
								{
									qcount++;
									
								}// end of if ( board[d][j] == 'X' )
								
							}// end of for ( int d = 0; j < boardSize; j++ )
							int j1 = j;
							int i1 = i;
							
							while ( j1 > 0 && i1 > 0 )
							{
								System.out.println( "Checking (" + i1 + "," + j1 + ")" );
								
								if ( j1 == 0 && i1 != 0 )
									i1--;
								else if ( i1 == 0 && j1 != 0 )
									j1--;
								else
								{
									i1--;
									j1--;
									
								}// end of else
								
								if ( board[i1][j1] == 'X' )
								{
									qcount++;
									
								}// end of if ( board[i1][j1] == 'X' )
								
							}// end of while ( j1 > 0 && i1 > 0 )
							
							j1 = j;
							i1 = i;
							
							while ( j1 < boardSize-1 && i1 < boardSize-1 )
							{
								System.out.println( "Checking (" + i1 + "," + j1 + ")" );
								if ( j1 == boardSize && i1 != boardSize )
									i1++;
								else if (i1 == boardSize && j1 != boardSize)
									j1++;
								else
								{
									i1++;
									j1++;
									
								}// end of else
								
								if ( board[i1][j1] == 'X' )
								{
									qcount++;
									
								}// end of if ( board[i1][j1] == 'X' )
								
							}// end of while ( j1 < boardSize-1 && i1 < boardSize-1 )
							
							j1 = j;
							i1 = i;
							
							while ( i1 > 0 && j1 < boardSize-1 )
							{
								System.out.println( "Checking (" + i1 + "," + j1 + ")" );
								if ( j1 == boardSize && i1 != 0 )
									i1--;
								else if ( i1 == 0 && j1 != boardSize )
									j1++;
								else
								{
									i1--;
									j1++;
									
								}// end of else
								
								if ( board[i1][j1] == 'X' )
								{
									qcount++;
									
								}// end of if ( board[i1][j1] == 'X' )
								
							}// end of while ( i1 > 0 && j1 < boardSize-1 )
							
							j1 = j;
							i1 = i;
							
							while ( j1 > 0 && i1 < boardSize-1 )
							{
								System.out.println( "Checking (" + i1 + "," + j1 + ")" );
								if ( j1 == 0 && i1 != boardSize )
									i1++;
								else if ( i1 == boardSize && j1 != 0 )
									j1--;
								else
								{
									i1++;
									j1--;
									
								}// end of else
								
								if ( board[i1][j1] == 'X' )
								{
									qcount++;
									
								}// end of if ( board[i1][j1] == 'X' )
								
							}// end of while ( j1 > 0 && i1 < boardSize-1 )
							
						}// end of if ( board[i][j] == 'X' )
						
					}// end of for ( int j = 0; j < boardSize; j++ )
					
				}// end of for ( int i = 0; i < boardSize; i++ )
				
				num = s.nextInt();
				System.out.println(qcount/2);
				qcount = 0;
				
			}// end of while ( !hi.equals("0") )
		
		s.close();
		
	}// end of main
	
}// end of QueenCollisions
