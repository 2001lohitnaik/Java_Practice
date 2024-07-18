class Abc
{
	String name;
	public Abc(String name)
	{
		this.name=name;
	}
	public void display()
	{
		System.out.println("Name is "+name);
	}
}

class Xyz extends Abc
{
	int age;
	public Xyz(String name,int age)
	{
		super(name);
		this.age=age;
	}
	public void display1()
	{
		super.display();
		System.out.println("Age is "+age);
	}
}
public class Superr
{
	public static void main(String args[])
	{
		Xyz ob=new Xyz("Lohit",23);
		ob.display1();
	}
}