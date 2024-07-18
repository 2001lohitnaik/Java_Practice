class A
{
	String name;
	public void show()
	{
		System.out.println(this);
	}
	public static void main(String args[])
	{
		A obj=new A();
		System.out.println(obj);
		obj.show();
	}
}