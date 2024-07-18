class BeforeThis 
{
	String name;
	int age;
	public void init(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
	}
	public static void main(String[] args) 
	{
		BeforeThis bt=new BeforeThis();
		bt.init("Akshay",22);
		bt.display();
	}
}
