//If You Use Static Keyword It is Directly Called Only in Same Class... This Program Gives Error
class Stu
{
	String name;
	int regno;
	int age;
	String address;
	int pincode;

	public Stu(String name,int regno,int age,String address,int pincode)
	{
		this.name=name;
		this.regno=regno;
		this.age=age;
		this.address=address;
		this.pincode=pincode;
	}

	public static void display()
	{
		System.out.println("Student Name is: "+name);
		System.out.println("Student Reg No is: "+regno);
		System.out.println("Student Age is: "+age);
		System.out.println("Student Address is: "+address);
		System.out.println("Student Pincode is: "+pincode);
	}
}
public class Metro2
{
	public static void main(String args[])
	{
		Stu ob=new Stu("Abhi",001,22,"Kumta",123);
		display();
	}
}
