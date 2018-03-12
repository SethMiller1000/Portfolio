/** GameBoard class
 *  Program 5- CIS 1144
 *  Seth Miller
 */

package program5;

public class GameBoard
{
	///// FIELDS /////
	
	private char [] [] board = new char [3] [3];  // A tic-tac-toe board
	private int plays = 0; // The number of valid plays
	
	///// METHODS /////
	
	public GameBoard()
	// Default constructor to initialize the board
	{
		plays = 0;
		
		// Double nested for loop to set all char elements to blank space
		for ( int i = 0; i < board.length ; i++ )
		{
			for ( int j = 0; j < board[i].length; j++ )
			{
				board[i][j] = ' ';
				
			} // end of inner for loop
			
		} // end of outer for loop
		
		
	} // end of default GameBoard constructor
	
	
	public boolean play( boolean x, int row, int column )
	// Simulates a single move on the board. If x is true, then X is playing.
	// O is playing otherwise. Row and column represent which cell on the board
	// the character is being played into. If the play is valid--that is, on the
	// board and not occupied--then the method should update the board and
	// return true. Otherwise, the board should not be updated and the method
	// should return false.
	{
		if ( x ) // user's turn ( user is 'X')
		{
			if ( (row <= 2) && (row >= 0) && (column <= 2) && (column >= 0) && (board[row][column] == ' ') ) // Location exists on board and is not taken
			{
				board[row][column] = 'X'; // fill location
				plays++ ;
				return true; // computer play is valid
						
			}// end of if location exists on board and is not taken
					
			else
				return false;
			
		} // end of if x == true
		
		else // computer's turn ( computer is 'O' )
		{
			if ( (row <= 2) && (row >= 0) && (column <= 2) && (column >= 0) && (board[row][column] == ' ') )
			{
				board[row][column] = 'O'; // fill location
				plays++ ;
				return true; // computer play is valid
				
			} // end of if block testing row and column input
			
			else
				return false; // computer play is invalid
			
		} // end of else block ( x == false )
		
	} // end of boolean method play
	
	public int validPlayCount()
	{
		return plays;
		
	} // end of int method validPlayCount
	
	public char checkWin()
	// This method should return 'X' if x has won, 'O' if o has won, 'T' if the
	// game is a tie and anything else to represent the game is still in progress
	{
		for ( int x = 0; x < board.length; x++ )
		{
			if ( board[x][0] == 'X' && board[x][1] == 'X' && board[x][2] == 'X' ) // entire row is 'X's
				return 'X'; // user, X, has won
				
			else if ( board[x][0] == 'O' && board[x][1] == 'O' && board[x][2] == 'O' ) // entire row is 'O's
				return 'O'; // computer, O, has won
				
		} // end of for x < board.length loop
			
		for ( int y = 0; y < 3; y++ )
		{
			if ( board[0][y] == 'X' && board[1][y] == 'X' && board[2][y] == 'X' ) // entire column is 'X's
				return 'X'; // user, X, has won
				
			else if ( board[0][y] == 'O' && board[1][y] == 'O' && board[2][y] == 'O' ) // entire column is 'O's
				return 'O'; // computer, O, has won
					
		} // end of for y < 3 loop
			
		if ( board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ) // 'X's from top left to bottom right
			return 'X'; // user, X, has won
			
		else if ( board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X' ) // 'X's from top right to bottom left
			return 'X'; // user, X, has won
			
		else if ( board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ) // 'O's from top left to bottom right
			return 'O'; // computer, O, has won
			
		else if ( board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O' ) // 'O's from top right to bottom left
			return 'O'; // computer, O, has won
		
			if ( plays == 9 )
				return 'T'; // Board is filled up and nobody won; game is a tie
			else
				return 'U'; // Board is not filled up; game is unfinished
					
		 // end else
		
	} //  end of char method checkWin
	
	public void showBoard()
	// Display the current board in the console using character graphics
	{	
		System.out.println( );
		System.out.println( " " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " " );
		System.out.println( "---+---+---" );
		System.out.println( " " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " " );
		System.out.println( "---+---+---" );
		System.out.println( " " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " " );
		System.out.println( );
		
	} // end of void method showBoard
	
} // end of class GameBoard
