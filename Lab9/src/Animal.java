
public abstract class Animal {
	
	String name,eats,color;
	boolean vegetarian;
	double speed;
	
	public Animal(String name, boolean veg, String food, String color)
	{
		this.name = name;
		vegetarian = veg;
		eats = food;
		this.color = color;
	}
	
	public Animal(String name, boolean veg, String food, String color, double speed)
	{
		this(name,veg,food,color);
		this.speed = speed;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public boolean isVegetarian()
	{
		return vegetarian;
	}
	
	public void setVegetarian(boolean vegetarian)
	{
		this.vegetarian = vegetarian;
	}
	
	public String getEats()
	{
		return eats;
	}
	
	public void setEats(String eats)
	{
		this.eats = eats;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public double getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
}//END CLASS
