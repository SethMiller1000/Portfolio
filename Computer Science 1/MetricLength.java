package metriclength;

/*MetricLength- converts inches to centimeters
  Seth, Miller
*/

public class MetricLength {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	  /***** 1. What data values do we know?
	  * We know that there are 2.54 centimeters in an inch.
	  * Declare a double constant named CM_PER_INCH.
	  * Assign CM_PER_INCH the value 2.54.
	  */
	   final double CM_PER_INCH = 2.54;

	  /***** 2.    What other data does the program require?
	  * For this program, we require the number of inches.
	  * Declare a double variable named inches.
	  * Assign any desired value to this variable.
	  */
	   final double inches = 14;


	  /***** 3. Calculation: convert inches to centimeters
	  * Declare a double variable named centimeters.
	  * Multiply inches by CM_PER_INCH
	  * and store the result in centimeters.
      */
	   final double centimeters = inches * CM_PER_INCH;


	  /***** 4. Output
	  * Write one or two statements that output
	  * the original inches and the equivalent centimeters.
	  * Try to match the sample output in Figure 2.6.
	  */
	   System.out.println(inches + " inches are equivalent to " + centimeters + " centimeters.");
	}

}
