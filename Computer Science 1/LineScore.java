package objectArrays;

public class LineScore
{
	private int runs, hits, errors;
	private String team;
	
	public LineScore ( String t, int r, int h, int e )
	{
		 team = t;
		 runs = r;
		 hits = h;
		 errors = e;
		
	}// end of LineScore overloaded constructor
	
	public LineScore ( )
	{
		team = "Team";
		runs = 0;
		hits = 0;
		errors = 0;
		
	}// end of Line Score default constructor
	
	///// ACCESSOR METHODS /////
	
	public String getTeam( )
	{
		return team;
		
	}// end of getTeam
	
	public int getRuns( )
	{
		return runs;
		
	}// end of getRuns
	
	public int getHits( )
	{
		return hits;
		
	}// end of getHits
	
	public int getErrors( )
	{
		return errors;
		
	}// end of getErrors
	
	
	///// MUTATOR METHODS /////
	
	public void setTeam ( String newTeam )
	{
		team = newTeam;
		
	}// end of setTeam
	
	public void setRuns ( int newRuns )
	{
		runs = newRuns;
		
	}// end of setRuns
	
	public void setHits ( int newHits )
	{
		hits = newHits;
		
	}// end of setHits
	
	public void setErrors ( int newErrors )
	{
		errors = newErrors;
		
	}// end of setErrors
	
}// end of LineScore