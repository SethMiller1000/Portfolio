/**	SavingsAccount class
*	Seth Miller
*	Lab 11- CIS 1144
*/

package bank;

import java.text.NumberFormat;

//1. ***** indicate that SavingsAccount inherits
//       from BankAccount
public class SavingsAccount extends BankAccount
{
	public final double DEFAULT_RATE = .03;
	// 2. ****** define the private interestRate instance variable
	// interestRate, a double, represents an annual rate
	private double interestRate;


	// 3 ***** write the default constructor
	/** default constructor
	 *   explicitly calls the BankAccount default constructor
	 *   set interestRate to default value DEFAULT_RATE
	 *   print a message to System.out indicating that
	 *    constructor is called
	 */
	public SavingsAccount()
	{
		super( );
		interestRate = DEFAULT_RATE;
		System.out.println("The constructor is called.");
		
	}// end of SavingsAccount constructor

	// 4 ***** write the overloaded constructor
	/** overloaded constructor
	 *   explicitly call BankAccount overloaded constructor
	 *   call setInterestRate method, passing startInterestRate
	 *   print a message to System.out indicating that
	 *    constructor is called
	 *  @param  startBalance      starting balance
	 *  @param  startInterestRate starting interest rate
	 */
	public SavingsAccount( double startBalance, double startInterestRate )
	{
		super( startBalance );
		setInterestRate( startInterestRate );
		
		System.out.println("The overloaded constructor is called.");
		
	}// end of SavingsAccount overloaded constructor

	// 5 ****** write this method:
	/** applyInterest method, no parameters, void return value
	 *  call deposit method, passing a month's worth of interest
	 *  remember that interestRate instance variable is annual rate
	 */
	public void applyInterest( )
	{
		double monthlyInterest = ( interestRate / 12 ) * getBalance() ;
		deposit( monthlyInterest );
		
	}// end of applyInterest method

	/** accessor method for interestRate
	 *  @return  interestRate
	 */
	public double getInterestRate( )
	{
		return interestRate;
		
	}// end of getInterestRate

	/** mutator method for interestRate
	 *  @param  newInterestRate new value for interestRate
	 *          newInterestRate must be >= 0.0
	 *            if not, print an error message
	 */
	public void setInterestRate( double newInterestRate )
	{
		if ( interestRate >= 0.0 )
			interestRate = newInterestRate;
		else
			System.err.println( "Interest rate cannot be negative" );
		
	}// end of setInterestRate

	// 6 *****  write this method
	/* toString method
	 *  @return String containing formatted balance and interestRate
	 *    invokes superclass toString to format balance
	 *    formats interestRate as percent using a NumberFormat object
	 *    To create a NumberFormat object for formatting percentages
	 *    use the getPercentInstance method in the NumberFormat class,
	 *    which has this API:
	 *       static NumberFormat getPercentInstance( )
	 */
	public String toString( )
	{
		// NumberFormat toPercentage = new NumberFormat getPercentInstance( interestRate );
		
		return super.toString() + "  Interest rate: " + (interestRate * 100) + "%";
		
	}// end of toString method
	
}// end of SavingsAccount Class