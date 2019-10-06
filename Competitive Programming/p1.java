import java.util.*;
public class p1 {
    public static boolean test(int a,int n)
    {
        if(a%2+n==0)
            return false;
        else if(n<a/4)
            return test(a,(n+1));
        else
            return true;
    }
    public static void main (String [] args)
    {
        Scanner s = new Scanner(System.in);
        
        int cnt = s.nextInt();
        
        while(cnt>0)
        {
            int num = s.nextInt();
            int storenum=num;
            int Tcnt = 0;
            int THcnt = 0;
            int Fcnt = 0;
            if(num%2==1)
            {
                
                while(num%2==1&&num!=1)
                {
                    if(num%5==0&&num!=1)
                    {
                    num /=5;
                    Fcnt++;
                    }
                    else if (num%3==0&&num!=1)
                    {
                      num /=3;
                    THcnt++; 
                    }
            
                }//while
                while(num%2==0&&num!=1)
                {
                    num/=2;
                    Tcnt++;
            
                }//while
                
            }//if
            else
            {
                while(num%2==0&&num!=1)
                {
                    num/=2;
                    Tcnt++;
            
                }//while
                
            }//
            
            
            System.out.println(Tcnt + " " + THcnt+ " "+ Fcnt);
            if((Tcnt<4||test(Tcnt,0)!=false)&&(THcnt<4||test(THcnt,0)!=false)&&(Fcnt<4||test(Fcnt,0)!=false))
                System.out.println(storenum + " YES");
            else
                System.out.println(storenum+" NO");
            cnt--;
        }
    }
}

