package sbuSilver;

import java.util.Scanner;

public class NineKnights 
{

	public static void main(String[] args) 
	{
		//variable init
		Scanner scan = new Scanner(System.in);
		int kCount = 0;
		boolean solution = true;
		String [] rows = new String [5];
		char [] [] board = new char [5] [5];
		char a = ' ';
		char b = ' ';
		char c1 = ' ';
		char d = ' ';
		char e = ' ';
		char f = ' ';
		char g = ' ';
		char h = ' ';
		
		
		//building the array
		for(int r = 0; r<5; r++)
		{
			rows[r] = scan.nextLine();
		}
		
		for(int r = 0; r<5; r++)
		{
			for( int c = 0; c<5; c++)
			{
				board[r][c]=rows[r].charAt(c);
			}
		}
		
		//the math
		for(int r = 0; r<5; r++)
		{
			for(int c = 0; c<5; c++)
			{
				if(board[r][c] == 'k')
				{
					kCount++;
					//ab
					if((r-2 < 4)&&(r-2>0))
					{
						if((c-1 < 4)&&(c-1 > 0))
							a = board [r-2][c-1];
						if((c+1 < 4)&&(c+1 > 0))
							b = board [r-2][c+1];
					}
					//c1 h
					if((r-1 < 4)&&(r-1>0))
					{
						if((c+2 < 4)&&(c+2 > 0))
							c1 = board [r-1][c+2];
						if((c-2 < 4)&&(c-2 > 0))
							h = board [r-1][c-2];
					}
					//dg
					if((r+1 < 4)&&(r+1 > 0))
					{
						if((c+2 < 4)&&(c+2 > 0))
							d = board [r+1][c+2];
						if((c-2 < 4)&&(c-2 > 0))
							g = board [r+1][c-2];
					}
					//ef
					if((r+2 < 4)&&(r+2>0))
					{
						if((c+1 < 4)&&(c+1 > 0))
							e = board [r+2][c+1];
						if((c-1 < 4)&&(c-1 > 0))
							f = board [r+2][c-1];
					}
					
					if((a=='k')||(b=='k')||(c1=='k')||(d=='k')||(e=='k')||(f=='k')||(g=='k')||(h=='k'))
					{
						solution = false;
					}
				
				}//if k found
			}//c loop
		}//r loop
		if((kCount<9)||(kCount>9))
		{
			solution = false;
		}
		
		if(solution == true)
			System.out.println("valid");
		else
			System.out.println("invalid");
	}//main

}//class
