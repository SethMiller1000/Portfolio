package airport;
/* Airport class
   Seth Miller
*/

public class Airport
{
  /// 1. ***** Define the instance variables  *****
  
  //  airportCode is a String
  private String airportCode;
  
  //  gates is an integer
  private int gates;
  
  // countAirports is an integer
  private static int countAirports;
  
  // 2. ***** Write this method *****
  // Default constructor:
  // method name: Airport
  // return value:  none
  // parameters: none
  // function: sets the airportCode to an empty String
  public Airport( )
  {
	  airportCode = "";
	  countAirports++;
  }
  
  // 3. ***** Write this method *****
  // Overloaded constructor:
  // method name: Airport
  // return value: none
  // parameters:  a String startAirportCode and an int startGates
  // function:
  //      calls the setAirportCode method,
  //                   passing startAirportCode parameter;
  //      calls the setGates method, passing the startGates parameter
  public Airport( String startAirportCode, int startGates )
  {
	  airportCode = startAirportCode;
	  setGates( startGates );
	  countAirports++;
  }
  
  // 4. ***** Write this method *****
  // Accessor method for the airportCode instance variable
  // method name: getAirportCode
  // return value: String
  // parameters: none
  // function: returns airportCode
  public String getAirportCode( )
  {
	 return airportCode; 
  }
    
  // 5. ***** Write this method *****
  // Accessor method for the gates instance variable
  // method name: getGates
  // return value: int
  // parameters: none
  // function: returns gates
  public int getGates( )
  {
	  return gates;
  }
  
  // Accessor method that gets countAirports
  public static int getCountAirports( ) 
  {
	  return countAirports;
  }

  // 6. ***** Write this method *****
  // Mutator method for the airportCode instance variable
  // method name: setAirportCode
  // return value: void
  // parameters: String newAirportCode
  // function: assigns airportCode the value of the
  //                    newAirportCode parameter
  public void setAirportCode( String newAirportCode )
  {
	  airportCode = newAirportCode;
  }

  // 7. ***** Write this method *****
  // Mutator method for the gates instance variable
  // method name: setGates
  // return value:  void
  // parameters: int newGates
  // function: validates the newGates parameter.
  //   if newGates is greater than or equal to 0,
  //       sets gates to newGates;
  //       otherwise, prints an error message to System.err
  //        and does not change value of gates
  public void setGates ( int newGates )
  {
	  if ( newGates >= 0 )
			  gates = newGates;
	  else
		  System.err.print("Amount of new gates cannot be less than zero.");
	      System.err.print("Value of gates will stay the same.");
  }
  
  public String toString( )
	{
		return ("Airport Code: " + airportCode + "\nGates: " + gates );
	}
	
	public boolean equals( Object kciAirport)
	{
		if ( ! ( kciAirport instanceof Airport  ) )
			return false;
		else
		{
			Airport objAirport = ( Airport ) kciAirport;
			if ( airportCode.equals(objAirport.airportCode) && gates == objAirport.gates )
				return true;
			else
				return false;
		}
	}
  
 }  // end of Airport class definition
