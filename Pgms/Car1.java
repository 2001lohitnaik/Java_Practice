// Without Keyword in Constructor ... If Same is Assigned It Gives Null Value
class Car1
{
	static String product="Car";
	static int wheels=4;

	public void nonDisplay()
	{
		System.out.println("Product is "+product);
		System.out.println("Number Of Wheels are "+wheels);
		System.out.println();
	}
	String name;
	String colour;
	String company;
	int year;
	public Car1(String name,String colour,String company,int year)
	{
		name=name;
		colour=colour;
		company=company;
		year=year;
	}
	public void display()
	{
		System.out.println("Car Name is "+name);
		System.out.println("Car Colour is "+colour);
		System.out.println("Car Company is "+company);
		System.out.println("Registeres Year is "+year);
	}
	public static void main(String args[])
	{
		Car1 obj=new Car1("Alto","White","Suzuki",2017);
		obj.nonDisplay();
		obj.display();
	}
}
