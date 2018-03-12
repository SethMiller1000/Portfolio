package midtermReview;

public class Exercise6Client
{
	public static void main(String[] args)
	{
		CannedGoods can1 = new CannedGoods();
		
		can1.setPrice( 1.47 );
		can1.setFoodType("Spaghetti-o's");
		
		String foodTypeOutput= can1.getFoodType( );
		System.out.println("The food type of can1 is " + foodTypeOutput + ".");
		
		CannedGoods can2 = new CannedGoods( "Peaches", 0.99 );
		
		String can2FoodType = can2.getFoodType( );
		double can2Price = can2.getPrice( );
		
		System.out.println( "can2 food type: " + can2FoodType );
		System.out.println( "can2 price: " + can2Price );
		
	}// end of main
	
}// end of Exercise6Client
