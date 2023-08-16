class DeluxePizza extends Pizza
{
	public DeluxePizza(Boolean veg)
	{
		super(veg);
		super.addExtraCheese();
		super.addExtraToppings(); 
		//this done to make sure that deluxe pizza has extra cheese and 
		//toppings by default.
	}
		
}