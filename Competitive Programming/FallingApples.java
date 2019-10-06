package sbuSilver;

import java.util.Scanner;

public class FallingApples
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		int R = scan.nextInt();
		int C = scan.nextInt();
		
		char [][] grid = new char [R][C];
		
		String [] rows = new String [R];
		
		for ( int i = 0; i < rows.length; i++ ) 
		{
			rows[i] = scan.next();
			
		}// end for loop i
		
		for ( int x = 0; x < R; x++ )
		{
			for ( int y = 0; y < C; y++ ) 
			{
				grid[x][y] = rows[x].charAt(y);
				
			}// end for loop y
			
		}// end for loop x
		
		for ( int X = 0; X < R; X++ ) 
		{
			for ( int Y = 0; Y < C; Y++ ) // Y = i
			{
				if (X < R - 1)
				{
					if( (grid[X][Y] == 'a') && (grid[X + 1][Y] == '.') ) 
					{
						grid[X][Y] = '.';
						grid[X + 1][Y] = 'a';
						
						// I need to write an if or else if statement that tests if a position
						// has 'a' and the one below it has 'a' and the one below that is a
						// and move the 'a's down by 1 each, and put the period on top
						
					}// end if grid x,y = a & grid x + 1,y = .
				
				}// end if X < R - 1
					
				if ( (X < R - 2) && (grid[X][Y] == 'a') && (grid[X + 1][Y] == 'a') && (grid[X + 2][Y] == '.') )
				{
					grid[X][Y] = '.';
					grid[X + 1][Y] = 'a';
					grid[X + 2][Y] = 'a';
					
				}// end if with long condition
				
			}// end for loop Y
			
		}// end for loop X
		
		for ( int x = 0; x < R; x++ )
		{
			System.out.println();
			
			for ( int y = 0; y < C; y++ ) 
			{
				System.out.print(grid[x][y]);
				
			}// end for loop y
			
		}// end for loop x
			
	}// end main

}// end FallingApples
