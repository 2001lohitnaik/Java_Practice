class Student
{
	String name;
	int age;
	Student()
	{
		System.out.println("Default");
	}
	Student(String n,int a)
	{
		
		name=n;
		age=a;
	}
	public void display()
	{
		System.out.println("Student Name is "+name);
		System.out.println("Student Age is "+age);
	}
}
public class Demo1
{
	public static void main(String args[])
	{
		Student obj1=new Student();
		
		System.out.println();
		Student obj2=new Student("Abhi",22);
		obj2.display();
	}
}
