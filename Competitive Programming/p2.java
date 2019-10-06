import java.util.*;

public class p2 // Space Oddity
{
    public static void main ( String [] args )
    {
        Scanner scan = new Scanner( System.in );
        int x = 0;
        int y = 0;
        int modify = 0;
        int count = scan.nextInt();
        for ( int i = 0; i <= count; i++ )
        {
            modify = 0;
            
            // Change made by Grant
            String operator = scan.next();
            int value = scan.nextInt();
            // end change made by Grant
            
            if ( operator.contains( "AccelX" ) )
            {
                modify = value;
                x += modify;
                
            }// end of if ( scan.nextLine().contains( "AccelX" ) )
            
            else if ( operator.contains( "AccelY" ) )
            {
                modify = value;
                y += modify;
                
            }// end of else if ( scan.nextLine().contains( "AccelY" ) )
            
            else if ( operator.contains( "DecelX" ) )
            {
                modify = scan.nextInt();
                x -= modify;
                
            }// end of else if ( scan.nextLine().contains( "DecelX" ) )
            
            else if ( operator.contains( "DecelY" ) )
            {
                modify = scan.nextInt();
                y -= modify;
                
            }// end of else if ( scan.nextLine().contains( "DecelY" ) )
            
            else if ( operator.contains( "Hyper" ) )
            {
                modify = scan.nextInt();
                x += modify;
                y += modify;
                
            }// end of else if ( scan.nextLine().contains( "Hyper" ) )
            
            else if ( operator.contains( "Move" ) )
            {
                modify = scan.nextInt();
                x = x * modify;
                y = y * modify;
                
            }// end of else if ( scan.nextLine().contains( "Move" ) )
            
        if( ( ( x % 2 == 0 )&&( y % 2 != 0 ) ) || ( ( x%2 != 0 ) && ( y%2 == 0 ) ) )
        {
            System.out.println( "SAFE" );
            
        }// end of if
        
        else
        {
            System.out.println( "UNSAFE" );
            
        }// end of else
        
    }// end of for ( int i = 0; i <= count; i++ )
        
  }// end of main
    
}// end of p2
