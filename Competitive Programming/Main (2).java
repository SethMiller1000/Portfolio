import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws FileNotFoundException
	{
		//Scanner scan = new Scanner(new File("input.txt"));
		Scanner scan = new Scanner(System.in);
		
		long num1 = scan.nextLong();
		long num2 = scan.nextLong();
		
		int probNum=0;
		
		while(num1!=0 && num2!=0)
		{
			probNum++;
			String output="Problem "+probNum+"\n";
			long answer = num1*num2;
			int ansLen = (answer+"").length();
			output+=sp(ansLen-(num1+"").length(),' ')+num1+"\n";
			output+=sp(ansLen-(num2+"").length(),' ')+num2+"\n";
			for(int i=0;i<ansLen;i++)
				output+="-";
			output+="\n";
			
			int numZeroes=0;
			if((num2+"").replaceAll("0", "").length()>1)
			{
				for(int i=(num2+"").length()-1;i>=0;i--)
				{
					int n = Integer.parseInt((num2+"").charAt(i)+"");
					if(n==0)
						numZeroes++;
					else
					{
						String s = (n*num1)+"";
						output+=sp(ansLen-s.length()-((num2+"").length()-i)+1,' ')+s+sp(numZeroes,'0')+"\n";
						numZeroes=0;
					}
				}
				for(int i=0;i<ansLen;i++)
					output+="-";
				output+="\n";
			}
			output+=answer;
			
			System.out.println(output);
			num1=scan.nextLong();
			num2=scan.nextLong();
		}
	}
	static String sp(int n,char c)
	{
		String toReturn="";
		for(int i=0;i<n;i++)
		{
			toReturn+=c;
		}
		return toReturn;
	}
}
