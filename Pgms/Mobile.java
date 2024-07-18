//Constructor Overloading...
class Spec
{
	String name;
	int storage;
	int ram;
	public Spec()
	{
		System.out.println();
		System.out.println("Default Contructor is Called");
		System.out.println();
	}
	public Spec(String name)
	{
		this.name=name;
	}
	public Spec(int storage,int ram)
	{
		 this.storage=storage;
		 this.ram=ram;
	}
	public void display()
	{
		 System.out.println("Name is: "+name);
		 System.out.println("Storage is "+storage);
		 System.out.println("RAM is "+ram);
	}
}
public class Mobile
{
	public static void main(String args[])
	{
		Spec ob=new Spec();
		Spec ob1=new Spec("iphone");
		ob1.display();
		Spec ob2=new Spec(128,8);
		ob2.display();

	}
}
