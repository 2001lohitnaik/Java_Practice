class Constructor1 
{
	String name;
	int age;
	public Constructor1()
	{
		System.out.println("constructor is created");
	}
	public Constructor1(String name)
	{
		this.name=name;
	}

	public Constructor1(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
	public static void main(String[] args) 
	{
		Constructor1 C1=new Constructor1();
		C1.display();
		Constructor1 C2=new Constructor1("yash");
		C2.display();
		Constructor1 C3=new Constructor1("yash",23);
		C3.display();
	}
}