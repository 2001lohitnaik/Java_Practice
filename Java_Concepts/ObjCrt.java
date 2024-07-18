class Human
{
	public Human()
	{
		System.out.println("Obj Created");
	}

	public void show()
	{
		System.out.println("Java");
	}
	
}
public class ObjCrt
{
	public static void main(String args[])
	{
		new Human();   //Anonymous Object
	}
}