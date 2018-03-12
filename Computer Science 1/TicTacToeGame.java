/** TicTacToeGame class
 *  Program 5- CIS 1144
 *  Seth Miller
 */

package program5;

// Import scanner and random
import javax.swing.JOptionPane;
import java.util.Random;

// For help with Random, writing classes, and the assignment,
// see Java Illuminated pages 125, 377, 643

public class TicTacToeGame
{
	public static void main( String[] args )
	{
		// Explain purpose of program to user
		JOptionPane.showMessageDialog( null, "Hello, and welcome to Tic-Tac-Toe: The Computer Game!\nYou are X; to play, select where you will place each X." );
		
		// Ask user for row and column number and initialize row and column numbers
		String row = "";
		int rowNum = 10;
		String column = "";
		int columnNum = 10; 	
		
		// Initialize tic-tac-toe board and random number generator
		GameBoard tictactoe = new GameBoard();
		Random randNum = new Random();
		
		// Display tic-tac-toe board
		tictactoe.showBoard();
		System.out.println( "=========================" );
		
		while ( tictactoe.checkWin() == 'U' && tictactoe.validPlayCount() < 9) // game is unfinished
		{
			// Ask user for row and column number and initialize row and column numbers
			row = JOptionPane.showInputDialog( "Enter a number from 0 to 2 for the row:\n0 is top\n1 is middle\n2 is bottom" );
			column = JOptionPane.showInputDialog( "Enter a number from 0 to 2 for the column:\n0 is left\n1 is middle\n2 is right" ); 	
			
			// Convert row and column input into integers
			rowNum = Integer.parseInt(row);
			columnNum = Integer.parseInt(column);
			
			while ( !(tictactoe.play(true, rowNum, columnNum)) ) // Board location does not exist or is already filled
			{
				// Display error
				JOptionPane.showMessageDialog( null, "Error: invalid board location!" );
				
				// Ask user for location again
				row = JOptionPane.showInputDialog( "Enter a number from 0 to 2 for the row:\n0 is top\n1 is middle\n2 is bottom" );
				column = JOptionPane.showInputDialog( "Enter a number from 0 to 2 for the column:\n0 is left\n1 is middle\n2 is right" );
				
				// Convert row and column input into integers
				rowNum = Integer.parseInt(row);
				columnNum = Integer.parseInt(column);
				
			} // end of while tictactoe.play(user play) == false
			
			tictactoe.play(true, rowNum, columnNum );
			
			// Display tic-tac-toe board
			tictactoe.showBoard();
			System.out.println( "=========================" );
			
			if ( tictactoe.validPlayCount() < 9 && tictactoe.checkWin() == 'U' ) // game is not finished
			{
				// Process computer's turn
				rowNum = randNum.nextInt(3);
				columnNum = randNum.nextInt(3);
			
				while ( !(tictactoe.play( false, rowNum, columnNum )) ) // Board location does not exist, location is taken, or game is over
				{
					rowNum = randNum.nextInt(3);
					columnNum = randNum.nextInt(3);
				
				} // end of while board location does not exist or is taken
			
				tictactoe.play( false, rowNum, columnNum );
			
				// Display tic-tac-toe board
				tictactoe.showBoard();
				System.out.println( "=========================" );
				
			}// end of if validPlayCount < 9
			
		} // end of while validPlayCount < 9

		// Game is finished; calculate and display result of game		
		if ( tictactoe.checkWin() == 'X' ) // user won
			JOptionPane.showMessageDialog( null, "Congratulations; You, player X, win!" );
		
		else if ( tictactoe.checkWin() == 'O' ) // computer won
			JOptionPane.showMessageDialog( null, "Sorry, the computer, player O, won. Better luck next time!" );
		
		else if ( tictactoe.checkWin() == 'T' ) // nobody won
			JOptionPane.showMessageDialog( null, "The game ended in a tie." );
		
	} // end of main

} // end of TicTacToeGame
