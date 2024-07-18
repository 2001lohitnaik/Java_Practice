//this(); use
class Stu
{
	String name;
	int age;
	int reg;
	Stu(String name)
	{
		this.name=name;
	}
	Stu(String name,int age)
	{
		this(name);
		this.age=age;
	}
	Stu(String name,int age,int reg)
	{
		this(name,age);
		this.reg=reg;
	}
	public void display()
	{
		System.out.println("Student Name is "+name);
		System.out.println("Student Age is "+age);
		System.out.println("Student Reg No is "+reg);
	}
}
class Desktop
{
	public static void main(String args[])
	{
		Stu obj1=new Stu("Abhi");
		obj1.display();
		System.out.println();
		Stu obj2=new Stu("Abhi",22);
		obj2.display();
		System.out.println();
		Stu obj3=new Stu("Abhi",22,001);
		obj3.display();
	}
}