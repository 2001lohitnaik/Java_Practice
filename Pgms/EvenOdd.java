class EvenOdd
{
	public static void checkNumber(int n)
	{
		if(n%2==0)
		{
			System.out.println("Number "+n+ " is Even");
		}
		else 
		{
			System.out.println("Number "+n+ " is Odd");
		}
	}
	public static void main(String args[])
	{
		for(int i=1;i<=10;i++)
		{
			checkNumber(i);
		}
	}
}