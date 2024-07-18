class Human
{
	private String name;
	private int age;

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age=age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name=name;
	}
}
public class Encaps
{
	public static void main(String args[])
	{
		Human obj=new Human();
		obj.setName("Lohit");
		obj.setAge(23);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}
}