
import java.util.Scanner;


public class NewClass1
{
    //Scanner scan = new Scanner (System.in);
    public static int cut(int n)
    {
        if(n==0)
            return 0;
        else
            return n + cut(n-1);

    }// end of cut
    
    
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(cut(n));

    }// end of main

}// end of NewClass1