public class GameController
{
	private String employee;
	
	private Restaurant restaurant;
	
	private Player player;
	
	public void chooseName( )
	{
		player.name = System.in.read("Enter the players name:");
		if(Player.name == null)
		{
			System.out.println("wrong name");	// call the method again maybe?
		}
	}
	
	public void startGame( )
	{
		if(Player.name!=null)
			{
			// some events to start the game
			GameController.setDishesQuality();
			GameController.SetMenuItemsInfo();
			//
			GameController.Time();
			}
		else {
				Player.name = System.in.read("Enter the players name:");
			 }
	}
	
	public void trainEmployee( Employee employee )
	{
			if(Restaurant.budget >= employee.trainingCost)
			{ // it's 800 for a waiter, else 1200
				if(employee.experience != high)
					{ // it's not already high
						employee.train();
					}
				else
					{
					System.out.println("The experience of "+employee+" is already high");
					}
			}
			else
			{
				System.out.println("Sorry, but there is not enough money");
			}
	}
	
	public void makeSelection( Waiter waiter, Table table )
	{
	for(int i=1; i<=9; i++)
		{
			System.out.println("Input the waiter name for table #" + i);
			Table.i.assignToWaiter = System.in.read();
			if(isWaiterName(Table.i.assignToWaiter))
			{	// where isWaiterName takes the argument and checks if the argument belongs to waiters list (waiter.name list)
				System.out.println("Wrong name, let's try again: ");
				Table.i.assignToWaiter = System.in.read();
			}		
		}
	}
	
	public void setDishesQuality()
	{
		byte a = System.in.read("Enter the number of High Quality dishes, from 0 to 5: ");
		byte b = 5-a;
		if(a>=0 && a<=5)
			{
			System.out.println("So, there are "+a+" of High Quality dishes and "+b+" of Low Quality dishes");
			System.out.println("Are you fine with it? (y/n)");
			if(System.in.read()==y)
				{
					for(i=0;i<a;i++) dish[i].Quality = High;
					for(y=a;y<5-a;i++) dish[y].Quality = Low;
				}
			}
		else
			{
				byte a = System.in.read("Enter the number of High Quality dishes:");
				byte b = 5-a;
				System.out.println("So, there are "+a+" of High Quality dishes and "+b+" of Low Quality dishes");
				System.out.println("Are you fine with it? (y/n)");
				if(System.in.read()==y)
					{
						for(i=0;i<a;i++) dish[i].Quality = High;
						for(y=a;y<5-a;i++) dish[y].Quality = Low;
					}
			}
	}
	
	public void setBeveragesQuality(String highNo, String lowNo)
	{
		byte a = System.in.read("Enter the number of High Quality beverages, from 0 to 5: ");
	byte b = 5-a;
	if(a>=0 && a<=5) {
	System.out.println("So, there are "+a+" of High Quality beverages and "+b+" of Low Quality beverages");
	System.out.println("Are you fine with it? (y/n)");
	if(System.in.read()==y)
			{
				for(i=0;i<a;i++) beverage[i].Quality = High;
				for(y=a;y<5-a;i++) beverage[y].Quality = Low;
			}
	}
	else
		{
			byte a = System.in.read("Enter the number of High Quality beverages:");
			byte b = 5-a;
			System.out.println("So, there are "+a+" of High Quality beverages and "+b+" of Low Quality beverages");
			System.out.println("Are you fine with it? (y/n)");
			if(System.in.read()==y)
			{
				for(i=0;i<a;i++) beverage[i].Quality = High;
				for(y=a;y<5-a;i++) beverage[y].Quality = Low;
			}
		}
	}
	
	public void setPrice( double highDCost, double lowDCost, double highBCost, double lowBCost )
	{
		double highDCost = System.in.read("Set the price for High Quality dish:");
		double lowDCost = System.in.read("Set the price for Low Quality dish:");
		double highBCost = System.in.read("Set the price for High Quality beverage:");
		double lowBCost = System.in.read("Set the price for Low Quality beverage:");
		return (highDCost, lowDCost, highBCost, lowBCost);
	}
	
	

	public void GameController.SetMenuItemsInfo()// read from the keyboard names, calories and volumes for menu items
	{
	// set names by id's
	// set calorie's for it
	dish1.name = System.in.read("Enter the name for dish1:");
	dish1.calorieCount = System.in.read("Enter the calorie count for dish1:");
	//
	dish2.name = System.in.read("Enter the name for dish2:");
	dish2.calorieCount = System.in.read("Enter the calorie count for dish2:");
	//
	dish3.name = System.in.read("Enter the name for dish3:");
	dish3.calorieCount = System.in.read("Enter the calorie count for dish3:");
	//
	dish4.name = System.in.read("Enter the name for dish4:");
	dish4.calorieCount = System.in.read("Enter the calorie count for dish4:");
	//
	dish5.name = System.in.read("Enter the name for dish5:");
	dish5.calorieCount = System.in.read("Enter the calorie count for dish5:");
	//
	// same for beverages
	//
	beverage1.name = System.in.read("Enter the name for beverage1:");
	beverage1.volume = System.in.read("Enter the volume for beverage1:");
	//
	beverage2.name = System.in.read("Enter the name for beverage2:");
	beverage2.volume = System.in.read("Enter the volume for beverage2:");
	//
	beverage3.name = System.in.read("Enter the name for beverage3:");
	beverage3.volume = System.in.read("Enter the volume for beverage3:");
	//
	beverage4.name = System.in.read("Enter the name for beverage4:");
	beverage4.volume = System.in.read("Enter the volume for beverage4:");
	//
	beverage5.name = System.in.read("Enter the name for beverage5:");
	beverage5.volume = System.in.read("Enter the volume for beverage5:");
	}
	
	GameController.Time()
	{
		if(startOfTheDay)
			{
				GameController.makeSelection(waiter : Waiter, table : Table);
			}
		if(endOfTheWeek)
			{
				Restaurant.paySalaries (Employee.computeSalary());
			}
	}
		
}
