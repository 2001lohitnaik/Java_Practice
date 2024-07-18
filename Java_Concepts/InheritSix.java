class Student
{
	String name;

	public Student(String name)
	{
		this.name=name;
	}

	public void display()
	{
		System.out.println("Name is "+name);
	}
}

class Student1 extends Student
{
	int age;

	public Student1(String name,int age)
	{
		super(name);
		this.age=age;
	}

	public void display()
	{
		super.display();
		System.out.println("Age is "+age);
	}
}

class Student2 extends Student1
{
	String loc;

	public Student2(String name,int age,String loc)
	{
		super(name,age);
		this.loc=loc;
	}

	public void display()
	{
		super.display();
		System.out.println("Location is "+loc);
	}
}

public class InheritSix
{
	public static void main(String args[])
	{
		Student2 obj=new Student2("Lohit",23,"Kumta");
		obj.display();
	}
}