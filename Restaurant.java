public class Restaurant
{
	private String name;
	
	private String address;
	
	private String city;
	
	private int budget = 10000;
	
	private int reputationPoints;
	
	private Employee employee;
	
	private Table table;
	
	private Orders orders;
	
	private Player player;
	
	private MenuItem menuItem;
	
	public void paySuppliers( Double amount )
	{
		// just need to take Restaurant.supplierCost as an amount
		Restaurant.budget = Restaurant.budget - amount;
	}
	
	public void computeReputation( String clientSatisfaction )
	{
		
	}
	
	public void payUtilities( Double amount )
	{
		Restaurant.budget = Restaurant.budget - amount;
	}
	
	public void paySalaries( Double amount )
	{	
		amount = Employee.getSalaries();
		Restaurant.budget = Restaurant.budget - amount;
	}
	
	public void populateTables( )
	{
		
	}
	
	public void computeClientStatistics( )
	{
		
	}
	
	public void payTraining( Double amount )
	{
		// will be inside of trainEmployee
	}
	
	public void processOrder( String dish, String beverage, int table )
	{
		double dish1=find.price(Menu.Item.dish);
		double bev1=find.price(Menu.Item.beverage);
		double orderPrice = dish1+bev1;
		Restaurant.budget += orderPrice;
		// + some formulas to add for customer satisfaction
	}
	
	

	public void computeReputation( String clientSatisfaction )
	{
		
	}
	
	
	public void processOrder( String dish, String beverage, int table )
	{
		
	}
	
	

	public void computeReputation( String clientSatisfaction )
	{
		
	}
	
	
	public void processOrder( String dish, String beverage, int table )
	{
		
	}
	
	
}
