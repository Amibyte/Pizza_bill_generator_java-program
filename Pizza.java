class Pizza{
	private int price;
	private boolean veg;
	private int pizzaprice,i=0,j=0;
	private boolean ch = false,tp = false,tk = false;
	public Pizza(boolean veg)
	{
		this.veg = veg;
		if(this.veg)
		{
			this.price = 300;
		}
		else{
			this.price = 400;
		}
		this.pizzaprice = this.price;
	}
	public void addExtraCheese()
	{
		ch = true;
		price += 100;
		i +=1;
	}
	public void addExtraToppings()
	{
		tp = true;
		price += 150;
		j += 1;
	}
	public void addTakeout()
	{
		tk = true;
		price += 20;
	}
	public void getprice()
	{
		System.out.println("Pizza :		"+this.pizzaprice);
		if(ch)
		{
			System.out.println("Extra Cheese : 100 x " + i);
		}
		if(tp)
		{
			System.out.println("Extra Topping : 150 x " + j);
		}
		if(tk)
		{
			System.out.println("Takeout added : 20 ");
		}
		System.out.println("Total amount : 	"+this.price);

	}
}