package lab12;

import javax.swing.JOptionPane;

public class MultiplyNums
{
	public static int Multiply(int x, int y)
	{
		if (y == 0)
			return 0;
		else
			return x + Multiply(x, y - 1);
		
	}// end of method Multiply
	
	public static void main(String[] args)
	{
		int x, y;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Enter a value for x"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Enter a value for y"));
		
		JOptionPane.showMessageDialog(null, "x times y is " + Multiply(x, y) + ".");

	}// end of main
	
}// end of Multiply Nums
