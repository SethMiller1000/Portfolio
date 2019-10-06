import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	static ArrayList<boolean[]> findAdds(int goal, int value, boolean[] start)
	{
		ArrayList<boolean[]> ret = new ArrayList<boolean[]>();
		if(value == goal)
		{
			ret.add(start);
			return ret;
		}

		for(int i = 0; i < start.length; i++)
		{
			if(start[i] == false && (value + i + 1) <= goal)
			{
				boolean[] copy = start.clone();
				copy[i] = true;
				ret.addAll(findAdds(goal, value + i + 1, copy));

			}
		}

		return ret;

	}

	static int findMaxMoves(boolean[] used, ArrayList<Integer> targets, int currentRoll)
	{
		if(currentRoll >= targets.size())
		{
			return 0;
		}
		int target = targets.get(currentRoll);
		ArrayList<boolean[]> branches = findAdds(target, 0, used);

		int max = 0;
		for(boolean[] x : branches)
		{
			max = Math.max(max, findMaxMoves(x, targets, currentRoll+1));
		}

		return max + 1;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count = 0;

		while(scan.hasNext())
		{
			count++;
			
			int pieces = scan.nextInt();
			int turns = scan.nextInt();
			
			if(pieces == 0)
			{
				break;
			}
			
			ArrayList<Integer> moves = new ArrayList<Integer>();
			
			for(int i = 0; i < turns; i++)
			{
				moves.add(scan.nextInt());
			}
			boolean[] smallest = new boolean[11];
			System.out.println("Game " + count + ": " + findMaxMoves(smallest, moves, 0));
			
			
		}

	}

}
