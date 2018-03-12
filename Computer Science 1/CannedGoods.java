package midtermReview;

public class CannedGoods
{
	private String foodType;
	private double price;

	public CannedGoods()
	{
		foodType = "Spam";
		setPrice( 2.99 );
	}
	
	public CannedGoods( String startFoodType, double startPrice ) 
	{
		foodType = startFoodType;
		setPrice( startPrice );
	}

	public String getFoodType()
	{
		return foodType;
	}

	public double getPrice()
	{
		return price;
	}

	public void setFoodType(String t)
	{
		foodType = t;
	}

	public void setPrice(double p)
	{
		price = p;
	}

	// Client work done inside class!

}// end of CannedGoods
