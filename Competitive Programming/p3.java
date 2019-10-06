// Movie Marque Banner Problem (ID: banner)

import java.util.*;

public class p3
{
     public static void main (String [] args)
    {
        Scanner scan = new Scanner( System.in );
        
        int marque = Integer.parseInt( scan.nextLine() );
        String movie = scan.nextLine();

        int i = 1;
        
        String first = "";
        String next = "";
        
        String firstHalf = "";
        String secondHalf = "";
        int difference = 0;
        
        if ( movie.length() < marque )
        {
            first = movie;
            
        }// end of if ( movie.length() < marque )
        
        else
        {
            first = movie.substring( 0, marque );
            
        }// end of else
        
        System.out.println(first);
        
        while ( movie.length() < marque )
        {
            movie = " " + movie + " ";
            
        }// end of while ( movie.length() < marque )
        
        if ( i + marque < movie.length() + 1 )
            next = movie.substring( i, i + marque );
            
        else if ( i + marque == movie.length() + 1 )
            next = movie.substring( i );
            
        else //( i + marque > movie.length() + 1 )
        {
            difference = ( i + marque ) - ( movie.length() + 1 );
                
            firstHalf = movie.substring( i );
            secondHalf = movie.substring( 0, difference + 1 );
            next = firstHalf + secondHalf;
                
        }// end of else
        
        i++;

//next = movie.substring( i, marque + i );
        
        while ( !( next.equals(first) ) )
        {
            System.out.println( next );
            
            if ( i + marque < movie.length() + 1 )
                next = movie.substring( i, i + marque );
            
            else if ( i + marque == movie.length() + 1 )
                next = movie.substring( i );
            
            else //( i + marque > movie.length() + 1 )
            {
                difference = ( i + marque ) - ( movie.length() + 1 );
                
                firstHalf = movie.substring( i );
                secondHalf = movie.substring( 0, difference + 1 );
                next = firstHalf + secondHalf;
                
            }// end of els
            
            i++;
            
        }// end of while
       
        scan.close();
        
    }// end of main
     
}// end of p3
