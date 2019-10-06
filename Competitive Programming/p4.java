import java.util.*;
public class p4 {
     public static void main (String [] args)
    {
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        int dif = s.nextInt();
        int [] array = new int [num];
        int temp = num;

        while( temp > 0 )
        {
            array[ temp-1 ]= s.nextInt();
            //System.out.println( temp );
            temp--;

        }// end of while ( temp > 0 )

        String returnS = "";
        int max = 0;

        for( int i=1; i < array.length; i++ )
            max = Math.max( max, Math.abs( array[ i-1 ]-array[i] ) );
                
        if( max >= dif )
            returnS += "BUMPY ";
        else
            returnS += "SMOOTH ";
        
        for( int i = num; i < 0; i-- )
        {
            for( int j = 0; j < i; j++ )
            {
                if( array[j] > array[i] )
                {
                    int temp1 = i;
                    array[i] = j;
                    array[j] = temp1;

                }// end of if ( array[j] > array[i] )

            }// end of for( int j = 0; j < i; j++ )

        }
        
        max = 0;
        for(int i=1;i<array.length;i++)
            max = Math.max(max, Math.abs(array[i-1]-array[i]));
        
        if(max>dif)
            returnS+="BUSTED";
        else
            returnS+="FIXABLE";
        System.out.println(returnS);
    }
}
