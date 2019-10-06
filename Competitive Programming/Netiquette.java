// Andrew Smith & Seth Miller- Competitive Programming
// Netiquette- Problem ID: 3398
// Date Created: 03/12/2018 (mm/dd/yyyy)

package competitiveProgramming;
import java.util.*;
public class Netiquette 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		String a = "";
		
		while(s.hasNext()&& !a.equals("#"))
		{
			a = s.nextLine();
			int i = 1;
			int j = 0;
			boolean boo=true;
			while(i<a.length()&&boo!=false)
			{
				
				// /* FIRST TEST
				if(a.charAt(i)>'Z' && a.charAt(j)>'Z' && !(a.charAt(i)>'z') && !(a.charAt(j)>'z'))
				{
					System.out.println("suspicious");
					boo = false;
					
				}// end of first test
				// */
				
				// else if((a.charAt(i)< 65 && a.charAt(j)>=65)||(a.charAt(i)>=65 && a.charAt(j)<65)&& a.charAt(j)!=32 && a.charAt(i)!=32)							//j						//i					  //i						//i					  //i
				
				// /* SECOND TEST
				if( ( a.charAt(i) <= 9 && ( ( a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' ) || ( a.charAt(j) >= 'a' && a.charAt(j) <= 'z' ) ) ) || ( a.charAt(j) <= 9 && ( ( a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' ) || ( a.charAt(i) >= 'a' && a.charAt(i) <= 'z' ) ) ) )// a digit is adjacent to a letter (char) 'A' = 65 'Z' = 90 'a' = 97 'z' = 122
				{
					System.out.println("suspicious");
					boo = false;
					
				}// end of second test
				// */
				
				// /* THIRD TEST
				else if(!(a.charAt(i)!='A' || a.charAt(i)!='a' || a.charAt(i)!='I') &&(a.charAt(j)==' '&& a.charAt(i+1)==' '))
				{
					System.out.println("suspicious");
					boo = false;
					
				}// end of third test
				// */
				
				// /* FOURTH TEST
				else if(a.charAt(j)>'z'&&a.charAt(i)>'z' && a.charAt(j)!='"' && a.charAt(i)!='"'&& a.charAt(j)!=' ' && a.charAt(i)!=' ')
				{
					System.out.println("suspicious");
					boo = false;
					
				}// end of fourth test
				// */
				
				j++;
				i++;
				
			}// end of while( i < a.length() && boo != false )
			
			if(boo==true)
				System.out.println("OK");
			
		}// end of while( s.hasNext() && !a.equals("#") )
		
		s.close();
		
	}// end of main

}// end of Netiquette
