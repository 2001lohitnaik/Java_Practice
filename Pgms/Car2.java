// Without Keyword in Constructor ... If Same is Assigned It Gives Null Value.. So Give Differene Values
class Car2
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
	public Car2(String n,String c,String cmp,int yr)
	{
		name=n;
		colour=c;
		company=cmp;
		year=yr;
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
		Car2 obj=new Car2("Alto","White","Suzuki",2017);
		obj.nonDisplay();
		obj.display();

	}
}
