package bank;

public class SavingsAccountClient
{
	public static void main(String[] args)
	{
		// Instantiate three savings account objects, two with arguments, and one default one
		SavingsAccount sethsAccount = new SavingsAccount ( 1000.00, 0.05 );
		SavingsAccount calebsAccount = new SavingsAccount ( 250.00, 0.02 );
		SavingsAccount newAccount = new SavingsAccount ( );
		
		// Display each bank account's information as string
		System.out.println( );
		System.out.println( "Seth's Account: " );
		System.out.println( sethsAccount.toString() );
		
		System.out.println( );
		System.out.println( "Caleb's Account: " );
		System.out.println( calebsAccount.toString() );
		
		System.out.println( );
		System.out.println( "New Account: " );
		System.out.println( newAccount.toString() );
		

	}// end of main

}// end of SavingsAccountClient
