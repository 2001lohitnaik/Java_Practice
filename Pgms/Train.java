class Train
{
	static int data=10;
	static int age=22;

	int data1;
	int data2;
	int data3;

	public void staticDisplay()
	{
		System.out.println("It is Static Variable... Data is"+data);
		System.out.println("It is Static Variable... Age is"+age);
		System.out.println();

	}

	public void nonStaticDisplay()
	{
		System.out.println("Data 1 is: "+data1);
		System.out.println("Data 2 is: "+data2);
		System.out.println("Data 3 is: "+data3);
		System.out.println();

	}

	public void init(int a,int b,int c)
	{
		data1=a;
		data2=b;
		data3=c;
	}

	public static void main(String args[])
	{
		Train obj=new Train();
		obj.staticDisplay();

		obj.init(5,10,15);
		obj.nonStaticDisplay();
	
	}
}