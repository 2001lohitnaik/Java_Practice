class Employee
{
	String name;
	int age;

	public Employee(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	public void display()
	{
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
	}
}
class Employee1 extends Employee
{
	String loc;

	public Employee1(String name,int age,String loc)
	{
		super(name,age);
		this.loc=loc;
	}

	public void display1()
	{
		super.display();
		System.out.println("Location is "+loc);
	}
}
public class InheritFour
{
	public static void main(String args[])
	{
		Employee1 obj=new Employee1("Lohit",23,"Kumta");
		obj.display1();
	}
}