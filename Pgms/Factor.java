class Factor
{
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println("Factorial of "+i+" is "+fact);
		}
		return fact;
	}
	public static void main(String args[])
	{
		factorial(4);

	}

}