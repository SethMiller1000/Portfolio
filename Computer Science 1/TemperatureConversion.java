/* Temperature Conversion
   Seth Miller
 */

package temperatureConversion;

public class TemperatureConversion

{
	public static void main (String [] args)
	{
		//***** 1. Declare any constants here.
		final double FAHRENHEIT_FREEZING_POINT = 32.0;
		
		//***** 2. Declare the temperature in Fahrenheit as an integer (int).
		int tempInFahrenheit = 85;
		
		//***** 3. Calculate equivalent Celsius temperature.
		double tempInCelsius = 5.0 / 9.0 * (tempInFahrenheit - FAHRENHEIT_FREEZING_POINT);
		
		//***** 4. Output the temperature in Celsius.
		System.out.println(tempInCelsius);
		
		//***** 5. Convert Celsius temperature back to Fahrenheit.
		double checkTempInFahrenheit = 9.0 / 5.0 * tempInCelsius + FAHRENHEIT_FREEZING_POINT;
		
		//***** 6. Output Fahrenheit temperature to check correctness.
		System.out.println(checkTempInFahrenheit);
		
				int a = 6;
		System.out.println(a);
		
		float b = 13f;
		System.out.println(b);
		
		double c = 13 / 5;
		System.out.println(c);
		
		int d = 13 / 5;
		System.out.println(d);
		
		int e = 13 % 5;
		System.out.println(e);
		
		int f = 12 / 6 * 2;
		System.out.println(f);
		
		int g = 12 / (6 * 2);
		System.out.println(g);
		
		int h = 4 + 6 / 2;
		System.out.println(h);
		
		int i = (4 + 6) / 2;
		System.out.println(i);
		
		double j = 12.0 / 5;
		System.out.println(j);
		
		int k = (int) 12.0 / 5;
		System.out.println(k);
		
		double l = (double) (12) / 5;
		System.out.println(l);
		
		double m = (double) (12 / 5);
		System.out.println(m);
		
		int n = 5;
		n++;
		System.out.println(n);
		
		int o = 5;
		System.out.println(o--);
		
		int p = 5;
		System.out.println(--p);
		
		int q = 5;
		q += 2;
		System.out.println(q);
		
		int r = 5;
		r /=6;
		System.out.println(r);
		
		
	}
}