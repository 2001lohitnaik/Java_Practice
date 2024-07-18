class Computer
{
	String name;
	String processor;
	String colour;
	int RAM;
	double price;

	public void display(String name,String processor,String colour,int RAM,double price)
	{
		System.out.println("Computer Name is: "+name);
		System.out.println("Computer Processor is: "+processor);
		System.out.println("Computer Name is: "+colour);
		System.out.println("Computer Name is: "+RAM);
		System.out.println("Computer Name is: "+price);
		System.out.println();

	}

	public static void main(String args[])
	{
		Computer obj=new Computer();
		obj.display("Acer","AMD","Black",4,30000);


		Computer obj1=new Computer();
		obj1.display("Dell","i3","Black",4,35000);


	}
}
