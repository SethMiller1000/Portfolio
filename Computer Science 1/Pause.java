package airport;

/* Pause class
*  Seth Miller
*/

public class Pause
{
  /** wait method
  *  @param seconds  number of seconds to pause
  */
  public static void wait( double seconds )
  {
     try
     {
       Thread.sleep( (int)( seconds * 5000 ) );
     }
     catch ( InterruptedException e )
     {
       e.printStackTrace( );
     }
  }
}