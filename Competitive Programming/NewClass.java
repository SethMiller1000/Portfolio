
import java.util.Scanner;

public class NewClass
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner( System.in );
        
        int n = scan.nextInt();
        long sum = 0;
        
        for ( int i = 0; i < n; i++ )
        {
            sum += scan.nextInt();
            
        }// end of for ( int i = 0; i < n; i++ )
        
        String numString = "" + sum;
        String reverse = "";
        
        for ( int i = numString.length() - 1; i >= 0; i-- )
        {
            reverse += numString.charAt(i);
            
        }// end of for ( int i = 0; i < numString.length(); i++ )
        
        if ( reverse.equals( numString ) )
            System.out.println(sum + " YES");
        else
            System.out.println(sum + " NO");
        
    }// end of main
    
}// end of NewClass