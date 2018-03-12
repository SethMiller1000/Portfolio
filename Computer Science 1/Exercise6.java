package midtermReview;

public class Exercise6
{
	private String foodType;
	private double price;

	public CannedGoods( )
	{
		foodType = "Spam";
		setPrice( 2.99 );
	}

	public String getFoodType( )
	{
		return foodType;
	}

	public double getPrice( )
	{
		return price;
	}

	public void setFoodType( String t )
	{
		foodType = t;
	}

	public void setPrice( double p )
	{
		price = p;
	}
		
}// end of CannedGoods
	

