// Mitchell Northern - SBU Competitive Programming

package competitiveProgramming;

import java.util.*;
import java.io.*;

public class Backgammon
{
	static int p6 = 0;
	static int p5 = 0;
	static int p4 = 0;
	static int p3 = 0; 
	static int p2 = 0;
	static int p1 = 0;	
	
	public static boolean isFull()
	{
		if (p6 == 15 && p5 == 15 && p4 == 15 && p3 == 15 && p2 == 15 && p1 == 15)
			return true;
		else
			return false;
		
	}// end of boolean is Full()
	
	public static void main (String [] args) throws IOException
	{
		Scanner scan = new Scanner(new File("backgammon.txt"));
		String typeofinput = "";
		String output = "";
		int arrayloc = 0;
		int casenum = 0;
		int maxp1 = 15;
		Pieces [] combinations = new Pieces[15504];
		
		for (int i = 0; i < 15504; i++)
		{
			p1 = maxp1;
			int sum = p1 + p2 + p3 + p4 + p5 + p6;
			if (sum > 15)
			{
				// UNFINISHED
				
			}// end of if sum > 15
			
			combinations[i] = new Pieces(p6, p5, p4, p3, p2, p1);
		}//populate array
		for (int i = 0; i < 15504; i++)
		{
			int temp1 = combinations[i].getPoint1();
			int temp2 = combinations[i].getPoint2();
			int temp3 = combinations[i].getPoint3();
			int temp4 = combinations[i].getPoint4();
			int temp5 = combinations[i].getPoint5();
			int temp6 = combinations[i].getPoint6();
			
			System.out.println(temp1 + " " + temp2 + " " + temp3 + " " + temp4 + " " + temp5 + " " + temp6);
			
		}// end of for i < 15504
		
		typeofinput = scan.next();
		
		while(!typeofinput.equals("e"))
		{
			casenum++;
			p6 = 0;
			p5 = 0;
			p4 = 0;
			p3 = 0;
			p2 = 0;
			p1 = 0;
			
			if (typeofinput.equals("m"))
			{
				p1 = scan.nextInt();
				p2 = scan.nextInt();
				p3 = scan.nextInt();
				p4 = scan.nextInt();
				p5 = scan.nextInt();
				p6 = scan.nextInt();
				
				for (int i = 0; i < 15504; i++)
				{
					if (combinations[i].isEqual(p1, p2, p3, p4, p5, p6))
					{
						System.out.println(i);
						output = "" + i;
						i = 15555;
						
					}// end of if combinations[i].isEqual
					
				}
				
			}// search // end of if typeofinput.equals("m")
			
			else if (typeofinput.equals("u"))
			{
				arrayloc = scan.nextInt();
				p1 = combinations[arrayloc].getPoint1();
				p2 = combinations[arrayloc].getPoint2();
				p3 = combinations[arrayloc].getPoint3();
				p4 = combinations[arrayloc].getPoint4();
				p5 = combinations[arrayloc].getPoint5();
				p6 = combinations[arrayloc].getPoint6();
				
				output = "" + p1 + " " + p2 + " " + p3 + " " + p4 + " " + p5 + " " + p6;
			}// getcoordinates // end of if else if typeofinput.equals("u")
			
			output = "Case " + casenum + ": " + output;
			System.out.println(output);
			
			typeofinput = scan.next();
			
		}// end of while(!typeofinput.equals("e"))
		
		scan.close();
		
	}// end of main
	
}// end of Backgammon

class Pieces 
{
	private int point6;
	private int point5;
	private int point4;
	private int point3;
	private int point2;
	private int point1;
	
	public Pieces(int n6, int n5, int n4, int n3, int n2, int n1)
	{
		point6 = n6;
		point5 = n6;
		point4 = n6;
		point3 = n6;
		point2 = n6;
		point1 = n6;
		
	}//Constructor
	
	public int getPoint6()
	{
		return point6;
	}
	public int getPoint5()
	{
		return point5;
	}
	public int getPoint4()
	{
		return point4;
	}
	public int getPoint3()
	{
		return point3;
	}
	public int getPoint2()
	{
		return point2;
	}
	public int getPoint1()
	{
		return point1;
	}
	
	public boolean isEqual(int test1, int test2, int test3, int test4, int test5, int test6)
	{
		if (test1 == point1 && test2 == point2 && test3 == point3 
				&& test4 == point4 && test5 == point5 && test6 == point6)
			return true;
		else
			return false;
			
	}// end of boolean isEqual
	
}//Pieces // end of Backgammon