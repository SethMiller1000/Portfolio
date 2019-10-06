package competitiveProgramming;

import java.util.Scanner;

public class RefrigeratorMagnetsAllison {
	static boolean dupe (String s)
	{
		boolean bad = false;
		if (s.isEmpty())
			return bad;
		else
		{
			char c = s.charAt(0);
			s = s.substring(1);
			while(!s.isEmpty() && !bad)
			{
				bad = (s.contains("" + c) && c != ' ');
				c = s.charAt(0); // c is first
				s = s.substring(1); // s is second
				
			}
			return bad;
		}
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		while(!s.equals("END"))
		{
			if(!dupe(s))
				System.out.println(s);
			s = scan.nextLine();
		}
		
		

	}

}
