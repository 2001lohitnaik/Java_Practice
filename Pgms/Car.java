// This Keyword Usage in Constructor
class Car
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
	public Car(String name,String colour,String company,int year)
	{
		this.name=name;
		this.colour=colour;
		this.company=company;
		this.year=year;
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
		Car obj=new Car("Alto","White","Suzuki",2017);
		obj.nonDisplay();
		obj.display();

	}
}
