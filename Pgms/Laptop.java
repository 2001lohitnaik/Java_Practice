class Laptop
{
	String name;
	String processor;
	String colour;
	int RAM;
	double price;

	public void display()
	{
		System.out.println("Laptop Name is: "+name);
		System.out.println("Laptop Processor is: "+processor);
		System.out.println("Laptop Name is: "+colour);
		System.out.println("Laptop Name is: "+RAM);
		System.out.println("Laptop Name is: "+price);
		System.out.println();

	}

	public void init(String a,String b,String c,int d,double e)
	{
		name=a;
		processor=b;
		colour=c;
		RAM=d;
		price=e;
	}
	public static void main(String args[])
	{
		Laptop obj=new Laptop();
		obj.init("Acer","AMD","Black",4,30000);
		obj.display();

		Laptop obj1=new Laptop();
		obj1.init("Dell","i3","Black",4,35000);
		obj1.display();

	}
}
