class Student
{
	String name;
	int age;

	public Student(String name,int age)
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

class Student1 extends Student
{
	String loc;


	public Student1(String name,int age,String loc)
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

class Student2 extends Student1
{
	String regno;
	public Student2(String name,int age,String loc,String regno)
	{
		super(name,age,loc);
		this.regno=regno;
	}

	public void display2()
	{
		super.display1();
		System.out.println("Reg No "+regno);
	}
}

public class InheritFive
{
	public static void main(String args[])
	{
		Student2 obj=new Student2("Lohit",23,"Kumta","4VP22MC023");
		obj.display2();
	}
}