class Main{
	public static void main(String args[])
	{
		Pizza p = new Pizza(false);
		p.addExtraCheese();
		p.addExtraCheese();
		p.addExtraCheese();
		p.addExtraToppings();
		p.addTakeout();
		p.getprice();
		DeluxePizza dp = new DeluxePizza(true);
		dp.getprice();
	}
}