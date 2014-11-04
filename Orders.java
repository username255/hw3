public class Orders
{
	private DateTime time;
	
	private String orderNo;
	
	private int clientSatisfaction;
	
	public void setPrice()
	{

	}
	
	public void addSupplyCost( Double orderPrice)
	{
		// adding orderPrice to Restaurant.supplierCost
		Restaurant.supplierCost += orderPrice;
		// where orderPrice is the sum price of ingredients
	}
	
}
